package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NissanTiida car =new NissanTiida();
		int loop;
		System.out.println("Please enter a number:");
		loop = scanner.nextInt();
		car.tiida(loop);

	}

}