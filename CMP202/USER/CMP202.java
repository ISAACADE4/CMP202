public class CMP202 {

    int age;
    int usage;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 25;
        height = 170;
        name = "James";
        name.length();

        password = "12345678";

        if (password.contains("12345678")|| password.contains("abcd")) {
            System.out.println("Password is too easy");

        }

    }
}