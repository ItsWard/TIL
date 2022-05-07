package user;

public class User {

    public User(String id, String password, int level) {
        this.id = id;
        this.password = password;
        this.level = level;
    }

    private String id = "";
    private String password ="";
    private int level =0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @SuppressWarnings("boxing")
    @Override
    public String toString(){
        return String.format("User{id='%s', password='%s', level=%d}", id,password,level);
    }
}
