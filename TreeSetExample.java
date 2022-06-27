import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set treeSet = new TreeSet();
        treeSet.add("C");
        treeSet.add("C++");
        treeSet.add("C#");
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("VB");

        System.out.println("the trees set is: "+treeSet);

        treeSet.remove("C#");
        treeSet.remove("VB");
        System.out.println("After removing two languages: "+treeSet);
        treeSet.add("Cobol");
        treeSet.add("Pascal");
        treeSet.add("Fortan");
        System.out.println("After addition to three languages: "+treeSet);
        System.out.println("java is part of treeSet: "+treeSet.contains("Java"));
        treeSet.clear();
        System.out.println("The tree set is: "+treeSet);
    }
}
