import java.util.*;

import static java.util.List.*;

public class Main {
    static List<Integer> nums = new ArrayList<>(of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> listWords = new ArrayList<>(Arrays.asList("стол", "стул", "дверь", "окно", "стол", "стул", "дверь", "окно"));
    static List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printingOddNumbers(nums);
        printingHonestNumbers(nums);
        printingUniqueWords(listWords);
        printQuantityRepetitionsWords(strings);
    }

    public static void printingOddNumbers(List<Integer> nums) {
        List<Integer> num = new ArrayList<>();
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) != 0 && nums.get(i) % 2 != 0) {
                num.add(nums.get(i));
            }
        }
        System.out.println(num);
    }

    public static void printingHonestNumbers(List<Integer> nums) {
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i <= nums.size() - 1; i++) {
            if (nums.get(i) != 0 && (nums.get(i) % 2) == 0) {
                num.add(nums.get(i));
            }
        }
        System.out.println(num);
    }

    public static void printingUniqueWords(List<String> listWords) {
        Set<String> num = new HashSet<>();
        for (int i = 0; i <= listWords.size() - 1; i++) {
                num.add(listWords.get(i));
        }
        System.out.println(num);
    }
    public static void printQuantityRepetitionsWords(List<String> num1){
       Map<String,Integer> num = new HashMap<>();
        for (String s : num1) {
            if (!num.containsKey(s)){
                num.put(s,1);
            }else {
                num.put(s, num.get(s) + 1);
            }
        }
        System.out.println(num.values());
    }
}