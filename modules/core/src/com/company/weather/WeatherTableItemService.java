package com.company.weather;

import com.company.weather.entity.WeatherTableItem;

public interface WeatherTableItemService {
    String NAME = "weather_WeatherTableItemService";

    void saveWeatherItem(WeatherTableItem weatherItem);
}

