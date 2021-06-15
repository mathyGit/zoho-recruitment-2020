import java.util.Scanner;

public class Pattern {

	public static void printPattern(String n) {
		
		int length = n.length();
		int middle = length/2;
		int iter = 0;
		String output = "";
		
		for(int i=0;i<length;i++) {
			for(int k=i;k<length-1;k++) {
				System.out.print(" ");
			}
			if((middle+iter)>(length-1)) {
				middle=0;
				iter=0;
			}
			output = output+n.charAt(middle+iter)+"";
			iter++;
			System.out.print(output);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputWord = sc.nextLine();
		printPattern(inputWord);
		sc.close();
	}

}
