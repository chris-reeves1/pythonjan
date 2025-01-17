package MAbstractlab2;

import java.util.Comparator;

public class PersonComparetor implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName()); 
    }
}