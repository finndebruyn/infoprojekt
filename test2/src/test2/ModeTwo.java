package test2;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ModeTwo extends JFrame{
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	JButton bReturn;

public ModeTwo() {
	setLayout(null);
	setVisible(true);
	setSize(screenSize.width,screenSize.height);
	setTitle("Slotmaschine");
	getContentPane().setBackground(Color.yellow);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(null);
	bReturn = new JButton("Zurück zum Menü");
	bReturn.setBounds(screenSize.width/2-100,screenSize.height-100,200,50);
	add(bReturn);
	Handler moHandler = new Handler();
	bReturn.addActionListener(moHandler);
}

private class Handler implements ActionListener {
	

@Override
public void actionPerformed(ActionEvent event) {
	if(event.getSource()==bReturn) {
		JFrame menu = new Menu();
	}
}
}
}
