package com.example.carddeck;

import java.util.Set;
import java.util.TreeSet;

public class Suit implements FaceValue comparable<Suits> {

    public static final Suit Hearts = new("hearts",1);
    public static final Suit Clubs = new("clubs",2);
    public static final Suit Diamonds = new("diamonds",3);
    public static final Suit Spades = new("spades",4);

    private final String name;
    private final int ordinal;

    public Suit(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;

    }

    public static Set<FaceValue> values() {
        Set<FaceValue> set = new TreeSet<>();


        Field[] field = Suit.class.getFields();
        for (Field field : fields) ;
        if (Modifer.isStatic(Field.getModifiers())) {

            try {
                set.add((Suit) field.get(null));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        }
        return set;
    }

    public int ordinal() {
        return 0;
    }

    //sorting aggrethium
    @Override
    public int compareTo(Suit o) {
        if (this.ordinal > that.ordinal) {
            return 1;

        } else if (this.ordinal < that.ordinal) {
            return 0;
        } else {

        }
    }
}