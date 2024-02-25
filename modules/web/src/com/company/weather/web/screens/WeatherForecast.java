package com.company.weather.web.screens;

import com.company.weather.entity.WeatherTableItem;
import com.company.weather.service.WeatherService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("weather_WeatherForecast")
@UiDescriptor("weather-forecast.xml")
public class WeatherForecast extends Screen {
    @Inject
    private Table weatherTable;
    @Inject
    private Button getWeatherBtn;
    @Inject
    private CollectionContainer<WeatherTableItem> weatherTableDc;
    @Inject
    private WeatherService weatherService;

    public void onGetWeatherBtnClick() {
        String city = "Moscow"; // Получите город из формы, если необходимо
        clearTable();
        String weatherForecast = weatherService.getWeatherForecast(city);
        addWeatherForecastToTable(weatherForecast);
    }

    private void clearTable() {
        weatherTableDc.getMutableItems().clear();
    }

    private void addWeatherForecastToTable(String forecastData) {
        System.out.println(forecastData);
        String[] rows = forecastData.split("\n");
        for (String row : rows) {
            String[] columns = row.split("\\s+");
            WeatherTableItem item = createWeatherTableItem(columns);
            weatherTableDc.getMutableItems().add(item);
        }
    }

    private WeatherTableItem createWeatherTableItem(String[] data) {
        WeatherTableItem item = new WeatherTableItem();
        item.setDateTime("data[0]");
        item.setTemperature("data[1]");
        item.setFeelsLike("data[2]");
        item.setPressure("data[3]");
        item.setHumidity("data[4]");
        item.setDescription("data[5]");
        item.setWindSpeed("data[6]");
        item.setWindDirection("data[7]");
        return item;
    }
}