import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class ROT13Window {
    ROT13 r = new ROT13();
    JFrame f = new JFrame("ROT13");
    JPanel p = new JPanel();
    JLabel cipherLabel = new JLabel("Enter Cipher");
    JLabel decipheredLabel = new JLabel("Deciphered");
    JLabel output = new JLabel("");
    JTextField text = new JTextField(30);
    JButton b = new JButton("Decipher");
    String cipher = "";
    String deciphered = "";
    GridBagConstraints gbc = new GridBagConstraints();

    public void window(){
        // action listener for enter key, need to make it more precise, not entirely sure how this works yet
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cipher = text.getText();
                deciphered =  r.rot13Decipher(cipher).toString();
                output.setText(deciphered);
            }
        };

        f.setLayout(new GridBagLayout());
        f.setMinimumSize(new Dimension(700,100));
        p.setLayout(new GridBagLayout());
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridy = 0; // set row
        gbc.gridx = 0; // set column
        p.setSize(700,100);
        f.add(p,gbc);
        f.setSize(700,100);
        text.addActionListener(action);
        p.add(cipherLabel,gbc);
        gbc.gridx = 1; // set column
        p.add(text,gbc);
        gbc.gridx = 2; // set column
        p.add(b,gbc);
        gbc.gridy = 1; // set row
        gbc.gridx = 0; // set column
        p.add(decipheredLabel,gbc);
        gbc.gridx = 1; // set column
        p.add(output,gbc);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

/*
 SOURCES:
 https://stackoverflow.com/questions/4419667/detect-enter-press-in-jtextfield 
  
 */