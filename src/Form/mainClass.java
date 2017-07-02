package Form;

public class mainClass extends Thread
{


	public static void main(String[] args)
	{      
	
		Login log = new Login("Table#1","Table#1");
			
		 java.awt.EventQueue.invokeLater(() -> {
	            new finalForm(log.getUserName()).setVisible(true);
	        });
		
	}
}