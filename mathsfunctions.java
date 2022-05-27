
/**
 *
 */
package pakage;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * @author Arvind.Kumar
 *
 *         Printing the SUM AVERAGE COUNT MULTIPLY of INPUT NUMBERS
 *
 */
public class mathsfunctions {

public enum basicfunctions {
SUM, AVG, COUNT, MULTIPLY
}

public int result(int Num, basicfunctions basicfunctions) {

// Getting the upperbounds to generate the stream upto definite range
int ub = (Num * 2) + 1;
// Generate ODD numbers automatically
IntStream stream = IntStream.range(0, ub).filter(element -> element % 2 != 0);

// FOR DEBUG --> stream.forEach(System.out::println);
int SUM = 0;
int AVG = 0;
// TYPE OF MATHEMATICAL OPERATION TO BE PERFORMED i.e. SUM or AVERAGING
if (basicfunctions == basicfunctions.SUM) {
int sumOfElements = stream.sum();
// System.out.println(sumOfElements);
SUM = sumOfElements;
return SUM;
}

if (basicfunctions == basicfunctions.AVG) {

int avgOfElements = (int) stream.average().getAsDouble();
AVG =  avgOfElements;
return AVG;
}

return 0;
}

/**
* @param args
*/

public static void main(String[] args) {
// TODO Auto-generated method stub

mathsfunctions mf = new mathsfunctions();

// Calling maths functions with
System.out.println(mf.result(5, basicfunctions.SUM));
System.out.println(mf.result(5, basicfunctions.AVG));

}

}
