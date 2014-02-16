package edu.esprit;

import java.util.*;
import java.io.*;
import java.util.logging.*;

public class PlayersReader{
	
	public List<Player> readPlayers(InputStream in){
		List<Player> players = new ArrayList<Player>();
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = br.readLine()) != null){
				String[] tokens = line.split(",");
				Player player = new Player();
				player.setId(Integer.parseInt(tokens[0]));
				player.setName(tokens[1]);
				player.setNumber(Integer.parseInt(tokens[2]));
				players.add(player);
			}
		}catch(Exception e){
			Logger.getLogger(PlayersReader.class.getName()).log(Level.INFO, "error while reading file");
		}
		return players;
	}
}