public class Film {
	private final int id;
	protected final String name;
	private final String director;
	private final String actor;
	private final String date;
	private final String type;
	public Film(int id, String name, String director, String actor, String date, String type) {
		this.id = id;
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.date = date;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDirector() {
		return director;
	}
	public String getActor() {
		return actor;
	}
	public String getDate() {
		return date;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Film [id]=" + id + ", name=" + name + ", director=" + director + ", actor=" + actor + ", date=" + date
				+ ", type=" + type + "]";
	}
	
	
	
}


