import java.util.ArrayList;
import java.util.Scanner;

public class Monopoly {

    public static ArrayList<Player> playerArrayList = new ArrayList<Player>();
    private Player CurrentPlayer ;
    static Monopoly theGame = new Monopoly();

    

    public void Game () {
        System.out.println("Welcome to the game please  type number of  players");

        Scanner playerNumber = new Scanner(System.in);
        Scanner playerName = new Scanner(System.in);

        int numberOFplayers = playerNumber.nextInt();

        for (int i = 0; i < numberOFplayers; i++) {
            new Player(playerName.nextLine());
        }

        while (true) {

            for (Player a : playerArrayList) {

                CurrentPlayer = a;

                System.out.println("---------------------------CurrentPlayer is" + CurrentPlayer.getName());

                CurrentPlayer.Dice();
                if(CurrentPlayer.getLocation()>100)
                {
                    break;
                }
                System.out.println("Player " + CurrentPlayer.getName() + " Throwed The Dice \n --Current Location is " + CurrentPlayer.getLocation());

            }
            if(CurrentPlayer.getLocation()>100)
            {
                break;
            }
        }
        System.out.println("The  winner  is " + CurrentPlayer.getName() +" with "+ CurrentPlayer.getLocation());
    }


    public  static  void main (String[] args){

            theGame.Game();

    }



























}
