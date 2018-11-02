public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
public boolean add(int index, T value){
  add(value);
}
public boolean add(T value){
  super.add(findindex(value,this),value);
}
private int findindex(T value, OrderedArrayList<T> listy){
  boolean firstly=T.compareTo(list.get(0))>0;
  for (int i = 0;i<listy.size();i++){
    if((T.compareTo(listy.get(i))>0)!=firstly){
      int index=list.get(i);
    };
  }
  return index;
}
}
