package optional.com.knoldus.service;

import optional.com.knoldus.entity.Student;

import java.util.HashSet;
import java.util.List;

public interface StudentWithRoomThatHasNoSubject {
    HashSet<String> studentWithRoomThatHasNoSubject(List<Student> people);
}
