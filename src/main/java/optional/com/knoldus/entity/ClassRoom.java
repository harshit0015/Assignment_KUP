package optional.com.knoldus.entity;
import java.util.Optional;

public class ClassRoom implements ClassRoomInterface {
    static String roomID;
    private static Optional<Student> students;

    public ClassRoom(String roomID, Optional<Student> student)
    {
        this.roomID = roomID;
    }
    @Override
    public String toString()
    {
        return "ClassRoom{" + roomID + "}";
    }

    @Override
    public String getRoomID()
    {
        return roomID;
    }

}
