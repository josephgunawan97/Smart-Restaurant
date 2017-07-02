package Form;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import Menu.MenuList;
import Menu.Menupic;
import Menu.Order;

import javax.swing.ImageIcon;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.SystemColor;
import java.awt.Color;



public class Form extends JFrame 
{
	Light Prog = new Light();
	Menupic newpic= new Menupic();
	Order[] pesanan=new Order[6];
	MenuList daftar = new MenuList();;
	
	int jmlPP,jmlHP,jmlCP,jmlMP,jmlT,jmlLT;
	public JLabel Display;
	
	

	
	 static JOptionPane redd = new JOptionPane("Order Is Received");
	 static JOptionPane yelloww = new JOptionPane("Food Is Cooked");
	 static JOptionPane greenn = new JOptionPane("Enjoy Your Meal");
	final  static JDialog pane = redd.createDialog(null, "Message"); 
	final  static JDialog pane2 = yelloww.createDialog(null, "Message"); 
	final  static JDialog pane3 = greenn.createDialog(null, "Message"); 

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	DefaultListModel<String> listModel = new DefaultListModel<String>();

	public static String[] menu;
	private static final long serialVersionUID = -8692378507003111806L;
	

	Image form= new ImageIcon(this.getClass().getResource("/form.png")).getImage();
	Image waiter= new ImageIcon(this.getClass().getResource("/waiterform1.png")).getImage();
	Image yColor= new ImageIcon(this.getClass().getResource("/YC1.png")).getImage();
	Image gColor= new ImageIcon(this.getClass().getResource("/GC1.png")).getImage();
	Image rColor= new ImageIcon(this.getClass().getResource("/RC1.png")).getImage();
	
	
	int indexCP=-1;
	int indexPP=-1;
	int indexMP=-1;
	int indexHP=-1;
	int indexLT=-1;
	int indexT=-1;
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Form() {
		
		getContentPane().setBackground(new Color(255, 228, 225));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(845,695);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2-20);
		
		getContentPane().setLayout(null);
		
		 Display = new JLabel("");
		Display.setBounds(110, 568, 210, 14);
		getContentPane().add(Display);

/////////////////////////////// FOOD ORDERING
		


