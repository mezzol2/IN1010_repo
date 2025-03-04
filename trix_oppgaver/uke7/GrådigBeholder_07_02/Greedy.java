class Greedy < E extends Comparable<E>>{
    E x;

    public E setIn(E y){
        //if empty, put the element in the containter
        if (x==null){
            x = y;
            return null;
        } else if (y.compareTo(x) >= 0){
            E oldX = x;
            x = y;
            return oldX;
        } else{
            return null;
        }
    }

    public E getObject(){
        return x;
    }
}