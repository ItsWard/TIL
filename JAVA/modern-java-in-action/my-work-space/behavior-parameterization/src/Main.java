import compare.Abstraction;
import user.Filter;
import user.User;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<User> list = Arrays.asList(
               new User("Ward","123123", 105),
               new User("chobo","123123", 10),
               new User("gosu","abbc", 99)
       );
       Filter filter = new Filter();
        filter.prettyPrintUser(list, new Filter.UserCheckFommat());
        filter.prettyPrintUser(list, new Filter.UserIdFommat());
        filter.prettyPrintUser(list, new Filter.UserPasswordFommat());
        Abstraction abstraction = new Abstraction();
        List<User> filterUser = Abstraction.filter(list, (User user) -> "123123".equals(user.getPassword()));
        System.out.println(filterUser);
    }



}
