package gl_pack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompositePersonnel racine = new CompositePersonnel("Entreprise");
		
		CompositePersonnel service1 = new CompositePersonnel("Service1");
		CompositePersonnel service2 = new CompositePersonnel("Service2");
		
		Personnel personne1 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Najibe")
														.build();
		
		Personnel personne2 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile")
				.build();
		
		Telephone tel1 = new Telephone("70707070");
		Telephone tel2 = new Telephone("60606060");
		personne1.getTelephone().add(tel1);
		personne2.getTelephone().add(tel2);
		
		service1.add(personne1);
		service2.add(personne2);
		
		racine.add(service1);
		racine.add(service2);
		
		racine.composant();
		service1.composant();
		service2.getElements();
	}

}
