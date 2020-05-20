package gl_pack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public abstract class DAOFactory {

	// Liste des types de DAO supporté par notre Factory
	public static final int ORACLE = 1;
	public static final int DERBY = 2;
	public static final int SERIALIZATION = 3;

	// Nous avons des methodes pour chaque DAO que nous allons crée
	public abstract PersonnelDAO getPersonnelDAO() throws FileNotFoundException, IOException;

	public static DAOFactory getDAOFactory(int wichFactory) {
		switch (wichFactory) {
		case SERIALIZATION:
			return new SerializationDaoFactory();
		default:
			return null;
		}
	}

}
