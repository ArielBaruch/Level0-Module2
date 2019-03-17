import java.util.Random;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
String n = JOptionPane.showInputDialog(null, "How old are you in years?"); 

int h = Integer.parseInt(n); 




if(h  >17) {
	JOptionPane.showInputDialog(null, "Who do you think should be the next president?");
}
else {
	JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
}



}

}
