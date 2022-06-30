package strategy.filters;

import strategy.Filter;

public class BlackWhiteFilter implements Filter{

    @Override
    public void apply(String fileName) {
        System.out.println(fileName + " is filtered with Black and White");
    }
}