		JList list = new JList();
		list.setBounds(217, 314, 169, 207);
		getContentPane().add(list);
		
		
		JComboBox hpNum = new JComboBox();
		hpNum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED)
				{
					jmlHP=Integer.parseInt(hpNum.getSelectedItem().toString());
					int indexHP=-1;
					for(int i=0; i<listModel.size(); i++)
					{
						if(listModel.getElementAt(i).indexOf("Ham Pizza")>0)
						{
							indexHP=i;

						}
					}
					if(indexHP>=0)
					{
						listModel.setElementAt(jmlHP + " Ham Pizza", indexHP);
					}
					else
					{
						listModel.addElement(jmlHP + " Ham Pizza");
					}
					list.setModel(listModel);
					repaint();
				}
			}
		});
		
		JList list_1 = new JList();
		list_1.setBounds(472, 47, 318, 235);
		getContentPane().add(list_1);
		hpNum.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		hpNum.setBounds(160, 130, 36, 20);
		getContentPane().add(hpNum);
		
		JComboBox tNum = new JComboBox();
		tNum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED)
				{
					jmlT=Integer.parseInt(tNum.getSelectedItem().toString());
					
					for(int i=0; i<listModel.size(); i++)
					{
						if(listModel.getElementAt(i).indexOf("Tea")>=0)
						{
							if(listModel.getElementAt(i).indexOf("Lemon")<0)
							indexT=i;	
						}
					}
					if(indexT>=0)
					{
						listModel.setElementAt(jmlT + " Tea", indexT);
					}
					else
					{
						listModel.addElement(jmlT + " Tea");
					}
					list.setModel(listModel);
					repaint();
				}
			}
		});
		tNum.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		tNum.setBounds(160, 214, 36, 20);
		getContentPane().add(tNum);
		
		JComboBox cpNum = new JComboBox();
		cpNum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED)
				{
					jmlCP=Integer.parseInt(cpNum.getSelectedItem().toString());
				
					for(int i=0; i<listModel.size(); i++)
					{
						if(listModel.getElementAt(i).indexOf("Cheese Pizza")>=0)
						{
							indexCP=i;
	
						}
					}
					if(indexCP>=0)
					{
						listModel.setElementAt(jmlCP + " Cheese Pizza", indexCP);
					}
					else
					{
						listModel.addElement(jmlCP + " Cheese Pizza");
					}
					list.setModel(listModel);
					repaint();
				}
			}
		});
		cpNum.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cpNum.setBounds(160, 102, 36, 20);
		getContentPane().add(cpNum);
		
		JComboBox mpNum = new JComboBox();
		mpNum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED)
				{
					jmlMP=Integer.parseInt(mpNum.getSelectedItem().toString());
				
					for(int i=0; i<listModel.size(); i++)
					{
						if(listModel.getElementAt(i).indexOf("Mushroom Pizza")>=0)
						{
							indexMP=i;
						}
					}
					if(indexMP>=0)
					{
						listModel.setElementAt(jmlMP + " Mushroom Pizza", indexMP);
					}
					else
					{
						listModel.addElement(jmlMP + " Mushroom Pizza");
					}
					list.setModel(listModel);
					repaint();
				}
			}
		});

		mpNum.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		mpNum.setBounds(160, 74, 36, 20);
		getContentPane().add(mpNum);
		
		JComboBox ltNum = new JComboBox();
		ltNum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED)
				{
					jmlLT=Integer.parseInt(ltNum.getSelectedItem().toString());
			
					for(int i=0; i<listModel.size(); i++)
					{
						if(listModel.getElementAt(i).indexOf("Lemon Tea")>=0)
						{
							indexLT=i;
						}
					}
					if(indexLT>=0)
					{
						listModel.setElementAt(jmlLT + " Lemon Tea", indexLT);
					}
					else
					{
						listModel.addElement(jmlLT + " Lemon Tea");
					}
					list.setModel(listModel);
					repaint();
				}
			}
		});
		ltNum.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		ltNum.setBounds(160, 186, 36, 20);
		getContentPane().add(ltNum);
		
		JComboBox ppNum = new JComboBox();
		ppNum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED)
				{
					jmlPP=Integer.parseInt(ppNum.getSelectedItem().toString());
				
					for(int i=0; i<listModel.size(); i++)
					{
						if(listModel.getElementAt(i).indexOf("Pepperoni Pizza")>=0)
						{
							indexPP=i;
						}
					}
					if(indexPP>=0)
					{
						listModel.setElementAt(jmlPP + " Pepperoni Pizza", indexPP);
					}
					else
					{
						listModel.addElement(jmlPP + " Pepperoni Pizza");
					}
					list.setModel(listModel);
					repaint();
				}
			}
		});
		ppNum.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		ppNum.setBounds(160, 45, 36, 20);
		getContentPane().add(ppNum);
		JLabel pic = new JLabel("");
		pic.setBounds(210, 48, 179, 179);
		getContentPane().add(pic);
		
		Label PepperoniPizza = new Label("Pepperoni Pizza   $5");
		PepperoniPizza.setBackground(SystemColor.menu);
		PepperoniPizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pic.setIcon(new ImageIcon (newpic.PPizza));
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
		PepperoniPizza.setBounds(18, 45, 132, 22);
		getContentPane().add(PepperoniPizza);
		
		Label CheesePizza = new Label("Cheese Pizza      $3");
		CheesePizza.setBackground(SystemColor.menu);
		CheesePizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pic.setIcon(new ImageIcon (newpic.CPizza));
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
		CheesePizza.setBounds(18, 100, 132, 22);
		getContentPane().add(CheesePizza);
		
		Label LemonTea = new Label("Lemon Tea          $1.5");
		LemonTea.setBackground(SystemColor.menu);
		LemonTea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pic.setIcon(new ImageIcon (newpic.lemontea));
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
		LemonTea.setBounds(18, 184, 132, 22);
		getContentPane().add(LemonTea);
		
		Label Tea = new Label("Tea                       $1");
		Tea.setBackground(SystemColor.menu);
		Tea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pic.setIcon(new ImageIcon (newpic.tea));
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
		Tea.setBounds(18, 212, 132, 22);
		getContentPane().add(Tea);
		
		Label HamPizza = new Label("Ham Pizza           $6");
		HamPizza.setBackground(SystemColor.menu);
		HamPizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pic.setIcon(new ImageIcon (newpic.HPizza));
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
		HamPizza.setBounds(18, 128, 132, 22);
		getContentPane().add(HamPizza);
		
		Label MushroomPizza = new Label("Mushroom Pizza  $4");
		MushroomPizza.setBackground(SystemColor.menu);
		MushroomPizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
					pic.setIcon(new ImageIcon (newpic.MPizza));
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
		MushroomPizza.setBounds(18, 72, 132, 22);
		getContentPane().add(MushroomPizza);

