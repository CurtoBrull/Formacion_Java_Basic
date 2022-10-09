package DatosAvanzados;

public class ArrayMain {

  public static void main(String[] args) {
    int array1[] = new int[5];
    array1[0] = 1;
    array1[1] = 2;
    array1[2] = 3;
    array1[3] = 4;
    array1[4] = 5;

    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
    }
    System.out.println();

    for (int i : array1) {
      System.out.print(i + " ");
    }
    System.out.println();

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();

    for (int num2 : arr2) {
      System.out.print(num2 + " ");
    }
    System.out.println();

    String nombres[] = { "Javier", "Izhan", "Iris" };

    for (String nombre : nombres) {
      System.out.print(nombre + " ");
    }
    System.out.println();

    //		MultidimensionalArray
    int[][] multidimensionalArray = new int[2][4];
    multidimensionalArray[0][0] = 1;
    multidimensionalArray[0][1] = 2;
    multidimensionalArray[0][2] = 3;
    multidimensionalArray[0][3] = 4;

    multidimensionalArray[1][0] = 10;
    multidimensionalArray[1][1] = 20;
    multidimensionalArray[1][2] = 30;
    multidimensionalArray[1][3] = 40;

    for (int i1 = 0; i1 < multidimensionalArray.length; i1++) {
      for (int j = 0; j < multidimensionalArray[1].length; j++) {
        System.out.println(
          "El valor de la posición " +
          i1 +
          "-" +
          j +
          " es = " +
          multidimensionalArray[i1][j]
        );
        //				System.out.println(multidimensionalArray[i1][j]);
      }
    }

    int arrayMulti[][] = {
      { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
      { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
    };

    var result = arrayMulti[0][1];
    System.out.println(result);
  }
}
