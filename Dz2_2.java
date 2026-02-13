package dz;
//Задача №2
//Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения, а потом поменять значения
// местами (значение переменной a должно оказаться в переменной b и наоборот).
public class Dz2_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int temp ;
        System.out.println(a);
        System.out.println(b);
        System.out.println("__________");
        temp = a;
        a = b;
        b = temp ;
        System.out.println(a);
        System.out.println(b);
        System.out.println("__________");
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println("__________");
    }
}
