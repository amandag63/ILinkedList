package ius;

public class LinkedList<T> implements ILinkedList<T> {

    private ILinkedList next;
    T data;


    public LinkedList() {
        this.next = null;
        this.data = null;
    }//end LinkedList


    public ILinkedList<T> next() {
        return next;
    }//end next()


    public ILinkedList<T> last() {
        ILinkedList<T> temp = this;
        while (temp.next() != null) {
            temp = temp.next();
        }//end while loop
        return temp;
    }//end last()


    public ILinkedList<T> after(int n) {
        ILinkedList<T> temp = this;
        if (temp != null) {
            for (int i = 0; i < n; i++) {
                temp = temp.next();
            }//end for
        }//end if
        return temp;
    }//end after(int n)


    public ILinkedList<T> detach() {
        ILinkedList<T> remove = next; //detaches so if you have 1->2->3->NULL   it can then be 1->NULL
        next = null;
        return remove;
    }//end detach()


    public T get() {
        return data; //returns the data that you are getting
    }//end get()


    public void set(T value) {
        data = value; //sets the data to whatever value you put
    }//end set(T value)


    public void setNext(ILinkedList<T> nextLocal) {
        next = nextLocal; //sets next to nextLocal node
    }//setNext


    public void append(ILinkedList<T> nextLocal) {
        this.last().setNext(nextLocal);
    }//end append


    public void insert(ILinkedList<T> newFirst) {
        newFirst.append(this);
    }//end insert

}//end class