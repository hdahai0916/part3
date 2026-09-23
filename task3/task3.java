package part3.task3;

public class task3 {
    public static void main(String[] args) {
        Animal animal1 = new Mouse("鼠鼠", 1);
        Animal animal2 = new Penguin("企鹅", 2);

        animal1.introduction();
        animal1.eat();
        animal1.sleep();

        System.out.println();

        animal2.introduction();
        animal2.eat();
        animal2.sleep();
    }
}
