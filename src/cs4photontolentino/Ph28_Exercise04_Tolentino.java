package ph28_exercise04_tolentino;

import java.util.Scanner;

public class Ph28_Exercise04_Tolentino {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        
        int NumOfRounds = 2;
        String ComputerMove = "";
        String PlayerMove = "";
        
        do {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option: ");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            
            int PlayerWins = 0, ComputerWins = 0;
            
            choice = scan.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("\nThis match will be first to " + NumOfRounds + " wins.");
                    while (PlayerWins < NumOfRounds && ComputerWins < NumOfRounds){
                        int random = (int) Math.floor(Math.random()*3+1);
                        switch(random){
                            case 1:
                                ComputerMove = "Rock";
                                break;
                                
                            case 2:
                                ComputerMove = "Paper";
                                break;
                                
                            case 3:
                                ComputerMove = "Scissors";
                                break;
                        }
                        
                        System.out.println("The computer selected its move. Select your move: ");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        int PlayerChoice = scan.nextInt();

                        switch(PlayerChoice){
                            case 1:
                                PlayerMove = "Rock";
                                break;
                                
                            case 2:
                                PlayerMove = "Paper";
                                break;
                                
                            case 3:
                                PlayerMove = "Scissors";
                                break;
                        }
                        
                        
                        if (PlayerMove.equals(ComputerMove)){
                            System.out.printf("\nComputer chose " + ComputerMove);
                            System.out.printf(" You chose " + PlayerMove);
                            System.out.println(" Round is tied!");
                        }
                        else if (PlayerMove.equals("Rock") && ComputerMove.equals("Scissors") ||
                    PlayerMove.equals("Paper") && ComputerMove.equals("Rock") ||
                    PlayerMove.equals("Scissors") && ComputerMove.equals("Paper")){
                            System.out.printf("\nComputer chose " + ComputerMove);
                            System.out.printf(" You chose " + PlayerMove);
                            System.out.println(" Player wins round!");
                            PlayerWins++;
                        }
                        else {
                            System.out.printf("\nComputer chose " + ComputerMove);
                            System.out.printf(" You chose " + PlayerMove);
                            System.out.println(" Computer wins round!");
                            ComputerWins++;
                        }
                        
                    }
                    
                    if (PlayerWins == NumOfRounds){
                        System.out.println("Player wins!");
                    }
                    else {
                        System.out.println("Computer wins!");
                    }
                    break;
                
                case 2:
                    System.out.println("\nHow many winds are needed to win a match?");
                    NumOfRounds = scan.nextInt();
                    break;
                
                case 3:
                    System.out.printf("\nThank you for playing!");
                    break;
            }
            System.out.printf("\n");
        } while (choice != 3);
    }
    
}
