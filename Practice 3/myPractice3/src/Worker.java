import java.util.Objects;

public class Worker {
    private int ID;
    private String FullName;
    private String Phone;
    private String Username;
    private String Password;

    public Worker(int ID, String fullName, String phone, String username, String password) {
        setID(ID);
        setFullName(fullName);
        setPhone(phone);
        setUsername(username);
        setPassword(password);
    }

    public Worker(int ID, String fullName, String username, String password) {
        this(ID,fullName,null,username,password);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Worker{" + "FullName=" + FullName + " ,ID=" + ID +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return ID == worker.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }
}
