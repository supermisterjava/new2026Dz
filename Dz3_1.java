package dz;

//Задача №1
//Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//a == b - если переменные равны
//a < b - если переменная a меньше b
//a > b - если переменная b меньше a
public class Dz3_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if (a == b) {
            System.out.println("a == b - если переменные равны");
            a--;
            if (a < b) {
                System.out.println("a < b - если переменная a меньше b");
                a = a + 5;
                if (a > b) {
                    System.out.println("a > b - если переменная b меньше a");
                }
            }
        }
    }

}
