package Form;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class MP3
{
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    
    public String fileLocation;
    
    public void Stop()
    {
        if(player != null)
        {
            player.close();
            
            pauseLocation = 0;
            songTotalLength= 0;
            

            
        }
    }
    
    public void Pause()
    {
        if(player != null)
        {
            try 
            {
                pauseLocation= FIS.available();
                player.close();
            } 
            catch (IOException |  NullPointerException ex) 
            {
                
            }
            
        }
    }
    
    public void Play(String path)
    {
        try
        {
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
           
            player = new Player(BIS);
            
            songTotalLength= FIS.available();
            
            fileLocation= path;
            
        } 
  
        catch (FileNotFoundException |JavaLayerException |  NullPointerException ex)
        {
            
        } 
        catch (IOException ex) 
        {        
            Logger.getLogger(MP3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        new Thread()
        {
            @Override
            public void run()
            {
                try 
                {
                    player.play();
                    
                    if(player.isComplete() && mp3Gui.count == 1)
                    {
                        Play(fileLocation);
                    }
                
                } 
                catch (JavaLayerException |  NullPointerException ex) 
                {
                    
                }
            }
            
        }.start();
     
    }
    public void Resume()
    {
        try
        {
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);
           
            
            player = new Player(BIS);
            
            FIS.skip(songTotalLength - pauseLocation);
        } 
  
        catch (FileNotFoundException |JavaLayerException ex)
        {
            
        } catch (IOException ex) {        
            Logger.getLogger(MP3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        new Thread()
        {
            @Override
            public void run()
            {
                try 
                {
                    player.play();
                } 
                catch (JavaLayerException ex) 
                {
                    
                }
            }
            
        }.start();
        
    }
    
    
         
}
