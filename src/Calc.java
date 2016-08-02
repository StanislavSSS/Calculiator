import javax.swing.JFrame;

public class Calc {
	public static void main (String args[]){
		Face f = new Face("Калькулятор Лосяша");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setSize(250, 200);
		f.setLocationRelativeTo(null);

		
	}

}
