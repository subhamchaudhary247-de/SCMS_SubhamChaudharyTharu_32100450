/*//SubhamChaudharyTharu-32100450
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scms.ui;
import scms.model.*;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sumitchaudhary
 */
public class DashboardFrame {
    private JFrame frame;
    private List<Student> std;
    private Set<Course> course;
    private Map<String, List<Student>> enrolled_std;
   

    
    public DashboardFrame(List<Student> std, Set<Course> course, Map<String, List<Student>> enrolled_std){
        this.std = std;
        this.course = course;
        this.enrolled_std= enrolled_std;
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
    
    // Actions
        B1.addActionListener(e -> {
            result.setText("Total Students: " + std.size());
        });

        B2.addActionListener(e -> {
            long ug = std.stream().filter(s -> s instanceof UnderGraduate).count();
            long pg = std.stream().filter(s -> s instanceof Postgraduate).count();
            result.setText("Undergraduate Students: " + ug + "\nPostgraduate Students: " + pg);
        });

        B3.addActionListener(e -> {
            double ugAvg = std.stream()
                    .filter(s -> s instanceof UnderGraduate)
                    .mapToDouble(Student::getpercentageOfMarks)
                    .average()
                    .orElse(0);

            double pgAvg = std.stream()
                    .filter(s -> s instanceof Postgraduate)
                    .mapToDouble(Student::getpercentageOfMarks)
                    .average()
                    .orElse(0);

            result.setText("Average Marks of UG: " + ugAvg + "\nAverage Marks of PG: " + pgAvg);
        });

        B4.addActionListener(e -> {
            double ugAvgAttendance = std.stream()
                    .filter(s -> s instanceof UnderGraduate)
                    .mapToDouble(Student::getattendancePercentage)
                    .average()
                    .orElse(0);

            double pgAvgAttendance = std.stream()
                    .filter(s -> s instanceof Postgraduate)
                    .mapToDouble(Student::getattendancePercentage)
                    .average()
                    .orElse(0);

            result.setText("Average Attendance of UG: " + ugAvgAttendance +
                    "\nAverage Attendance of PG: " + pgAvgAttendance);
        });

        B5.addActionListener(e -> {
            result.setText("Total Courses: " + course.size());
        });

        B6.addActionListener(e -> {
            String courseId = JOptionPane.showInputDialog(frame, "Enter Course ID:");
            if (courseId != null) {
                courseId = courseId.trim();
                List<Student> enrolledStudents = enrolled_std.get(courseId);

                if (enrolledStudents != null) {
                    result.setText("Students enrolled in " + courseId + ": " + enrolledStudents.size());
                } else {
                    result.setText("Course ID not found.");
                }
            }
        });
    
    
    }
    public void show(){
        frame.setVisible(true);
    }
    
}
