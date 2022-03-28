package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private static final double NINE = 9.0;
    private static final double FIVE = 5.0;
    private static final int THIRTY_TWO = 32;
    private static final int MAX_TEMP = 30;
    private static final int MIN_TEMP = 10;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String displayWeatherMessage() {

        double temperature_F = (NINE / FIVE) * temperature + THIRTY_TWO;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, loc_based_icon(), temp_based_message(), temperature_F);

    }

    public String loc_based_icon() {
        String strIcon = "";
        switch (location){
            case "London":
                strIcon = "🌦";
                break;
            case "California":
                strIcon = "🌅";
                break;
            case "Cape Town":
                strIcon = "🌤";
                break;
            default:
                strIcon = "🔆";
                break;
        }
        return strIcon;

    }

    public String temp_based_message() {
        if (temperature > MAX_TEMP) {
            return "It's too hot 🥵!";
        } else if (temperature < MIN_TEMP) {
            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }

}

