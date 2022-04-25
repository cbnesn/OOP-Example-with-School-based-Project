public class Preparatory extends Student {


    public int levelOfEnglish;

    public Preparatory(String name, double GPA, int levelOfEnglish) {
        super.name=name;
        super.GPA=GPA;
        this.levelOfEnglish = levelOfEnglish;
    }

    @Override
    public double calculateAchievement() {
        return 	(levelOfEnglish * 10 * GPA);
    }
}
