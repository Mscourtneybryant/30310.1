package org.example;

// Superclass Monster
class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}

// Subclass FireMonster
class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}

// Subclass WaterMonster
class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}

// Subclass StoneMonster
class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}

// Main program TestMonster
public class TestMonster {
    public static void main(String[] args) {
        // Upcasting to Monster
        Monster m1 = new FireMonster("r2u2");
        Monster m2 = new WaterMonster("u2r2");
        Monster m3 = new StoneMonster("r2r2");

        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        System.out.println(m3.attack());  // Run StoneMonster's attack()

        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack());  // Run StoneMonster's attack()

        // Attempt to create a Monster directly (should not work as intended)
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());  // Should print the default "I don't know how to attack!"
    }
}
