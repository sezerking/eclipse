package kodlamaIo3Oyun;

public class Campaign {
	
	int id;
	String campaignName;
	int campaignDiscount;
	public Campaign(int id, String campaignName, int campaignDiscount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}
	public Campaign() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getCampaignDiscount() {
		return campaignDiscount;
	}
	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

}
