package decorated;

import media.Media;

public class HighQualiteMedia extends MediaDecorated {
    public HighQualiteMedia(Media mediaDecorated) {
        super(mediaDecorated);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("High Qualite");
    }
}
