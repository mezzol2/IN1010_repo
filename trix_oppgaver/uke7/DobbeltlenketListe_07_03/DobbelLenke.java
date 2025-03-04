class DobbelLenke<T>{
    Node first;

    private class Node{
        Node previous;
        Node next;
        T data;

        Node(T data){
            this.data = data;
        }

        public T getData(){
            return data;
        }
        
        public Node getNext(){
            return next;
        }

        public Node getPrevious(){
            return previous;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public void setPrevious(Node previous){
            this.previous = previous;
        }

    }

    public void settInn(T element){
        Node newNode = new Node(element);

        if (first == null){
            first = newNode;
        } else{
            Node currentNode = first;

            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            newNode.setPrevious(currentNode);
        }
    }
}