package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1, str2 = "exit";
		while(true){
			System.out.printf("¿é¤J¦r¦ê:\n");
			str1 = scanner.nextLine();
			if(str1.equals(str2)){
				break;
			}
			PasswordEncorder change = new PasswordEncorder();
			str1 = change.endcode(str1);
			System.out.println(str1);
		}

	}

}
