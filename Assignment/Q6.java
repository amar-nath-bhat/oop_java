import java.util.Scanner;

class ArraySearch extends Thread {
    int start, end, target;
    int[] array;
    int ans;

    ArraySearch(int start, int end, int[] array, int target) {
        this.start = start;
        this.end = end;
        this.array = array;
        this.target = target;
        this.ans = -1;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            if (array[i] == target) {
                synchronized (this) {
                    ans = i;
                }
                return; 
            }
        }
    }
}

class OddArraySizeException extends Exception {
    OddArraySizeException(String str) {
        super(str);
    }
}

public class Q6 {
    public static void main(String[] args) throws OddArraySizeException {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter the no. of elements: ");
        size = sc.nextInt();

        try {
            if (size % 2 == 1)
                throw new OddArraySizeException("Array of Odd Size!");
        } catch (OddArraySizeException e) {
            System.out.println(e);
            return; 
        }

        int array[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int target = sc.nextInt();

        ArraySearch t1 = new ArraySearch(0, size / 2, array, target);
        ArraySearch t2 = new ArraySearch(size / 2, size, array, target);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int ans1 = t1.ans;
        int ans2 = t2.ans;

        if (ans1 == -1 && ans2 == -1) {
            System.out.println("Element not found in array!");
        } else if (ans1 == -1) {
            System.out.println("Element found at " + (ans2+1) + " in array!");
        } else {
            System.out.println("Element found at " + (ans1+1) + " in the array!");
        }
    }
}
