class Factorial extends Thread{
    int number;
    Factorial(int number){
        this.number = number;
    }
    synchronized void  printFactorial(int n){
        //synchronized block  : this means to current context
            int fact =1 ;
            for(int i=1;i<=n;i++){
                fact = i*fact;
            }
            System.out.println(Thread.currentThread().getName()+"::"+fact);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);

            }

    }

    public void run(){
        printFactorial(number);
    }

}

class AddTwoNumbers extends Thread{
    int a;
    int b;

    AddTwoNumbers(int a,int b){
        this.a = a;
        this.b = b;
    }
    synchronized void printAddition(int a,int b){
               synchronized(this){//synchronized block  : this means to current context
                   int sum = a+b;
            System.out.println("The addition is  "+Thread.currentThread().getName()+":: "+sum);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}

        }
    }

    public void run(){
        printAddition(a,b);
    }

}

public class ThreadSynchronizedExample {
    public static void main(String[] args) {

        Factorial t1 = new Factorial(5);
        Factorial t2 = new Factorial(4);

        AddTwoNumbers t3 = new AddTwoNumbers(6,3);
        AddTwoNumbers t4 = new AddTwoNumbers(12,18);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");

        t2.start();
        t4.start();
        t1.start();
        t3.start();


    }



}
