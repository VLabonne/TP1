import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qu'elle est la hauteur ?");
		double hauteur = scan.nextDouble();
		System.out.println("Qu'elle est la longeur ?");
		double longueur = scan.nextDouble();
		System.out.println("Qu'elle est la largeur ?");
		double largeur = scan.nextDouble();
		scan.close();
		System.out.println("Le volume est de " + hauteur*longueur*largeur);

	}

}
