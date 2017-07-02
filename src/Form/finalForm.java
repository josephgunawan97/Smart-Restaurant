package Form;

import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class finalForm extends mp3Gui{
	/**
	 * 
	 */
	Rating rate;
	private static final long serialVersionUID = -868156824363497082L;
	public String number;
	public static double HARGA=0;
	public finalForm(String number)
	{
		super();
		setTitle("WELCOME " + number.toUpperCase());
		
		this.number=number;
		JOptionPane call = new JOptionPane(number +  " Called");
		final JDialog pane4 = call.createDialog(null, "Message"); 
		
		
		pane4.setBounds(790, 300,200, 100);
		
//////////////////////////Waiter Calls
		JLabel Call = new JLabel("");
		Call.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			pane4.setVisible(true);
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
		Call.setBounds(338, 572, 65, 74);
		getContentPane().add(Call);
//////////////////////////
		

///////////////////////////////BILL
		JLabel Bill = new JLabel("");
		Bill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				try {
					String nota = "";
					int go=0;
					for (int i=0;i<6;i++)
					{
						if (pesanan[i].jumlah!=0)go+=1;
					}
					
					if(go!=0)
					{
					for(int i=0;i<6;i++)
					{
						if(pesanan[i].jumlah!=0)
						{
						nota+= pesanan[i].jumlah + " " + pesanan[i].makanan.nama + " " +"$"+pesanan[i].jumlah*pesanan[i].makanan.harga+"\n";
						HARGA += pesanan[i].makanan.harga*pesanan[i].jumlah;
						}
					}
					nota+="TOTAL = $"+HARGA;
					JOptionPane bill = new JOptionPane(nota);
					final JDialog panebill = bill.createDialog(null, "Message"); 

					panebill.setBounds(380, 300,200, 200);
					panebill.setVisible(true);
					HARGA=0;

						rate=new Rating();
					}	

					else JOptionPane.showMessageDialog(null,"NO ORDER");
				} catch (HeadlessException  | NullPointerException e) {
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

		Bill.setBounds(18, 568, 76, 78);
		getContentPane().add(Bill);
	
///////////////////////////////

	}
}
