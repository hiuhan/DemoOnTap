import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HotelManager {
    ArrayList<Hotel> hotels = new ArrayList<>();
    ArrayList<Person> persons = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() throws ParseException {
        while (true) {
            int choice;
            System.out.println("1. Create room");
            System.out.println("2. Create person");
            System.out.println("3. Display room - Sort by price");
            System.out.println("4. Display customer");
            System.out.println("5. Search customer by name");
            System.out.println("6. Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    createRoom();
                    break;
                case 2:
                    createPerson();
                    break;
                case 3:
                    displayRoom();
                    break;
                case 4:
                    choice4();
                    break;
                case 5:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println(searchCustomer(name));
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("No option!! Choice again");
                    break;
            }
        }
    }

    public void choice4() {
        int choice4 = -1;
        while (choice4 != 3) {
            System.out.println("1. Sort by ID");
            System.out.println("2. Sort by date of birth");
            System.out.println("3. Exit");
            choice4 = Integer.parseInt(sc.nextLine());
            switch (choice4) {
                case 1:
                    displayCustomerByID();
                    break;
                case 2:
                    displayCustomerByDateOfBirth();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("No option!! Choice again");
            }
        }
    }

    public void createRoom() {
        System.out.println("Enter kind of room: ");
        String kindOfRoom = sc.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter room number: ");
        long roomNumber = Long.parseLong(sc.nextLine());
        Hotel hotel = new Hotel(kindOfRoom, price, roomNumber);
        hotels.add(hotel);
    }

    public void createPerson() throws ParseException {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter date of birth: ");
        SimpleDateFormat dr = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirth = dr.parse(sc.nextLine());
        System.out.println("Enter ID: ");
        String ID = sc.nextLine();
        Person person = new Person(name, dateOfBirth, ID);
        persons.add(person);
    }

    public void displayRoom() {
        hotels.sort(new SortRoomByPrice());
        System.out.println("Display room: ");
        for (Hotel room : hotels) {
            System.out.println(room);
        }
    }

    public void displayCustomerByID() {
        persons.sort(new SortPersonById());
        System.out.println("Display person by ID: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void displayCustomerByDateOfBirth() {
        persons.sort(new SortPersonByDateOfBirth());
        System.out.println("Display person by day of Birth: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    public Person searchCustomer (String name){
        for (Person person: persons) {
            if (person.getName().equals(name)) return person;
        }
        throw new InputMismatchException("No Result");
    }
}

