package optional.com.knoldus.controller;

import optional.com.knoldus.DatabaseModel.ClassroomInfo;
import optional.com.knoldus.DatabaseModel.ClassroomInfoImpl;
import optional.com.knoldus.entity.Student;
import optional.com.knoldus.service.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalDemoJava8 {
    static ClassroomInfo classroomInfo = new ClassroomInfoImpl();
    static List<Student> studentList = classroomInfo.insertClassroomInfo();
    public static void main(String[] args) {
        //Find the students associated with a room that have no subjects associated.
        StudentWithRoomThatHasNoSubject studentWithRoomThatHasNoSubject = new StudentWithRoomThatHasNoSubjectImpl();
        HashSet<String> studentWithNoSubject = studentWithRoomThatHasNoSubject.studentWithRoomThatHasNoSubject(studentList);
        System.out.println(studentWithNoSubject);
        //Subjects of students associated with a room that has roomID xyz
        GetSubjectOfRoomxyzInterface getSubjectOfRoomxyzInterface = new GetSubjectOfRoomxyzImpl();
        HashSet<String> subjectOfRoomXyz= getSubjectOfRoomxyzInterface.getSubjectOfClassXYZ(studentList);
        System.out.println(subjectOfRoomXyz);
        //print "hello Student" if a room has students associated.
        GreetClassroomHavingStudent greetClassroomHavingStudent = new GreetClassroomHavingStudentImpl();
        String studentsInClass = greetClassroomHavingStudent.greetClassroomHavingStudent(studentList);
        System.out.println(studentsInClass);
    }
}
