package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command {

    private Context context;
    private Contact contact;
    private ContactList contactList;

    public EditContactCommand(ContactList contactList, Contact contact, Context context) {
        this.contact = contact;
        this.contactList = contactList;
        this.context = context;
    }

    @Override
    public void execute() {
        contactList.addContact(contact);
        contactList.saveContacts(context);
        setIsExecuted(true);
    }
}
