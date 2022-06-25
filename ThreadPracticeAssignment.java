public class ThreadPracticeAssignment extends Thread {

    public void run(){
        for(int i=0;i<3;i++){
            try{

                Thread.sleep(2000);  // 2000 miliseconds = 2 secs
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

            System.out.println("Thread: "+Thread.currentThread().getName()+ " is running or not :"+Thread.currentThread().getState());
            System.out.println("Thread: "+Thread.currentThread().getName()+ " is alive or not :"+Thread.currentThread().isAlive());
            System.out.println("Thread: "+Thread.currentThread().getName()+" is demon thread :"+Thread.currentThread().isDaemon());
        }
    }

   /* public void run(){
        System.out.println("running thread name is:"+ ThreadPracticeAssignment.currentThread().getName());  // name of the thread
        System.out.println("running thread priority is:"+ ThreadPracticeAssignment.currentThread().getName()+ " :::" + ThreadPracticeAssignment.currentThread().getPriority());  //what is current prirotiy of thread
        System.out.println("running thread state is:"+ ThreadPracticeAssignment.currentThread().getName()+ " :::" + ThreadPracticeAssignment.currentThread().getState());  // it will print state of the thread running
        System.out.println("The thread group is:" + ThreadPracticeAssignment.currentThread().getName()+ " :::" + ThreadPracticeAssignment.currentThread().getThreadGroup()); // a group in whihc thread is assgined
        System.out.println("The thread id is:"+ ThreadPracticeAssignment.currentThread().getName()+ " :::" + ThreadPracticeAssignment.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
        System.out.println("Is my thread alive or not? :  "+ ThreadPracticeAssignment.currentThread().getName()+ " :::" + ThreadPracticeAssignment.currentThread().isAlive());  // it will heck if thread is alive or dead
        System.out.println("Is my thread Daemon or not? :  "+ ThreadPracticeAssignment.currentThread().getName()+ " :::" + ThreadPracticeAssignment.currentThread().isDaemon()); // this thread always run in background
    }*/

    public static void main(String args[]){

        ThreadPracticeAssignment m1=new ThreadPracticeAssignment();
        ThreadPracticeAssignment m2=new ThreadPracticeAssignment();
        ThreadPracticeAssignment m3=new ThreadPracticeAssignment();

        m1.setName("T1");
        m2.setName("T2");
        m3.setName("T3");

        m1.setPriority(ThreadPracticeAssignment.NORM_PRIORITY);
        m2.setPriority(ThreadPracticeAssignment.NORM_PRIORITY);
        m3.setPriority(ThreadPracticeAssignment.MAX_PRIORITY);

        m3.setDaemon(true);

        m1.start();
        m2.start();
        m3.start();

    }
}
