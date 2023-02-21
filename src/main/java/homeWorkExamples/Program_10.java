package homeWorkExamples;

public class Program_10 {

	public static void main(String[] args) {
		// While loop
		System.out.println(" Using while loop");
		System.out.println(" The couting is :");
		int i = 1;
		while (i <= 1000) {
			System.out.println(i);
			i++;
		}
		System.out.println(" ");
		System.out.println(" Using Do-While loop");
		System.out.println(" The couting is :");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 1000);
		System.out.println("  ");
		System.out.println(" Using for loop");
		System.out.println(" The couting is :");
		for (int k = 1; k <= 1000; k++) {
			System.out.println(k);
		}
	}

}
