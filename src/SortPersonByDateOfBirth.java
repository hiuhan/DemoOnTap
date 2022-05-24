import java.util.Comparator;
public class SortPersonByDateOfBirth implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2){
        if (o1.getDayOfBirth().compareTo(o2.getDayOfBirth()) > 0 ) return 1;
        else return -1;
    }
}
