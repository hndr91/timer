package timer;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Afif
 */
public class MainWindow {
    JFrame mainFrame;
    JButton startBtn, stopBtn, getOutputBtn;
    JPanel timerPanel, startStopPanel, outputPanel;
    JLabel timerText;
    
    public MainWindow() {
        initComponents();
    }
    
    private void initComponents() {
        mainFrame = new JFrame(Constants.WINDOW_TITLE);
        mainFrame.setSize(400, 250);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        GridBagLayout mainLayout = new GridBagLayout();
        mainFrame.setLayout(mainLayout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        //Timer Text Panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        timerPanel = new JPanel();
        timerPanel.setBorder(BorderFactory.createTitledBorder(Constants.TIMER_PANEL_TITLE));
        timerPanel.setLayout(new GridBagLayout());
        GridBagConstraints timerPanelCons = new GridBagConstraints();
        timerPanelCons.fill = GridBagConstraints.HORIZONTAL;
        
        timerPanelCons.gridx = 0;
        timerPanelCons.gridy = 0;
        timerText = new JLabel("0.0");
        timerText.setFont(new Font(Constants.LUCIA_GRANDE, Font.BOLD, 50));
        timerPanel.add(timerText, timerPanelCons);
        
        //Start Stop Panel
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        startStopPanel = new JPanel();
        startStopPanel.setBorder(BorderFactory.createTitledBorder(Constants.START));
        startStopPanel.setLayout(new GridBagLayout());
        GridBagConstraints startStopPanelCons = new GridBagConstraints();
        startStopPanelCons.fill = GridBagConstraints.HORIZONTAL;
        
        //Start Button
        startStopPanelCons.gridx = 0;
        startStopPanelCons.gridy = 0;
        startStopPanelCons.weightx = 0.5;
        startBtn = new JButton();
        startBtn.setFont(new Font(Constants.LUCIA_GRANDE, Font.PLAIN, 14));
        startBtn.setText(Constants.START);
        startBtn.addActionListener((ActionEvent e) -> {
            System.out.println("From Start Button");
        });
        startStopPanel.add(startBtn, startStopPanelCons);
        
        //Stop Button
        startStopPanelCons.gridx = 1;
        startStopPanelCons.gridy = 0;
        startStopPanelCons.weightx = 0.5;
        stopBtn = new JButton();
        stopBtn.setFont(new Font(Constants.LUCIA_GRANDE, Font.PLAIN, 14));
        stopBtn.setText(Constants.STOP);
        stopBtn.addActionListener((ActionEvent e) -> {
            System.out.println("From Stop Button");
        });
        startStopPanel.add(stopBtn, startStopPanelCons);
        
        
        
        
        
        //Add All Panel to Main Frame
        mainFrame.add(timerPanel, gbc);
        mainFrame.add(startStopPanel, gbc);
        
        //Set MainFrame to Visibel
        mainFrame.setVisible(true);
    }
}
