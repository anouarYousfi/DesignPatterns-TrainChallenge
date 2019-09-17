package com.sqli.train;

public abstract  class Wagon {
    private boolean isLast;
    public abstract String toString();

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }
}
