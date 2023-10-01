package vucutkitleendeksi;

import java.util.Scanner;

public class VucutKitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double kilo, boy;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kilo giriniz: ");
		kilo = scan.nextDouble();
		
		System.out.print("Boy giriniz:");
		boy = scan.nextDouble();
		
		double sonuc = kilo / (boy*boy);
		
		System.out.println("Vücut kitle endeksiniz: "+ sonuc);

	}

}
