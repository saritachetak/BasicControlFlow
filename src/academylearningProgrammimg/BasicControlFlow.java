package academylearningProgrammimg;

public class BasicControlFlow {
    public static void main(String[] args) {
        boolean myBoolean = false;
        String myString = "Mango";

        int a = 12;

        if(myBoolean=true){
            System.out.println("myBoolean value is true");
        }


        if(myBoolean){
            System.out.println("myBoolean value is true");
        }
        else {
            System.out.println("myBoolean value is false");
        }

        int x= 1;

        if(x==1){
            System.out.println("this works");
        };

        if(x!=2){System.out.println("this works");};



        int testScore = 76;
        char grade;

        if(testScore>=90){ //nester if else statment
            grade = 'A';
        } else if(testScore>=80){
            grade = 'B';
        } else if(testScore>=70){
            grade = 'C';
        } else if (testScore>=60){
            grade = 'D';
        } else if(testScore>=50){
            grade = 'E';
        } else{
            grade ='F';
        }

//        if(true){
//            if(true){
//
//            }
//        }

        System.out.println("my testscore grade is " + grade);

        int x1 = 10;
        int y = 20;

        if(x>5){
            y = 2*x;
        }else{
            y = 4*x;
        }

        System.out.println("value of y ="+y);

        //Terenary operator

        y = (x>5)?(2*x):(5*x);

//        x>10?(System.out.println("This is first statement")): (System.out.println("This is second statement"));



        System.out.println("value of y using Terenary operator is= "+y);


        //Switch case

        int daysOfWeek = 2;
        int marks = 35;

        switch (daysOfWeek){
            case 0:
                System.out.println("Monday");
                //break;
            case (0+1):
                System.out.println("Tuesday");
                //break;
            case 2:
                System.out.println("Wednesday");
                //break;
            case 3:
                System.out.println("Thursday");
                //break;
            case 4:
                System.out.println("Friday");
                // break;
            default:
                System.out.println("WeekEnd");
        }

        //While loop

        int countDown = 10;

        System.out.println("CountDown starts from"+countDown);

        while(countDown>0){

            System.out.println(countDown);
            countDown = countDown-1;


        }

        //for loop

        System.out.println("For loop CountDown starts from 10");



        for(int i=10;i>0;i--){
            System.out.println(i);

        }
    }

}
