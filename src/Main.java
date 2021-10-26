public class Main {
    public static void main(String[] args) {
        //Cerinta 1
        Random.printMyName();
        int result1 = Calculator.sum(2,5);
        float result2 = Calculator.divide (10,3);
        int result3 = Calculator.calc1 (-5, 8, 6);
        float result4 = Calculator.calc2(55,9,9);
        float result5 = Calculator.calc3(20,3,5,8);
        float result6 = Calculator.calc4(5,15,3,2,8,3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        //Cerinta 2
        int result7 = Calculator.adunare(10, 5);
        int result8 = Calculator.scadere(25, 20);
        int result9 = Calculator.inmultire(2, 4);
        double result10 = Calculator.impartire(3, 5);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);

        //Cerinta 3
        Random.printJAVA();

        //Cerinta 4
        float result11 = Calculator.average(10,20,30);
        System.out.println(result11);

        //Cerinta 5
        Random.georgel();

        //Cerinta 6
        int result12 = Calculator.restul(2, 3);
        System.out.println(result12);

        //Cerinta 7
        double celsius = Converter.temperatura(100);
        System.out.println(celsius);

        //Cerinta 8
        float metri = Converter.distantaMetri(100);
        System.out.println(metri);

        //Cerinta 9
        Converter.Cerinta9(100,5,15,50);



    }
}
