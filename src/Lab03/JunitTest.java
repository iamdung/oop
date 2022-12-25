package Lab03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {
    public static double BMI(double w, double h) {
        double x = w/h/h;
        return x;
    }
//    public static int min(int[] arr) {
//        for (int a = 0; a < arr.length; a++) {
//            for (int i = 0; i != a; i++) {
//                if ( arr[a] <= arr[i]){
//                    return arr[a];
//                }
//            }
//        }



//    public static int max(int a, int b){
//        if(a > b){
//            return a;
//        } else if (a == b) {
//            return a;
//        }else{
//            return b;
//        }
//    }
    public static void main(String[] args) {
        double a = 67.5 , b = 1.76;
        if (BMI(a,b) < 18.5){
            System.out.println("Thiếu cân");
        } else if (BMI(a,b) >= 18.5 && BMI(a,b) < 23) {
            System.out.println("Bình thường");
        } else if (BMI(a,b) >= 23 && BMI(a,b) < 24.99) {
            System.out.println("Thừa cân");
        } else if (BMI(a,b) > 25) {
            System.out.println("Béo phì");
        }
//        int[] arr = new int[5];
//        arr[0] = 4;
//        arr[1] = 5;
//        arr[2] = 14;
//        arr[3] = 1;
//        arr[4] = -1;
//        for (int x = 0; x < 5;x++){
//            System.out.println(min(arr));
//        }

    }
}
