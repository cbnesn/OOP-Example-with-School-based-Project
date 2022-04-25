public class Graduate extends Student {

    public int numberOfPaper;

    public Graduate(String name, double GPA, int numberOfPaper) {

        super.name=name;
        super.GPA=GPA;
        this.numberOfPaper = numberOfPaper;
    }

    @Override
    public double calculateAchievement(){
        return 	(numberOfPaper * 30 + GPA * 20);
    }
}
