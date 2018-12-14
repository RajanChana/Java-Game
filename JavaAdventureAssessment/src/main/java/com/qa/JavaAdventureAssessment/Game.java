package com.qa.JavaAdventureAssessment;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		System.out.println("You have landed in the middle of a big grey swamp. It is large and dreary.");
		System.out.println("You look to your compass and find it is beeping and flashing a location.");
		System.out.println("Which way do you want go: North, East, South or West?");
		Scanner p1 = new Scanner(System.in);
		String input = p1.next();
		
		
				
		 if (input.equals("North"));
			System.out.println("You have moved North" );
		 
		 if (input.equals("East"))
				System.out.println("You have moved East");
		 
		 if (input.equals("South"))
				System.out.println("You have moved South");
		 
		 if (input.equals("West"))
				System.out.println("You have moved West");
		 
		
		 
		 Treasure.Treasurelocation(5,5);
		Player.PlayerLoction(0,0);
		
			 
		 
	}	public static void Thetreasure(){
		 Treasure.Treasurelocation(10,10);
		
	}	public static void Theplayer() {
		Player.PlayerLoction(1, 1);
			
		
	} 	public static void CompareplayerandTreasure() {
		Player p2 = new Player(2,2);
		
		Treasure t1 = new Treasure(10,10);
		
		if (Player p2 == Treasure t1)
			System.out.println("you win");
		
	}
		
	
	
}
