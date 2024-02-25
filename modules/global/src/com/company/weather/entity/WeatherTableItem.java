package com.company.weather.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.*;

@NamePattern("%s|dateTime")
@Table(name = "WEATHER_WEATHER_TABLE_ITEM")
@Entity(name = "weather_WeatherTableItem")
public class WeatherTableItem extends BaseUuidEntity {
    @Id
    @GeneratedValue(generator = "weather_WeatherTableItemSeq")
    @SequenceGenerator(name = "weather_WeatherTableItemSeq", sequenceName = "WEATHER_WEATHER_TABLE_ITEM_SEQ")
    @Column(name = "ID", nullable = false)
    protected int id;
    @Column(name = "DATETIME_")
    protected String dateTime;

    @Column(name = "TEMPERATURE")
    protected String temperature;

    @Column(name = "FEELS_LIKE")
    protected String feelsLike;

    @Column(name = "PRESSURE")
    protected String pressure;

    @Column(name = "HUMIDITY")
    protected String humidity;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "WIND_SPEED")
    protected String windSpeed;

    @Column(name = "WIND_DIRECTION")
    protected String windDirection;

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getPressure() {
        return pressure;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindDirection() {
        return windDirection;
    }
}
