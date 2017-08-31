package gameZone;
import javax.swing.JOptionPane;
public class GameZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Think of a number 1-10");
		
		JOptionPane.showMessageDialog(null,
				"The number is " + (1+ (int)(Math.random() *10)));
	}

}
