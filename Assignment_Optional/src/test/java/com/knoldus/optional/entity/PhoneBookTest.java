package com.knoldus.optional.entity;

import java.util.Optional;

import static org.junit.Assert.*;

public class PhoneBookTest {

    private PhoneBook phoneBook = new PhoneBook();

    @org.junit.Test
    public void findPhoneByName() {
        assertEquals(phoneBook.findPhoneByName("Harshit"), Optional.of(6391158496L));
    }
    @org.junit.Test
    public void findPhoneByName1(){
        assertNotEquals(phoneBook.findPhoneByName("vikas"), Optional.of(6391158496L));
    }

    @org.junit.Test
    public void findNameByPhoneNumber() {
        assertEquals(phoneBook.findNameByPhoneNumber("Harshit", 6391158496L), Optional.of(6391158496L));
    }
    @org.junit.Test
    public void findNameByPhoneNumber1() {
        assertNotEquals(phoneBook.findNameByPhoneNumber("Ashu", 6391158496L), Optional.of(6391158496L));
    }
}