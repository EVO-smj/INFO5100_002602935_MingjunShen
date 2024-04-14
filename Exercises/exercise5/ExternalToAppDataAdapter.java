// Adapter Pattern

public class ExternalToAppDataAdapter implements WeatherDataAdapter {
    private WeatherService weatherService;

    public ExternalToAppDataAdapter(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Override
    public String adaptWeatherData() {
        String externalData = weatherService.fetchWeatherData();
        String[] parts = externalData.split(",");
        String temperature = parts[0];
        String humidity = parts[1];
        return "Temperature: " + temperature + "°C, Humidity: " + humidity + "%";
    }
}
