package gl_pack;

import java.util.List;

public class PersonnelGroup {

	private String name;
	private List<Personnel> personnel;

	/***
	 * COnstructeur pour initialiser le nom d'un groupe de personnel
	 * 
	 * @param name nom du groupe de personnel
	 */
	public PersonnelGroup(String name) {
		this.name = name;
	}

	/***
	 * 
	 * @return le nom du groupe de personnel
	 */
	public String getName() {
		return this.name;
	}

	public void add(Personnel person) {
		personnel.add(person);
	}

	/***
	 * Vérifie si un personnel appartient un group
	 * 
	 * @param person
	 * @return
	 */
	public boolean contains(Personnel person) {
		return personnel.contains(person);
	}

}
