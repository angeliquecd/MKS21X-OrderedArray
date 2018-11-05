import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T
extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
public void add(int index, T value){
  add(value);
}
public boolean add(T value){
  if (this.size()==0) super.add(value);
  else super.add(findindexy(value,this),value);
   return true;
}
private int findindexy(T value, OrderedArrayList<T> listy){
  boolean firstly=(value.compareTo(listy.get(0)))>0;
  for (int i = 0;i<listy.size();i++){
    if((value.compareTo(listy.get(i))>0)!=firstly){
      return i;
    }
  }
  if (!firstly) return 0;
  else return this.size();
}
public T set(int index, T value){
  this.remove(index);
  this.add(value);
  return this.get(index);
}
}
