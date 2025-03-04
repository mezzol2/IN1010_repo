class Main{
    public static void main(String[] args) {
        Katt[] cats = new Katt[3];

        Katt cat1 = new Katt("Billie", 9);
        Katt cat2 = new Katt ("Big Cat", 5);
        Katt cat3 = new Katt("Nacho", 13);

        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        Katt oldestKatt = cats[0];

        for (Katt cat : cats){
            if (cat.compareTo(oldestKatt) == 1){
                oldestKatt = cat;
            }
        }

        System.out.println(oldestKatt);
    }
}