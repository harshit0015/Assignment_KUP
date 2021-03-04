package optional.com.knoldus.service;

import optional.com.knoldus.entity.Student;

import java.util.HashSet;
import java.util.List;

public class StudentWithRoomThatHasNoSubjectImpl implements StudentWithRoomThatHasNoSubject{
    @Override
    public HashSet<String> studentWithRoomThatHasNoSubject(List<Student> people) {
        HashSet<String> studentTest = new HashSet<>();
        System.out.println("*****Students associated with a room that have no subjects associated*****");
        people.forEach((p) -> {
            if (p.getSubjects().isEmpty() && !p.getRoomID().isEmpty())
            {
                studentTest.add(p.getName());
            }
        });
        return studentTest;
    }
}
