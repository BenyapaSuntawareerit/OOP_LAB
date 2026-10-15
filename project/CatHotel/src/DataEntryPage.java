package project.CatHotel.src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DataEntryPage extends JFrame implements ActionListener {
    private JComboBox<String> roomType, roomSize;
    private JTextField catName, phone, days, specialCare;
    private JTextArea bookingList;
    private JPanel detailPanel;
    private CardLayout card;

    public DataEntryPage() {
        super("Cat Boarding Management System");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        roomType = new JComboBox<>(new String[]{"Standard", "VIP"});
        roomType.addActionListener(this);

        catName = new JTextField();
        phone = new JTextField();
        days = new JTextField();

        JPanel common = new JPanel(new GridLayout(4, 2, 5, 5));
        common.add(new JLabel("Room type"));
        common.add(roomType);
        common.add(new JLabel("Cat name"));
        common.add(catName);
        common.add(new JLabel("Phone"));
        common.add(phone);
        common.add(new JLabel("Days"));
        common.add(days);

        roomSize = new JComboBox<>(new String[]{"S", "M", "L"});
        specialCare = new JTextField();

        JPanel standard = new JPanel(new GridLayout(1, 2));
        standard.setBorder(BorderFactory.createTitledBorder("Standard"));
        standard.add(new JLabel("Room size"));
        standard.add(roomSize);

        JPanel vip = new JPanel(new GridLayout(1, 2));
        vip.setBorder(BorderFactory.createTitledBorder("VIP"));
        vip.add(new JLabel("Special care"));
        vip.add(specialCare);

        card = new CardLayout();
        detailPanel = new JPanel(card);
        detailPanel.add(standard, "Standard");
        detailPanel.add(vip, "VIP");
        card.show(detailPanel, "Standard");

        bookingList = new JTextArea();
        bookingList.setEditable(false);

        JButton add = new JButton("Add booking");
        JButton clear = new JButton("Clear");
        JButton back = new JButton("Back");

        add.addActionListener(this);
        clear.addActionListener(this);
        back.addActionListener(this);

        JPanel buttons = new JPanel();
        buttons.add(add);
        buttons.add(clear);
        buttons.add(back);

        JPanel left = new JPanel(new BorderLayout(5, 5));
        left.add(common, BorderLayout.NORTH);
        left.add(detailPanel, BorderLayout.CENTER);
        left.add(buttons, BorderLayout.SOUTH);

        JPanel right = new JPanel(new BorderLayout(5, 5));
        right.add(new JLabel("All bookings"), BorderLayout.NORTH);
        right.add(new JScrollPane(bookingList), BorderLayout.CENTER);

        JPanel center = new JPanel(new GridLayout(1, 2, 10, 10));
        center.add(left);
        center.add(right);

        add(new JLabel("Data Entry", SwingConstants.CENTER),
                BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        refreshList();
        setVisible(true);
    }

    private void refreshList() {
        bookingList.setText("");

        int i = 1;
        for (Bookable booking : Database.getBookings()) {
            bookingList.append(i++ + ". " + booking.getSummary() + "\n");
        }
    }

    private void clearForm() {
        catName.setText("");
        phone.setText("");
        days.setText("");
        specialCare.setText("");
        roomSize.setSelectedIndex(0);
        roomType.setSelectedIndex(0);
        card.show(detailPanel, "Standard");
    }

    private void addBooking() {
        String name = catName.getText().trim();
        String tel = phone.getText().trim();
        String dayText = days.getText().trim();

        // 1. Check required fields
        if (name.isEmpty() || tel.isEmpty() || dayText.isEmpty()) {
            throw new IllegalArgumentException(
                    "Please fill in all required fields.");
        }

        // 2. Check phone number: digits only, 9-10 digits
        if (!tel.matches("\\d{9,10}")) {
            throw new IllegalArgumentException(
                    "Phone must contain 9-10 digits only.");
        }

        // 3. Check days: integer greater than zero
        int numberOfDays;

        try {
            numberOfDays = Integer.parseInt(dayText);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                    "Days must be a valid number.");
        }

        if (numberOfDays <= 0) {
            throw new IllegalArgumentException(
                    "Days must be greater than 0.");
        }

        // 4. Create the correct subclass
        Bookable booking;

        if ("Standard".equals(roomType.getSelectedItem())) {
            String size = (String) roomSize.getSelectedItem();

            booking = new StandardRoom(
                    name, tel, numberOfDays, size);
        } else {
            String care = specialCare.getText().trim();

            if (care.isEmpty()) {
                care = "-";
            }

            booking = new VipRoom(
                    name, tel, numberOfDays, care);
        }

        // 5. Save and update the GUI
        Database.addBooking(booking);
        refreshList();
        clearForm();

        JOptionPane.showMessageDialog(
                this, "Booking added successfully.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (e.getSource() == roomType) {
            card.show(detailPanel,
                    (String) roomType.getSelectedItem());
            return;
        }

        switch (command) {
            case "Add booking":
                try {
                    addBooking();
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            this,
                            ex.getMessage(),
                            "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;

            case "Clear":
                clearForm();
                break;

            case "Back":
                dispose();
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DataEntryPage::new);
    }
}


