package minesweeper1;

import java.util.Random;


public class minesweeperGame {
	static int rows = 15;
	static int cols = 15;
	static int mines = 10;
	static Pair<Integer, Integer>[] minePositions;
	
	
	private static void setMinePosition(int rows, int cols, int mines) {
		for(int i=0;i<mines;i++) {
			Random r = new Random();
			int x = r.nextInt(rows);
			int y = r.nextInt(cols);
			
			Pair<Integer, Integer> minePosition = new Pair<Integer, Integer>(x, y);
			minePositions[i]= minePosition;
		}
	}
	
	public static int[][] field;
	private Pair<Integer, Integer>[] neighbors;
	
	//TODO
		static Object resetGame() {
			setMinePosition(rows, cols, mines);
			//setButtons
			System.out.println("reset");
			return null;
		}
		
		static int[][] fillField(Pair<Integer, Integer> minePosition, int cols, int rows) {
		// init field
			for(int i=0;i<cols;i++) {
				for(int j=0;j<rows;j++) {
					field[i][j] = 0;
				}
			}
			//fill with mines && values
			for(int i=0;i<minePositions.length;i++) {
				int x =minePositions[i].getX();
				int y =minePositions[i].getY();
				field[x][y]=-1;
				
				Pair<Integer, Integer>[] neighbors = getNeighborsIndex(x,y);	
							
			}
			
			return field;
		}

		public Pair<Integer, Integer>[] getNeighborsIndex(int col, int row){
			neighbors = null;
			
			if(col == 0) {
				//TODO
			}
			if (row == 0) {
				//TODO
			}
			if (col == minesweeperGame.getCols()) {
				//TODO
			}
			if(row == minesweeperGame.getRows()) {
				//TODO
			}
			
			//
			neighbors[0] = new Pair<Integer,Integer>(col-1, row-1);
			neighbors[1] = new Pair<Integer,Integer>(col-1, row);
			neighbors[2] = new Pair<Integer,Integer>(col-1, row+11);
			neighbors[3] = new Pair<Integer,Integer>(col, row-1);
			neighbors[4] = new Pair<Integer,Integer>(col, row+1);
			neighbors[5] = new Pair<Integer,Integer>(col+1, row-1);
			neighbors[6] = new Pair<Integer,Integer>(col+1, row);
			neighbors[7] = new Pair<Integer,Integer>(col+1, row+1);
			
			return neighbors;
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
