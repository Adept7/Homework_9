package homework9;

/**
 * One of the testers for homework9.MusicLibrary.
 */
public class Tester
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

        System.out.println("Actual: " + ml.count());
        System.out.println("Expected: 1");

        ml.addAlbum(b);
        ml.addAlbum(c);

        System.out.println("Actual: " + ml.getAlbum("sdfsdf"));
        System.out.println("Expected: null");

        System.out.println("Actual: " + ml.count());
        System.out.println("Expected: 3");

        ml.addAlbum(d);
        ml.addAlbum(e);
        ml.addAlbum(f);

        System.out.println("Actual: " + ml.count());
        System.out.println("Expected: 6");

        System.out.println("Actual: " + ml.getAlbum("Stop Making Sense"));
        System.out.println("Expected: Talking Heads - Stop Making Sense");

        System.out.println("Actual: " + ml.getAlbum("Hosianna Mantra"));
        System.out.println("Expected: Popol Vuh - Hosianna Mantra");
    }
}
