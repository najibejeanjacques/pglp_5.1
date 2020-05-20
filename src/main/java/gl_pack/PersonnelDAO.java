package gl_pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonnelDAO implements CustomerDAO<Personnel>, java.io.Serializable {

	private List<Personnel> personnels = new ArrayList<Personnel>();
	SerializationDaoFactory serialDaoF = new SerializationDaoFactory();

	/***
	 * Fonction setup pour l'initialisation du fichier de serialisation
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void setupPersonnelDAO() throws FileNotFoundException, IOException {
		/*
		 * personnels.add(new Personnel.PersonnelBuilder("OUEDRAOGO",
		 * "Najibe").build()); personnels.add(new
		 * Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile").build());
		 */
		SerializationDaoFactory serialDaoFacto = new SerializationDaoFactory();
		serialDaoFacto.addFile("SerialisationPersonnelDAO.ser");
		this.serialDaoF = serialDaoFacto;
	}

	/***
	 * Méthode pour retourner tout le personnel
	 * 
	 * @throws IOException
	 */
	public List<Personnel> findAll() throws IOException {
		// TODO Auto-generated method stub
		List<Personnel> recordList = null;
		// ObjectInputStream objectinputstream = null;
		int i = 0;
		try {
			FileInputStream streamIn = new FileInputStream(new File("SerialisationPersonnelDAO.ser"));
			ObjectInputStream objectinputstream = new ObjectInputStream(streamIn);
			Personnel objetPersonnel;
			do {
				objetPersonnel = (Personnel) objectinputstream.readObject();
				if (objetPersonnel != null) {
					recordList.add(objetPersonnel);
					System.out.println(
							"Nom: " + recordList.get(i).getNom() + " Prénom: " + recordList.get(i).getPrenom());
					i++;
				}
			} while (objetPersonnel != null);
			objectinputstream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return recordList;
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

	/**
	 * Crée un personnel
	 */
	public void create(Personnel personne) {
		// TODO Auto-generated method stub
		try {
			if (serialDaoF.verifyFile()) {
				serialDaoF.getFile().writeObject(personne.getNom());
				serialDaoF.getFile().close();
				serialDaoF.getFileOutput().close();
			} else {
				System.out.println("Le fichier de sérialisation n'existe pas");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
