package project.CatHotel.src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel;
    private JButton dataEntryButton;
    private JButton searchButton;
    private JButton exitButton;

    public MainPage() {
        setTitle("Cat Boarding Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Cat Boarding Management System", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 18));

        JPanel titlePanel = new JPanel(new GridLayout(1, 1));
        titlePanel.add(titleLabel);

        dataEntryButton = new JButton("Data Entry");
        dataEntryButton.addActionListener(this);
        searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 30, 20, 30));
        panel.add(dataEntryButton);
        panel.add(searchButton);
        panel.add(exitButton);

        add(titlePanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Data Entry")) {
            new DataEntryPage();
        } else if (actionCommand.equals("Search")) {
            new SearchPage();
        } else if (actionCommand.equals("Exit")) {
            int chosenOption = JOptionPane.showConfirmDialog(this,
                    "Do you want to exit the program?",
                    "Cat Boarding Management System", JOptionPane.OK_CANCEL_OPTION);
            if (chosenOption == JOptionPane.OK_OPTION)
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MainPage();
    }
}