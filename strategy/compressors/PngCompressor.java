package strategy.compressors;

import strategy.Compressor;

public class PngCompressor implements Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println(fileName + " is compressed with PNG");
    }
}
