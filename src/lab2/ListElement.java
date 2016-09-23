/**
 *
 * @author Steve
 */

//list element class provided by professor
public class ListElement<R>
  {
      private R value;
      private ListElement<R> link;
    
      public ListElement(R v, ListElement<R> le)
      {
        this.value = v;
        this.link = le;
      }
    
      public ListElement(R v)
      {
        this(v, null);
      }
    
      public ListElement()
      {
        this(null, null);
      }
    
      public void setValue(R p)
      {
        this.value = p;
      }
    
      public R getValue()
      {
        return this.value;
      }
    
      public ListElement<R> getLink()
      {
        return this.link;
      }
    
      public void setLink(ListElement<R> lnk)
      {
        this.link = lnk;
      }
    }
