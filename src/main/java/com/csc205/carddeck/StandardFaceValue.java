package com.csc205.facevalue;

import java.util.Set;

public class StandardFaceValue implements FaceValue {

    public static final FaceValue ACE = null;
    public static final FaceValue TWO = null;
    public static final FaceValue THREE = null;
    public static final FaceValue FOUR = null;
    public static final FaceValue FIVE = null;
    public static final FaceValue SIX = null;
    public static final FaceValue SEVEN = null;
    public static final FaceValue EIGHT = null;
    public static final FaceValue NINE = null;
    public static final FaceValue TEN = null;
    public static final FaceValue JACK = null;
    public static final FaceValue QUEEN = null;
    public static final FaceValue KING = null;

    private final String name;
    private final int ordinal;

    private StandardFaceValue(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public int compareTo(StandardFaceValue faceValue) {
        return 0;
    }

    @Override
    public int ordinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Face Value {" +
                "name ='" + name + '\'' +
                ", ordinal =" + ordinal +
                '}';
    }

    public static Set<FaceValue> values() {
        return FaceValue;
    }
}
