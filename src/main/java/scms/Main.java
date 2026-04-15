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
       
       //Data of UnderGraduate Students
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
       
       //Adding data of UnderGraduate Students to the student List
       std.addAll(Arrays.asList(ug1,ug2,ug3,ug4,ug5,ug6,ug7,ug8,ug9,ug10));
       
        
       
       DashboardFrame dashboard = new DashboardFrame();
        dashboard.show();
    }
    
}
