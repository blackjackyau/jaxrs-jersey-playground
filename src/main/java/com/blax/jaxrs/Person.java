package com.blax.jaxrs;

import java.io.Serializable;

/**
 * Created by Yau on 11/13/2017.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final String hobby;

    public Person(final String name, final String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }
}
