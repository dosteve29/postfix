package lab2;
/**
 *
 * @author Steve
 * @param <T>
 */
public class Stack<T>
{
  private LL<T> theStack;

  public Stack(){
    theStack = new LL<>();
  }

  public boolean isEmpty(){
    return theStack.isEmpty();
  }

  public boolean isFull(){
    return false;
  }

  public void push(T value) throws LLException{
    theStack.insertAtHead(value);
  }
    
  public T pop(){
    return theStack.deleteFromHead();
  }
  
  public int getSize(){
      return theStack.size;
  }
}
