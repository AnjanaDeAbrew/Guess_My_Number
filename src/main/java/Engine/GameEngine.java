/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Engine;

import java.awt.image.BufferedImage;

/**
 *
 * @author anjana
 */
public class GameEngine {
    String gamePlayer = null;

	/**
	 * Each player has their own game engine.
	 * 
	 * @param player
	 */
	public GameEngine(String player) {
		gamePlayer = player;
	}

	int counter = 0;
	int point = 0;
	GameServer server = new GameServer();
	Game current = null;

	/**
	 * Retrieves a game. This basic version only has two games that alternate.
	 */
	public BufferedImage nextRound() {
		current = server.getRandomGame();
		return current.getImage();

	}

	/**
	 * Checks if the parameter i is a solution to the game URL. If so, score is
	 * increased by one.
	 * 
	 * @param game
	 * @param number
	 * @return
	 */
	public boolean checkNumber( int number) {
		if (number == current.getSolution()) {
			point+=10;
			return true;
		} else {
			return false;
		}
	}
        
        public int checkSolutionReturn(){
            
            return current.getSolution();
	}

	/**
	 * Retrieves the score.
	 * 
	 * @param player
	 * @return
	 */
	public int getScore() {
		return point;
	}


}
