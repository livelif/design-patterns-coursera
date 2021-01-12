package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {

    private Context context;
    private Contact contact;
    private ContactList contactList;

    public DeleteContactCommand(ContactList contactList, Contact contact, Context context) {
        this.contact = contact;
        this.contactList = contactList;
        this.context = context;
    }

    @Override
    public void execute() {
        this.contactList.deleteContact(this.contact);
        this.contactList.saveContacts(context);
        setIsExecuted(true);
    }
}
