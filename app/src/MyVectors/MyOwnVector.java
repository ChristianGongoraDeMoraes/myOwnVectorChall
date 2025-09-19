package MyVectors;
public class MyOwnVector<T> {
    private T[] elements;
    private int size;

    public MyOwnVector(int size){
        this.size = size;
    }

    public void add(T element){
        this.doubleCapacity();

        this.elements[this.elements.length] = element;
    }

    private void doubleCapacity(){
        if(this.size == this.elements.length){
            T[] newVector = (T[]) new Object[this.elements.length * 2];
            for(int i = 0; i < this.size; i++){
                newVector[i] = this.elements[i];
            }
            this.elements = newVector;
            this.size = this.size * 2;
        }
    }

    public T search(int pos){
        if(pos <= this.size && pos >= 0){
            return this.elements[pos];
        }
        return (T) new Object();
    }
}
