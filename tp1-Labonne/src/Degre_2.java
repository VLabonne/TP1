import java.util.Scanner;
public class Degre_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qu'elles sont les coefs?");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		double delta=b*b-4*a*c;
		if(delta<0) {
			double cr=((-b)/(2*a));
			double c2i=((Math.sqrt(Math.abs(delta)))/(2*a));
			System.out.println("Les racines complexes sont "+cr+" +/-"+c2i+"*i");
			}
		if(delta==0) {
			double x=-b/(2*a);
			System.out.println(x+" est la racine double");}
		if (delta>0){
			double x1=(-b-Math.sqrt(delta))/(2*a);
			double x2=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("Les racines sont " +x1 +" et " + x2);
		}
	}

}
