public class Difference {
    private int[] elements;
    public int maximumDifference;

    public int maxElem;
    public int minElem;

    public Difference(int[] inputElements) {
        this.elements = inputElements;
    }

    public int getMax() {
        this.maxElem = 0;
        for (int element : elements) {
            if (element > maxElem) {
                this.maxElem = element;
            }
        }
        return maxElem;
    }

    public int getMin() {
        this.minElem = 101;
        for (int element : elements) {
            if (element < minElem) {
                this.minElem = element;
            }
        }
        return minElem;
    }

    public void computeDifference() {
        maximumDifference = getMax() - getMin();
    }
}