/*
Christopher Wischmann
CIT 130
July 16th, 2022
Adds a node at the start of the linked list with the 
specified data & returns a reference to the 
data in that node
*/

class LinkedList3<T> implements Cloneable {
    private class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node() {
            data = null;
            next = null;
            prev = null;
        }

        public Node(T newData, Node<T> nextValue, Node<T> prevValue) {
            data = newData;
            next = nextValue;
            prev = prevValue;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public LinkedList3() {
        head = null;
    }

    public void addToStart(T itemData) {
        Node tmp = new Node(itemData, head, null);
        if (head != null) {
            head.prev = tmp;
        }

        head = tmp;
        if (tail == null) {
            tail = tmp;
        }
    }

    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.next;
            head.prev = null;
            return true;
        
        } else
        return false;
    }

    public int size() {
        int count = 0;
        Node<T> position = head;

        while (position != null) {
            count++;
            position = position.next;
        }
        return count;
    }

    public boolean contains(T item) {
        return (find(item) != null);
    }

    private Node<T> find(T target) {
        Node<T> position = head;
        T itemAtPosition;

        while (position != null) {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target))return position;
            position = position.next;
        }
        return null;
    }
    public T findData(T target) {
        return find(target).data;
    }

    public void outputList() {
        Node<T> position = head;
        while (position != null) {
            System.out.println(position.data);
            position = position.next;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        Node<T> position = head;
        while (position != null) {
            s.append(position.data + " ");
            position = position.next;
        }
        return s.toString();
    }
    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) return false;
        else if (getClass() != otherObject.getClass()) return false;

        else {
            LinkedList3<T> otherList = (LinkedList3<T>) otherObject;
            if (size() != otherList.size()) return false;
            Node<T> position = head;
            Node<T> otherPosition = otherList.head;

            while (position != null) {
                if (!(position.data.equals(otherPosition.data))) return false;
                position = position.next;
                otherPosition = otherPosition.next;
            }
            return true;
        }
    }
    public void iterateForward() {
        System.out.println("iterating forward..");
        Node tmp = head;

        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
    public void iterateBackward() {
        System.out.println("iterating backword..");
        Node tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.prev;
        }
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}   
    
