/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scms.ui;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author sumitchaudhary
 */
public class DashboardFrame {
    JFrame frame;
    
    public DashboardFrame(){
    frame = new JFrame("SCMS_SubhamChaudharyTharu_32100450");
    frame.setSize(600,400);
    frame.setLayout(new BorderLayout());
    
    JLabel toplabel = new JLabel("Welcome to UNDA");
    toplabel.setHorizontalAlignment(JLabel.CENTER);
    toplabel.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
    frame.add(toplabel, BorderLayout.NORTH);
    
    JTextArea result = new JTextArea();
    
    
    JPanel buttons = new JPanel(new GridLayout(3,2,10,10));
    buttons.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    JButton B1 = new JButton("Number of Students");
    JButton B2 = new JButton("Number of UG and PG");
    JButton B3 = new JButton("AVG marks og UG and PG");
    JButton B4 = new JButton("AVG attendence of UG and PG");
    JButton B5 = new JButton("Number of Courses");
    JButton B6 = new JButton("Students per course");
    
    buttons.add(B1);
    buttons.add(B2);
    buttons.add(B3);
    buttons.add(B4);
    buttons.add(B5);
    buttons.add(B6);
    
    
    JPanel centralpanel = new JPanel(new BorderLayout());
    centralpanel.add(result, BorderLayout.CENTER);
    centralpanel.add(buttons, BorderLayout.SOUTH);
    
    frame.add(centralpanel, BorderLayout.CENTER);
    
    JLabel bottomlabel = new JLabel("SubhamChaudharyTharu_32100450");
    bottomlabel.setHorizontalAlignment(JLabel.CENTER);
    bottomlabel.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
    frame.add(bottomlabel, BorderLayout.SOUTH);
    
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
}
    public void show(){
        frame.setVisible(true);
    }
    
}
