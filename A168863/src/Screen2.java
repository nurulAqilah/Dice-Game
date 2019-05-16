import java.awt.*;
import javax.swing.*;

public class Screen2 extends JFrame {
	
	public Screen2(Controller controller) {
		setTitle("Second screen");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setBackground(Color.white);
		pane.setLayout(new BorderLayout());
	
		JTextField text1 = new JTextField("1st die:"+controller.getFaceValueDie1()+" 2nd die:"+controller.getFaceValueDie2());
		JTextField text2 = new JTextField(controller.getResult());
		
		pane.add(text1, BorderLayout.CENTER);
		pane.add(text2, BorderLayout.SOUTH);
	}
}