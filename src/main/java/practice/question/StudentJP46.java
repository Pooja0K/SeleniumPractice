package practice.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentJP46 {
    String FirstName;
    String LastName;
    int Age;
    int  rollNumber;

    StudentJP46(String firstName, String lastName, int age, int rollNumber){
        this.FirstName= firstName;
        this.LastName= lastName;
        this.Age=age;
        this.rollNumber=rollNumber;
    }

    public static void main(String[] args) {
      StudentJP46 student1 = new StudentJP46("Pooja", "Singh", 35, 1);
      StudentJP46 student2 = new StudentJP46("Anjuli", "Singh", 30, 2);
      StudentJP46 student3 = new StudentJP46("Saket", "Singh", 29, 3);
      StudentJP46 student4 = new StudentJP46("Ankit", "Kumar", 34, 4);

        List<StudentJP46> list= new ArrayList<StudentJP46>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        Collections.sort(list,new NameComparator());
        for (StudentJP46 s: list){
            System.out.println(s.FirstName+" "+s.LastName+" "+s.Age+" "+s.rollNumber);
        }
    }
}
