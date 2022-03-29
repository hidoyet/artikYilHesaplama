package artikYilHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Yýlý giriniz");
		int year=scanner.nextInt();
		if(year%4==0) {
			System.out.println("artýk yýldýr");
		}else {
			System.out.println("artýk yýl deðildir");
		}
		

	}

}
