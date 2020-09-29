package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GuiView {
    public void guiFrame(){
        JFrame mainWind = new JFrame("Swingy GUI");
        JButton saveBtn = new JButton("Save");
        JLabel welMsg = new JLabel("Welcome To Swingy", SwingConstants.CENTER);
        JTextField inputFil = new JTextField();

        
        mainWind.setSize(400,800);
        saveBtn.setBounds(40,90,85,20);
        welMsg.setBounds(0,0,120,30);
        mainWind. setLayout(null);
        mainWind.setSize(300,400);

        mainWind.add(saveBtn);
        mainWind.add(welMsg);
        mainWind.setVisible(true);
        mainWind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
