package com;
import model.BeginGame;
import controller.ConsoleMode;

public class Main {
	public static void main(String[] args){
		if (args.length == 1){
			if (args[0].equals("console")){
				ConsoleMode.startSwingy();
				//Somethin.begin();
			}
			else if (args[0].equals("gui")){
				BeginGame.startSwingy();
			}
			else{
				System.out.println("Unrecognised input");	
			}
		}
		else{
			System.out.println("Invalid input");
		}
	}
}