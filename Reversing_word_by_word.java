
/**
 *
 */
package pakage;

/**
 * @author Arvind.Kumar
 *
 */
import java.util.Scanner;

public class Reversing_word_by_word {
public static void main(String[] args) {
String str;
System.out.println("Enter a string to reverse it word by word: ");
Scanner sc = new Scanner(System.in);
str = sc.nextLine();

sc.close(); // closes the input scanner stream

String reversed = reverseString(str);

System.out.println("The reversed words of full is: " + reversed);

String st = "arvind";

System.out.println(st.substring(1)+st.charAt(0));


/* Step1 = rvind+a
* step2 = vind+r+a
* step 3 = ind+v+r+a and so on
*/

}




public static String reverseString(String s) {
if (s.isEmpty()) // checks the string if empty
return s;




return reverseString(s.substring(1)) + s.charAt(0); //  //return after concatenating in reverse order




}
}



