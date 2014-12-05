/**
 * This class encapsulates an album of music.
 * It stores the artist, and the name of the
 * album.
 */
public class AlbumNode
{
    private String artist;
    private String name;

    // these variables allow this class to act as a tree node
    public AlbumNode left;
    public AlbumNode right;

    public AlbumNode(String artist, String name)
    {
        this.artist = artist;
        this.name = name;
    }

    // accessors and mutators
    public String getArtist(){ return artist; }
    public String getName(){ return name; }
    public void setArtist(String artist){ this.artist = artist; }
    public void setName(String name){ this.name = name; }

    @Override
    public String toString()
    {
        return this.artist + " - " + this.name;
    }
}
