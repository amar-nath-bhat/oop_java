// Create a Java application with three threads to carry out each of the following actions in turn:
// The first thread reads the sentence; the second thread prints the repeated words in the sentence read by
// the first Thread; the third thread removes the repeated words from the original sentence; and prints the
// results. The above string operations must be performed multiple times. Ensure that all the three threads
// run in the order listed above (Hint: Make use of Synchronise, Wait() and Notify() methods ).
// Additionally, make an exception if the entered sentence does not contain any repeating words.

import java.util.Scanner;

class NoRepeatedWordsException extends Exception {
    NoRepeatedWordsException(String str) {
        super(str);
    }
}

class StringThread extends Thread {
    int i;
    StringUtil s;
    StringThread(int i, StringUtil s) {
        this.i = i;
        this.s = s;
    }

    public void run() {
        switch (i) {
            case 1:
                s.readString();
                synchronized (s) {
                    s.notify(); 
                }
                break;

            case 2:
                synchronized (s) {
                    try {
                        s.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    s.printRepeated();
                } catch (NoRepeatedWordsException e) {
                    System.out.println(e);
                }
                synchronized (s) {
                    s.notify(); 
                }
                break;

            case 3:
                synchronized (s) {
                    try {
                        s.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                s.removeRepeated();
                break;

            default:
                break;
        }
    }
}

class StringUtil {
    Scanner sc = new Scanner(System.in);
    String s;
    String repeatedWords[] = new String[100]; 
    int wordCount = -1;

    void readString() {
        System.out.println("Enter the String: ");
        s = sc.nextLine();
    }

    void printRepeated() throws NoRepeatedWordsException {
        int count;
        String words[] = s.split(" +");
        for (String word : words) {
            count = 0;
            for (String checkWord : words) {
                if (word.equalsIgnoreCase(checkWord))
                    count++;
            }

            if (count > 1) {
                
                repeatedWords[++wordCount] = word;
            }
        }

        if (wordCount == -1)
            throw new NoRepeatedWordsException("No Repeated Words in the Sentence");
        else {
            System.out.println("Repeated Words are: ");
            for (int i = 0; i <= wordCount; i++) {
                System.out.print(repeatedWords[i] + " ");
            }
            System.out.println("");
        }
    }

    void removeRepeated() {
        StringBuilder modifiedString = new StringBuilder();
        for (String word : s.split(" +")) {
            if (!isRepeated(word)) {
                modifiedString.append(word).append(" ");
            }
        }
        s = modifiedString.toString().trim();
        System.out.println("String after removal of repeated words: " + s);
    }

    boolean isRepeated(String word) {
        for (String repeatedWord : repeatedWords) {
            if (word.equalsIgnoreCase(repeatedWord)) {
                return true;
            }
        }
        return false;
    }
}

public class Q5 {
    public static void main(String[] args) {
        StringUtil util = new StringUtil();

        StringThread t1 = new StringThread(1, util);
        StringThread t2 = new StringThread(2, util);
        StringThread t3 = new StringThread(3, util);

        t1.start();
        t2.start();
        t3.start();
    }
}
