package optional.com.knoldus.service;
import optional.com.knoldus.entity.Student;
import java.util.*;
import java.util.stream.Collectors;

public class GetSubjectOfRoomxyzImpl implements GetSubjectOfRoomxyzInterface {
    public HashSet<String> getSubjectOfClassXYZ(List<Student> list)
    {
        List<String> unique;
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("******Subjects of students associated with a room that has roomID xyz******");
        List<Student> student1 = list.stream().
                filter(l->l.getRoomID().
                        equals("xyz")).filter(l->!l.subjectIsEmpty()).
                collect(Collectors.toList());

        for (Student s : student1)
        {
            unique = s.getSubjects().stream().distinct().collect(Collectors.toList()).get(0);
            for (String subject : unique)
            {
                hashSet.add(subject);
            }
        }
        return hashSet;
    }
}