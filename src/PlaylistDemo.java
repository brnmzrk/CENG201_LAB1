/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        BARAN MIZRAK
 * Student ID:  240444026
 * Date:        05.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // TODO: Create one Track object using EACH of the four constructors.
        //       Print each track's toString() result.
        //       Also test getDurationFormatted() and individual getters.
        //       Test the invalid-duration case (negative value).

        // --- Default constructor ---
        Track track1 = new Track();
        System.out.println("Default Constructor:");
        System.out.println(track1);
        System.out.println();
        // --- Title-only constructor ---
        Track track2 = new Track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(track2);
        System.out.println();
        // --- Title + artist constructor ---
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(track3);
        System.out.println();
        // --- Full constructor ---
        Track track4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track:");
        System.out.println(track4);
        System.out.println();
        // --- Invalid duration test ---
        Track track5 = new Track("Broken Clock", "Static Noise", 0, false);
        System.out.println("Invalid Duration Test:");
        System.out.println(track5);
        System.out.println();
        // --- Getter test ---
        System.out.println("Getter Test:");
        Track track6 = new Track("Stardust","Stellar Echo",242,true);
        System.out.println("Title: " + track6.getTitle());
        System.out.println("Artist: " + track6.getArtist());
        System.out.println("Duration: " + track6.getDurationFormatted());
        System.out.println("Explicit: " + track6.isExplicit());

    }
}