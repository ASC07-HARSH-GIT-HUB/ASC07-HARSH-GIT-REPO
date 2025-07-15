package lab3;

class Movie {
    private static int moviesCount = 0;
    private String movie_name;
    private String produced_by;
    private String directed_by;
    private int duration;
    private int year;
    private String category;
    private final String movieId;

    public Movie(String movie_name, String produced_by) {
        if (movie_name == null || movie_name.isEmpty() || produced_by == null || produced_by.isEmpty()) {
            throw new IllegalArgumentException("Movie name and Producer name required!");
        }
        this.movie_name = movie_name;
        this.produced_by = produced_by;
        moviesCount++;
        this.movieId = movie_name + "_" + moviesCount;
    }

    public Movie(String movie_name, String produced_by, String directed_by, int duration, int year, String category) {
        this(movie_name, produced_by);
        this.directed_by = directed_by;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public String getProduced_by() {
        return produced_by;
    }

    public String getDirected_by() {
        return directed_by;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setDirected_by(String directed_by) {
        this.directed_by = directed_by;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Movie Name: " + movie_name);
        System.out.println("Produced by: " + produced_by);
        System.out.println("Directed by: " + directed_by);
        System.out.println("Duration (in min): " + duration);
        System.out.println("Year: " + year);
        System.out.println("Category: " + category);
        System.out.println("Movie ID: " + movieId);
    }

    public String showDetails() {
        return "Details: " + movie_name + " | " + produced_by + " | " + directed_by + " | " + duration + "min | " + year + " | " + category;
    }
}

class SpecialMovie extends Movie {
    private String soundEffectsTech;
    private String visualEffectsTech;

    public SpecialMovie(String movieName, String producedBy, String soundEffectsTech, String visualEffectsTech) {
        super(movieName, producedBy);
        this.soundEffectsTech = soundEffectsTech;
        this.visualEffectsTech = visualEffectsTech;
    }

    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String soundEffectsTech, String visualEffectsTech) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTech = soundEffectsTech;
        this.visualEffectsTech = visualEffectsTech;
    }

    public String getSoundEffectsTech() {
        return soundEffectsTech;
    }

    public void setSoundEffectsTech(String soundEffectsTech) {
        this.soundEffectsTech = soundEffectsTech;
    }

    public String getVisualEffectsTech() {
        return visualEffectsTech;
    }

    public void setVisualEffectsTech(String visualEffectsTech) {
        this.visualEffectsTech = visualEffectsTech;
    }

    public void smInfo() {
        System.out.println("Sound Effects Tech: " + soundEffectsTech);
        System.out.println("Visual Effects Tech: " + visualEffectsTech);
    }

    @Override
    public String showDetails() {
        return super.showDetails() + " | " + soundEffectsTech + " | " + visualEffectsTech + "\n";
    }
}

class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy, String country, String language) {
        super(movieName, producedBy);
        this.country = country;
        this.language = language;
    }

    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void imInfo() {
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }

    @Override
    public String showDetails() {
        return super.showDetails() + " | " + country + " | " + language + "\n";
    }
}

public class program1 {
    public static void main(String[] args) {
        System.out.println("Movies Count in the beginning: " + Movie.getMoviesCount() + "\n");

        Movie m1 = new Movie("Inception", "Emma Thomas");
        m1.setDirected_by("Christopher Nolan");
        m1.setDuration(148);
        m1.setYear(2010);
        m1.setCategory("Sci-Fi");

        Movie m2 = new Movie("The Dark Knight", "Emma Thomas", "Christopher Nolan", 152, 2008, "Action");

        SpecialMovie sm = new SpecialMovie("Avatar", "James Cameron", "Dolby Atmos", "CGI, Motion Capture");
        sm.setDirected_by("James Cameron");
        sm.setDuration(162);
        sm.setYear(2009);
        sm.setCategory("Sci-Fi");

        InternationalMovie im = new InternationalMovie("Parasite", "Barunson E&A", "South Korea", "Korean");
        im.setDirected_by("Bong Joon-ho");
        im.setDuration(132);
        im.setYear(2019);
        im.setCategory("Thriller");

        System.out.println("=== Base Movies ===");
        m1.displayInfo();
        System.out.println(m1.showDetails());
        System.out.println();

        m2.displayInfo();
        System.out.println(m2.showDetails());
        System.out.println();

        System.out.println("=== Special Movie ===");
        sm.displayInfo();
        sm.smInfo();
        System.out.println(sm.showDetails());
        //System.out.println();

        System.out.println("=== International Movie ===");
        im.displayInfo();
        im.imInfo();
        System.out.println(im.showDetails());
        //System.out.println();

        System.out.println("Movies Count after adding these movies: " + Movie.getMoviesCount());
    }
}
