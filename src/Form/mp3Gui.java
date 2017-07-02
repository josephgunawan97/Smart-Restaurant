package Form;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class mp3Gui extends Form{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4321421084517874189L;
	MP3 Mc = new MP3();
	String Song = System.getProperty("/Song");
	public static final String Display = null;
	protected static final JLabel LoopCounter = null;
	public static int count;
	
	public mp3Gui()
	{
		super();
		setVisible(true);
//////////////////////////////////MP3

		JLabel Play = new JLabel("");
		Play.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Mc.Resume();

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
				
		Play.setBounds(188, 587, 54, 48);
		getContentPane().add(Play);

		JLabel Stop = new JLabel("");



		Stop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Mc.Stop();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		Stop.setBounds(142, 594, 36, 33);
		getContentPane().add(Stop);

		JLabel Pause = new JLabel("");
		Pause.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Mc.Pause();
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});

		Pause.setBounds(252, 596, 36, 33);
		getContentPane().add(Pause);


		JLabel LoopCounter = new JLabel("");
		LoopCounter.setBounds(104, 622, 46, 14);
		getContentPane().add(LoopCounter);


		JLabel Search = new JLabel("");
		Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 FIles","mp3", "mpeg3");

				JFileChooser choose= new JFileChooser("Song");
				choose.addChoosableFileFilter(filter);

				int returnVal = choose.showOpenDialog(null);
					
				if (returnVal == JFileChooser.APPROVE_OPTION)
				{

					Mc.Stop();
					File myFile=choose.getSelectedFile();
					String song = myFile + "";

					String name = choose.getSelectedFile().getName();
					setText(name);


					Mc.Play(song);

				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		Search.setBounds(298, 601, 22, 21);
		getContentPane().add(Search);


		JLabel Loop = new JLabel("");
		Loop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				switch(count)
				{
				case 0:
					count =1;
					LoopCounter.setText(" On");
					break;
				case 1:
					count =0;
					LoopCounter.setText(" Off");
					break;
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		Loop.setBounds(110, 601, 22, 21);
		getContentPane().add(Loop);

////////////////////////////////

	}
	
}
