package gl_pack;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
	
	//On peux remplacer Personnel par T afin d'avoir un DAO généraliste
	
	List<T> findAll();
	
	void create();
	
	void save(T t);
	
	void update(T t,String[] params);
	
	void delete(T t);
	
}
