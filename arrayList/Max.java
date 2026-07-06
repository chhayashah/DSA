import java.util.*;
package arrayList;

public class Max {
    public static void main(String[] args) {

        // Q11. Find Maximum Element
        // int[] arr = { 10, 20, 40, 5, 70,30 };
        // int maxi = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > maxi) {
        //         maxi = arr[i];
        //     }

        // }
        // System.out.println("Maximum Element = " + maxi);

        // Q12. Find Minimum Element

        // int min = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        // }

        // System.out.println("Manimum Element = " + min);

        // Q13. Find Sum of all Elements
        // int[] arr = { 10, 20, 30, 40 };
        // int len=arr.length;
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        // }
        // System.out.println(sum);

        // Q14. Find Average of all Elements
        // double avarage = (double)sum / len;

        // System.out.println(avarage);

        // Q15. Reverse an ArrayList (Without Collections.reverse())
        // int[] arr = { 10, 20, 30, 40, 50 };
        // int start=0;
        // int end=arr.length-1;
        // while (start < end) {
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        // Q16. Reverse an ArrayList (Using Collections.reverse())
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Collections.reverse(list);

        // System.out.println(list);


        // Q17 (Sort ArrayList in Ascending Order)
        // Collections.sort(list);
        // System.out.println(list);

        // Q18 (Descending Order)
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        // Q19 (Count Even and Odd Numbers)
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                evenCount++;
                // System.out.println("even count" + evenCount);
            }
            else {
                // System.out.println("odd count" + oddCount);
                oddCount++;
            }
            System.out.println("Even Count = " + evenCount);
            System.out.println("Odd Count = " + oddCount);
         }
    }
}
