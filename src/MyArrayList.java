import java.util.Arrays;

public class MyArrayList implements MyLists{

    private Person[] array = new Person[5];
    private int size = 0;


    @Override
    public void add(Person person) {
        if (size >= array.length){
            enlarge();
        }
        array[size] = person;
        size=size+1;
    }

    private void enlarge (){
        Person[] newArray = Arrays.copyOf(array, array.length * 2);
        array =newArray;
    }


    @Override
    public Person get(int index) {
        if (index>=0 && index<size){
            return array[index];
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }




}
