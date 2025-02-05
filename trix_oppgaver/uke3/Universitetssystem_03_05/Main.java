class Main {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        String location = "UiO";
        String course = "IN1010";
        double rate = 505.05;
        String fag = "Java";

        Bachelorstudent bs = new Bachelorstudent(name, age, course, location);
        bs.printInfo();
        if (bs.hasAccess()){
            System.out.println("Problem 1");
        }

        Masterstudent ms = new Masterstudent(name, age, course, location);
        ms.printInfo();
        if (!ms.hasAccess()){
            System.out.println("Problem 2");
        }

        Forsker f = new Forsker(name, age, rate, fag);
        f.printInfo();
        if (f.getHourlyRate() != 505.05){
            System.out.println("Problem 3");
        }

        Professor p = new Professor(name, age, rate, fag, course);
        p.printInfo();
        if (p.getHourlyRate() != rate){
            System.out.println("Problem 4");
        }


    }
}