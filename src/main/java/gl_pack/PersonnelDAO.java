package gl_pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonnelDAO implements Dao<Personnel>,java.io.Serializable {

	private List<Personnel> personnels = new ArrayList<Personnel>();
	
	/***
	 * Constructeur de la classe
	 */
	public PersonnelDAO()
	{
		personnels.add(new Personnel.PersonnelBuilder("OUEDRAOGO", "Najibe").build());
		personnels.add(new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile").build());
	}
	
	/***
	 * Méthode pour retourner tout le personnel
	 */
	public List<Personnel> findAll() {
		// TODO Auto-generated method stub
		return personnels;
	}

	/***
	 * Enregistrer un personnel
	 */
	public void save(Personnel personne) {
		// TODO Auto-generated method stub
		personnels.add(personne);
		
	}

	/**
	 * Mettre a jour un personnel
	 */
	public void update(Personnel personne, String[] params) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Supprimer un personnel
	 */
	public void delete(Personnel personne) {
		// TODO Auto-generated method stub
		personnels.remove(personne);
	}

	public void create() {
		// TODO Auto-generated method stub
		
	}

}
