// Write a program that reads a five-letter word from the user and produces all possible
// three letter words that can be derived from the letters of the five letter word. For
// example, the three letter words produced from the word “bathe” include the
// commonly used words “ate,” “bat,” “bet,” “tab,”, “hat,” “the” and “tea.”

package Practice;

public class prg8 {
    public static void main(String[] args) {
        String s = "bathe";
        char[] ch = s.toCharArray();
        int count =0;
        for (char i : ch){
            for(char j : ch){
                if(i!=j){
                    for(char k : ch){
                        if(i!=k && j!=k){
                            // System.out.println(i+""+j+""+k);
                            count++;
                        }
                    }
                }
            }
        }System.out.println(count);
    }
}
