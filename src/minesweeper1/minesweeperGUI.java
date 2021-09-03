package minesweeper1;



import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class minesweeperGUI {

	static int rows = minesweeperGame.getRows();
	static int cols = minesweeperGame.getCols();
	int mines = minesweeperGame.getMines();
		
	static int breite = rows*25 + 50;
	static int hoehe = cols * 25 + 85;
	
	int[] miningValue = new int[rows*cols];
	
	
	public static void main(String[] args) {
	
	JFrame firstFrame = new JFrame("Minesweeper");
	

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JMenuBar menuBar = new JMenuBar();
	
	JMenu resetButton = new JMenu ("New Game");
	JMenu settings = new JMenu ("Settings");
	JButton[] miningFields = new JButton[rows*cols];
	
	firstFrame.setSize(breite, hoehe);
	firstFrame.setResizable(false);
	firstFrame.add(panel1);
	firstFrame.setJMenuBar(menuBar);
	firstFrame.setVisible(true);
	
	
	// TODO actionlistener
	menuBar.add(resetButton);
	menuBar.add(settings);
	menuBar.setVisible(true);
	
	
	
	
	resetButton.addActionListener(e -> minesweeperGame.resetGame());
	resetButton.setVisible(true);
	
	
	panel1.add(panel2);
	
	
	panel2.setLayout( new GridLayout( cols, rows ) );
	panel2.setBounds(0, 1000, cols, rows);
	
	setButtons(panel2, miningFields);
	}



	private static void setButtons(JPanel panel2, JButton[] miningFields) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
		miningFields[i]=new JButton();
		miningFields[i].setPreferredSize(new Dimension(25, 25));;
		miningFields[i].addActionListener(e -> open());
		panel2.add(miningFields[i]);
			}
		}
	}


	
	private static Object open() {
		// TODO
		System.out.println("show hidden number");
		return null;
	}


	
	
	//TODO
	
	
}