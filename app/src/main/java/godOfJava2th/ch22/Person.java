package godOfJava2th.ch22;

public class Person extends AbstractPerson{

    public static void main(String[] args) {
        Person person = new Person();
        person.getAge();
    }

    @Override
    public void getAge() {
        System.out.println("age: " + age);
    }
}
