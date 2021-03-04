package optional.com.knoldus.service;

import optional.com.knoldus.entity.Student;

import java.util.HashSet;
import java.util.List;

public class GreetClassroomHavingStudentImpl implements GreetClassroomHavingStudent {

    @Override
    public String greetClassroomHavingStudent(List<Student> people) {
        HashSet<String> studentsInClass = new HashSet<>();
        System.out.println("*****Print hello Student if a room has students associated*****");
        people.forEach((p) -> {
            if(p.getSubjects().isPresent() && !p.getName().isEmpty())
            {
                //System.out.println("Hello " + p.getName());
                studentsInClass.add(p.getName());
            }
        });
        return "Hello Students";
    }
}
