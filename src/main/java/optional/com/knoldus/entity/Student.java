package optional.com.knoldus.entity;

import java.util.List;
import java.util.Optional;
public class Student implements StudentInterface{
    private String name;
    private int rollNumber;
    private Optional<List<String>> subjects;
    private String roomID; //I had to use roomID here to get the task done.

    public Student(String name, int rollNumber, Optional<List<String>> subjects, String roomID) {
        if(name == null){
            throw new IllegalArgumentException("Null value for name is not permitted");
        }
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
        this.roomID = roomID;
    }

    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public Optional<List<String>> getSubjects(){
        return subjects;
    }
    public Optional<List<String>> classRoom()
    {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", Subject=" + subjects + ", Roll Number=" + roomID;
    }

    public String getRoomID() {
        return roomID;
    }
    public boolean subjectIsEmpty()
    {
        return subjects.isEmpty();
    }
}
