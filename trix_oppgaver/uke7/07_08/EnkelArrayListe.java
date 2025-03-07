import java.util.Iterator;

class EnkelArrayListe implements Iterable<String>{
    String[] strings;
    int arrayLength;
    int nextEmtpyPlace = 0;

    EnkelArrayListe(int arrayLength){
        strings = new String[arrayLength];
        this.arrayLength = arrayLength;
    }

    public void leggTil(String s){ 
        if (nextEmtpyPlace < arrayLength){
            strings[nextEmtpyPlace] = s;
            nextEmtpyPlace++;
        } else{
            throw new IllegalStateException("There is no room at the inn");
        }
    }

    public Iterator<String> iterator(){
        return new ListeIterator();
    }

    private class ListeIterator implements Iterator<String>{

        private int index = 0;

        public boolean hasNext(){
            return index < nextEmtpyPlace;
        }

        public String next(){
            return strings[index++];
        }
    }
}
