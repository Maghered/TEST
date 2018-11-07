import java.util.Scanner;
public class Main {
	
	private static Scanner clavier;

	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		int nb1;
		String nb;
		
		System.out.println("Saisie un nombre : ");
		nb=clavier.next();
		
		try {
            nb1=Integer.parseInt(nb);
			System.out.println(nb1*28);
        } 
        catch (NumberFormatException erreur) {
            System.out.println(nb + " n'est pas un nombre");
            System.out.println(erreur.toString());
        }//test
	}
}