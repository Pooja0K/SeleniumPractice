package practice.question;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentJP46> {

    @Override
    public int compare(StudentJP46 student1, StudentJP46 student2)
     {
        return student1.FirstName.compareTo(student2.FirstName);
    }
}
