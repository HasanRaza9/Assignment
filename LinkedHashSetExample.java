import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/* Assignment # 1 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set l1 = new LinkedHashSet();
        l1.add(12);
        l1.add(20);
        l1.add(12.30);
        l1.add(40.50);
        l1.add('S');
        l1.add('Q');
        l1.add(true);

        Set<Integer> l2 = new LinkedHashSet();
        for(int i = 1; i<=8; i++){
            Scanner s = new Scanner(System.in);
            System.out.println("Entry number from 1 to 8");
            int num = s.nextInt();
            l2.add(num);
        }

        System.out.println("The l1 object is: "+l1 );
        System.out.println("The l2 object is: "+l2.stream().sorted() );




    }
}
