import java.security.Signature;
import java.util.Date;

public class Person {
    private String name;
    private Date dateOfBirth;
    private String ID;

    public Person() {
    }

    public Person(String name, Date dayOfBirth, String ID) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDayOfBirth() {
        return dateOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dateOfBirth = dayOfBirth;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dayOfBirth=" + dateOfBirth +
                ", ID='" + ID + '\'' +
                '}';
    }
}