package homework9;

/**
 * One of the testers for homework9.MusicLibrary.
 */
public class MusicLibraryDemo2
{
    public static void main(String[] args)
    {
        AlbumNode a = new AlbumNode("Girl Talk", "All Day");
        AlbumNode b = new AlbumNode("Talking Heads", "Talking Heads 77");
        AlbumNode c = new AlbumNode("Talking Heads", "Stop Making Sense");
        AlbumNode d = new AlbumNode("The Wallflowers", "Bringing Down the Horse");
        AlbumNode e = new AlbumNode("Popol Vuh", "Hosianna Mantra");
        AlbumNode f = new AlbumNode("Popol Vuh", "In den Garten Pharaos");

        MusicLibrary ml = new MusicLibrary();
        ml.addAlbum(a);
        ml.addAlbum(b);
        ml.addAlbum(c);
        ml.addAlbum(d);
        ml.addAlbum(e);

        ml.printInReverseOrder();
    }
}
