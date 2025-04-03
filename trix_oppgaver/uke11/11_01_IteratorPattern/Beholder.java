import java.util.Iterator;

class Beholder implements Iterable<String>{
    Node first = null;
    Node last = null;


    private class Node{
        private String data;
        private Node previous = null;
        private Node next = null;

        Node(String data){
            this.data = data;
        }

        @Override
        public String toString(){
            return data;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Node getPrevious(){
            return previous;
        }

        public void setPrevious(Node previous){
            this.previous = previous;
        }
    }

    public void add(String data){
        Node newNode = new Node(data);

        //List is empty
        if (first == null){
            first = newNode;
            last = newNode;
            return;
        }

        //List is not empty
        last.setNext(newNode);
        newNode.setPrevious(last);
        last = newNode;
    }

    @Override
    public Iterator<String> iterator(){
        return new BeholderIterator();
    }

    private class BeholderIterator implements Iterator<String>{
        private Node node = last;

        @Override
        public String next(){
            Node nodeToReturn = node;
            node = node.getPrevious();
            return nodeToReturn.toString();
        }

        @Override
        public boolean hasNext(){
            return node != null;
        }
    }
}
