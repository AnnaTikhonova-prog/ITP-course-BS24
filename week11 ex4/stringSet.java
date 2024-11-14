import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class stringSet {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("fine");

        removeOddLengthStrings(stringSet);

        System.out.println(stringSet);
    }

    public static void removeOddLengthStrings(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() % 2 != 0) {
                iterator.remove();
            }
        }
    }
}
