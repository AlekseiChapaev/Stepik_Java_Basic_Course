import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            T item = it.next();
            if (set1.contains(item) && set2.contains(item)) {
                it.remove();
            }
        }

        return set;
    }
    public static void main(String[] args) {
        System.out.println(symmetricDifference(new HashSet<>(Arrays.asList(1, 2, 3)), new HashSet<>(Arrays.asList(0, 1, 2))));
    }
}
