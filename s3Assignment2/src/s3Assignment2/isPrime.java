package s3Assignment2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class isPrime {
	public boolean primeNumber(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter the Number to be Checked: ");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		isPrime isit=new isPrime();
		System.out.println("The Entered Number is: " +a+ " !! Is it Prime? "+isit.primeNumber(a));
	}
}
