//FORBIDDEN java.util

/**
 * This class encapsulates a basic music library. It uses a binary search tree to store albums. It's like a TreeMap.
 * The key into the tree is a String, the name of the album. The value is the actual album itself.
 * You must implement a binary search tree in order to get any credit for this homework. You may not use data
 * structures from the jcf to complete this class. You may not add additional instance variables to this class.
 */
public class MusicLibrary
{
    AlbumNode root;

    /**
     * Constructor.
     */
    public MusicLibrary()
    {
        root = null;
    }

    /**
     * Add an album to the tree. Use a recursive helper method. The albums in the tree should be ordered based on the
     * name of the album, NOT the artist.
     * @param a the AlbumNode to add
     */
    public void addAlbum(AlbumNode a)
    {
        // YOUR CODE HERE
    }

    /**
     * Return an Album from the tree if it exists, or null otherwise. Use a recursive helper method.
     * @param albumName the name of the album to return
     * @return an Album or null
     */
    public AlbumNode getAlbum(String albumName)
    {
        // YOUR CODE HERE
    }

    /**
     * Return the size of the library. Use a recursive helper method.
     * @return an int
     */
    public int count()
    {
        // YOUR CODE HERE
    }

    /**
     * Print the list of album in the MusicLibrary in order based on name. Print each album on its own line. Use a
     * recursive helper method. Use the toString method in the AlbumNode class to print each album.
     */
    public void printInOrder()
    {
        // YOUR CODE HERE
    }

    /**
     * Print the list of albums in the MusicLibrary in reverse order based on name. Use a recursive helper method.
     */
    public void printInReverseOrder()
    {
        // YOUR CODE HERE
    }
}
