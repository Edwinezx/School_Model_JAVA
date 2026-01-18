package com.school.model.people.staff;

import com.school.model.people.People;

public abstract class Staff extends People {

    protected String staffId;

    public Staff(String name, int age, String staffId) {
        super(name, age);
        this.staffId = staffId;
    }
}
