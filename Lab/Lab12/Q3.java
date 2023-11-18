package Lab12;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 3, 17, 25};
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
            a1.add(arr[i]);

        a1.add(50);
        System.out.println("ArrayList after adding 50: "+a1);

        a1.add(2, 19);
        System.out.println("ArrayList after adding 19 at 3: "+a1);

        a1.remove(1);
        System.out.println("ArrayList after deleting element at 2: "+a1);

    }
}
