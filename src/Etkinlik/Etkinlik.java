package Etkinlik;
import java.util.Scanner;
public class Etkinlik {
	public static void main(String[]args) {
		int heat;
		Scanner inp = new Scanner(System.in);
		System.out.print("sıcaklığı girin:");
		heat = inp.nextInt();
		if(heat<5) {
			System.out.print("kayak");
		}
		else if(4 <heat  && heat<26) {
			if(heat<16) {
			System.out.print("sinema");
		}
			if(heat>9) {
				System.out.print("piknik");
				
			}
		} else {
			System.out.print("yüzme");
		}
	}

}
