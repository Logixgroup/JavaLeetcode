package pakage;

public class CountUpperCaseCharacters {

public static void main(String []args) {

     System.out.println("Checking for Uppercase characters in given string");


//Input string
String str =  "ABVdggGHScL";

char[] ch = str.toCharArray();{
int count = 0;
for (char c : ch)
{
/* * Java provides a wrapper class Character in java.lang package.
* An object of type Character contains a single field, whose type is char.
* The Character class offers a number of useful class (i.e., static) methods for manipulating characters.
*/
if (Character.isUpperCase(c))
count++;
}

System.out.println("Final upper case count is : " + count );
}

}
}
