package minesweeper1;

import java.util.Random;


public class minesweeperGame {
	static int rows = 15;
	static int cols = 15;
	static int mines = 10;
	Pair<Integer, Integer>[] minePositions;
	
	private void setMines() {
		for(int i=0;i<mines;i++) {
			Random r = new Random();
			int x = r.nextInt(rows);
			int y = r.nextInt(cols);
			
			Pair<Integer, Integer> minePosition = new Pair<Integer, Integer>(x, y);
			minePositions[i]= minePosition;
		}
	}
	
	//TODO
		static Object resetGame() {
			System.out.println("reset");
			return null;
		}


		public static int getRows() {
			return rows;
		}


		public static void setRows(int rows) {
			minesweeperGame.rows = rows;
		}


		public static int getCols() {
			return cols;
		}


		public static void setCols(int cols) {
			minesweeperGame.cols = cols;
		}


		public static int getMines() {
			return mines;
		}


		public static void setMines(int mines) {
			minesweeperGame.mines = mines;
		}
}
