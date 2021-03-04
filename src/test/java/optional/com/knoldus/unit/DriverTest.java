package optional.com.knoldus.unit;

import optional.com.knoldus.service.StudentWithRoomThatHasNoSubject;
import optional.com.knoldus.service.StudentWithRoomThatHasNoSubjectImpl;
import org.junit.Test;

public class DriverTest {
    public static void main(String[] args) {
            driverTest();
        }
        @Test
        static void driverTest()
        {
            GetSubjectOfRoom_xyzImplTest getSubjectOfRoomXyzImplTest = new GetSubjectOfRoom_xyzImplTest();
            GreetClassRoomHavingStudentImplTest greetClassRoomHavingStudentImplTest = new GreetClassRoomHavingStudentImplTest();
            StudentWithRoomThatHasNoSubjectImplTest studentWithRoomThatHasNoSubjectImplTest = new StudentWithRoomThatHasNoSubjectImplTest();

            getSubjectOfRoomXyzImplTest.testGetSubjectOfRoom_xyzImpl();
            greetClassRoomHavingStudentImplTest.greetClassRoomHavingStudentImpltest();
            studentWithRoomThatHasNoSubjectImplTest.studentWithRoomThatHasNoSubjectImplTest();
        }
}
