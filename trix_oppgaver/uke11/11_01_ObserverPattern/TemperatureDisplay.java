class TemperatureDisplay implements Observer{
    private final int ID;
    private static int numberOfDisplays = 0;

    TemperatureDisplay(){
        ID = numberOfDisplays;
        numberOfDisplays++;
    }
    
    @Override
    public void update(Double temperature){
        System.out.println("Display "+ID+" now shows temp of "+temperature);
    }
}