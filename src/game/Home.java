package game;

import javax.swing.JFrame;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import java.lang.Math.*;
import java.util.*;

public class Home extends JPanel /*implements ActionListener, ItemListener*/ {

	String penguin = "linux";
    public Home() {
    	setLayout(null);
		setBackground(new Color(30,30,35));
		drawConsole();
		
		
		v.add(Pandas);
        v.add(penguin);
        
        System.out.println("int test: "+v.get(0)+" String test: "+v.get(1));
        
    }
   
    public static void main(String[] args) { //CREATES THE FRAME

        JFrame frame = new JFrame("CraftMania!");
        frame.add(new Home());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    //BEGIN PROGRAM STUFF
    Vector v = new Vector(300);
    String TreeBranch = "Nothing";
    int Pandas = 10;
    
    
    
	JTextArea outputArea;
    JScrollPane scrollPane;
	public void drawConsole (){ //CREATES THE CONSULE
	   	outputArea = new JTextArea("It's TIME TO CRAFT!!!!");
	   	outputArea.append("\n...Lets do this!!!!");
		outputArea.setCaretPosition(outputArea.getDocument().getLength());
	   	outputArea.setLineWrap(true);
	    outputArea.setWrapStyleWord(true);
	    scrollPane = new JScrollPane(outputArea);
	    scrollPane.setBounds(620, 10, 360, 540);
	    add(scrollPane);

  }
    


}