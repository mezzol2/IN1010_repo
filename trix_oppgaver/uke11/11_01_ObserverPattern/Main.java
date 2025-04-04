class Main{
    public static void main(String[] args) {
    
    WeatherStation station = new WeatherStation(70.0);
    station.printTemp();

    TemperatureDisplay display1 = new TemperatureDisplay();
    TemperatureDisplay display2 = new TemperatureDisplay();
    station.registerObserver(display1);
    station.registerObserver(display2);

    station.setTemperature(69.0);
    }
}