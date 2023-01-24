import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<String> sports; //declaring an array of string
//make the methods rrquired over here and implement them in App.java
    public Player (String name) //initializing a new array named sport
    {
        this.name = name;
        sports = new ArrayList<>();

    }

    public void addSport(String sport)//adding a sport to the Player obj
    {
        sports.add(sport);
    }

    public String getName()//getter
    {
        return name;
    }

    public ArrayList<String> getSports(){ //getter for the sports
        return sports;
    }

    @Override  //provides a alternative two string method provided by the user instead of the default method
    public String toString(){
        return "Player [name=" + name + ", sports=" + sports + "]" ; 
    }











    
}
