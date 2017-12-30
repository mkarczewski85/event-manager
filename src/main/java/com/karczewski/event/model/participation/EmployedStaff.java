package com.karczewski.event.model.participation;

public enum EmployedStaff {

    OPTION_ONE("1-25"), OPTION_TWO("26-50"), OPTION_THREE("Powyżej 50");

    private final String size;

    EmployedStaff(final String size){
        this.size = size;
    }


    @Override
    public String toString() {
        return size;
    }
}
