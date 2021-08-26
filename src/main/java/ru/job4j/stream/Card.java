package ru.job4j.stream;

import com.sun.jdi.Value;

import java.util.stream.Stream;

public class Card {
    enum Value {
        V_6, V_7, V_8
    }

    enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card {"
                + "SUIT= " + suit
               +  ", VALUE= " + value
                + '}';
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values()).map(value -> suit + " " + value))
                .forEach(System.out :: println);
    }

}
