
/**
 * Find duplicate characters by HashSet
 */
package pakage;

import java.util.HashSet;

/**
 * @author Arvind.Kumar
 *
 *duplicate characters with HashSet
 */
public class duplicatecharcters {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
String st = "arjhdbhghfghf";
char[] ch = st.toCharArray();
HashSet<Character> hg = new HashSet<Character>();
for (int i = 0; i < ch.length; i++) {
if (!hg.add(ch[i])) {
System.out.println("duplicate cahrs :" + ch[i]);
}
}
System.out.println("removed duplicate character :" + hg);
}
}
