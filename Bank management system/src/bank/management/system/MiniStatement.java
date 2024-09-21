package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame {

    MiniStatement(String pinnumber) {

        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        add(mini);

        JLabel bank = new JLabel("JAVA BANK OF PROGRAMMING");
        bank.setBounds(100, 20, 300, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        int bal = 0;  // Initialize balance variable

        try {
            Conn conn = new Conn();

            // Fetch card number from the login table
            ResultSet rsLogin = conn.s.executeQuery("SELECT * FROM login WHERE pin = '" + pinnumber + "'");
            if (rsLogin.next()) {
                card.setText("Card Number: " + rsLogin.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rsLogin.getString("cardnumber").substring(12));
            }

            // Fetch transactions from the bank table
            ResultSet rsBank = conn.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pinnumber + "'");
            StringBuilder miniStatementHTML = new StringBuilder("<html>");

            while (rsBank.next()) {
                // Add each transaction to the mini statement
                miniStatementHTML.append(rsBank.getString("date"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(rsBank.getString("type"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(rsBank.getString("amount"))
                        .append("<br><br>");

                // Calculate balance
                if (rsBank.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rsBank.getString("amount"));
                } else if (rsBank.getString("type").equals("Withdrawal")) {
                    bal -= Integer.parseInt(rsBank.getString("amount"));
                }
            }

            miniStatementHTML.append("</html>");
            mini.setText(miniStatementHTML.toString());

            // Display the balance
            balance.setText("Your current account balance is Rs " + bal);

        } catch (Exception e) {
            System.out.println(e);
        }

        mini.setBounds(20, 140, 400, 200);

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("1234"); // Pass a valid pin number here
    }
}
