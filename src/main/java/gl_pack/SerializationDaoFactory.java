package gl_pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDaoFactory extends DAOFactory {

	public static ObjectOutputStream newFile;
	public static FileOutputStream fichiers;

	/***
	 * Fonction pour ajouter un fichier pour la Serialization
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void addFile(String filename) throws FileNotFoundException, IOException {
		try {
			FileOutputStream fichier = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fichier);
			this.newFile = os;
			this.fichiers = fichier;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return Le stream de sérialisation
	 */
	public ObjectOutputStream getFile() {
		return this.newFile;
	}

	/**
	 * 
	 * @return Retourne le fichier d serialisation
	 */
	public FileOutputStream getFileOutput() {
		return this.fichiers;
	}

	@Override
	public PersonnelDAO getPersonnelDAO() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return new PersonnelDAO();
	}

	public boolean verifyFile() {
		File fichier = new File("SerialisationPersonnelDAO.ser");
		if (fichier.exists()) {
			return true;
		} else {
			return false;
		}
	}

}
