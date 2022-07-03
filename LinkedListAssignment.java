import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("May");
        linkedList.add("June");
        linkedList.add("July");
        linkedList.add("August");
        linkedList.add("April");
        linkedList.add("November");
        linkedList.addLast("December");
        linkedList.addFirst("January");
        linkedList.add(2,"March");

        linkedList.add(1,"Febuary");
        linkedList.add(8,"September");
        linkedList.add(9,"October");

        linkedList.add(2,"March");
        linkedList.remove(4);
        linkedList.add(3,"April");
        linkedList.remove(8);

        /*(2) Get all the even months and print them
        (3) Get all the odd months and print them
        (4) Use iterator to fetch and print all months
        (5) Print the first and last month of the year together
        (6) remove your birthday month from the linkedList and print it
        (7) Check whether this linkedList contains any winter month inside it or not?*/

        System.out.println(linkedList);
        System.out.println("Even Months List :");
        for (int i=0;i<linkedList.size();i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(linkedList.get(i));
            }
        }
        System.out.println();
        System.out.println("Even Months List: ");
            for (int j=0;j<linkedList.size();j++){
                if((j+1)%2!=0){
                    System.out.println(linkedList.get(j));
                }

        }
        System.out.println("Print list by Iterator: ");
        Iterator iterator = linkedList.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

      /*  (5) Print the first and last month of the year together
        (6) remove your birthday month from the linkedList and print it
        (7) Check whether this linkedList contains any winter month inside it or not*/
        System.out.println("First element: "+linkedList.getFirst());
        System.out.println("Last element: "+linkedList.getLast());
        System.out.println("Remove Birth month:  "+linkedList.remove("March"));
        System.out.println("The linked list after removing BirthMonth: "+linkedList);
        System.out.println("Check winter month: "+linkedList.contains("January"));
    }


}
