package mh.structural.facade;

public class UserFacade {

    private UserService userService = new UserService();

    public User registerUser(String email) {
        if(userService.userExist(email)) {
            return userService.findUser(email);
        } else {
            return userService.create(email);
        }
    }
}