///////////////////////////////		
		
//////////////////////////////PROGRESSION

		pane.setBounds(380, 300,200, 100);  
		pane2.setBounds(380, 300,200, 100);  
		pane3.setBounds(380, 300,200, 100);  
		
		JLabel pGCw = new JLabel("");
		pGCw.setEnabled(false);
		pGCw.setIcon(new ImageIcon(gColor));
		pGCw.setBounds(532, 22, 14, 14);
		getContentPane().add(pGCw);
		
		JLabel pYCw  = new JLabel("");
		pYCw.setEnabled(false);
		pYCw.setIcon(new ImageIcon(yColor));
		pYCw.setBounds(502, 22, 14, 14);
		getContentPane().add(pYCw);
		
		JLabel pRCw  = new JLabel("");
		pRCw.setEnabled(false);
		pRCw.setIcon(new ImageIcon(rColor));
		pRCw.setBounds(472, 22, 14, 14);
		getContentPane().add(pRCw);

		JLabel pGC = new JLabel("");
		pGC.setIcon(new ImageIcon(gColor));
		pGC.setBounds(383, 19, 14, 14);
		getContentPane().add(pGC);

		JLabel pYC = new JLabel("");
		pYC.setIcon(new ImageIcon(yColor));
		pYC.setBounds(353, 19, 14, 14);
		getContentPane().add(pYC);

		JLabel pRC = new JLabel("");
		pRC.setIcon(new ImageIcon(rColor));
		pRC.setBounds(323, 19, 14, 14);
		getContentPane().add(pRC);

		pGC.setEnabled(false);
		pRC.setEnabled(false);
		pYC.setEnabled(false);


		JLabel Order = new JLabel("");
		Order.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {

	
				new Thread()
				{
					@Override
					public void run()
					{
						try {
            	 
							pesanan[0]=new Order(daftar.CheesePizza,jmlCP);
							pesanan[1]=new Order(daftar.HamPizza,jmlHP);
							pesanan[2]=new Order(daftar.PepperoniPizza,jmlPP);
							pesanan[3]=new Order(daftar.MushroomPizza,jmlMP);
							pesanan[4]=new Order(daftar.Tea,jmlT);
							pesanan[5]=new Order(daftar.LemonTea,jmlLT);
            		
							int go=0;
							for (int i=0;i<6;i++)
							{
								if (pesanan[i].jumlah!=0)go+=1;
							}
							if(go!=0)
							{
								list_1.setModel(listModel);
				            	
			            		
								Prog.startR(pRC,pRCw);
								Form.pane.setVisible(true);
								Prog.startY(pYC,pYCw);
								Form.pane2.setVisible(true);
								Prog.startG(pGC,pGCw);
								Form.pane3.setVisible(true);
							
							}
							
							else
								JOptionPane.showMessageDialog(null,"NO ORDER");
							} catch (InterruptedException e) {
					
							}
				
						pGC.setEnabled(false);
						pRC.setEnabled(false);
						pYC.setEnabled(false);
						pGCw.setEnabled(false);
						pRCw.setEnabled(false);
						pYCw.setEnabled(false);
				
					
					}
          
				}.start();
		

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
		Order.setBounds(240, 287, 123, 14);
		getContentPane().add(Order);


///////////////////////////////

		

		JLabel Customer = new JLabel("");
		Customer.setIcon(new ImageIcon(form));
		Customer.setBounds(10, 11, 400, 637);
		getContentPane().add(Customer);
		
		JLabel Waiter = new JLabel("");
		Waiter.setIcon(new ImageIcon(waiter));
		Waiter.setBounds(430, 11, 400, 637);
		getContentPane().add(Waiter);
	}

public void setText(String txt)
{
     Display.setText(txt);
}

}
