import MyVectors.MyOwnVector;

public class App {
    public static void main(String[] args) throws Exception {
        
        MyOwnVector<String> myOwnVector = new MyOwnVector(3);

        myOwnVector.add("joao");
        myOwnVector.add("joaquin");
        myOwnVector.add("lucia");
        myOwnVector.add("joana");

        myOwnVector.search(0);
        myOwnVector.search(1);
        myOwnVector.search(2);
        myOwnVector.search(3);
        
    }
}
