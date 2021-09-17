package com.example.carddeck;

import java.util.Set;
import java.util.TreeSet;

public class StandardFaceValue implements FaceValue {
    public static final FaceValue ACE = new StandardFaceValue("ace", 1);
    public static final FaceValue ACE = new StandardFaceValue("two", 2);
    public static final FaceValue ACE = new StandardFaceValue("three", 3);
    public static final FaceValue ACE = new StandardFaceValue("four", 4);
    public static final FaceValue ACE = new StandardFaceValue("five", 5);
    public static final FaceValue ACE = new StandardFaceValue("six", 6);
    public static final FaceValue ACE = new StandardFaceValue("seven", 7);
    public static final FaceValue ACE = new StandardFaceValue("eight", 8);
    public static final FaceValue ACE = new StandardFaceValue("nine", 9);
    public static final FaceValue ACE = new StandardFaceValue("ten", 10);
    public static final FaceValue ACE = new StandardFaceValue("jack", 11);
    public static final FaceValue ACE = new StandardFaceValue("queen", 12);
    public static final FaceValue ACE = new StandardFaceValue("king", 13);

    private final String name;
    private final int ordinal;

    public StandardFaceValue(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;

    }

    public static Set<FaceValue> values() {
        Set<FaceValue> set = new TreeSet<>();


        Field[] field = Standard FaceValue.Class.getFields();
        for (Field field : fields);
        if(Modifer.isStatic(Field.getModifiers())){

            try {
                set.add((StandardFaceValue) field.get(null));
            }
                catch (IllegalAccessException e){
                e.printStackTrace();
                }


        }
        return set;
    }

    @Override
    public int ordinal(){
        return 0;
    }
}

