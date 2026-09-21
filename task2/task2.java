package part3.task2;

public class task2 {
    public static void main(String[] args) {
        System.out.println("当前人数：" + Person.getCount());
        Person person1 = new Person();
        System.out.println("当前人数：" + Person.getCount());
        person1.setName("张三");
        person1.setAge(20);
        person1.setSex(1);
        Person person2 = new Person(person1);
        System.out.println("当前人数：" + Person.getCount());
        System.out.println(person2.getName());
    }
}