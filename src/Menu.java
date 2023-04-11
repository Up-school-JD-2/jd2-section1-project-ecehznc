import java.util.Scanner;
public class Menu {
	private static FilmManagement filmManagement;
    private static UserManagement userManagement;
    private static Scanner scanner= new Scanner(System.in);
	private static int id;
    
	public Menu(FilmManagement filmManagement, UserManagement userManagement, Scanner scanner) {
		this.filmManagement = filmManagement;
		this.userManagement = userManagement;
		this.scanner = scanner;
	}
		
	public void Menu() {
		while (true) {
			System.out.println("\n---Film Kütüphanesi---");		
		}
	}
	public static void addFilm() {
		System.out.println("--- Film Ekle ---" );
	    System.out.print("Film id'si girin: ");
	    int id = scanner.nextInt();
	    scanner.nextLine();
	    System.out.print("Film başlığı girin: ");
	    String name = scanner.nextLine();
	    System.out.print("Film yönetmeni girin: ");
	    String director = scanner.nextLine();
	    System.out.print("Film oyuncuları girin: ");
	    String actor = scanner.nextLine();
	    System.out.print("Film tarihi girin: ");
	    String date = scanner.nextLine();;
	    System.out.print("Film türü girin: ");
	    String type = scanner.nextLine();
	    Film film = new Film(id, name, director, actor, date, type);
	    System.out.println("Film eklendi.");		
	}	
	protected static void removeFilm() {
		System.out.println("---Film Sil---");
		System.out.println("Silmek istediğiniz film id'sini girin");
		int id = scanner.nextInt();
		scanner.nextLine();
	    
		
		Film film=filmManagement.searchFilm(id);		
		if(film==null) {
			System.out.println("Film bulunamadı");
		}
		else {
			filmManagement.removeFilm(film);
			System.out.println("Film silindi" +film);
		}		
	}
	protected static void searchFilm() {
		System.out.println("---Film Ara---");
		System.out.print("Aranacak film id'sini girin:");
		int id = scanner.nextInt();
	    scanner.nextLine();
		
        Film film=filmManagement.searchFilm(id);
		if(film==null) {
			System.out.println("Film bulunamadı");
		}
		System.out.println(film);		
	}
	
	protected static void addUser() {
		System.out.println("--- Kullanıcı Ekle ---");
		System.out.print("Kullanıcı id'si girin: ");
	    int id = scanner.nextInt();
	    scanner.nextLine();
	    System.out.print("Kullanıcı adı girin: ");
	    String name = scanner.nextLine();
	    System.out.print("Kullanıcı şifresi girin: ");
	    String password = scanner.nextLine();
	    System.out.print("Kullanıcı e-posta adresi girin: ");
	    String mail = scanner.nextLine();
	    User user= new User(id,name,password,mail);
	    System.out.print("Kullanıcı eklendi ");
	}
	
	protected static void removeUser() {
		System.out.println("---Kullanıcı Sil---");
		System.out.println("Silmek istediğiniz kullanıcı adını girin:");
		String name = scanner.nextLine();
	    scanner.nextLine();
		
		User user=userManagement.searchUser(id);
		if(user==null) {
			System.out.println("Kullanıcı bulunamadı");
			return;
		}
		else {
		userManagement.removeUser(user);
		System.out.println("Kullanıı silindi");
	   }
	}
		
	protected static void searchUser() {
		System.out.println("---Kullanıcı Ara---");
		System.out.print("Aramak istediğiniz kullanıcı id'sini girin: ");
	    int id = scanner.nextInt();
	    scanner.nextLine();
	    
		
	    User user = userManagement.searchUser(id);
	    if(user==null) {
	    	System.out.println("Kullanıcı bulunamadı");
	    	return;
	    }
	    
	    System.out.println(user);
				
 }
}

    


