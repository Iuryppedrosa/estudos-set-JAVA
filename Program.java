package problema5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        //Set<String> set = new HashSet<>(); // It doesn't order anything
        Set<String> set = new TreeSet<>(); // It set in alphabet order

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Arroz");


        System.out.println(set.contains("Notebook"));

        set.remove("Arroz");
        set.removeIf(x -> x.length() == 2); // it removes the first element from the set and returns true

        for (String p : set) {
            System.out.println(p);
        }
    }
}
