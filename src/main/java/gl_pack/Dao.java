package gl_pack;

import java.util.List;
import java.util.Optional;

public interface Dao<Personnel> {
	
	//On peux remplacer Personnel par T afin d'avoir un DAO généraliste
	
	List<Personnel> findAll();
	
	void create();
	
	void save(Personnel personne);
	
	void update(Personnel personne,String[] params);
	
	void delete(Personnel personne);
	
}
