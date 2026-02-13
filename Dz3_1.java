package dz;

//Задача №1
//Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие
// строки:
//a == b - если переменные равны
//a < b - если переменная a меньше b
//a > b - если переменная b меньше a
public class Dz3_1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        if(a == b){
            System.out.println("a == b");
        }else {
            if(a > b){
                System.out.println("a > b");
            }else {
                System.out.println("a < b");
            }
        }

        int c = 2;
        int d = 2;
        if(c == d){
            System.out.println("c == d");
        }else {
            if(c > d){
                System.out.println("c > d");
            }else {
                System.out.println("c < d");
            }
        }

        int a1 = 1;
        int b1= 1;
        if (a1 == b1) {
            System.out.println("a1 == b1 - если переменные равны");
        } else {
            if (a1 < b1) {
                System.out.println("a1< b1 - если переменная a меньше b");
            }
            if (a1 > b1) {
                System.out.println("a1 > b1 - если переменная b меньше a");
            }
        }
    }
}


