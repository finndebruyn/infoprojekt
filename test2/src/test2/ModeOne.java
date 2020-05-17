package test2;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ModeOne extends JFrame{

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JButton bReturn;
	private ImageIcon image1;
	private JLabel label1;

	public ModeOne() { 
		setLayout(null);                                     //Fenster festlegen
		setVisible(true);
		setSize(screenSize.width,screenSize.height);
		setTitle("Einarmiger Bandit");
		getContentPane().setBackground(Color.green);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);
		image1 = new ImageIcon(getClass().getResource("cardsicon.png"));
		label1 = new JLabel(image1);

		label1.setBounds(screenSize.width/2-100,screenSize.height-300,200,50);
		label1.setPreferredSize(newDimension(300,300));
		add(label1);
		


		setLayout(null);                                        // Buttons festlegen
		bReturn = new JButton("Zurück zum Menü");
		bReturn.setBounds(screenSize.width/2-100,screenSize.height-100,200,50);
		add(bReturn);
		Handler moHandler = new Handler();
		bReturn.addActionListener(moHandler);
	}

	private Dimension newDimension(int i, int j) {
		// TODO Auto-generated method stub
		return null;
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





