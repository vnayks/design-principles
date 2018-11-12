package TemplateAndStrategy.template;

public abstract class BubbleSorter {

    protected int lengthOfArray = 0;

    protected void doSort() {

        for (int nextToLast = lengthOfArray - 2; nextToLast >= 0; nextToLast--) {
            for (int index = 0; index <= nextToLast; index++) {
                outOfOrder(index);
            }
        }
    }

    protected abstract void outOfOrder( int index);

    protected abstract void swap(int index);
}
