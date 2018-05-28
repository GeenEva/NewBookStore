package evenuitproberen;

import javax.persistence.*;

import domain.Product;

@Entity
@Table(name = "book")
public class Book extends Product{
	
	private long id;
	private String title;
	private String author;
	private float price;
	
	public Book() {}
	
	public Book(long id) {
		this.id = id;
	}
	
	public Book(String title, String author, float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	

	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return id + "  " + title + "  " + author + "  " + price + "  ";
	}
	

}
