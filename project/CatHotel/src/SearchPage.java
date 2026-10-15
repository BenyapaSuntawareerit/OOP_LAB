package project.CatHotel.src;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class SearchPage extends JFrame implements ActionListener {
    private JComboBox<String> searchBy;
    private JTextField keyword;
    private JTextArea results;

    public SearchPage() {
        super("Cat Boarding Management System");
        setSize(650, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JLabel title = new JLabel("Search", SwingConstants.CENTER);
        title.setForeground(Color.BLUE);
        title.setFont(new Font("", Font.BOLD, 20));

        searchBy = new JComboBox<>(new String[]{
            "Cat name", "Phone", "Room type", "Room size", "Special care"
        });
        keyword = new JTextField(12);

        JButton search = new JButton("Search");
        JButton back = new JButton("Back");
        search.addActionListener(this);
        back.addActionListener(this);

        JPanel form = new JPanel();
        form.add(new JLabel("Search by"));
        form.add(searchBy);
        form.add(new JLabel("Value"));
        form.add(keyword);
        form.add(search);

        results = new JTextArea();
        results.setEditable(false);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(form, BorderLayout.NORTH);
        panel.add(new JScrollPane(results), BorderLayout.CENTER);
        panel.add(back, BorderLayout.SOUTH);

        add(title, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private boolean matches(Bookable b, String type, String key) {
        if (!(b instanceof CatBooking)) return false;

        CatBooking c = (CatBooking) b;
        key = key.toLowerCase().trim();

        switch (type) {
            case "Cat name":
                return c.getCatName().toLowerCase().contains(key);
            case "Phone":
                return c.getPhone().contains(key);
            case "Room type":
                return (b instanceof StandardRoom && key.equalsIgnoreCase("Standard"))
                    || (b instanceof VipRoom && key.equalsIgnoreCase("VIP"));
            case "Room size":
                return b instanceof StandardRoom
                    && ((StandardRoom) b).getRoomSize().equalsIgnoreCase(key);
            case "Special care":
                return b instanceof VipRoom
                    && ((VipRoom) b).getSpecialCare().toLowerCase().contains(key);
            default:
                return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {
            dispose();
            return;
        }

        String key = keyword.getText().trim();
        if (key.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a value to search.");
            return;
        }

        String type = (String) searchBy.getSelectedItem();

        if (type.equals("Room type")
                && !key.equalsIgnoreCase("Standard")
                && !key.equalsIgnoreCase("VIP")) {
            JOptionPane.showMessageDialog(this, "Enter Standard or VIP.");
            return;
        }
        // Validate room size
        if (type.equals("Room size")
                && !key.equalsIgnoreCase("S")
                && !key.equalsIgnoreCase("M")
                && !key.equalsIgnoreCase("L")) {
            JOptionPane.showMessageDialog(
                    this, "Enter S, M or L.");
            return;
        }

        results.setText("Search Results:\n");
        int count = 0;

        List<Bookable> bookings = Database.getBookings();
        for (Bookable b : bookings) {
            if (matches(b, type, key))
                results.append(++count + ". " + b.getSummary() + "\n");
        }

        if (count == 0) results.append("Not Found\n");
        else results.append("\nFound " + count + " booking(s)");
    }

    public static void main(String[] args) {
        new SearchPage();
    }
}
