import hw03.CS232ArrayList;
import hw03.CS232Stack;
import java.util.prefs.BackingStoreException;
import javax.swing.text.html.HTMLDocument;

public class CS232ArrayStack<E> implements CS232Stack<E>{ 

    private CS232ArrayList<E> backingStore;

    public CS232ArrayStack(){
        backingStore = new CS232ArrayList<>();
    }

    @Override
    public void push(E obj) {
        backingStore.insert(backingStore.size(), obj);
    }

    @Override
    public E pop() {
        if(backingStore.size() >0){
            return backingStore.remove(backingStore.size()-1);
        }
        else{
            return null;
        }
    }

    @Override
    public E peek() {
        if(backingStore.size() >0){
            return backingStore.get(backingStore.size()-1);
        }
        else{
            return null;
        }
    }
    
    @Override
    public int size() {
        return backingStore.size();
    }
}