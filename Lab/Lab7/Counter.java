/*Write a counter program to count the number of objects created.*/
package Lab7;

class ObjectCounter {
    private static int count = 0; // Static variable to count objects

    public ObjectCounter() {
        count++; // Increment the count when an object is created
    }

    public static int getObjectCount() {
        return count;
    }
}

public class Counter {
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}