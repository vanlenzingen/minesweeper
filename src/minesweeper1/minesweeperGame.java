package minesweeper1;

import java.util.Random;


public class minesweeperGame {
	static int rows = 15;
	static int cols = 15;
	static int mines = 10;
	static Pair<Integer, Integer>[] minePositions;
	
	
	minesweeperGame(int rows, int cols, int mines){
		minesweeperGame.rows = rows;
		minesweeperGame.cols = cols;
		minesweeperGame.mines = mines;
	}
	
	
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
	
	//TODO
		static Object resetGame() {
			System.out.println("reset game");
			setMinePosition(rows, cols, mines);
			fillField(minePositions, cols, rows);
			//setButtons
			return null;
		}
		
		static int[][] fillField(Pair<Integer, Integer> minePositions[], int cols, int rows) {
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
				for(int j = 0; j<neighbors.length;j++) {
					field[neighbors[j].getX()][neighbors[j].getY()]++;
				}
			}
			return field;
		}

		
		public static Pair<Integer, Integer>[] getNeighborsIndex(int col, int row){
			Pair<Integer, Integer>[] neighbors = null;
			if(col == 0 && row != 0 && row != rows) {
				neighbors[0] = new Pair<Integer,Integer>(col, row-1);
				neighbors[1] = new Pair<Integer,Integer>(col, row+1);
				neighbors[2] = new Pair<Integer,Integer>(col+1, row-1);
				neighbors[3] = new Pair<Integer,Integer>(col+1, row);
				neighbors[4] = new Pair<Integer,Integer>(col+1, row+1);
			} else if(col == cols && row != 0 && row != rows) {
				neighbors[0] = new Pair<Integer,Integer>(col-1, row-1);
				neighbors[1] = new Pair<Integer,Integer>(col-1, row);
				neighbors[2] = new Pair<Integer,Integer>(col-1, row+1);
				neighbors[3] = new Pair<Integer,Integer>(col, row-1);
				neighbors[4] = new Pair<Integer,Integer>(col, row+1);
			} else if(row == 0 && col != 0 && col != cols) {
				neighbors[0] = new Pair<Integer,Integer>(col-1, row);
				neighbors[1] = new Pair<Integer,Integer>(col-1, row+1);
				neighbors[2] = new Pair<Integer,Integer>(col, row+1);
				neighbors[3] = new Pair<Integer,Integer>(col+1, row);
				neighbors[4] = new Pair<Integer,Integer>(col+1, row+1);
			} else if(row == rows && col != 0 && col != cols) {
				neighbors[0] = new Pair<Integer,Integer>(col-1, row-1);
				neighbors[1] = new Pair<Integer,Integer>(col-1, row);
				neighbors[2]= new Pair<Integer,Integer>(col, row-1);
				neighbors[3] = new Pair<Integer,Integer>(col+1, row-1);
				neighbors[4] = new Pair<Integer,Integer>(col+1, row);
			} else if(row == 0 && col == 0) {
				neighbors[0] = new Pair<Integer,Integer>(col, row+1);
				neighbors[1] = new Pair<Integer,Integer>(col+1, row);
				neighbors[2] = new Pair<Integer,Integer>(col+1, row+1);
			} else if(row == rows && col == cols) {
				neighbors[0] = new Pair<Integer,Integer>(col-1, row-1);
				neighbors[1] = new Pair<Integer,Integer>(col-1, row);
				neighbors[2] = new Pair<Integer,Integer>(col, row-1);
			} else {
				neighbors[0] = new Pair<Integer,Integer>(col-1, row-1);
				neighbors[1] = new Pair<Integer,Integer>(col-1, row);
				neighbors[2] = new Pair<Integer,Integer>(col-1, row+1);
				neighbors[3] = new Pair<Integer,Integer>(col, row-1);
				neighbors[4] = new Pair<Integer,Integer>(col, row+1);
				neighbors[5] = new Pair<Integer,Integer>(col+1, row-1);
				neighbors[6] = new Pair<Integer,Integer>(col+1, row);
				neighbors[7] = new Pair<Integer,Integer>(col+1, row+1);
			}
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
