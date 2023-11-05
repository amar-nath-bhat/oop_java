// Write a Java program using generics to count the number of elements in a collection that are prime numbers.
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for(int i =0; i<n ;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("No. of prime elements: "+primeCheck(list));
    }

    static int primeCheck(ArrayList<Integer> list){
        int primeCount = 0;
        for(Integer it : list){
            if(isPrime(it))
                primeCount++;
        }
        return primeCount;
    }

    static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        } else if (value <= 3) {
            return true;
        } else if (value % 2 == 0 || value % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i * i <= value; i += 6) {
                if (value % i == 0 || value % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    

}
