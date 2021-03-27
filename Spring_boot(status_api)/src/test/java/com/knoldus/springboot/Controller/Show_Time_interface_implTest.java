package com.knoldus.springboot.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Show_CurrentTime_Tests {
    Show_CurrentTime_interface_impl application = new Show_CurrentTime_interface_impl();
    Date dateObj = new Date();
    @Test
    void showCurrentTimeTestPass() {
        String result = application.show_CurrentTime();
        DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        String localTime = timeFormat.format(dateObj);
        assertEquals(result, "Running ".concat(localTime));
    }
    @Test
       void showCurrentTimeTestFail() {
        {
            String result = application.show_CurrentTime();
            String timeFormat = String.valueOf(LocalTime.now());
            assertNotEquals(result, ("Running ".concat(timeFormat)));
        }
    }}


