public class Arr {

    private static final int MAX_EXPANSION = 10000;

    private int capacity = 10;

    private int expansionFactor = 10;

   private int[] arr = new int[10];

   private int[] newarray = new int[arr.length + 1];

private int numElements = 0;

public Arr(int capacity) {

    this.capacity = capacity;
}

public Arr (int capacity, int expansionFactor) {

    if(expansionFactor <= MAX_EXPANSION && capacity > 0) {
        this.capacity = capacity;
        this.expansionFactor = expansionFactor;
    } else {
        this.expansionFactor = MAX_EXPANSION;
    }

    if(expansionFactor <= MAX_EXPANSION && expansionFactor > 0) {
        this.expansionFactor = expansionFactor;
    } else if (expansionFactor > MAX_EXPANSION) {
        this.expansionFactor = MAX_EXPANSION;
    }
    arr = new int[capacity];

}



    public int size() {
        return arr.length;
    }

    public void add(int num) {

        if(numElements == arr.length) {
         //   grow();
        }

        arr[numElements] = num;
        numElements++;
    }


    // Grow
    // create new array with X extra slots
    // loop through original array and copy to new array
    // Replace the original array with the new one
    private void grow(){
        int [] tempArray = new int[arr.length + 10];
        for(int i = 0; i < arr.length; i++){
            tempArray[i] = arr[i];
        }

        arr = tempArray;
    }

}
