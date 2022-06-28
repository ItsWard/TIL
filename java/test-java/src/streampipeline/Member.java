package streampipeline;

public class Member {
    String gender;
    int age;

    public Member(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static final String MALE = "male";
    static final String FEMALE = "female";

}
