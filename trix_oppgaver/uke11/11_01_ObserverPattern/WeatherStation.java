import java.util.ArrayList;

class WeatherStation implements Subject{
    private double temperature;
    private ArrayList<Observer> observers = new ArrayList<>();

    WeatherStation(Double startTemperature){
        temperature = startTemperature;
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        if (observers.size() != 0){
            observers.remove(observer);
        }
        System.out.println("There are currently no observers to remove");

    }

    @Override
    public void notifyObservers(){
        if (observers.size() == 0){
            System.out.println("There are currently no observersto notify");
            return;    
        }
        
        for (Observer o : observers){
            o.update(temperature);
        }
    }

    public Double getTemperature(){
        return temperature;
    }

    public void setTemperature(Double temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    public void printTemp(){
        System.out.println("The temperature is currently "+temperature);
    }
}