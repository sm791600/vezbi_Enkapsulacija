import java.util.Scanner;
public class Enk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vnes = new Scanner(System.in);
		System.out.println("Vnesi 2 broja");
		int prv= vnes.nextInt();
		int vtor=vnes.nextInt();
		Klasa_A a = new Klasa_A();
		a.setNumA(prv);
		a.setNumA(vtor);
		System.out.println("zbir e "+a.soberi(prv, vtor));
	}

}
