package gl_pack_test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;

import gl_pack.Personnel;
import gl_pack.Personnel.PersonnelBuilder;

public class PersonnelSerialisation {
	
	@Test
	public void personnelSerialize()
	{
		boolean bool = true;
		try
		{
			final FileOutputStream fichier = new FileOutputStream("Personnel.ser");
			ObjectOutputStream os = new ObjectOutputStream(fichier);
			Personnel personne = new Personnel.PersonnelBuilder("OUEDRAOGO", "Najibe")
											  .build();
			os.writeObject(personne);
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
