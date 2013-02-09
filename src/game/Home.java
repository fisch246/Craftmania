import javax.swing.JFrame;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import java.lang.Math.*;
import java.util.*;

public class Home extends JPanel implements ActionListener, ItemListener {

    public Home() {
    	setLayout(null);
		setBackground(new Color(30,30,35));
		drawConsole();
        
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
    
	JTextArea outputArea;
    JScrollPane scrollPane;
	public void drawConsole (){ //CREATES THE CONSULE
	   	outputArea = new JTextArea("It's TIME TO CRAFT!!!!");
	   	outputArea.setLineWrap(true);
	    outputArea.setWrapStyleWord(true);
	    scrollPane = new JScrollPane(outputArea);
	    scrollPane.setBounds(20, 400, 600, 150);
	    add(scrollPane);

  }
    


}