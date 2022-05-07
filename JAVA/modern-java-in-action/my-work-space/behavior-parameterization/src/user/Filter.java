package user;

import java.util.List;

public class Filter {

    public interface UserPredicate{
        String test(User user);
    }


    public static class UserCheckFommat implements UserPredicate{
        public String test(User user) {
            String characteristic = user.getLevel() > 99 ? "고수" : "뉴비";
            return "플레이어는 " + characteristic + " 입니다.";
        }
    }

    public static class UserIdFommat implements UserPredicate{
        public String test(User user) {
            return "플레이어 이름은 " + user.getId() + " 입니다.";
        }
    }

    public static class UserPasswordFommat implements UserPredicate{
        public String test(User user) {
            return "플레이어 비밀번호는 " + user.getPassword()+ " 입니다.";
        }
    }


    public void prettyPrintUser(List<User> list, UserPredicate userPredicate){
        for(User user : list){
            String output = userPredicate.test(user);
            System.out.println(output);
        }
    }

}
