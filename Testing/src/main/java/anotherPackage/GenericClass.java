package anotherPackage;


public class GenericClass<T, P> {

    T value;
    P valueTwo;
    int valueThree;


    public GenericClass(T value, P valueTwo, int valueThree) {
        this.value = value;
        this.valueTwo = valueTwo;
    }

    public void print() {
        System.out.println(value);

    }

}

