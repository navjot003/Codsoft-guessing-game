
import java.util.Scanner;
public class Guessingnumber {

	public static void guessingNumberGame() {
		Scanner sc = new Scanner(System.in);
		//generate the number
		int number = 1 + (int)(100*Math.random());
		//k= No. of trials
		int k = 5;
		int i,guess;
		System.out.println("A number is chosen "+" between 1 and 100."+" Guess the number"+" within 5 trials.");
		
		for(i=0 ; i<k ; i++) {
			System.out.println("Guess the number: ");
			guess = sc.nextInt();
			
			if(number == guess) {
				System.out.println("The number is correct");
				break;
				
			}
			else if(number > guess && i!=k-1){
				
				System.out.println("The number is too low");
				
			}
			else if(number < guess && i!=k-1) {
				System.out.println("The number is too high");
				
			}
		}
		if(i==k) {
			System.out.println("Your trials are finished");
			System.out.println("The number was" + number);
		}
		// TODO Auto-generated method stub

	}
	public static void main(String args[]) {
		guessingNumberGame();
	}

}
