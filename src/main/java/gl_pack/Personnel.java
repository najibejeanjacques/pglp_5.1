package gl_pack;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personnel extends ComposantPersonnel implements Serializable {

	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private ArrayList<Telephone> NumeroListe = new ArrayList<Telephone>();
	private Iterator it = NumeroListe.iterator();

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public static class PersonnelBuilder {
		private String nom;
		private String prenom;
		private LocalDate dateNaissance;
		ArrayList<Telephone> NumeroListe = new ArrayList<Telephone>();
		Iterator it = NumeroListe.iterator();

		public PersonnelBuilder(String nom, String prenom) {
			this.nom = nom;
			this.prenom = prenom;
		}

		public PersonnelBuilder setDateNaissance(LocalDate dateNaiss) {
			this.dateNaissance = dateNaiss;
			return this;
		}

		public PersonnelBuilder NumeroListe(ArrayList<Telephone> numero) {
			this.NumeroListe = numero;
			return this;
		}

		public Personnel build() {
			return new Personnel(this);
		}
	}

	private Personnel(PersonnelBuilder personnelBuilder) {
		nom = personnelBuilder.nom;
		nom = personnelBuilder.prenom;
	}

	@Override
	public void composant() {
		// TODO Auto-generated method stub
	}

	public List<Telephone> getTelephone() {
		// TODO Auto-generated method stub
		return NumeroListe;
	}

}
