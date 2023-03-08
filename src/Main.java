import exeption.MyExeption;
import model.User;
import model.gender.Gender;
import service.UserService;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) throws MyExeption {
        UserService userService = new UserServiceImpl();

        User user = new User(1L,"name1",21, Gender.MALE);
        User user2 = new User(2L,"name2",25, Gender.FEMALE);
        User user3 = new User(3L,"name3",19, Gender.MALE);


        userService.add(user);
        userService.add(user2);
        userService.add(user3);

        System.out.println(userService.findById(1L));

        System.out.println(userService.getAll());
        userService.deleteById(2L);

        System.out.println(userService.getAll());
    }
}