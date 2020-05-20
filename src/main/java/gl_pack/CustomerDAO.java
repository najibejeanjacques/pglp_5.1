package gl_pack;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface CustomerDAO<T> {

	// On peux remplacer Personnel par T afin d'avoir un DAO généraliste

	List<T> findAll() throws IOException;

	void create(T t);

	void update(T t, String[] params);

	void delete(T t);

}
