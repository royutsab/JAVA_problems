package notation;
import java.util.*;
public class Lottery_using_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String luck = ""+(int)(Math.random()*10)+(int)(Math.random()*10);
System.out.print("Enter your lottery pick(two digits):");
String lottery = input.next();
while(lottery.length()!=2) {
	 luck = ""+(int)Math.random()*10+(int)Math.random()*10;
	System.out.print("Enter your lottery pick(two digits):");
lottery = input.next();
}
char lottery1 = lottery.charAt(0);
char lottery2 = lottery.charAt(1);
char luck1 = luck.charAt(0);
char luck2 = luck.charAt(1);
System.out.println("The lottery number is "+luck);
if(luck.equals(lottery)) {
	System.out.println("You won $10,000");
}
else if(lottery1==luck2 && lottery2==luck1) {
	System.out.println("You won $5,000");
}
else if(luck1 == lottery1 || luck1==lottery2 || luck2==lottery1 || luck2 == lottery2) {
	System.out.println("You won $3,000");
}
else {
	System.out.println("Sorry,no match");
}
	}

}
