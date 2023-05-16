package java_programming.day34_abstraction;

import java_programming.day34_abstraction.animaltask.Playable;
import java_programming.day34_abstraction.animaltask.Swimmable;

public class Person implements Swimmable, Playable { // shortcut ==> generate-> implements methods
    @Override
    public void play() {
    }


    @Override
    public void swim() {
    }
}