package Movie.App.data.model;

public class Cast {
    private int id;
    private String name;
    private String character;

    @SerializedName("profile_path")
    private String profilePath;

    public Cast() {}

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCharacter() { return character; }
    public String getProfilePath() { return profilePath; }
}