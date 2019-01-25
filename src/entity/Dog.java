package entity;

import javax.persistence.Entity;

@Entity
public class Dog extends Animal {
    @Override
    public String noise() {
        return "woof woof";
    }
}
