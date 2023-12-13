package media;

public class ImageAdapter implements Media{
  private Image image;

    public ImageAdapter(Image image) {
        this.image = image;
    }

    @Override
    public void play() {
       image.display();
    }
}
