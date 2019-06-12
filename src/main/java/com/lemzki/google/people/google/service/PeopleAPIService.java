package com.lemzki.google.people.google.service;

import com.lemzki.google.people.model.PersonDb;

import java.util.concurrent.ExecutionException;

public interface PeopleAPIService {

    //get contacts from google.. convert and save to DB
    String importContactPersonsFromGoogle();


    String exportOneContactToGoogle(PersonDb personDb) throws InterruptedException, ExecutionException;

    String exportAllContactsToGoogle() throws InterruptedException;

    void syncLocalDBWithAPI() throws InterruptedException;
}
