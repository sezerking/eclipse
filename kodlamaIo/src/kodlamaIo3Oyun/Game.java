package kodlamaIo3Oyun;

public class Game {
	
	private Campaign campaign;
	
	
	public Game(Campaign campaign) {
		super();
		this.campaign = campaign;
	}

	int id;
	String name;
	String details;
	int price;
	int discount;
	int priceAfterDiscount;
	
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return campaign.getCampaignDiscount();
	}

	public int getPriceAfterDiscount() {
		return price-(price*getDiscount()/100);
	}

	public Game(int id, String name, String details, int price, int discount, int priceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.price = price;
		this.discount = discount;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public Game() {
		// TODO Auto-generated constructor stub
	}

}
