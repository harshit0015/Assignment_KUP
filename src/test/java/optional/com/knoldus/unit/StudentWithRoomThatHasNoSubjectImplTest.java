package optional.com.knoldus.unit;

import optional.com.knoldus.DatabaseModel.ClassroomInfo;
import optional.com.knoldus.DatabaseModel.ClassroomInfoImpl;
import optional.com.knoldus.entity.Student;
import optional.com.knoldus.service.StudentWithRoomThatHasNoSubjectImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StudentWithRoomThatHasNoSubjectImplTest {
    ClassroomInfo classroomInfo = new ClassroomInfoImpl();
    List<Student> studentList = classroomInfo.insertClassroomInfo();
    @Test
    public void studentWithRoomThatHasNoSubjectImplTest()
    {
        StudentWithRoomThatHasNoSubjectImpl studentWithRoomThatHasNoSubject = new StudentWithRoomThatHasNoSubjectImpl();
        studentWithRoomThatHasNoSubject.studentWithRoomThatHasNoSubject(studentList);
        HashSet<String> studentSetReceived = studentWithRoomThatHasNoSubject.studentWithRoomThatHasNoSubject(studentList);
        HashSet<String> studentSetTest = new HashSet<>(Arrays.asList("Ayush"));
        Assert.assertEquals(studentSetTest.toString(),studentSetReceived.toString());
    }
}
