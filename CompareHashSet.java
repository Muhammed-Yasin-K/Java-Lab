import java.util.HashSet;

public class CompareHashSet {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Apple");

        System.out.println("Are sets equal? " + set1.equals(set2));  // true
    }
}

