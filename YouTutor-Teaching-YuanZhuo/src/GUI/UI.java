package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI extends JFrame {

	UI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 1000);
		Container contentPane = getContentPane();
		JButton button1 = new JButton("Press");
	//	button1.setSize(500, 500);
		getContentPane().add(button1);
		setContentPane(contentPane);
		setVisible(true);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setVisible(false);
				System.out.println("Clicked");
			}
		});
	}

}
