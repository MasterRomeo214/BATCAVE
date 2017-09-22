class ArrayExercise{

  public static void main(String[] args){

    int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
    int[] result = findClosest(myArray);
    // print the elements of the resulting array
    System.out.println(result[0]);
    System.out.println(result[1]);
  }
  private static int[] findClosest(int[] numbers) {
    // hint: remember Math.abs();
    int[] myArray2 = new int[2];
    int comparison = -1;

    for(int i = 1; i < numbers.length; i++){
      int calculate = Math.abs(numbers[i - 1] - numbers[i]);
      if(comparison < calculate || comparison < 0 ){
        comparison = calculate;
        myArray2[0]= numbers[i-1];
        myArray2[1]= numbers[i];
      }
    }
    return myArray2;
  }
}
