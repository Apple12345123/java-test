package java_test;
// 게임 캐릭터 설계하기
public class Test6 {
    String name;
    int level;
    int health;

    public Test6 (String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + "의 공격!");
    }
    public void takeDamage(int damage) {
        System.out.println(name + "는 " + damage + "의 피해를 입었습니다. 체력이 " + health + " 남았습니다.");
    }
}
