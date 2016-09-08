package am.aca.musicapp.common.model;

public class Author {

	String name;
	String whereBorn;
	int whenBorn;
	int careerstartingyear;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWhereBorn() {
		return whereBorn;
	}
	public void setWhereBorn(String whereBorn) {
		this.whereBorn = whereBorn;
	}
	public int getWhenBorn() {
		return whenBorn;
	}
	public void setWhenBorn(int whenBorn) {
		this.whenBorn = whenBorn;
	}
	public int getCareerstartingyear() {
		return careerstartingyear;
	}
	public void setCareerstartingyear(int careerstartingyear) {
		this.careerstartingyear = careerstartingyear;
	}
	public Author(String name, String whereBorn, int whenBorn, int careerstartingyear) {
		super();
		this.name = name;
		this.whereBorn = whereBorn;
		this.whenBorn = whenBorn;
		this.careerstartingyear = careerstartingyear;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", whereBorn=" + whereBorn + ", whenBorn=" + whenBorn + ", careerstartingyear="
				+ careerstartingyear + "]";
	}
	
}
