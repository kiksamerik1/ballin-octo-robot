package edu.esprit;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import org.junit.*; 

public class PlayersReaderTest{

	@Test
	public void testReadThreePlayers() throws Exception{

		PlayersReader reader = new PlayersReader();
		List<Player> expected = new ArrayList<Player>();
		Player messi = new Player(1, "Messi", 10);
		Player ronaldo = new Player(2, "Ronaldo", 9);
		Player zidane = new Player(3, "Zidane", 5);
		expected.add(messi);
		expected.add(ronaldo);
		expected.add(zidane);
		List<Player> read = reader.readPlayers(new File(ClassLoader.getSystemResource("./players.csv").toURI()));
		assertEquals(3, read.size());
		

	}

}