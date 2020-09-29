//package com;
import model.BeginGame;

public class Main {
	public static void main(String[] args){
		if (args.length == 1){
			if (args[0].equals("console")){
				System.out.println("They chose the conole");
				//BeginGame.startSwingy("gui");
				//Somethin.begin();
			}
			else if (args[0].equals("gui")){
				System.out.println("They chose the GUI");
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