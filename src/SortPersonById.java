import java.util.Comparator;
public class SortPersonById implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2){
        if (o1.getID().compareTo(o2.getID()) > 0 ) return 1;
        else return -1;
    }
}
