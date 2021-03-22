package com.knoldus.optional.Controller;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PhoneBookCrawlerTest {

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler();

    @Test
    public void findPhoneByNameAndPunishIfNothingFound() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFound("Harshit"), Optional.of(6391158496l));
    }
    @Test
    public void findPhoneByNameAndPunishIfNothingFound1() {
        assertNotEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFound("vikas"), Optional.of(6391158496l));
    }

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFound() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("Harshit"), Optional.of(6391158496l));
    }

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFound1() {
        assertNotEquals(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("Vikas"), Optional.of(6391158496l));
    }
    @Test
    public void findPhoneByNameAndPunishIfNothingFoundUsingStreams() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFoundUsingStreams("Harshit"), Optional.of(6391158496l));
    }
    @Test
    public void findPhoneByNameAndPunishIfNothingFoundUsingStreams1() {
        assertNotEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFoundUsingStreams("Vikas"), Optional.of(6391158496l));
    }
    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams("Harshit"), Optional.of(6391158496l));
    }
    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams1() {
        assertNotEquals(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams("Vikas"), Optional.of(6391158496l));
    }

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumber() {
        assertEquals(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Harshit", 8447507369L), Optional.of(6391158496l));
    }
    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumber1() {
        assertNotEquals(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("vikas", 8447507369L), Optional.of(6391158496l));
    }
}