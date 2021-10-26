public class Calculator {
    public static int sum(int a, int b){
        return a + b;
    }
    public static float divide(float a, int b){
        return a / b;
    }
    public static int calc1(int a, int b, int c){
        return a + b * c;
    }
    public static float calc2(float a, int b, int c){
        return (a+b)%c;
    }
    public static float calc3(float a, int b, int c, int d){
        return a+ (-b) * c / d;
    }
    public static float calc4(float a, int b, int c, int d, int e, int f){
        return a+ b / c * d - e % f;
    }

    //Cerinta 2
    public static int adunare(int a, int b){
        int result = a + b;
        return result;
    }
    public static int scadere (int a, int b){
        int result = a - b;
        return result;
    }
    public static int inmultire (int a, int b){
        int result = a * b;
        return result;
    }
    public static double impartire (int a, int b){
        double result = a / b;
        return result;
    }

    //Cerinta 4
    public static float average(float a, int b, int c){
        return (a + b + c) / 3;
    }

    //Cerinta 6
    public static int restul(int a, int b) {
        return a / b;
    }
}
