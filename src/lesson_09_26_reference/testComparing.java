package lesson_09_26_reference;

public class testComparing {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = cat1;

        System.out.println(cat1 == cat2);

        String str1 = "JAVA";
        String str2 = "JAVA";
        String str3 = "Java";

        System.out.println(str1.equals((str2)));
        System.out.println(str1.equals(str3));
    }
}
