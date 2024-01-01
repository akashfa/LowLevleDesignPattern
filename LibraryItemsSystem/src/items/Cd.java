package items;

abstract class Cd implements LibraryItems{
    private String title;
    private String uniqueId;
    private String author;
    private double value;

    public Cd(String title, String uniqueId, String author, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.author = author;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
     public int getCalculateLateFee(int days){
        return days*30;
    }

    @Override
    public double getValues() {
        return this.value;
    }
}
