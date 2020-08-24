import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestStockMerchant {

    @Test
    public void testFirstRound() {
        var ar = new int[]{ 1, 1, 1, 2, 2 , 2, 2, 3};
        int result = StockMerchant.sockMerchant(ar.length, ar);
        assertThat(result,is(3));
        System.out.printf("results %s\n", result);
    }

    /*
    https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
    Sample Input: 9
    10 20 20 10 10 30 50 10 20
    Sample Output: 3
    */
    @Test
    public void testHackerRankInputs() {
        System.out.println("hello");
        var ar = new int[]{ 10, 20, 20, 10, 10, 30, 50, 10, 20 };
        int result = StockMerchant.sockMerchant(ar.length, ar);
        assertThat(result,is(3));
        System.out.printf("results %s\n", result);
    }
}




