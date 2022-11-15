import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<StringBuilder> arrayList = new ArrayList<>();
        for (int i = 1; i < 16; i++) {
            map.put(i, scanner.nextLine());
            if (i == 1 || i == 2 || i == 5 || i == 8 || i == 9 || i == 13) {
                arrayList.add(new StringBuilder(map.get(i)));
            }
        }
        arrayList = (ArrayList<StringBuilder>) arrayList.stream().filter(str -> str.length() % 2 == 1)
                .map(StringBuilder::reverse).collect(Collectors.toList());
        System.out.println(arrayList);
    }
}