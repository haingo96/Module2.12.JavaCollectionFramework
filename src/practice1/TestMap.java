package practice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        String input = "It returns the pair having the least key.";

        input = input.replaceAll("[^a-zA-Z0-9 ]"," ");
        input = input.replaceAll("\\s+", " ");
        input = input.toLowerCase();

        System.out.println(input);

        String[] inputChar = input.split(" ");

        Map<String, Integer> inputHashMap = new HashMap<>();
        for (var e : inputChar) {
            inputHashMap.put(e, 1);
        }

        Map<String, Integer> inputLinkedHashMap = new LinkedHashMap<>();
        for (var e : inputChar) {
            inputLinkedHashMap.put(e, 1);
        }

        Map<String, Integer> inputTreeMap = new TreeMap<>();
        for (var e : inputChar) {
            inputTreeMap.put(e, 1);
        }

        System.out.println(inputHashMap);
        System.out.println(inputLinkedHashMap);
        System.out.println(inputTreeMap);
    }
}
