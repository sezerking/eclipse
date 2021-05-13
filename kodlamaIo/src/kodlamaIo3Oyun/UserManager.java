package kodlamaIo3Oyun;

public class UserManager implements UserService{

	@Override
	public void register(User user) {
		if (user.getDateOfBirth()>2003) {
			System.out.println("18 yasindan kücük oldugunuz icin kayit olamiyorsunuz");
			
		}
		else {
			System.out.println(user.getUserName()+" sisteme basari ile kayit oldunuz");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName()+" bilgilerinizi basari ile guncellediniz");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+"kaydiniz silinmistir. Geri donusunuzu dort goz ile bekliyoruz");
		
	}

}
