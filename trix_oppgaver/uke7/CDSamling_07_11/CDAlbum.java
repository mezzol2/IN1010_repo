//import java.util.Comparator;

class CDAlbum implements Comparable<CDAlbum>{
    private String artistNavn;
    private String albumNavn;
    private int utgivelsesÅr;
    
    CDAlbum(String artistNavn, String albumNavn, int utgivelsesÅr){
        this.artistNavn = artistNavn;
        this.albumNavn = albumNavn;
        this.utgivelsesÅr = utgivelsesÅr;
    }

    public String getArtistNavn(){
        return artistNavn;
    }

    public String getAlbumNavn(){
        return albumNavn;
    }

    @Override
    public String toString(){
        return albumNavn+" by "+artistNavn+" ("+utgivelsesÅr+")";
    }

    @Override
    public int compareTo(CDAlbum otherCdAlbum){
        return this.albumNavn.compareTo(otherCdAlbum.getAlbumNavn()); //>
    }   //returns positive if this.artistNavn is "greater"
        //returns negative if this.artistNavn is "lesser"
}