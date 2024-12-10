package az.turingacademy.quizzess;

public class Cat {

    private String catsName;
    private int catsAge;
    private String gender;

    public Cat (String catsName, int catsAge, String gender){
        this.catsAge=3;
        this.catsName="Mia";
        this.gender="female";
    }

    public int getCatsAge() {
        return catsAge;
    }

    public String getCatsName() {
        return catsName;
    }

    public String getGender() {
        return gender;
    }

    public void setCatsAge(int catsAge) {
        this.catsAge = catsAge;
    }

    public void setCatsName(String catsName) {
        this.catsName = catsName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
