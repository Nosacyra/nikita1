public class Perviyrok {
  public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(array[i]);
            if(array[i] < 0) {
                System.out.println("fols");
            }
           else{
             System.out.println(array[i]);
           }
            }




    }


}
