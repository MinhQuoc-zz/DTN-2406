package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(15);
        set.add(25);
        set.add(15);
        set.add(15);
        set.add(19);

        System.out.println(set);
    }
}
