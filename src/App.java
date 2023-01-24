import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Player player1 = new Player("Joe"); //declare a new object of class Player
        //use the method from Player.java to add sports to Player objects
        player1.addSport("basketball");
        player1.addSport("Football");
        player1.addSport("JuiJutsu");
        Player player2 = new Player("Magns"); //declare a new object of class Player
        player2.addSport("American Football");
        player2.addSport("Football");
        player2.addSport("Weight Lifting");
        Player player3 = new Player("Nic"); //declare a new object of class Player
        player3.addSport("BaseBall");
        player3.addSport("Boxing");
        player3.addSport("Weight Lifting");


        ArrayList <Player> players = new ArrayList<>(); // this is an array of type Player 
       //using a method to add player1,player2,player3 to the players array
        players.add(player1);
        players.add(player2);
        players.add(player3);

        String[] listOfSports = { "American Football","BaseBall", "Weight Lifting", "Football", "basketball", "JuiJutsu", "Boxing" };


  for (String sport: listOfSports) // similar to for each 
    {
        for (Player player:players){
            ArrayList<String> sports = player.getSports();
            if (sports.contains(sport))
            {
                System.out.println(player.name + " plays " + sport);
            }
        }
    }
    }   
}
