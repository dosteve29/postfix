/**
 *
 * @author Steve
 * @param <T>
 */

//generic linked list class
public class LL<T> {
    ListElement<T> head;
    ListElement<T> tail;
    int size;
    
    public LL(){
        this.head = new ListElement<T>();
        this.tail = head;
        this.size = 0;
    }
    
    public void insertAtHead(T value){
        this.head.setLink(new ListElement<T>(value, head.getLink()));
        this.size++;
        if (this.tail == this.head){
            this.tail = head.getLink();
        }
    }
    
    public T deleteFromHead(){
        T retval = null;
        if (this.isEmpty()){
            throw new LLException("Empty List");
        }
        else{
            retval = this.head.getLink().getValue();
            this.head.setLink(this.head.getLink().getLink());
            if (this.head.getLink() == null){
                this.tail = this.head;
            }
            size--;
        }
        return retval;
    }
    
    public void insertAtTail(T value){
        tail.setLink(new ListElement<>(value, tail.getLink()));
        size++;
        tail = tail.getLink();
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
}
