package gl_pack_test;

import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;

import gl_pack.Personnel;
import gl_pack.PersonnelDAO;

public class PersonnelDaoSerialisation {

	@Test
	public void personnelDaoSerialize()
	{
		boolean bool = true;
		try
		{
			final FileOutputStream fichier = new FileOutputStream("PersonnelDao.ser");
			ObjectOutputStream os = new ObjectOutputStream(fichier);
			PersonnelDAO personnelDao = new PersonnelDAO();
			os.writeObject(personnelDao);
			os.close();
			bool = true;
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			bool = false;
		}
		assertTrue("La sérialisation passe", bool == true);
	}
}
