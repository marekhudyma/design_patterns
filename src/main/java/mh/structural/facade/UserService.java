package mh.structural.facade;

//fake api
public class UserService {

    public boolean userExist(String email) {
        if(email.startsWith("m")) {
            return true;
        }
        return false;
    }

    public User create(String email) {
        return new User(15, email);
    }

    public User findUser(String email) {
        return new User(15, "some@example.com");
    }
}
