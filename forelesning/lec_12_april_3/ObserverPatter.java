import java.util.ArrayList;

public class ObserverPatter {
    public static void main(String[] args) {
        NewsFeed nrk = new NewsFeed();
        Reader person = new Reader();
        nrk.addObserver(person);

        nrk.newArticle("Siste nytt!");

        Reader p4 = new Reader();
        nrk.addObserver(p4);

        nrk.newArticle("New stuff");

    }    
}

interface Observer{
    void update(Subject s);
}

interface Subject{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class NewsFeed implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<String> articles = new ArrayList<>();

    public void newArticle(String header){
        articles.add(header);

        notifyObservers();
    }

    public void addObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer o:observers){
            o.update(this);
        }
    }

    public String getNewHeadline(){
        return articles.getLast();
    }
}

class Reader implements Observer{
    public void update(Subject s){
        NewsFeed n = (NewsFeed) s; //Casting here
        System.out.println(n.getNewHeadline());
    }
}