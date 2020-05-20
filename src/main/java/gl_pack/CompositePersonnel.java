package gl_pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositePersonnel extends ComposantPersonnel implements java.io.Serializable {

	// private String nom;
	private ArrayList<ComposantPersonnel> composants = new ArrayList<ComposantPersonnel>();
	private Iterator it = composants.iterator();

	public CompositePersonnel(String noms) {
		// TODO Auto-generated constructor stub
		nom = noms;
	}

	@Override
	public void composant() {
		// TODO Auto-generated method stub
		System.out.println("Le nom de cette fonction est :" + nom);
	}

	public void add(ComposantPersonnel personnel) {
		// TODO Auto-generated method stub
		composants.add(personnel);

	}

	public void remove(ComposantPersonnel personnel) {
		// TODO Auto-generated method stub
		composants.remove(personnel);
	}

	public void getElements() {
		while (it.hasNext()) {
			CompositePersonnel comp = (CompositePersonnel) it.next();
			System.out.println(comp.nom);
		}
	}
}
