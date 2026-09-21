package part3.task1;

public class Person {
    private String name;
    private int age;
    private int sex;

    public Person() {}

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.sex = person.sex;
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
/* 
    private void eat() {
        System.out.println(name + "正在吃东西");
    }

    private void sleep() {

    }

    private void dadoudou() {

    }*/
}