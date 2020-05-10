import java.awt.event.*;
import java.awt.*;
import java.io.FileNotFoundException;
import javax.swing.*;


public class LibrarySystem
{
	//public void actionPerformed(ActionEvent event){};
	public static void main(String [] args) throws FileNotFoundException
	{

            MainProgram main = new MainProgram();
            SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    main.setVisible(true);
                }
            });



	}
}