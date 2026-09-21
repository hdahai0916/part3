package part3.task3;

public class Penguin extends Animal {
    public Penguin(String myName, int myId) {
        super(myName, myId);
    }

    @Override
    public void eat() {
        System.out.println("企鹅正在吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("企鹅正在睡觉");
    }
    
}
