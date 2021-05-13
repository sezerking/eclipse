package kodlamaIo3Oyun;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(0);
		user.setFirstName("Sezer");
		user.setLastName("Karakas");
		user.setDateOfBirth(2000);
		user.setEmail("sezerkarakas@mail.com");
		user.setUserName("sezerko");
		user.setPassword("123456");
		
		UserManager manager =new UserManager();
		manager.register(user);
		
	
		
		Campaign scampaign=new Campaign();
		scampaign.setId(0);
		scampaign.setCampaignName("Yaz indirimleri");
		scampaign.setCampaignDiscount(20);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(scampaign);
		
		Game game=new Game(scampaign);
		game.setId(0);
		game.setName("Prince Of Persia");
		game.setDetails("Güzel oyun");
		game.setPrice(60);
		
		GameManager gameManager=new GameManager();
		gameManager.buy(game);
		
		System.out.println(game.getPriceAfterDiscount()+" fiyatýna düþtü");


	}

}
