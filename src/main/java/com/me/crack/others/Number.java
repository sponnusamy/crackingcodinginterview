package com.me.crack.others;

public enum Number {
    ONE(1);
    private int value;
    private Number(int i) {
        value=i;
    }
    public int getValue() {
        return value;
    }
}