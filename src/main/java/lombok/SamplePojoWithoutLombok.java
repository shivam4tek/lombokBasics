package lombok;
public class SamplePojoWithoutLombok {
	SamplePojoWithoutLombok() {}
	SamplePojoWithoutLombok(int id, String name) {
		this.id = id;
		this.name = name;
	}
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
