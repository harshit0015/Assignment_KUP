package optional.com.knoldus.DatabaseModel;
import optional.com.knoldus.entity.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ClassroomInfoImpl implements ClassroomInfo {
    public List<Student> insertClassroomInfo()
    {
        List<String> subject1 = Arrays.asList("Java","SQL","DAA","CNN");
        List<String> subject2 = Arrays.asList("Python","MongoDB","DAA","CNN");
        List<String> subject3 = Arrays.asList("Scala","Akka","MYSQl","CNN");
        List<String> subject4 = Arrays.asList("Rust","Postman","DAA","CNN");

        Student student1 = new Student("Ashu",13, Optional.of(subject1),"A1");
        Student student2 = new Student("Harshit",11,Optional.empty(),"A1");
        Student student3 = new Student("Vikas",24,Optional.of(subject2),"xyz");
        Student student4 = new Student("Anu",28,Optional.of(subject3),"A2");
        Student student5 = new Student("Akash",14,Optional.of(subject4),"xyz");

        List<Student> people = new ArrayList<>();
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(student4);
        people.add(student5);

        return people;
    }
}
