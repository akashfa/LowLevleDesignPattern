package utility;

import decorated.HighQualiteMedia;
import media.*;

import java.util.ArrayList;

public class MultimediaApp {
    public static void main(String[] args) {
        Media video=new Video("file.mp4");

        Media audio=new Audio("file.mp3");

        Image image=new Image("picture.png");

        ImageAdapter imageAdapter=new ImageAdapter(image);
        HighQualiteMedia highQualiteMedia=new HighQualiteMedia(audio);
        highQualiteMedia.play();
        MediaCollection mediaCollection=new MediaCollection(new ArrayList<>());
        mediaCollection.add(video);
        mediaCollection.add(audio);
        mediaCollection.add(imageAdapter);
        mediaCollection.play();

    }
}
