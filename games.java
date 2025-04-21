package assessment;
import java.util.Scanner;
public class games {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Cool gaming store");
			while(true) {
				System.out.println("1.Call of Warfare| 2. Speed Racers | 3. Mystery Mansion| 4. Pixel Adventure"
						+ "| 5.Puzzle Mania|6. Exit");
				int input=sc.nextInt();
				
				if(input==6) {
					System.out.println("exit from console");
					break;
				}
				if(input<1 || input>6) {
					System.out.println("invalid input");
					
				}
				System.out.println("enter the choice of yours");
				int input=sc.nextInt();
				
				System.out.println("how many copies you want");
				int input=sc.nextInt();
				 
				
				switch(input){
				
				case 1: System.out.println()
					
				}
			}
			
		}

	}



