public class Main {

    public static void main(String[] args) {
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//           С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("1)");
        int[] arr_1 = {0,1,0,0,1,1,0,1};
        for( int i = 0; i< arr_1.length; i++){
            System.out.print(arr_1[i]+" ");
        }
        for(int i = 0; i< arr_1.length; i++){
            if(arr_1[i]==0){
                arr_1[i]=1;
            } else {
                arr_1[i]=0;
            }
        }
        System.out.println();
        for( int i = 0; i< arr_1.length; i++){
            System.out.print(arr_1[i]+" ");
        }
        System.out.println();

//        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("2)");
        int[] arr_2 = new int[8];
        int value = 0;
        for(int i=0; i<arr_2.length; i++){
            arr_2[i]=value;
            value+=3;
            System.out.print(arr_2[i]+" ");
        }
        System.out.println();
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("3)");
        int[] arr_3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i=0; i<arr_3.length; i++){
            System.out.print(arr_3[i]+" ");
        }
        System.out.println();
        for( int i=0; i< arr_3.length; i++){
            if (arr_3[i]<6){
                arr_3[i]*=2;
            }
        }
        for(int i=0; i<arr_3.length; i++){
            System.out.print(arr_3[i]+" ");
        }
        System.out.println();
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//           и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("4)");
        int[][] arr_4 = new int[4][4];
        for (int i = 0; i < arr_4.length; i++) {
            for (int j = 0, x = arr_4[i].length - 1; j < arr_4[i].length; j++, x--) {
                if (i == j || i == x) arr_4[i][j] = 1;
                else arr_4[i][j] = 0;
                System.out.print(arr_4[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
//        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("5)");
        int[] arr_5 = { 17, 5, 3, 7, 11, 4, 5, 2, 6, 8, 9, 27 };
        int minValue = arr_5[0];
        int minIndex = 0;
        int maxValue = arr_5[0];
        int maxIndex = 0;

        for(int i=0; i< arr_5.length; i++){
            if(arr_5[i]<minValue){
                minValue = arr_5[i];
                minIndex = i;
            }
        }

        System.out.println("Минимальный элемент: " + minValue + " с индексом: " + minIndex);

        for(int i=0; i< arr_5.length; i++){
            if(arr_5[i]>maxValue){
                maxValue = arr_5[i];
                maxIndex = i;
            }
        }

        System.out.println("Максимальный элемент: " + maxValue + " с индексом: " + maxIndex);
        System.out.println();
//        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//           если в массиве есть место, в котором сумма левой и правой части массива равны.
//           Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//           граница показана символами ||, эти символы в массив не входят.
        System.out.println("6)");
        method_6(new float[]{2,2,2,1,2,2,10,1});

//        7. **** Написать метод, которому на вход подается одномерный массив и число n
//           (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
//           Для усложнения задачи нельзя пользоваться вспомогательными массивами.


    }

    public static void method_6(float[] arr) {
// я здесь поставил float, потому что если int, тогда {2,2,2,1,2,2,10,2}={2,2,2,1,2,2,10,1} (23/2 = 22/2)
        float sum = 0;
        float sum2 = 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];

        }
        for (int i=0; i < arr.length; i++) {
            sum2 += arr[i];

            if (sum2 == sum/2) {

                System.out.println(true);
            }
        }
    }

}
