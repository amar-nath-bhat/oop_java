package Lab12;
class Array<T>{
    T[] arr;
    Array(T[] arr){
        this.arr = arr;
    }
    T[] swap(int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}

public class Q1{
    public static void main(String[] args) {
        String array1[] = {"a", "b", "c", "d", "e"};
        Integer array2[] = {1, 2, 3, 4, 5};

        Array<String> a1 = new Array<>(array1);
        Array<Integer> a2 = new Array<>(array2);

        array1 = a1.swap(2, 4);
        array2 = a2.swap(2, 4);


        for (String string : array1){
            System.out.print(string+" ");
        }
        System.out.println();
        for (int i : array2){
            System.out.print(i+" ");
        }

    }
}