package Form;


import java.awt.event.WindowEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Login extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public static String userName;
	public static String passWord;
	static JLabel lblWelcome;
	
	public static String dataUserName=null;
	public static String datapassWord=null;
	
	public void close() {
	    WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
	}
	
	public Login(String name, String pass) {
	 dataUserName= name;
	datapassWord= pass;
		// Create Form Frame
		JOptionPane.showMessageDialog(null,"WELCOME");
		int bool=LoginDialog();
	    if(bool==1){
	    	WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
	    	Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
			
	    }
		
	}
	
	public String getUserName()
	{
		return dataUserName;
	}

	public static int LoginDialog() {

		JLabel title = new JLabel("Login Username and Password");
		JTextField username = new JTextField();
		JPasswordField password = new JPasswordField();
		final JComponent[] inputs = new JComponent[] {
				title,
				new JLabel("Username"),
				username,
				new JLabel("Password"),
				password
		};
		JOptionPane.showMessageDialog(null, inputs, "Login", JOptionPane.PLAIN_MESSAGE);

		userName = username.getText();
		passWord =  new String(password.getPassword()); 
		
		if((!userName.equals(dataUserName) && !passWord.equals(datapassWord)) ||(!userName.equals(dataUserName) && passWord.equals(datapassWord)) ||(userName.equals(dataUserName) && !passWord.equals(datapassWord)))
		{
			LoginDialog();
		}
		
		else if(userName.equals(dataUserName)) 
			{if(passWord.equals(datapassWord)){
				return 1;
			}
			}
		return 0;
	}
}
