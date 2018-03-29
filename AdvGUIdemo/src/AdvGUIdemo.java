
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdvGUIdemo 
{
   public static void main(String[] Args)
   {
	   JFrame frame = new JFrame("Food Supply");//UI Frame
	   frame.setSize(800,600);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setResizable(false);
	   
	   JPanel mainPanel = new JPanel();//Main JPanel to add onto
	   mainPanel.setLayout(new BorderLayout());
	   
	   frame.add(mainPanel);
       frame.setVisible(true);	   
   }
}
