package strategy;

import strategy.compressors.JpegCompressor;
import strategy.filters.SepiaFilter;

public class Main {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage(new JpegCompressor(), new SepiaFilter());
        storage.store("my_photo");
    }
}