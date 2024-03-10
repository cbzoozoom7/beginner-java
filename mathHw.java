import java.util.*;
import java.io.*;
public class mathHw {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("math.dat"));
		int lines = s.nextInt();
		for (int a = 0; a<lines; a++) {
			String operator = s.next();
			int one = s.nextInt();
			int two = s.nextInt();
			if (operator.equals("+")) {
				System.out.println(one+two);
			} else if (operator.equals("-")) {
				System.out.println(one-two);
			} else if (operator.equals("*")) {
				System.out.println(one*two);
			} else if (operator.equals("/")) {
				System.out.println(one/two);
			} else {
				System.out.println("Bad operator.");
			}
		}
	}
}