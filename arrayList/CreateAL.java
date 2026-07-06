import java.util.*;

public class CreateAL {
 
    public static void main(String[] args) {
        // Q1. Create an ArrayList of Integer and print all elements.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(60);

        // System.out.println(list);

// Q2. Create an ArrayList of String and print all elements.
        // ArrayList<String> str = new ArrayList<>();
        // str.add("chhaya");
        // str.add("shah");
        // str.add("kiran");
        // System.out.println(str);

        //    Q3. Find the size of an ArrayList. 
        // System.out.println(str.size());

        // Q4. Add an element at a specific index.
        list.add(2, 30);
        System.out.println(list);

        // Q5. Remove an element by index.
        list.remove(1);
        System.out.println(list);

        // Q6. Remove an element by value.
        list.remove(Integer.valueOf(40));
        System.out.println(list);

        // Q7 set()
        list.set(0, 100);
        System.out.println(list);

        // Q8. Check whether an element exists using contains().
        System.out.println(list.contains(40));

        // Q9. Print an element using get(index).
        System.out.println(list.get(2));

        // Q10. Clear the ArrayList.
        list.clear();
        System.out.println(list);
    }
}