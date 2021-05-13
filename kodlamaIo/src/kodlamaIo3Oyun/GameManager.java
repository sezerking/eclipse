package kodlamaIo3Oyun;

public class GameManager implements GameService{

	@Override
	public void buy(Game game) {
		System.out.println(game.getName()+" oyununu satýn aldýnýz");
		
		
	}

	@Override
	public void addToWishlist(Game game) {
		System.out.println(game.getName()+" oyununu istek listesine eklediniz");
		
	}

}
