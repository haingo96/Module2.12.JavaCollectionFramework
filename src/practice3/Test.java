package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("G", 1, "d");
        Student st2 = new Student("H", 2, "c");
        Student st3 = new Student("I", 3, "b");
        Student st4 = new Student("K", 4, "a");

        List<Student> stList = new ArrayList<>();

        stList.add(st3);
        stList.add(st1);
        stList.add(st4);
        stList.add(st2);

        System.out.println(stList);
        Collections.sort(stList);
        Comparator<Student> idCompare = (a, b) -> (a.getId() - b.getId());

        Collections.sort(stList, (a, b) -> a.getClasses().compareTo(b.getClasses()));
        System.out.println(stList);
    }
}
