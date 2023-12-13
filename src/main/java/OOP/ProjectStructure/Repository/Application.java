package OOP.ProjectStructure.Repository;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        UserRepo<String> stringRepo = new UserRepo();
        stringRepo.save(new String("Some string"));
        stringRepo.save(new String("Some string too"));
        System.out.println("Строки в хранилище: " + stringRepo.findAll());

        var x = stringRepo.findById(1L);
        System.out.println("Строка с ID = 1 " + x);

        System.out.println("Удаление Строки с ID = 1");
        stringRepo.deleteById(1L);
        System.out.println("Строки в хранилище: " + stringRepo.findAll());

        System.out.println();

        UserRepo<User> usRepo = new UserRepo<>();
        User us1 = new User("Mike", 25);
        User us2 = new User("Ivan", 39);
        User us3 = new User("Ignasio", 11);

        usRepo.saveAll(List.of(us1, us2, us3));
        System.out.println("Все пользователи: " + usRepo.findAll());
    }
}
