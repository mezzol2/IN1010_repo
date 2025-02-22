class Main{
    public static void main(String[] args) {
        Bil car = new Bil("QWERTY", 4);
        Motorsykkel bike = new Motorsykkel("1234", 120.4);

        Parkeringsplass<Bil> carPlace = new Parkeringsplass<>();
        Parkeringsplass<Motorsykkel> bikePlace = new Parkeringsplass<>();

        carPlace.parkVehicle(car);
        bikePlace.parkVehicle(bike);

        System.out.println(carPlace.driveOff().getRegNum());
        System.out.println(bikePlace.driveOff().getRegNum());
    }
}