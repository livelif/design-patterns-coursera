package com.example.sharingapp;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AddContactCommand extends Command {

    private Context context;
    private Contact contact;
    private ContactList contactList;

    public AddContactCommand(ContactList contactList, Contact contact, Context context) {
        this.contactList = contactList;
        this.contact = contact;
        this.context = context;
    }

    @Override
    public void execute() {
        this.contactList.addContact(this.contact);
        this.contactList.saveContacts(this.context);
        setIsExecuted(true);
    }
}
