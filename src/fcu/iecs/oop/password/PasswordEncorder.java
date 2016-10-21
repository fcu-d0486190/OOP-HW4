package fcu.iecs.oop.password;

public class PasswordEncorder {
	public String endcode(String str1){
		String str2, str3, str4, str5, str6, str7, str8, str9, str10;
		str2 = str1.replace("A", "4");
		str3 = str2.replace("a", "4");
		str4 = str3.replace("E", "3");
		str5 = str4.replace("e", "3");
		str6 = str5.replace("I", "1");
		str7 = str6.replace("i", "1");
		str8 = str7.replace("O", "0");
		str9 = str8.replace("o", "0");
		str10 = str9.replace("T", "7");
		str10.replace("t", "7");
		return str10;
	}
	
}
