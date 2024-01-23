public class Arr {


   private int[] arr = new int[10];

   private int[] newarray = new int[arr.length + 1];

private int num_elements = 0;


    public int size() {
        return arr.length;
    }

    public void add(int num) {

        if(num_elements == arr.length) {
         //   grow();
        }

        arr[num_elements] = num;
        num_elements++;
    }




}
