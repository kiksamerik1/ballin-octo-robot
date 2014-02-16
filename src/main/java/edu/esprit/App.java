package edu.esprit;

import java.util.*;
import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        PlayersReader reader = new PlayersReader();
        List<Player> players = reader.readPlayers(new File("/home/ego/dev/maven/qs/src/main/resources/players.csv"));
        for(Player p:players){
        	System.out.println(p);
        }
    }
}
