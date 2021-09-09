package minesweeper1;



import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuListener;

public class minesweeperGUI {

	private static final MenuListener MenuEvent = null;
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
	JMenu menu = new JMenu ("Menu");
	JMenuItem newGame = new JMenuItem("New Game");
	newGame.addActionListener(e -> minesweeperGame.resetGame());
	JMenuItem settings = new JMenuItem ("Settings");
	settings.addActionListener(e -> openSettings());
	
	
	JButton[] miningFields = new JButton[rows*cols];
	
	firstFrame.setSize(breite, hoehe);
	firstFrame.setResizable(false);
	firstFrame.add(panel1);
	firstFrame.setJMenuBar(menuBar);
	

	
	
	//TODO
	
	menu.add(newGame);
	menu.add(settings);
	
	// TODO actionlistener
	menuBar.add(menu);
	menuBar.setVisible(true);
	
	
	
	//TODO events funktionieren im menü nicht addMenuListener
	//resetButton.addMenuListener(MenuEvent e);
	menu.setVisible(true);
	
	
	panel1.add(panel2);
	
	
	panel2.setLayout( new GridLayout( cols, rows ) );
	panel2.setBounds(0, 1000, cols, rows);
	
	setButtons(panel2, miningFields);
	firstFrame.setVisible(true);
	}



	private static Object openSettings() {
		JFrame settingsFrame = new JFrame("settings");
		JPanel settingsPanel = new JPanel();
		
		JLabel rows = new JLabel("Rows:");
		JLabel cols = new JLabel("Cols:");
		JLabel mines = new JLabel("mines:");
		
		JButton ok = new JButton("Ok");
		JButton exit = new JButton("exit");
	
		
		
		
		settingsFrame.setSize(500, 500);
		settingsFrame.setResizable(false);
		settingsFrame.add(settingsPanel);
		settingsFrame.setVisible(true);
		
		settingsFrame.add(rows);
		settingsFrame.add(cols);
		settingsFrame.add(mines);
		
		settingsFrame.add(ok);
		settingsFrame.add(exit);
		
		System.out.println("settings opened");
		return null;
	}



	private static void setButtons(JPanel panel2, JButton[] miningFields) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				Pair<Integer, Integer> koords = new Pair<Integer, Integer>(i,j);
		miningFields[i]=new miningButton(koords);
		miningFields[i].setPreferredSize(new Dimension(25, 25));;
		
		panel2.add(miningFields[i]);
			}
		}
	}


	
	


	
	
	//TODO
	
	
}