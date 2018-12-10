package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("car")
public class Car {

    private String width;
    private String height;
    private String carAge;

    @Override
    public String toString() {
        return "Car{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", carAge='" + carAge + '\'' +
                '}';
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCarAge() {
        return carAge;
    }

    public void setCarAge(String carAge) {
        this.carAge = carAge;
    }
}
