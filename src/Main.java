import java.util.Scanner;

public class Main {
	private static Scanner scanner= new Scanner(System.in);

	private static FilmManagement filmManagement= new FilmManagement(0, null, null, null, null, null);
	private static UserManagement userManagement=new UserManagement(0, null, null, null, null);
	
	public static void main(String[] args) {
		//default films
		Film film1= new Film(1,"film1", "director1", "actor1", "date1","Drama");
		Film film2= new Film(2, "film2", "director2", "actor2", "date2","type2" );
		Film film3= new Film(3,"film3", "director3", "actor3", "date3", "type3");
		
		//default users
		User user1= new User(4,"ece", "eceha", "ecehazneci@gmail.com");
		User user2= new User(5,"zeynep", "zeynep12", "zeyhazneci@gmail.com");
		
		filmManagement.addFilm(film1);
		filmManagement.addFilm(film2);
		filmManagement.addFilm(film3);
		
		userManagement.addUser(user1);
		userManagement.addUser(user2);
		
		Menu menu = new Menu(filmManagement, userManagement, scanner);
		
		while (true) {
	        System.out.println("\n--- Ana Menü ---");
	        System.out.println("1. Film Ekle");
	        System.out.println("2. Film Sil");
	        System.out.println("3. Film Ara");
	        System.out.println("4. Kullanıcı Ekle");
	        System.out.println("5. Kullanıcı Sil");
	        System.out.println("6. Kullanıcı Ara");
	        System.out.println("0. Çıkış Yap");

	        System.out.print("Seçiminiz: ");
	        int secim = scanner.nextInt();
	        scanner.nextLine();

	        switch (secim) {
	            case 0:
	                System.out.println("Programdan çıkıldı.");
	                return;
	            case 1:
	                Menu.addFilm();
	                break;
	            case 2:
	                Menu.removeFilm();
	                break;
	            case 3:
	                Menu.searchFilm();
	                break;
	            case 4:
	                Menu.addUser();
	                break;
	            case 5:
	                Menu.removeUser();
	                break;
	            case 6:
	                Menu.searchUser();
	                break;
	            default:
	                System.out.println("Tekrar deneyin.");
	                break;
	        }
	    }
	}		
}
	
	
	
	
	
	

