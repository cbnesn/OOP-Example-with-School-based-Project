

public class LectureProcessor {

    public static void doIt(Lecturable a){

        if (a.isQualified()){

            System.out.println("Can lecture...");
        }
        else {
            System.out.println("Cannot lecture...");
        }



    }
}
