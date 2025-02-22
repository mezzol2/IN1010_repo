class Parkeringsplass <E>{
    private E parkedVehicle;

    public void parkVehicle(E vehicle){
        parkedVehicle = vehicle;
    }

    public E driveOff(){
        E vehicle = parkedVehicle;
        parkedVehicle = null;
        return vehicle;
    }
}