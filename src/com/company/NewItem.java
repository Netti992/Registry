package com.company;

import javax.swing.*;
import java.awt.*;

public class NewItem extends JFrame {


    public NewItem() {

        JFrame newItemFrame = new JFrame();
        newItemFrame.setResizable(true);
        newItemFrame.setSize(1000, 800);
        newItemFrame.setVisible(true);

        JLabel background = new JLabel();
        background.setSize(1000, 800);
        background.setIcon(new ImageIcon("./wood.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        newItemFrame.add(background);


        // NEW BOOK
        JLabel newBookLabel = new JLabel("<html><font color=black> NEW BOOK </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 70);
        newBookLabel.setFont(myFont);
        newBookLabel.setBounds(200, 20, 700, 200);
        newBookLabel.setHorizontalAlignment(JLabel.CENTER);
        newBookLabel.setVerticalAlignment(JLabel.TOP);
        newBookLabel.setVisible(true);
        background.add(newBookLabel);


        // TITLE
        JButton titleButton = new JButton("Title");
        titleButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        titleButton.setBackground(new Color(154,205,50));
        titleButton.setBounds(140, 120, 450, 35);
        titleButton.setHorizontalAlignment(JLabel.CENTER);
        titleButton.setVerticalAlignment(JLabel.TOP);
        titleButton.setVisible(true);
        background.add(titleButton);

        JTextField titleField = new JTextField();
        titleField.setBounds(140, 160, 450, 40);
        titleField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(titleField);


        // LASTNAME
        JButton lastNameButton = new JButton("Lastname");
        lastNameButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        lastNameButton.setBackground(new Color(154,205,50));
        lastNameButton.setBounds(140, 220, 220, 35);
        lastNameButton.setHorizontalAlignment(JLabel.CENTER);
        lastNameButton.setVerticalAlignment(JLabel.TOP);
        lastNameButton.setVisible(true);
        background.add(lastNameButton);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(140, 260, 220, 40);
        lastNameField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(lastNameField);


        // FIRSTNAME
        JButton firstNameButton = new JButton("Firstname");
        firstNameButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        firstNameButton.setBackground(new Color(154,205,50));
        firstNameButton.setBounds(370, 220, 220, 35);
        firstNameButton.setHorizontalAlignment(JLabel.CENTER);
        firstNameButton.setVerticalAlignment(JLabel.TOP);
        firstNameButton.setVisible(true);
        background.add(firstNameButton);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(370, 260, 220, 40);
        firstNameField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(firstNameField);


        // SUMMARY
        JButton summaryButton = new JButton("Summary");
        summaryButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        summaryButton.setBackground(new Color(154,205,50));
        summaryButton.setBounds(140, 320, 450, 35);
        summaryButton.setHorizontalAlignment(JLabel.CENTER);
        summaryButton.setVerticalAlignment(JLabel.TOP);
        summaryButton.setVisible(true);
        background.add(summaryButton);

        JTextField summaryField = new JTextField();
        summaryField.setBounds(140, 360, 450, 100);
        summaryField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(summaryField);


        // CATEGORY
        JButton categoryButton = new JButton("Category");
        categoryButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        categoryButton.setBackground(new Color(154,205,50));
        categoryButton.setBounds(140, 480, 450, 35);
        categoryButton.setHorizontalAlignment(JLabel.CENTER);
        categoryButton.setVerticalAlignment(JLabel.TOP);
        categoryButton.setVisible(true);
        background.add(categoryButton);

        JTextField categoryField = new JTextField();
        categoryField.setBounds(140, 520, 450, 40);
        categoryField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(categoryField);


        // PUBLISHED DATE
        JButton publishedDateButton = new JButton("Published date");
        publishedDateButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        publishedDateButton.setBackground(new Color(154,205,50));
        publishedDateButton.setBounds(140, 580, 220, 35);
        publishedDateButton.setHorizontalAlignment(JLabel.CENTER);
        publishedDateButton.setVerticalAlignment(JLabel.TOP);
        publishedDateButton.setVisible(true);
        background.add(publishedDateButton);

        JTextField publishedDateField = new JTextField();
        publishedDateField.setBounds(140, 620, 220, 40);
        publishedDateField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(publishedDateField);


        // PUBLISHER
        JButton publisherButton = new JButton("Publisher");
        publisherButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        publisherButton.setBackground(new Color(154,205,50));
        publisherButton.setBounds(370, 580, 220, 35);
        publisherButton.setHorizontalAlignment(JLabel.CENTER);
        publisherButton.setVerticalAlignment(JLabel.TOP);
        publisherButton.setVisible(true);
        background.add(publisherButton);

        JTextField publisherField = new JTextField();
        publisherField.setBounds(370, 620, 220, 40);
        publisherField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(publisherField);


        // PAGES
        JButton pagesButton = new JButton("Pages");
        pagesButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        pagesButton.setBackground(new Color(154,205,50));
        pagesButton.setBounds(140, 680, 220, 35);
        pagesButton.setHorizontalAlignment(JLabel.CENTER);
        pagesButton.setVerticalAlignment(JLabel.TOP);
        pagesButton.setVisible(true);
        background.add(pagesButton);

        JTextField pagesField = new JTextField();
        pagesField.setBounds(140, 720, 220, 40);
        pagesField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(pagesField);


        // ISBN
        JButton isbnButton = new JButton("Isbn");
        isbnButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        isbnButton.setBackground(new Color(154,205,50));
        isbnButton.setBounds(370, 680, 220, 35);
        isbnButton.setHorizontalAlignment(JLabel.CENTER);
        isbnButton.setVerticalAlignment(JLabel.TOP);
        isbnButton.setVisible(true);
        background.add(isbnButton);

        JTextField isbnField = new JTextField();
        isbnField.setBounds(370, 720, 220, 40);
        isbnField.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        background.add(isbnField);


        // PICTURE
        JButton pictureButton = new JButton();
        pictureButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        pictureButton.setBackground(new Color(154,205,50));
        pictureButton.setBounds(650, 200, 250, 400);
        pictureButton.setHorizontalAlignment(JLabel.CENTER);
        pictureButton.setVerticalAlignment(JLabel.TOP);
        pictureButton.setVisible(true);
        background.add(pictureButton);


        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - newItemFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - newItemFrame.getHeight()) / 2);
        newItemFrame.setLocation(x, y);

        newItemFrame.setLayout(null);
        newItemFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        newItemFrame.setBackground(Color.white);
}
}
