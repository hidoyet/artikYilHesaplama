package artikYilHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Yılı giriniz");
		int year=scanner.nextInt();
		if(year%4==0) {
			System.out.println("Artık yıldır");
		}else {
			System.out.println("Artık yıl değildir");
		}
	}
}
