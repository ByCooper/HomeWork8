public class Main {
    public static void main(String[] args) {
        //Задача №1
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = new double[]{1.57, 7.654, 9.986};
        double[] array3 = new double[4];
        array3[0] = 17;
        array3[1] = 23.5;
        array3[2] = 33;
        array3[3] = 0.07;

        //Задача №2
        System.out.println("Задача №2" + "\n");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            if (i == array1.length) {
                System.out.print(array3[i]);
            } else {
                System.out.print(array3[i] + ", ");
            }
        }
        System.out.println();

        //Задача №3
        System.out.println("\n" + "Задача №3" + "\n");

        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array3[i]);
            } else {
                System.out.print(array3[i] + ", ");
            }
        }

        //Задача №4
        System.out.println("\n" + "Задача №4" + "\n");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            if (i == array1.length-1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }

        }
    }
}