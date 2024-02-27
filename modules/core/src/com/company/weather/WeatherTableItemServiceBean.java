package com.company.weather;

import com.company.weather.entity.WeatherTableItem;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(WeatherTableItemService.NAME)
public class WeatherTableItemServiceBean implements WeatherTableItemService {

    @Inject
    private DataManager dataManager;

    @Override
    public void saveWeatherItem(WeatherTableItem weatherItem) {
        dataManager.commit(weatherItem);
    }
}

