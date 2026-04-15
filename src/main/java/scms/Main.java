/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import scms.ui.DashboardFrame;
import scms.model.*;


/**
 *
 * @author sumitchaudhary
 */
public class Main {
     public static void main(String[] args) {
         
       List<Student> std = new ArrayList<>();
       Set<Course> course = new HashSet<>();
       Map<String,List<Student>> enrolled_std = new HashMap<>();
       
       // Data of UnderGraduate Students
       UnderGraduate ug1 = new UnderGraduate(32100450, "Subham", 20, "CS", 3, 80, 85, "undergraduate", 3, "Tanmya Singha",+61-400-11111);
       UnderGraduate ug2 = new UnderGraduate(32100102, "Ujain", 19, "IT", 2, 75, 80, "undergraduate", 3, "Tanmya Singha", +61-400-111112);
       UnderGraduate ug3 = new UnderGraduate(32100103, "Mannu", 21, "CS", 4, 78, 82, "undergraduate", 3, "Tanmya Singha", +61-400-111113);
       UnderGraduate ug4 = new UnderGraduate(32100104, "Sujal", 20, "IT", 3, 82, 88, "undergraduate", 3, "Tanmya Singha", +61-400-111114);
       UnderGraduate ug5 = new UnderGraduate(32100105, "Bijay", 22, "CS", 5, 85, 90, "undergraduate", 3, "Tanmya Singha", +61-400-111115);
       UnderGraduate ug6 = new UnderGraduate(32100106, "Ava", 18, "IT", 1, 70, 75, "undergraduate", 3, "Tanmya Singha", +61-400-111116);
       UnderGraduate ug7 = new UnderGraduate(32100107, "Ethan", 21, "CS", 4, 76, 80, "undergraduate", 3, "Tanmya Singha", +61-400-111117);
       UnderGraduate ug8 = new UnderGraduate(32100108, "Sophia", 20, "IT", 3, 79, 83, "undergraduate", 3, "Tanmya Singha", +61-400-111118);
       UnderGraduate ug9 = new UnderGraduate(32100109, "James", 19, "CS", 2, 74, 78, "undergraduate", 3, "Tanmya Singha", +61-400-111119);
       UnderGraduate ug10 = new UnderGraduate(32100110, "Isabella", 21, "IT", 4, 81, 86, "undergraduate", 3, "Tanmya Singha", +61-400-111120);
       UnderGraduate ug11 = new UnderGraduate(32100111, "Lucas", 22, "CS", 5, 83, 89, "undergraduate", 3, "Tanmya Singha", +61-400-111121);
       UnderGraduate ug12 = new UnderGraduate(32100112, "Mia", 18, "IT", 1, 72, 77, "undergraduate", 3, "Tanmya Singha", +61-400-111122);
       
       // Adding data of UnderGraduate Students to the student List
       std.addAll(Arrays.asList(ug1, ug2, ug3, ug4, ug5, ug6, ug7, ug8, ug9, ug10));
       
        // Data of Postgraduate Students
        Postgraduate pg1 = new Postgraduate(201, "Alice", 24, "DS", 2, 88, 90, "postgraduate", 2, "Lisa Ban", +61-400-222221);
        Postgraduate pg2 = new Postgraduate(202, "David", 25, "Cyber", 1, 85, 87, "postgraduate", 2, "Lisa Ban", +61-400-222222);
        Postgraduate pg3 = new Postgraduate(203, "Chris", 26, "AI", 3, 90, 92, "postgraduate", 2, "Lisa Ban", +61-400-222223);
        Postgraduate pg4 = new Postgraduate(204, "Nina", 23, "Cloud", 2, 87, 89, "postgraduate", 2, "Lisa Ban", +61-400-222224);
        Postgraduate pg5 = new Postgraduate(205, "Tom", 27, "Security", 1, 84, 86, "postgraduate", 2, "Lisa Ban", +61-400-222225);
        Postgraduate pg6 = new Postgraduate(206, "Sara", 24, "Data", 2, 89, 91, "postgraduate", 2, "Lisa Ban", +61-400-222226);
        Postgraduate pg7 = new Postgraduate(207, "Leo", 25, "ML", 3, 91, 93, "postgraduate", 2, "Lisa Ban", +61-400-222227);
        Postgraduate pg8 = new Postgraduate(208, "Anna", 23, "BigData", 1, 86, 88, "postgraduate", 2, "Lisa Ban", +61-400-222228);
       
        // Adding data of Postraduate Students to the student List
        std.addAll(Arrays.asList(pg1, pg2, pg3, pg4, pg5, pg6, pg7, pg8));
        
        // UnderGraduate courses
        Course c1 = new Course("COMP1005", "Object Oriented Programming", 60, "undergraduate");
        Course c2 = new Course("COMP1004", "Mathematics of Computer Science", 60, "undergraduate");
        Course c3 = new Course("COMP1006", "Artifical Intelligence", 60, "undergraduate");
        Course c4 = new Course("COMP2014", "Networking", 60, "undergraduate");
        Course c5 = new Course("COMP1001", "Principles of CyberSecurity", 60, "undergraduate");
        
        // Storing UnderGraduate courses at course set
        course.addAll(Arrays.asList(c1, c2, c3, c4, c5));
        
        // Postgraduate courses
        Course c6 = new Course("PG201", "Advanced Java", 60, "postgraduate");
        Course c7 = new Course("PG202", "Machine Learning", 60, "postgraduate");
        Course c8 = new Course("PG203", "Cloud", 60, "postgraduate");
        Course c9 = new Course("PG204", "Web development", 60, "postgraduate");
        Course c10 = new Course("PG205", "Data Science", 60, "postgraduate");
        
        // Storing Postgraduate courses at courses set
        course.addAll(Arrays.asList(c6, c7, c8, c9, c10));
        
       DashboardFrame dashboard = new DashboardFrame();
        dashboard.show();
    }
    
}
