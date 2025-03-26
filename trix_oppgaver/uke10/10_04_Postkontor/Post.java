class Post{
    private String beskrivelse;
    private String mottaker;

    Post (String beskrivelse, String mottaker){
        this.beskrivelse = beskrivelse;
        this.mottaker = mottaker;
    }

    public String hentMottaker(){
        return mottaker;
    }

    public String hentBeskrivelse(){
        return beskrivelse;
    }
}