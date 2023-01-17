package deba.service;

public interface IWeatherService<T>{

    public T getForecast(String city) throws Exception;

}
