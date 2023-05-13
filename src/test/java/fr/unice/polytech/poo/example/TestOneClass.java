package fr.unice.polytech.poo.example;

import static org.junit.jupiter.api.Assertions.*;

class TestOneClass {

    @org.junit.jupiter.api.Test
    void hello() {
        OneClass oneClass = new OneClass();
        assertEquals("hello", oneClass.hello());
    }

}