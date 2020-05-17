package test2;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Menu extends JFrame {
	
int xbSize = 200;
int ybSize = 50;


public JButton bEinarmigerBandit, bSlotmachine, bHelp, bEnd;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

public Menu() {
	setLayout(null);
	setVisible(true);
	setSize(screenSize.width,screenSize.height);
	setTitle("Online Casino");
	getContentPane().setBackground(Color.blue);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(null);
	bEinarmigerBandit = new JButton("Einarmiger Bandit");
	bSlotmachine = new JButton("Slotmachine");
	bHelp = new JButton("Hilfe");
	bEnd = new JButton("Spiel schlieﬂen");
	bEinarmigerBandit.setBounds(screenSize.width/2-xbSize/2,150,xbSize,ybSize);
	bSlotmachine.setBounds(screenSize.width/2-xbSize/2,250,xbSize,ybSize);
	bHelp.setBounds(screenSize.width/2-xbSize/2,350,xbSize,ybSize);
	bEnd.setBounds(screenSize.width/2-xbSize/2,450,xbSize,ybSize);
	bEinarmigerBandit.setBackground(Color.red);
	bSlotmachine.setBackground(Color.red);
	bHelp.setBackground(Color.red);
	bEnd.setBackground(Color.red);
	add(bEinarmigerBandit);
	add(bSlotmachine);
	add(bHelp);
	add(bEnd);
	Handler menuhandler = new Handler(bEinarmigerBandit);
	bEinarmigerBandit.addActionListener(menuhandler);
	bSlotmachine.addActionListener(menuhandler);
	bHelp.addActionListener(menuhandler);
	bEnd.addActionListener(menuhandler);
	
}

//private class Handler implements ActionListener {
//	
//
//@Override
//public void actionPerformed(ActionEvent event) {
//	if(event.getSource()==bEinarmigerBandit) {
//		ModeOne mo = new ModeOne();
//	}
//	else if(event.getSource()==bSlotmachine) {
//		ModeTwo mt = new ModeTwo();
//		}
//	else if(event.getSource()==bHelp) {
//		JOptionPane.showMessageDialog(null, "Bei Verdacht auf Spielsucht bitte nehmen Sie Kontakt zur n‰chstgelegenen Suchtberatungsstelle auf oder rufen Sie folgende Nummer an: 0201040303");
//		}
//	else if(event.getSource()==bEnd) {
//		System.exit(0);
//		}
//}
//}
}
