import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Votre nom s'il vous plait");
		String User = scan.nextLine();
		System.out.println(" Hello " + User );
		scan.close();
	}

}
