package Module_6;

public class Monster {
    String name;
    int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void create() {
        System.out.println("Monster " + this.name + " was created");
    }

    public void growl() {
        System.out.println(this.name + " growled");
    }

    public void attack() {
        this.create();
        System.out.println("Monster " + this.name + " attacked with damage " + this.damage);
    }
}

