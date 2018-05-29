package domain;

import javax.persistence.*;

@Entity
@Table(name= "dog")
public class Dog {

	private long id;
	private String name;
	

	public Dog() {}

	@Id
	@Column(name= "dog_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
	
}
