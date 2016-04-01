/**
 * Created by genius on 4/1/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class SwingControlDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    private JTextField inputField;
    private JButton enterButton;
    private JTree tree;
    private JTextArea outputArea;
    public SwingControlDemo(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("bananaPlayer");
        mainFrame.setSize(1000,600);
        mainFrame.setLayout(new GridLayout(2, 2));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        tree = new JTree();
        enterButton = new JButton("submit");
        inputField = new JTextField();
        outputArea = new JTextArea();
        tree.setSize(100,200);
        inputField.setSize(1000,50);
        tree.setModel(new FileSystemModel(new File(".")));
        mainFrame.add(tree);
        mainFrame.add(outputArea);
        mainFrame.add(inputField);
        mainFrame.add(enterButton);
        mainFrame.setVisible(true);
    }

    public void showTextFieldDemo(){
        headerLabel.setText("Control in action: JTextField");

        JLabel  namelabel= new JLabel("User ID: ", JLabel.RIGHT);
        JLabel  passwordLabel = new JLabel("Password: ", JLabel.CENTER);
        final JTextField userText = new JTextField(6);
        final JPasswordField passwordText = new JPasswordField(6);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username " + userText.getText();
                data += ", Password: "
                        + new String(passwordText.getPassword());
                statusLabel.setText(data);
            }
        });

        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(passwordLabel);
        controlPanel.add(passwordText);
        controlPanel.add(loginButton);
        mainFrame.setVisible(true);
    }
}