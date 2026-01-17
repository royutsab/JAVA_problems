package exercise;
import java.util.Scanner;
public class CardPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] deck = new int[52];
		String[] suits = {"spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		System.out.print("How many cards do you want to see:");
		int many=  input.nextInt();
        int[] king = new int[many];
		for(int i=0;i<many;i++) {
			System.out.print("Enter "+(i+1)+" card number");
			int guess = input.nextInt();
			king[i] = guess;
			System.out.println();
		}
for(int i=0;i<many;i++) {
	int temp = deck[i];
	deck[i] = king[i];
	king[i] = temp;
}
for(int i=0;i<many;i++) {
	String suit = suits[deck[i]/13];
	String rank = ranks[deck[i]%13];
	System.out.println("Card number "+deck[i]+" : "+rank+" of "+suit);
}
input.close();
	}

}
