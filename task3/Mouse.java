package part3.task3;

public class Mouse extends Animal {
    public Mouse(String myName, int myId) {
        super(myName, myId);
    }

    @Override
    public void eat() {
        System.out.println("老鼠正在吃大米");
    }

    @Override
    public void sleep() {
        System.out.println("老鼠正在睡觉");
    }
    
}
