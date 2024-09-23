package Proj1;
class Game {
    private String title;
    private double price;
    private int downloads;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
        this.downloads = 0;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Method to download the game
    public void download() {
        this.downloads++;
        System.out.println("Downloaded " + this.title + ". Total Downloads: " + downloads);
    }

    // Getter for downloads
    public int getDownloads() {
        return downloads;
    }
}
