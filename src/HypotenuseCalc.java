import javax.swing.JOptionPane;
import java.lang.Math;

public class HypotenuseCalc {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Today you will be find the hypothenuse of a triangle");
		int A = Integer.parseInt(JOptionPane.showInputDialog("What is side A?:"));
		int B = Integer.parseInt(JOptionPane.showInputDialog("What is side B?:"));
		double C = Math.sqrt((A*A)+(B*B));
		JOptionPane.showMessageDialog(null, "The hypothenuse of your triangle is: " + C);
		
	}	
}