package part3.task1;

public class task1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(20);
        person1.setSex(1);
        Person person2 = new Person(person1);
        System.out.println(person2.getName());
    }
}