package edu.esprit;

public class Player{

	private int id;
	private String name;
	private int number;

	public Player(){
	}

	public Player(int id, String name, int number){
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public void setId(int id){this.id=id;}
	public void setName(String name){this.name=name;}
	public void setNumber(int number){this.number=number;}

	public int getId(){return id;}
	public String getName(){return name;}
	public int getNumber(){return number;}

	public String toString(){
		return "Player [id="+id+", name="+name+", number="+number+"]";
	}
}