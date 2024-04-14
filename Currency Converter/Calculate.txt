import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculate {
	public Calculate() {
		// TODO Auto-generated constructor stub
		
		JFrame frame = new JFrame("Currency Converter");
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel("Enter Your Amount Please : ");
		label1.setBounds(10, 10, 200, 40);
		frame.add(label1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(200, 10, 200, 40);
		frame.add(tf1);
		
		//JLabel label2 = new JLabel("Number 2");
		//label2.setBounds(10, 60, 100, 40);
		//frame.add(label2);
		
		//JTextField tf2 = new JTextField();
		//tf2.setBounds(120, 60, 200, 40);
		//frame.add(tf2);
		
		JButton euro = new JButton("Euro");
		euro.setBounds(10, 110, 100, 40);
		frame.add(euro);
		
		JButton dollar = new JButton("Dollar");
		dollar.setBounds(120, 110, 100, 40);
		frame.add(dollar);
		
		JButton rupee = new JButton("Rupee");
		rupee.setBounds(230, 110, 100, 40);
		frame.add(rupee);
		
		JButton rmb = new JButton("Chinis Yuan");
		rmb.setBounds(340, 110, 100, 40);
		frame.add(rmb);
		
		JLabel label3 = new JLabel("Result : ");
		label3.setBounds(10, 160, 100, 40);
		frame.add(label3);

		euro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(tf1.getText());
				int b = 95;
				
				label3.setText("Result : " + (a*b) + " bdt");
			}
		});
		
		dollar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(tf1.getText());
				int b = 81;
				
				label3.setText("Result : " + (a*b) );
			}
		});
		
		rupee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int a = Integer.parseInt(tf1.getText());
				float b = (float) 1.26;
				
				label3.setText("Result : " + (a*b));
			}
		});
		
		rmb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				float a = Integer.parseInt(tf1.getText());
				float b = (float) 12.11;
				
				label3.setText("Result - " + (a*b) );
			}
		});
	}
}
