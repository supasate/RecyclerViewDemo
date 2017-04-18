package com.example.supasate.recyclerviewdemo;

import java.util.ArrayList;

/**
 * Created by supasate on 4/18/17.
 */

public class Contact {
    private String name;
    private boolean isOnline;

    public Contact(String name, boolean isOnline) {
        this.name = name;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public boolean isOnline() {
        return isOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}
