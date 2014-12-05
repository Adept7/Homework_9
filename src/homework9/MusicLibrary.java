package homework9;
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
     * @param a the homework9.AlbumNode to add
     */
    public void addAlbum(AlbumNode a)
    {
        if (this.root == null) { this.root = a; }
        else
        {
            this.addAlbum(this.root, a);
        }
    }

    /**
     * Recursive helper method for addAlbum.
     * @param current the current position in the process
     * @param adding the AlbumNode to add
     */
    private void addAlbum(AlbumNode current, AlbumNode adding)
    {
        int comparison = adding.getName().compareTo(current.getName());
        if (comparison > 0)
        {
            if (current.right == null) { current.right = adding; }
            else { this.addAlbum(current.right, adding); }
        }
        else if (comparison < 0)
        {
            if (current.left == null) { current.left = adding; }
            else { this.addAlbum(current.left, adding); }
        }
    }

    /**
     * Return an Album from the tree if it exists, or null otherwise. Use a recursive helper method.
     * @param albumName the name of the album to return
     * @return an Album or null
     */
    public AlbumNode getAlbum(String albumName)
    {
        return this.getAlbum(this.root, albumName);
    }

    /**
     * Recursive helper method for getAlbum.
     * @param current the current position in the process
     * @param albumName the name of the album being searched for
     * @return the AlbumNode if found or null
     */
    private AlbumNode getAlbum(AlbumNode current, String albumName)
    {
        if (current == null) { return null; }
        int comparison = albumName.compareTo(current.getName());
        if (comparison == 0) { return current; }
        else if (comparison < 0) { return this.getAlbum(current.left, albumName); }
        else { return this.getAlbum(current.right, albumName); }
    }

    /**
     * Return the size of the library. Use a recursive helper method.
     * @return an int
     */
    public int count()
    {
        return count(this.root);
    }

    /**
     * Recursive helper method for count.
     * @param current the position in the process
     * @return the count at the current position of the recursion
     */
    private int count(AlbumNode current)
    {
        if (current == null) { return 0; }
        return this.count(current.left) + 1 + this.count(current.right);
    }

    /**
     * Print the list of album in the homework9.MusicLibrary in order based on name. Print each album on its own line. Use a
     * recursive helper method. Use the toString method in the homework9.AlbumNode class to print each album.
     */
    public void printInOrder()
    {
        this.printInOrder(this.root);
    }

    /**
     * Recursive helper method for printInOrder.
     * @param current the current AlbumNode being printed
     */
    private void printInOrder(AlbumNode current)
    {
        if (current == null) { return; }
        this.printInOrder(current.left);
        System.out.println(current.toString());
        this.printInOrder(current.right);
    }

    /**
     * Print the list of albums in the homework9.MusicLibrary in reverse order based on name. Use a recursive helper method.
     */
    public void printInReverseOrder()
    {
        this.printInReverseOrder(this.root);
    }

    /**
     * Recursive helper method for printInReverseOrder.
     * @param current the current AlbumNode being printed
     */
    private void printInReverseOrder(AlbumNode current)
    {
        if (current == null) { return; }
        this.printInReverseOrder(current.right);
        System.out.println(current.toString());
        this.printInReverseOrder(current.left);
    }
}
