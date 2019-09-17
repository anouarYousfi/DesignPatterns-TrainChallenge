package com.sqli.train;

public class Head extends Wagon {
    public Head() {
        this.setLast(false);
    }

    @Override
    public String toString() {
        if (this.isLast() == false)
            return "<HHHH";
        else
            return "HHHH>";

    }
}
