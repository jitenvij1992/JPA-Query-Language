package entity;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {
    @Override
    public String noise() {
        return "meow meow";
    }
}
