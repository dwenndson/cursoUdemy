package entities;

public class Quantos {
    private String Name;
    private String Email;
    private int Room;

    public Quantos(String name, String email, int room) {
        Name = name;
        Email = email;
        Room = room;
    }

    @Override
    public String toString() {
        return Room + ": "+ Name +", "+ Email;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getRoom() {
        return Room;
    }

    public void setRoom(int room) {
        Room = room;
    }
}
