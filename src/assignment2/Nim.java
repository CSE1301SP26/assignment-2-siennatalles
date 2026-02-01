import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Initial number of sticks: ");
        int numSticks = in.nextInt();
        int round = 0;
        
        //human = even round
        //computer = odd round
        while (numSticks >0){
            if(round%2==0){ //human
                int human = 0;
                while (human!=1 && human!=2){ //will keep on prompting until choose 1 or 2
                    System.out.println("Would you like to take 1 or 2 sticks?");
                    human = in.nextInt();
                }
                System.out.println("Round: " + round + ": " + numSticks + " at start human takes "+ human + ", so "+ (numSticks-human)+ " remain");
                numSticks-=human;
            }
            else{ //computer
                int computer = 0;
                if (numSticks>=2){
                    computer = (int)(Math.random()*2) + 1;
                }
                else{
                    computer = 1;
                }
                System.out.println("Round: " + round + ": " + numSticks + " at start computer takes "+ computer + ", so "+ (numSticks-computer)+ " remain");
                numSticks-=computer;
            }
            round++;
        }

        if(round%2 ==0){
            System.out.println("The computer wins / you lose!");
		} else {
			System.out.println("You win!");
		}

    }
}
