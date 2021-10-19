package com.robin.designpatterns.behavioral_patterns.observer.observable;

import com.robin.designpatterns.behavioral_patterns.observer.simple.Observer;

import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

//    private List<Observer> observers;
//    private boolean changed;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        // 注意：我们没有调用notifyObservers()传送数据对象，这表示我们采用的做法是“拉”（观察者手动获取）
        notifyObservers();
    }

//    public void setChanged() {
//        this.changed = true;
//    }
//
//    public void notifyObservers(Object arg) {
//        if (changed) {
//            for (Observer observer : observers) {
//                observer.update(temperature, humidity, pressure);
//            }
//            changed = false;
//        }
//    }
//
//    public void notifyObservers() {
//        notifyObservers(null);
//    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
