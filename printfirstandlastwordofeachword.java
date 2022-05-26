
/**
 *
 */
package pakage;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Arvind.Kumar
 *
 */
public class printfirstandlastwordofeachword {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub

String str = "arvind is spliting the first and lastchars of words in sentence";

String[] li = str.split(" ");

for (int i =0;i<li.length;i++){

if (li[i].length()>1){

IntStream intstream = li[i].chars();
System.out.println("Total charcters in current word are: " + intstream.count() + " ");

char valueAtfirstindex =  li[i].charAt(0);
int lstindex = li[i].length()-1;
char valueAtLastindex = li[i].charAt(lstindex);  

// direct concatenation of chars is not allowed  CHARACTER CLASS IS USED FROM JAVA
String stringfirstwithlastcharacter = Character.toString(valueAtfirstindex) + Character.toString(valueAtLastindex);
System.out.println("First and last characters:"+ stringfirstwithlastcharacter + " ");

//Second way to print

String first = li[i].substring(0, 1);
String last = li[i].substring(li[i].length() - 1);

System.out.println("Second way to print: " + first + last);

}


}



}

}
