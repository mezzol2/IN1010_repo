class TestSortertArrayList {
    public static void main(String[] args){
        SortertArrayList<Katt> manyBoxes = new SortertArrayList<>();
        Katt cat1 = new Katt("Billie", 9);
        Katt cat2 = new Katt("Two Socks", 5);
        Katt cat3 = new Katt("Seven", 15);
        Katt cat4 = new Katt("The Devious One", 1);

        manyBoxes.settInn(cat1);
        manyBoxes.settInn(cat2);
        manyBoxes.settInn(cat3);
        manyBoxes.settInn(cat4);

        System.out.println(manyBoxes.hentUtFørste());
        System.out.println(manyBoxes.hentUtFørste());
        System.out.println(manyBoxes.hentUtFørste());
        System.out.println(manyBoxes.hentUtFørste());
        System.out.println(manyBoxes.hentUtFørste());
    }    
}
