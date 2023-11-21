// Write a program that inputs a telephone number as a string in the form (555) 555-
// 5555. Use String method to extract the area code as a token, the first three digits of
// the phone number as a token and the last four digits of the phone number as a token.
// Display area code and seven digit phone number separately.
package Practice;

public class prg7 {
    public static void main(String[] args) {
        String number = "(555) 555-5555";
        String codes[] = number.split(" +");
        String tokens[] = codes[1].split("-");
        String token1 = codes[0].substring(1, 4);
        String token2 = tokens[0];
        String token3 = tokens[1];
        System.out.println(token1+"-----"+token2+"------"+token3);
    }
}
