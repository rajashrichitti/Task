import java.io.*;

public class Rock_Paper_Scissors {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int x;

    public static void main(String[] args) throws IOException {

        int choice;
        do {
            System.out.println("\nGame Menu\t");
            System.out.println("1. Start Game\t");
            System.out.println("2. Quit Program\n");

            choice = Integer.valueOf(in.readLine()).intValue();

            if(choice == 1) {
                System.out.println("Welcome to Rock, Paper, Scissors");
                System.out.println("---------------------------------------------");
                System.out.println("Please enter Rock, Paper or Scissors to play\t");

            int wins = 0, loss = 0, ties = 0;
            String user = in.readLine();
            String pl="";
            int pl2=(int)(3*Math.random())+1;

            if (pl2==1) {
                pl="Rock";
            }
            else if (pl2==2) {
                pl="Paper";
            }
            else if (pl2==3) {
                pl="Scissors";
            }

            if (user.equals("Rock") || user.equals("rock")) {
                System.out.println("You chose : Rock\n");
                user = "Rock";
            }
            else if (user.equals("Paper") || user.equals("paper")) {
                System.out.println("You chose : Paper\n");
                user = "Paper";
            }
            else if (user.equals("Scissors")|| user.equals("scissors")) {
                System.out.println("You chose : Scissors\n");
                user = "Scissors";
            }
            else {
                System.out.println("Error: Please type Rock, Paper or Scissors\n");
            }
            System.out.println("Player2: I chose " + pl);
            if(user.equals(pl)) {
                System.out.println("\tIt's a tie!\n");
                ties++;
            }
            else if (user.equals("Rock")) {

                if (pl.equals("Scissors")){
                    System.out.println("Rock beats scissors, congrats you win!\n");
                wins++;
                }
                 if (pl.equals("Paper")){
                     System.out.println("Paper beats rock, sorry you lost!\n");
                loss++;
                 }


            }
            else if (user.equals("Paper")) {

                if (pl.equals("Rock")){
                    System.out.println("Paper beats rock, congrats you win!\n");
                    wins++;
                }
                 if (pl.equals("Scissors")){
                    System.out.println("Scissors beats paper, sorry you lost!\n");
                    loss++;   
                 }
            }
            else if (user.equals("Scissors")) {

                if (pl.equals("Paper")){
                    System.out.println("Scissors beats paper, congrats you win!\n");
                    wins++;
                }
                 if (pl.equals("Rock")){
                    System.out.println("Rock beats scissors, sorry you lost!\n");
                    loss++;     
                 }
            }
            System.out.println("Total wins :\n " +wins);
            }
            if (choice == 2) {
                System.out.println("Good Bye!.....Have a good day");
                in.close();
            }
        } while (choice !=2); 
    }
}
