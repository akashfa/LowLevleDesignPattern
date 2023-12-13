package decorated;

import media.Media;

public abstract class MediaDecorated implements Media {
    protected Media mediaDecorated;

    public MediaDecorated(Media mediaDecorated) {
        this.mediaDecorated = mediaDecorated;
    }

    @Override
    public void play() {
        this.mediaDecorated.play();

    }
}
