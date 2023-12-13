package OOP.ProjectStructure.Repository;

import java.util.*;

public class UserRepo<T> implements IRepo {
    // Полиморфизм: переопределение наследованных методов

    private static Long idCounter = 0L;
    private Map<Long,T> userStore = new HashMap<>();
    @Override
    public List<T> findAll() {
        return userStore.values().stream().toList();
    }

    @Override
    public T findById(Long id) {
        return userStore.get(id);
    }

    @Override
    public T deleteById(Long id) {
        var value = userStore.get(id);
        userStore.remove(id);
        idCounter--;
        return value;
    }

    @Override
    public T save(Object pojo) {
        idCounter++;
        userStore.put(idCounter, (T)pojo);
        return (T)pojo;
    }

    @Override
    public List<T> saveAll(List list) {
        for (int i = 0; i < list.size(); i++) {
            this.save(list.get(i));
        }
        return userStore.values().stream().toList();
    }
}
