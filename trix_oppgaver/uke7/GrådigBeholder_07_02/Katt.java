class Katt implements Comparable<Katt>{
    private String navn;
    private int alder;

    Katt(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }

    @Override
    public String toString(){
        return navn+" is "+alder+" years old";
    }

    @Override
    public int compareTo(Katt katt){
        if (this.getAlder() < katt.getAlder()){
            return -1;
        } else if (this.getAlder() == katt.getAlder()){
            return 0;
        } else{
            return 1;
        }
    }

    public int getAlder(){
        return alder;
    }
}