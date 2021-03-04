package optional.com.knoldus.unit;
import optional.com.knoldus.DatabaseModel.ClassroomInfo;
import optional.com.knoldus.DatabaseModel.ClassroomInfoImpl;
import optional.com.knoldus.entity.Student;
import optional.com.knoldus.service.GetSubjectOfRoomxyzImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GetSubjectOfRoom_xyzImplTest {
    ClassroomInfo classroomInfo = new ClassroomInfoImpl();
    List<Student> studentList = classroomInfo.insertClassroomInfo();
    @Test
    public void testGetSubjectOfRoom_xyzImpl()
    {
        GetSubjectOfRoomxyzImpl getSubjectOfRoom_xyz = new GetSubjectOfRoomxyzImpl();
        HashSet<String> subjectList = getSubjectOfRoom_xyz.getSubjectOfClassXYZ(studentList);
        HashSet<String> subjectSample = new HashSet<>(Arrays.asList("CNN, Rust, DAA, MongoDB, Postman, Python"));
        Assert.assertEquals(subjectSample.toString(),subjectList.toString());
    }
}
