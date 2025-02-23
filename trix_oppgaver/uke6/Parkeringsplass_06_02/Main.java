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

        //Test Parkeringshus
        Bil bil1 = new Bil("111", 1);
        Bil bil2 = new Bil("222",2);
        Bil bil3 = new Bil("333",3);
        Motorsykkel bike1 = new Motorsykkel("444", 40);
        Motorsykkel bike2 = new Motorsykkel("555", 50);
        Motorsykkel bike3 = new Motorsykkel("666", 60);



    }
}