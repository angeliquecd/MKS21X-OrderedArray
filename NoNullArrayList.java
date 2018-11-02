import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T value){
    if (value==null) throw new IllegalArgumentException;
    super.add(value);
  }
  public void set(int index, T value){
    if (value==null) throw new IllegalArgumentException;
    super.set(index, value);
  }
}
