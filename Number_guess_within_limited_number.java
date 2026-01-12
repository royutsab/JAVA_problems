package exercise;
import java.util.Scanner;
public class Number_guess_within_limited_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Here is the array of limited number
        int arr[] = {1, 2, 3, 4, 5};
        //you can change the size of the array, it should still work for bigger array
        //len is the length of the array
        int len = arr.length;
        
        System.out.println("Initial array:");
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Now your turn for choosing...");

        while (len > 1) {
            System.out.print("Choose a number: ");
            int n = input.nextInt();
            
            //here taken location -1 for initializing cause 0 itself is an index 
            int location = -1;

            // Checks if the number exist
            for (int i = 0; i < len; i++) {
                if (arr[i] == n) {
                    location = i;
                    break;
                }
            }

            // If not found then continue the loop by going on line 20 (while loop)
            if (location == -1) {
                System.out.println("Wrong choice! Please choose from remaining numbers.");
                continue;
            }

            // Remove the chosen number
            for (int i = location + 1; i < len; i++) {
                arr[i - 1] = arr[i];
            }
            //setting the deleted number which is the last number of the array to 0
            arr[len - 1] = 0;
            //deducting the length to get the right number
            len--;

            System.out.println("Remaining numbers:");
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        System.out.println("You are left with: " + arr[0]);
        input.close();
    }
}

