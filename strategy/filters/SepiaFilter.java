package strategy.filters;

import strategy.Filter;

public class SepiaFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println(fileName + " is filtered with Sepia");
    }
}
