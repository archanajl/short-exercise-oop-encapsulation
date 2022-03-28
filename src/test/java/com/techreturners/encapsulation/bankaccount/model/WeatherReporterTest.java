package com.techreturners.encapsulation.bankaccount.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeatherReporterTest {

    @Test
    public void checkdisplayWeatherMessageLondonHot() {
        WeatherReporter wr = new WeatherReporter("London",30.6);
        assertEquals("I am in London and it is \uD83C\uDF26. It's too hot \uD83E\uDD75!. The temperature in Fahrenheit is 87.08.", wr.displayWeatherMessage());
    }

    @Test
    public void checkdisplayWeatherMessageNewYorkCold() {
        WeatherReporter wr = new WeatherReporter("New York",7);
        assertEquals("I am in New York and it is \uD83D\uDD06. It's too cold \uD83E\uDD76!. The temperature in Fahrenheit is 44.6.", wr.displayWeatherMessage());
    }

}
