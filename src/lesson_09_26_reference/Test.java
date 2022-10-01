package lesson_09_26_reference;

public class Test {
    public static void main(String[] args) {
        User testUser = new User();
        System.out.println(testUser.getName());
        test(testUser);
    }

    private static void test(User user) {
        System.out.println(user.getName());
    }
}
