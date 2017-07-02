package Form;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Dimension;

public class Rating extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image rate= new ImageIcon(this.getClass().getResource("/Rating.png")).getImage();
	Image star= new ImageIcon(this.getClass().getResource("/Star.png")).getImage();
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	public Rating() {
		
		setSize(300,132);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2-20);
		
		JLabel star1 = new JLabel("");
		star1.setEnabled(false);
		star1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				star1.setEnabled(true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				star1.setEnabled(false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				star1.setEnabled(true);
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Thank You");
			}
		});
		star1.setBounds(15, 28, 54, 50);
		star1.setIcon(new ImageIcon(star));
		getContentPane().add(star1);
		
		JLabel star2 = new JLabel("");
		star2.setEnabled(false);
		star2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);

				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent arg0) {
				star1.setEnabled(false);
				star2.setEnabled(false);

				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mouseClicked(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Thank You");
			}
		});
		star2.setBounds(67, 28, 54, 50);
		star2.setIcon(new ImageIcon(star));
		getContentPane().add(star2);
		
		JLabel star3 = new JLabel("");
		star3.setEnabled(false);
		star3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);
				star3.setEnabled(true);

				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent arg0) {
				star1.setEnabled(false);
				star2.setEnabled(false);
				star3.setEnabled(false);

				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mouseClicked(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);
				star3.setEnabled(true);
				setVisible(false);

				JOptionPane.showMessageDialog(null, "Thank You");
			}
		});
		star3.setBounds(119, 28, 54, 50);
		star3.setIcon(new ImageIcon(star));
		getContentPane().add(star3);
		
		JLabel star4 = new JLabel("");
		star4.setEnabled(false);
		star4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);
				star3.setEnabled(true);
				star4.setEnabled(true);

				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent arg0) {
				star1.setEnabled(false);
				star2.setEnabled(false);
				star3.setEnabled(false);
				star4.setEnabled(false);

				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mouseClicked(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);
				star3.setEnabled(true);
				star4.setEnabled(true);
				setVisible(false);

				JOptionPane.showMessageDialog(null, "Thank You");
			}
		});
		star4.setBounds(172, 28, 54, 50);
		star4.setIcon(new ImageIcon(star));
		getContentPane().add(star4);
		
		JLabel star5 = new JLabel("");
		star5.setEnabled(false);
		star5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);
				star3.setEnabled(true);
				star4.setEnabled(true);
				star5.setEnabled(true);

				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent arg0) {
				star1.setEnabled(false);
				star2.setEnabled(false);
				star3.setEnabled(false);
				star4.setEnabled(false);
				star5.setEnabled(false);

				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mouseClicked(MouseEvent arg0) {
				star1.setEnabled(true);
				star2.setEnabled(true);
				star3.setEnabled(true);
				star4.setEnabled(true);
				star5.setEnabled(true);
				setVisible(false);

				JOptionPane.showMessageDialog(null, "Thank You");
			}
		});
		star5.setBounds(224, 28, 54, 50);
		star5.setIcon(new ImageIcon(star));
		getContentPane().add(star5);
	
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, 0, 291, 191);
		bg.setIcon(new ImageIcon(rate));
		
		getContentPane().add(bg);
		setVisible(true);
	}
}
