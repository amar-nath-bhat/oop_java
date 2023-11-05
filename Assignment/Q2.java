import java.util.*;

class VowelNotFoundException extends Exception{
    VowelNotFoundException(String str){
        super(str);
    }
}

class MyThread extends Thread{
    int task;
    Sentence s;
    MyThread(Sentence s, int task){
        this.s = s;
        this.task = task;
    }

    public void run(){
        switch (task) {
            case 1:
                try {
                    System.out.println("No. of words that start with a vowel: "+s.vowWordCount());
                } catch (VowelNotFoundException e) {
                    System.out.println("Exception occured: "+e);
                }
                break;
            
            case 2:
                System.out.println("Word length of each word in the sentence: ");
                s.wordLength();
            default:
                break;
        }
    }
}

class Sentence{

    String s;
    Sentence(String s){
        this.s = s;
    }

    
    int vowWordCount() throws VowelNotFoundException{
    int count=0;
    String words[];
    words = s.split(" +");
    for(String temp : words){
        int t = temp.charAt(0);
        if(t =='a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t =='A' || t == 'E' || t == 'I' || t == 'O' || t == 'U')
            count++;
    }
    if (count == 0 )
        throw new VowelNotFoundException("No word starts with a vowel!");
    return count;
    }

    void wordLength(){
        String words[];
        words = s.split(" +");
        for(String temp : words){
            System.out.print(temp.length()+" ");
        }
    }
}


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a sentence: ");
        s = sc.nextLine();
        Sentence newSentence = new Sentence(s);
        MyThread t1 = new MyThread(newSentence, 1);
        MyThread t2 = new MyThread(newSentence, 2);
        t1.start();
        
        try{
            t1.join();
        }catch(Exception e){

        }
        t2.start();
        sc.close();
        
    }
}
