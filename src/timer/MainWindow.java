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
    JButton startBtn, stopBtn, outputBtn;
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
        gbc.weightx = 1;
        gbc.weighty = 1;
        
        //Timer Text Panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        timerPanel = new JPanel();
        timerPanel.setBorder(BorderFactory.createTitledBorder(Constants.TIMER_PANEL_TITLE));
        timerPanel.setLayout(new GridBagLayout());
        GridBagConstraints timerPanelCons = new GridBagConstraints();
        timerPanelCons.fill = GridBagConstraints.HORIZONTAL;
        
        //timerPanelCons.gridx = 0;
        //timerPanelCons.gridy = 0;
        timerText = new JLabel("0.0");
        timerText.setFont(new Font(Constants.LUCIA_GRANDE, Font.BOLD, 50));
        timerPanel.add(timerText, timerPanelCons);
        
        mainFrame.add(timerPanel, gbc);
        
        // ============================================== //
        // ============ Button Panel ==================== //
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        startBtn = new JButton();
        startBtn.setFont(new Font(Constants.LUCIA_GRANDE, Font.PLAIN, 14));
        startBtn.setText(Constants.START);
        startBtn.addActionListener((ActionEvent e) -> {
            System.out.println("From Start Button");
        });
        mainFrame.add(startBtn, gbc);
        
        // Stop Button
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        stopBtn = new JButton();
        stopBtn.setFont(new Font(Constants.LUCIA_GRANDE, Font.PLAIN, 14));
        stopBtn.setText(Constants.STOP);
        stopBtn.addActionListener((ActionEvent e) -> {
            System.out.println("From Stop Button");
        });
        mainFrame.add(stopBtn, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        outputBtn = new JButton();
        outputBtn.setFont(new Font(Constants.LUCIA_GRANDE, Font.PLAIN, 14));
        outputBtn.setText(Constants.OUTPUT);
        outputBtn.addActionListener((ActionEvent e) -> {
            System.out.println("From Output Button");
        });
        mainFrame.add(outputBtn, gbc);
        
        //Set MainFrame to Visibel
        mainFrame.setVisible(true);
    }
}
