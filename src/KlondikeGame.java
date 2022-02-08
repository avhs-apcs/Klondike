import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class KlondikeGame {
	//#region vars
	public static final int DELAY_INTERVAL = 50, INIT_W = 1000, INIT_H = 800;
	private JFrame frame = new JFrame("Klondike");
	private JPanel panel;
	private final Dimension DIM = new Dimension(INIT_W,INIT_H);
	private GameBoard board = new GameBoard();
	private Timer timer = new Timer(DELAY_INTERVAL, null);
	//#endregion vars
	
	public static void main(String[] args) {
		new KlondikeGame().start();
	}

	private void start() {
		panel = new JPanel() {
			@Override 
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				board.draw(g);
			}
		};
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				clickedAt(me);
			}
		});
		panel.setPreferredSize(DIM);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		timer.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				board.update(e);
				panel.repaint();
			}
		});
	}

	protected void clickedAt(MouseEvent me) {
		board.justClicked(me);
		panel.repaint();
	}

}
