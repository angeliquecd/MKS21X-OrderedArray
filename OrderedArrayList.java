import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
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
  super.add(findindex(value,this),value);
}
private int findindex(T value){
  boolean firstly=(T.compareTo(listy.get(0)))>0;
  for (int i = 0;i<listy.size();i++){
    if((T.compareTo(listy.get(i))>0)!=firstly){
      int index=listy.get(i);
    }
  }
  return index;
}
}
