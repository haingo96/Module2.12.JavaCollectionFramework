package practice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Students students1 = new Students("st1", 1, "A");
        Students students2 = new Students("st2", 2, "B");
        Students students3 = new Students("st3", 3, "C");

        Map<Students, Integer> stMap = new HashMap<>();
        stMap.put(students1, 1);
        stMap.put(students2, 2);
        stMap.put(students3, 3);
        stMap.put(students1, 4);

        Set<Students> stSet = new HashSet<>();
        stSet.add(students1);
        stSet.add(students2);
        stSet.add(students3);
        stSet.add(students1);

        System.out.println(stMap);
        System.out.println(stSet);
    }
}
