package Form;

import javax.swing.JLabel;

public class Light
{
	static Thread thread= new Thread();
	int r=4;
	int g=2;
	int y=3;
	int timer=0;
	

	public void startR(JLabel pRC,JLabel pRCw) throws InterruptedException
	{ 
		
            	for(int i=1;i<=r;i++)
    		{
    			
    			Thread.sleep(1000);
    			if(i==1)
    			{
    				pRC.setEnabled(true);
    				pRCw.setEnabled(true);
    			}
    			
    		}
            	
    	
            
           
	
	}	
	public void startY(JLabel pYC,JLabel pYCw) throws InterruptedException
	{		
	
            	for(int i=1;i<=y;i++)
    		{
    			
    			Thread.sleep(1000);
    			if(i==1){
    				pYC.setEnabled(true);
    				pYCw.setEnabled(true);
    			}
    		}
            
    		
            
           
	}	
	public void startG(JLabel pGC,JLabel pGCw) throws InterruptedException
	{
		
		
	            	for(int i=1;i<=g;i++)
	        		{
	        			
	        			Thread.sleep(1000);
	        			if(i==1){
	        				pGC.setEnabled(true);
	        				pGCw.setEnabled(true);
	        			}
	        		}
	            	
	        	
	          
	}	
	
	

	
}
	
	

