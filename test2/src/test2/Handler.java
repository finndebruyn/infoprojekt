package test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Handler implements ActionListener {
	JButton bBandit;

	public Handler(JButton bEinarmigerBandit) {
		// TODO Auto-generated constructor stub
		bBandit = bEinarmigerBandit;
	}





	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==bBandit) {
			ModeOne mo = new ModeOne();
		}
//		else if(event.getSource()==bSlotmachine) {
//			ModeTwo mt = new ModeTwo();
//		}
//		else if(event.getSource()==bHelp) {
//			JOptionPane.showMessageDialog(null, "Bei Verdacht auf Spielsucht bitte nehmen Sie Kontakt zur nächstgelegenen Suchtberatungsstelle auf oder rufen Sie folgende Nummer an: 0201040303");
//		}
//		else if(event.getSource()==bEnd) {
//			System.exit(0);
//		}
	}
}