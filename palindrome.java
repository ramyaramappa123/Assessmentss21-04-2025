package assessment;
import java.util.Scanner;
public class palindrome {
	

				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter the number to check for palindrome");
					int number= sc.nextInt();
					int temp =number;
					int reversed = 0;
						
					 while(temp > 0) {
						int num = temp%10;
						reversed = reversed*10 +num;
						 temp = temp/10;
						 System.out.print(num);
						}	
					
					 
					if(number == reversed) {
						System.out.println("\npalindrome");
					}else {
						System.out.println("\nNot a palindrome");
				
					 }
					}
				}








