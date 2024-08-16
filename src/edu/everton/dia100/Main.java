package edu.everton.dia100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Available games:");
		System.out.println("1- Chess");
		System.out.println("2- Checkers");
		
        System.out.print("\nType the game code: ");
		int option = scan.nextInt();

		scan.close();
		
		if(option == 1) {
			MainChess chess = new MainChess();
			chess.playChess();
		} else if (option == 2) {
			MainCheckers checkers = new MainCheckers();
			checkers.playCheckers();
		}
		
    }
}
