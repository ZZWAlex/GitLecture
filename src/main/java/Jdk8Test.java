import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Jdk8Test {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> strings = Arrays.asList("1", "hello");
        strings.stream().collect(Collectors.toList()).forEach(System.out::println);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("java", "l");
        hashMap.put("py", "l");

    }
}
