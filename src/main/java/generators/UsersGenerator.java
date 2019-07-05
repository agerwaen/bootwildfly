package generators;

import model.User;

public class UsersGenerator {

    public static User[] genrateUsers(){
        User[] users = new User[3];

        for (int i = 0; i < 3; i++) {
            User user = new User(i,"Kowaslski","Karol",26);
            users[i] = user;
        }

        return users;
    }
}
