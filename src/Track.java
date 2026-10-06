/**
 * Name:        Mehmet İşbilir
 * Student ID:  240446010
 * Date:        5.10.2026
 */

public class Track {
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
    }

    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDurationSeconds() { return durationSeconds; }
    public boolean isExplicit() { return isExplicit; }

    public String getDurationFormatted() {
        int m = durationSeconds / 60;
        int s = durationSeconds % 60;
        String secStr = s < 10 ? "0" + s : "" + s;
        return m + ":" + secStr;
    }

    public String toString() {
        return "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
    }
}