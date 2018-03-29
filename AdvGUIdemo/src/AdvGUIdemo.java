/*
 * This program will simulate a grocery store shopping application.
 * Users will search for food items to add to their cart.
 *    They will then be able to remove items from the cart and checkout.
 *    
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class AdvGUIdemo 
{
   static Vector<FoodItem> foodList = new Vector<FoodItem>();//used to store food items in the cart
   public static void main(String[] Args)
   {
	   JFrame frame = new JFrame("Food Supply");//UI Frame
	   frame.setSize(800,600);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setResizable(false);
	   
	   JPanel mainPanel = new JPanel();//Main JPanel to add onto
	   mainPanel.setLayout(new BorderLayout());
	   
	   JList foodListJL = new JList(foodList);//This is going to show the food items in the cart
	   JScrollPane foodScrollPane = new JScrollPane(foodListJL);
	   mainPanel.add(foodScrollPane, BorderLayout.EAST);
	   
	   JButton checkoutBtn = new JButton("Checkout");
	   mainPanel.add(foodScrollPane, BorderLayout.EAST);
	   
	   
	   frame.add(mainPanel);
       frame.setVisible(true);	   
   }
}
