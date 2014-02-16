package edu.esprit;

import java.util.*;
import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        PlayersReader reader = new PlayersReader();
        List<Player> players = reader.readPlayers(App.class.getResourceAsStream("/players.csv"));
        for(Player p:players){
        	System.out.println(p);
        }
    }
}
