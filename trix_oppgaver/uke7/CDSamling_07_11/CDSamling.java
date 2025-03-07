import java.util.ArrayList;

class CDSamling {
    ArrayList<CDAlbum> list = new ArrayList<>();

    public void addCD(CDAlbum newCD){
        if (list.size()==0){
            list.add(newCD);
            return;
        }

        for (CDAlbum cd : list){
            if (cd.compareTo(newCD) >=0){
                int i = list.indexOf(cd);
                list.add(i,newCD);
                return;
            }
        }

        list.addLast(newCD);
    }

    public void printAll(){
        for (CDAlbum cd : list){
            System.out.println(cd);
        }
    }
}