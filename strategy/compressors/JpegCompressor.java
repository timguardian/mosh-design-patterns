package strategy.compressors;

import strategy.Compressor;

public class JpegCompressor implements Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println(fileName + " is compressed with JPEG");
    }
}
