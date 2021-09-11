package minesweeper1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class miningButton extends JButton{
	
	int index;
	boolean isMine;
	boolean flag;
	Pair<Integer, Integer> position;
	
	miningButton(Pair<Integer, Integer> position) {
		super();
		this.position = position;
		this.addActionListener(e -> open());	
		/*
		this.addMouseListener(new MouseAdapter() ;
		{
			public void mouseClicked(MouseEvent event) 
			{
				if(event.isPopupTrigger()) 
				{
					JButton btn = (JButton) event.getSource();
					btn.doClick();
					System.out.println("Rechtsclick");
				} else {
					System.out.println("Linksclick");
				}
		
			};
		}
	*/
	}
	
	private void flagButton() {
		if(this.isFlag()) {
			this.setFlag(false);
			this.setLabel("");
		}	else {
			this.setFlag(true);
			this.setLabel("f");
		}
			
		}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public boolean isMine() {
		return isMine;
	}
	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Pair<Integer, Integer> getPosition() {
		return position;
	}
	public void setPosition(Pair<Integer, Integer> position) {
		this.position = position;
	}
	public void open() {
		this.setVisible(false);
		System.out.println("show hidden number");
	}
		}
