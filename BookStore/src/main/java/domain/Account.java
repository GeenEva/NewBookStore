package domain;
import domain.Account.TypeOfAccount;
import javax.persistence.*;


@Entity
@Table(name = "account")
public class Account {
	public enum TypeOfAccount {ADMIN, CUSTOMER, DEFAULT, EMPLOYEE};
	
	private int id;
	private String email;
	private String password;
	private TypeOfAccount accountType;
	
	
	public Account() {}
	
	public Account(TypeOfAccount accountType, String email, String password) {

		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}

	@Id
	@Column(name = "account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	@Enumerated(EnumType.STRING)
	public TypeOfAccount getAccountType() {
		return accountType;
	}
	
	public void setAccountType(TypeOfAccount accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", password=" + password + ", accountType=" 
	+ accountType + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountType != other.accountType)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
}
