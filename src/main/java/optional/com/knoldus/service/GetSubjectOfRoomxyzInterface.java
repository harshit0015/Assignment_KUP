package optional.com.knoldus.service;
import optional.com.knoldus.entity.Student;

import java.util.HashSet;
import java.util.List;
public interface GetSubjectOfRoomxyzInterface {
    HashSet<String> getSubjectOfClassXYZ(List<Student> people);
}
