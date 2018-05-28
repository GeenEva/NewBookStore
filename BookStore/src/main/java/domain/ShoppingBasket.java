package domain;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingBasket {

	private int id;
	private List<OrderLine> listOfOrderLines;
	private BigDecimal totalPrice;
}
