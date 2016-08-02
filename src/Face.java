import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Face extends JFrame {
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bp, bm, be;
	JTextField t;
	eHandler handler = new eHandler();
	double x, y, z;
	String v;
	boolean plus, minus; 
		
	public Face (String s){
		super(s);
		setLayout(new FlowLayout());
		v = "";
		t  = new JTextField(v, 20);
		t.setEditable(false);
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bp = new JButton("+");
		bm = new JButton("-");
		be = new JButton("=");
		add (t);
		add (b1);
		add (b2);
		add (b3);
		add (b4);
		add (b5);
		add (b6);
		add (b7);
		add (b8);
		add (b9);
		add (b0);
		add (bp);
		add (bm);
		add (be);
		b0.addActionListener(handler);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		bp.addActionListener(handler);
		bm.addActionListener(handler);
		be.addActionListener(handler);
		
		
	}
	public class eHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
		}
	}
}
