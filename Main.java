import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Random random = new Random();
	    
	    int guessedBoxes = 0;
	    
	    while(guessedBoxes < 3){
	        ArrayList<Integer> boxesLocation = new ArrayList<Integer>();
	        
	        boolean boxesLocationList = false;
	        while(boxesLocationList == false){
	            int locationOne = random.nextInt(7)+1;
	            int locationTwo = random.nextInt(7)+1;
	            int locationThree = random.nextInt(7)+1;
	            if(locationOne != locationTwo && locationOne != locationThree && locationTwo != locationThree){
	                
	                boxesLocation.add(locationOne);
	                boxesLocation.add(locationTwo);
	                boxesLocation.add(locationThree);
	                boxesLocationList = !false;
	            }
	        }
	    
	        System.out.println(boxesLocation);
	    
	    
	   
	        int l = 5;
	        while(l > 0 && guessedBoxes != 3 ){
	        
	            for(int i = 1; i <= 3; i++){
	                System.out.println("Enter a possible number " + i);
	                int guess = scanner.nextInt();

	                for (int j = 0; j < boxesLocation.size(); j++){
	                    if(guess == boxesLocation.get(j)){
	                        boxesLocation.remove(j);
	                        guessedBoxes++;
	                    }
	                }
	            }
				clearScreen();
	            l--;
	            System.out.println("Guessed Boxes is : " + guessedBoxes);
	            System.out.println("Your attempt is "+l);
	    
	        }
	        
	        if(l == 5 || guessedBoxes != 3){
				clearScreen();
	            System.out.println("\nunfortunately our boxes found out");
	            System.out.println("that we were trying to find them and");
	            System.out.println("so they ran away");
	        }
	    }
	    
	    
	    
	}
	private static void clearScreen(){
		System.out.println("\033[H\033[2J");
		System.out.flush();

	}
	
}
