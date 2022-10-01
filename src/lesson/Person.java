package lesson;

public class Person {
    private String name;

    private String surname;

    private int age;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void askPerson (Person person) {
        System.out.println(person.getName() + ", how old are you?");
    }

    public void replyByPerson (Person person) {
        System.out.println("I am " + person.getAge() + " years old");
    }

    public void sayHelloByName (Person personToWhom1, Person personToWhom2) {
        System.out.println("Hello, " + personToWhom1.name + " and " + personToWhom2.name);
    }

    public void sayHelloByNameAndSurname (Person personToWhom1, Person personToWhom2) {
        System.out.println("Hello, " + personToWhom1.name + " " + personToWhom1.surname + " and " + personToWhom2.name + " " + personToWhom1.surname);
    }
}
