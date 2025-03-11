class Main {
    public static void main(String[] args) {
        CDAlbum cd1 = new CDAlbum("Green Day", "American Idiot", 2004);
        CDAlbum cd2 = new CDAlbum("My Chemical Romance", "The Black Parade", 2008);
        CDAlbum cd3 = new CDAlbum("The Beatles", "Seagent Pepper Loney Hearts Club Band", 1965);
        CDAlbum cd4 = new CDAlbum("Fake Band", "AAAAA", 2025);

        System.out.println(cd1);
        System.out.println(cd2);
        
        System.out.println("American Idiot comes before The Black Parade alphebetically");
        System.out.println("Thus, American Idiot < The Black Parade, so result is negative");
        System.out.println(cd1.compareTo(cd2));
        System.out.println("The Black Parade > Seagent Pepper Loney Hearts Club Band, so result is positive");
        System.out.println(cd2.compareTo(cd3));

        CDSamling shelf = new CDSamling();
        shelf.addCD(cd1);
        shelf.addCD(cd2);
        shelf.addCD(cd3);
        shelf.addCD(cd4);

        shelf.printAll();
    }
}
