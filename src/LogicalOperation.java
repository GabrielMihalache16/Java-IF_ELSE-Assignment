public class LogicalOperation {
    //Cerinta 3
    public int checkBiggerNumber(int first, int second){
        if (first < second){
            return second;
        } else {
        return first;
        }
    }
    //Cerinta 4
    public String verifyProvidedText(String text){
        if (text.equals("FastTrackIT")){
            return "Learning text comparison";
        }
        else return "Got to try some more";
    }

    //Cerinta 5
    public String cerinta5(String text, int number){
        if (text.equals("FastTrackIT") && number <= 3)
            return text + number;
        else if(!text.equals("FastTrackIT") && number >= 4)
            return text + number;
        else return "???";
    }

    //Cerinta 6
    public String cerinta6(int b){
        if (b > 8 || b == 6) {
            return "The amount of snow this winter was(cm): " + b;
        }
        else {
            return "The forecast snow is(cm): " + b;
        }
    }

//    public void cerinta6altfel(int b) {
//        if (b > 8 || b == 6) {
//            System.out.println("The amount of snow this winter was(cm): " + b);
//        } else {
//            System.out.println("The forecast snow is(cm): " + b);
//        }
//    }

    //Cerinta 7
    public String cerinta7(int a){
        if (a > 3 && a != 4){
            return "The number is greater than 3 and not equal to 4";
        }
        else if (a == 4){
            return "The number is equal to 4";
        }
        else if (a < 3){
            return "The number is lower than 3";
        }
        else return "Your number is 3";
    }

    //Cerinta 8
    public void cerinta8(int a){
        System.out.println(a);
        switch(a){
            case 5: System.out.println("The number is: 5!");break;
            case 15: System.out.println("The number is: 15!");break;
            case 300: System.out.println("The number is: 300!");break;
            default: System.out.println("The number is not 5, 15 or 300.");
        }

    }

    //Cerinta 9
    public boolean isNumberEven(int a){
        if (a % 2 == 0){
            return true;
        }
        else {
            return false;
        }
//        sau return (a % 2 == 0)?true:false;
    }

    //Cerinta 10
    public boolean isEligibleToVote(int a){
        if (a > 18){
        return true;
    }
        else return false;
    }

    //Cerinta 11
    public int cerinta11(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        else return c;
    }

}

