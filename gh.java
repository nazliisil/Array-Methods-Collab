import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gh {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gh window = new gh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int desiredScale = 40;
		int growScale = 70;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon clubIcon = new ImageIcon("C:\\Users\\river\\Desktop\\or-bilkent.jpg");
		Image scaledImage = clubIcon.getImage().getScaledInstance(desiredScale, desiredScale, Image.SCALE_SMOOTH);
		Image biggerImage = clubIcon.getImage().getScaledInstance(growScale, growScale, Image.SCALE_SMOOTH);
		ImageIcon smallfinalIcon = new ImageIcon(scaledImage);
		ImageIcon bigfinalIcon = new ImageIcon(biggerImage);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\river\\Downloads\\favicon.ico"));
		btnNewButton.setBounds(178, 119, 40, 40);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        // Increases size
		    	btnNewButton.setBounds(btnNewButton.getX() - 5, btnNewButton.getY() - 5, growScale, growScale);
		    	btnNewButton.setIcon(bigfinalIcon);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        // Return to original size and position
		    	btnNewButton.setBounds(btnNewButton.getX() + 5, btnNewButton.getY() + 5, desiredScale, desiredScale);
		    	btnNewButton.setIcon(smallfinalIcon);
		    }
		});
	}

}
