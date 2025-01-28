class MotorsykkelProgram{
    public static void main(String[] args) {
        Motorsykkel myBike = new Motorsykkel("AU38N");
        for (int i = 0; i< 5; i++){
            myBike.kjoer(10);
        }
        System.out.println(myBike.hentKilometerstand());
        System.out.println(myBike.hentProduksjonsnummer());

        Motorsykkel myBike0 = new Motorsykkel("1234");
        Motorsykkel myBike1 = new Motorsykkel("AKSDJV");
        System.out.println(myBike0.hentProduksjonsnummer());
        System.out.println(myBike1.hentProduksjonsnummer());
    }
}