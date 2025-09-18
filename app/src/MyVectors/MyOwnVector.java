package MyVectors;
public class MyOwnVector<T> {
    private T[] elements;
    private int size;

    public MyOwnVector(int size){
        this.size = size;
    }

    public boolean add(T element){
        this.doubleCapacity();
        if(this.size >= 0 && this.elements.length < this.size){
            this.elements[size] = element;
            return true;
        }
        return false;
    }

    private void doubleCapacity(){
        if(this.size == this.elements.length){
            T[] newVector = (T[]) new Object[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++){
                newVector[i] = this.elements[i];
            } 
        }
    }

    public T search(int pos){
        if(pos <= this.elements.length && pos >= 0){
            return this.elements[pos];
        }
        return (T) new Object();
    }
}
