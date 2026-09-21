package part3.task2;

public class Person {
    private String name;
    private int age;
    private int sex;

    private static int count = 0;

    public Person() {
        count++;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.sex = person.sex;
        count++;
    }
    
    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    public void sleep() {

    }

    public void dadoudou() {

    }
}