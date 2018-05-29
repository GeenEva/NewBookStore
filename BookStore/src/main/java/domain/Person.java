package domain;

import javax.persistence.*;

@Entity
@Table(name= "person")
public class Person {
	
	private long id;
	private String name;
	private String lastName;
	private Account account;	
	
	public Person() {}

	public Person(long id) {
		this.id = id;
	}
	
	public Person(String name, String lastName, Account account) {
		this.name = name;
		this.lastName = lastName;
		this.account = account;
	}
	
	@Id
	@Column(name = "person_id")
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
	
	@Column(name= "last_name")
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
