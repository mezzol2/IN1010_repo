import java.util.ArrayList;

class SortertArrayList<T extends Comparable<T>>{
    ArrayList<T> list = new ArrayList<T>();

    public void settInn(T data){
        int i = 0;
        for (T element : list){
            if (data.compareTo(element)<0){
                list.add(i,data);
                return;
            } else{
                i++;
            }
        }

        //This adds the data to the end of the list
        list.add(i,data);
    }

    public T hentUtFørste(){
        if (list.size() == 0){
            throw new RuntimeException("There are no cats in boxes");
        }
        
        //try{ 
            return list.remove(0);
        // } catch (Exception e){
        //     throw new RuntimeException("There are no cats in boxes");
        // }
    }
}
