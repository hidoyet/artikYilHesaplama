package artikYilHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Y�l� giriniz");
		int year=scanner.nextInt();
		if(year%4==0) {
			System.out.println("art�k y�ld�r");
		}else {
			System.out.println("art�k y�l de�ildir");
		}
		

	}

}
