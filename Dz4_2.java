package dz;

//Задача №2
//Необходимо возводить в степень число 5 начиная с показателя 1, пока результат возведения в степень меньше 10000,
// вывести результат каждого возведения в степень.
public class Dz4_2 {
    public static void main(String[] args) {

        int result = 5;
        while (result <= 10000) {
            System.out.println(result);
            result = result * 5;
        }

//        int result = 5;
        while (result <= 1000) {
            System.out.println(result);
            result = result * 5;
        }


//        int result = 5;
        while (result < 1000) {
            System.out.println(result);
            result = result * 5;
        }

        for (int i = 1; i <= 10000; i *= 5) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10000; i *= 5) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10000; i = i * 5) {
            System.out.println(i);
        }

        //TWO

//        int result = 5;
        while (result < 10000) {
            System.out.println(result);
            result = result * 5;

        }
    }
}


