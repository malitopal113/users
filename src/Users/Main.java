package Users;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Kullanıcı Girişi");
		/* username: patika
		 * password: kodluyoruz*/
		String userName, password, select, newPassword; 
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Kullanıcı Adınızı Girin: ");
		userName = inp.nextLine();
		
		System.out.print("Parolanızı Girin: ");
		password = inp.nextLine();
		
		if (userName.equals("patika") && password.equals("kodluyoruz")) 
		{
			System.out.println("Giriş Yaptınız !");
		} 
		else if (userName.equals("patika") && !(password.equals("kodluyoruz")))
			{
				System.out.println("parolayı yanlış girdiniz");
				System.out.print("Şifrenizi sıfırlamak ister misiniz?(E/H) : ");
				select = inp.nextLine();
				if (select.equals("E") || select.equals("e")) 
				{
					System.out.print("Yeni Şifreniz: ");
					newPassword = inp.nextLine();
					if (newPassword.equals(password) || newPassword.equals("kodluyoruz"))
					{
						System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
					}
					else 
					{
						System.out.println("Şifre oluşturuldu.");
					}
				}else if (select.equals("H") || select.equals("h"))
				{
					System.out.println("çıkış yapılıyor...");
				}
				
			}
		else 
		{
			System.out.println("Bilgileriniz Hatalı!!!");
		}
		
			
		
		
		
		
		
	}

}