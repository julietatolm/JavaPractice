package lesson_11_23_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeSorted {
    public static void main(String[] args) {
        List<String> il2 = Arrays.asList("18YU", "ty", "TRghdfszxh", "ZE", "10hfhf");
        List<String> il2Res = il2.stream().sorted().collect(Collectors.toList());
        List<String> il2Res2 =
                il2.stream().sorted((String s1, String s2) -> s1.length()-s2.length()).collect(Collectors.toList());

        String res4 = il2.stream().sorted((String s1, String s2) -> s1.length()-s2.length()).reduce((s1, s2) -> s1 +
                " : " + s2).orElse("");

        System.out.println(il2Res);
        System.out.println(il2Res2);
        System.out.println(res4);
    }
}
