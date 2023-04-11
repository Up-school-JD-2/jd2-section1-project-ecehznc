public class FilmManagement  {
	
	private Film[] films = new Film[6];
	private int filmCount=0;
	public FilmManagement(int id, String name, String director, String actor, String date, String type) {
		Film film= new Film(id, name, director, actor, date, type);
        addFilm(film);
	}
	
	
	
	public void addFilm(Film film) {
		films[filmCount]=film;
		filmCount++;
		}
	public Film searchFilm(int id) {
        for (int i = 0; i < filmCount; i++) {
            if (films[i].getId()== id) {
                return films[i];
            }
        }
        return null;
	
	}

	public void removeFilm(Film film) {
		int index = -1;
	    
	    if (index != -1) {
	        for (int i = index; i < filmCount - 1; i++) {
	            films[i] = films[i + 1];
	        }
	        films[filmCount - 1] = null;
	        filmCount--;
	    }
    }
	
}
