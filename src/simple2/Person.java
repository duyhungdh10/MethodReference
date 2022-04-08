package simple2;

public class Person{
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// 1 method duoc dinh nghia san
	public int compareByName(Person otherPersion) {
		return name.compareTo(otherPersion.getName());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId() + " - " + this.getName();
	}
}
