import java.lang.reflect.Method;

public abstract class Character implements Movable {
    protected String name;
    protected int life;
    protected int agility;
    protected int wit;
    protected int strength;
    protected final String RPGClass;
    // declare nonabstract methods

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public String getName() {
        return this.name;
    }

    public int getLife() {
        return this.life;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getWit() {
        return this.wit;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public void attack(String random) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(this.name + ": unsheathes his weapon.");
    }
}