package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY_VALUE = -1;
    private int[] NUMBERS = new int[MAX_SIZE];

    public int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_VALUE;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return EMPTY_VALUE;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return EMPTY_VALUE;
                        return NUMBERS[total--];
                    }

}
