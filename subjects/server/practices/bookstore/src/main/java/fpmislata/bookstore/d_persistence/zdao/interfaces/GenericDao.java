package fpmislata.bookstore.d_persistence.zdao.interfaces;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {

    List<T> getAll(Integer page, Integer size);

    Optional<Long> save(T t);
}
