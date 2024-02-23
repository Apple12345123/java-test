package java_test;

public class GameCharater extends Test6{

    public GameCharater(String name, int level, int health) {
        super(name, level, health);
    }

    public static void main(String[] args) {
        GameCharater 전사 = (GameCharater) new Test6("전사", 10, 200);
        GameCharater 마법사 = (GameCharater) new Test6("마법사", 10, 100);

        전사.attack();
        마법사.takeDamage(10);

        마법사.attack();
        전사.takeDamage(20);


    }
}
