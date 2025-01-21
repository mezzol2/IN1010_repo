class Bil{
    private String eier;
    private String merke;
    
    public Bil(String e, String m){
        eier = e;
        merke = m;
    }

    public void printInfo(){
        System.out.println(eier + " owns a " + merke);
    }
}