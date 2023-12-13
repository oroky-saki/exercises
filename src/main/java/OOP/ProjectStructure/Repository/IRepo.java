package OOP.ProjectStructure.Repository;

import java.util.List;

// Наследование
public interface IRepo<T> {

/*    Интерфейс репозитория, который может быть реализован
    другими классами для создания репозитория с параметризированным типом Т */
    List<T> findAll();

    T findById(Long id);

    T deleteById(Long id);

    T save(T pojo);

    List<T> saveAll(List<T> list);
}
