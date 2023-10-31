import java.util.Objects;

public abstract class Character implements Movable, Comparable<Character> {
    protected String name;
    protected int life;
    protected int agility;
    protected int wit;
    protected int strength;
    protected final String RPGClass;
    protected int capacity; // Added capacity attribute

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.capacity = 0; // Default capacity set to 0
    }

    protected Character(String name, String RPGClass, int capacity) {
        this(name, RPGClass);
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    // Attack method remains unchanged
    public void attack(String random) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    // Movement methods implemented from Movable interface
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

    // Unsheathe method remains unchanged
    public final void unsheathe() {
        System.out.println(this.name + ": unsheathes his weapon.");
    }

    @Override
    public int compareTo(Character other) {
        if (this.RPGClass.equals(other.RPGClass)) {
            return Integer.compare(this.capacity, other.capacity);
        } else if (this instanceof Warrior && other instanceof Mage) {
            if (this.capacity % other.capacity == 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (this instanceof Mage && other instanceof Warrior) {
            if (other.capacity % this.capacity == 0) {
                return -1;
            } else {
                return 1;
            }
        }
        // If the RPG classes are different and the characters are not Warrior or Mage
        return 0; // Or you might define a custom logic for other RPG classes.
    }
}
