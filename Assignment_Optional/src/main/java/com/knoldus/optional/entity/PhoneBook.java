package com.knoldus.optional.entity;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneBook {
    private final Map<String, Long> phoneBook = Stream.of(new Object[][]{
            {"Harshit", 6391158496L},
            {"Vikas ", 458182215L},
            {"Akash", 1548521479L},
            {"Ashu", 1457845218L},

    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Long) data[1]));

    public Map<String, Long> getPhoneBook() {
        return phoneBook;
    }

    /**
     * Overridden toString() for PhoneBook
     *
     * @return phonebook
     */
    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    /**
     * Method to find phone number using name
     * @param name passing in method findPhoneByName
     * @return findPhoneBy name
     */

    public Optional findPhoneByName(String name) {

        return (phoneBook.containsKey(name)) ? Optional.of(phoneBook.get(name)) : Optional.empty();
    }

    /**
     * Method to find name using phone number
     *
     * @param name  passing in method findNameByPhoneNumber
     * @param phone passing in method findNameByPhoneNumber
     * @return result.isPresent
     */
    public Optional findNameByPhoneNumber(String name, long phone) {

            Optional result = phoneBook.entrySet().stream()
                    .filter(e -> name.equals(e.getKey()))
                    .map(Map.Entry::getValue)
                    .findFirst();


        return (result.isPresent()) ? result : phoneBook.entrySet().stream()
                    .filter(e -> phone == e.getValue())
                    .map(Map.Entry::getValue)
                    .findFirst();
        }
    }

