package com.knoldus.optional.Controller;

import com.knoldus.optional.entity.PhoneBook;

import java.util.Optional;
import java.util.Map;
import java.util.logging.Logger;

public class PhoneBookCrawler {

    private static final Logger LOGGER = Logger.getLogger(PhoneBookCrawler.class.getName());

    /**
     * Implements findPhoneByName() method of PhoneBook
     * @param name passing in method findPhoneByNameAndPunishIfNothingFound
     * @return Returns name if found else punishes
     */

    public Optional findPhoneByNameAndPunishIfNothingFound(String name)
    {
        PhoneBook phoneBook = new PhoneBook();
        Optional result = phoneBook.findPhoneByName(name);

        return (result.isPresent()) ? Optional.of(result.get()) : Optional.of("Punish");
    }

    /**
     * Implements findPhoneByName() method of PhoneBook
     * @param name passing in method findPhoneByNameAndPrintPhoneBookIfNothingFound
     * @return Returns name if found else returns PhoneBook
     */
    public Optional findPhoneByNameAndPrintPhoneBookIfNothingFound(String name)
    {
        PhoneBook phoneBook = new PhoneBook();
        Optional result = phoneBook.findPhoneByName(name);

        return (result.isPresent()) ? Optional.of(result.get()) : Optional.of(phoneBook);
    }

    /**
     * Implements findPhoneByName() method of PhoneBook using Streams
     * @param name passing in the Method findPhoneByNameAndPunishIfNothingFoundUsingStreams
     * @return Returns name if found else punishes
     */
    public Optional findPhoneByNameAndPunishIfNothingFoundUsingStreams(String name)
    {
        PhoneBook phoneBook = new PhoneBook();
        Optional result = phoneBook.getPhoneBook().entrySet().stream()
                .filter(e -> name.equals(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst();

        return (result.isPresent()) ? Optional.of(result.get()) : Optional.of("Punish");
    }

    /**
     * Implements findPhoneByName() method of PhoneBook using Streams
     * @param name value passing in method findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams
     * @return Returns name if found else returns PhoneBook
     */
    public Optional findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams(String name)
    {
        PhoneBook phoneBook = new PhoneBook();
        Optional result = phoneBook.getPhoneBook().entrySet().stream()
                .filter(e -> name.equals(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst();

        return (result.isPresent()) ? Optional.of(result.get()) : Optional.of(phoneBook);
    }

    /**
     * Implements findNameByPhoneNumber() method of PhoneBook
     * @param name value passing in method findPhoneNumberByNameOrNameByPhoneNumber
     * @param phone value passing in method findPhoneNumberByNameOrNameByPhoneNumber
     * @return Returns name if found else returns empty
     */

    public Optional findPhoneNumberByNameOrNameByPhoneNumber(String name, long phone)
    {
        PhoneBook phoneBook = new PhoneBook();
        Optional result = phoneBook.findNameByPhoneNumber(name, phone);

        return (result.isPresent()) ? Optional.of(result.get()) : Optional.empty();
    }

    public static void main(String[] args) {
        PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler();

        //Calling findPhoneByNameAndPunishIfNothingFound() here
        Optional phone = phoneBookCrawler.findPhoneByNameAndPunishIfNothingFound("Harshit");
        LOGGER.info(String.valueOf(phone.get()));

        //Calling findPhoneByNameAndPrintPhoneBookIfNothingFound() here
        Optional phone2 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("Manu");
        LOGGER.info(phone2.get().toString());

        //Calling findPhoneByNameAndPunishIfNothingFoundUsingStreams ()here
        Optional phone3 = phoneBookCrawler.findPhoneByNameAndPunishIfNothingFoundUsingStreams("Harshit");
        LOGGER.info(String.valueOf(phone3.get()));

        //Calling findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams() here
        Optional phone4 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams("Manu");
        LOGGER.info(phone4.get().toString());

        //Calling findPhoneNumberByNameOrNameByPhoneNumber() here

        Optional phone7 = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Harshit",
                6391158496L);
        if(phone7.isPresent())
        {
            LOGGER.info(String.valueOf(phone7.get()));
        }
        else
        {
            LOGGER.info("Not Found!");
        }
    }
}




