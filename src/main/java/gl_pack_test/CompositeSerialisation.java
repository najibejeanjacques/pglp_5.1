package gl_pack_test;

import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;

import gl_pack.CompositePersonnel;
import gl_pack.Personnel;

public class CompositeSerialisation {

	@Test
	public void personnelSerialize()
	{
		boolean bool = true;
		try
		{
			final FileOutputStream fichier = new FileOutputStream("Composite.ser");
			ObjectOutputStream os = new ObjectOutputStream(fichier);
			CompositePersonnel compositePersonnel = new CompositePersonnel("Département Informatique");
			os.writeObject(compositePersonnel);
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
