import org.junit.Assert;
import org.junit.Test;

public class AppleStockTest {

    @Test
    public void whenNoStockPricesReturnErrorMessage(){
        try{
            AppleStock.getMaxProfit(new int[] {});
        } catch(Error e) {
            Assert.assertEquals("No stock prices available to calculate profit", e.getMessage());
        }
    }

    @Test
    public void whenOneStockPriceAvailableReturnErrorMessage(){
        try{
            AppleStock.getMaxProfit(new int[] {10});
        } catch(Error e) {
            Assert.assertEquals("No stock prices available to calculate profit", e.getMessage());
        }
    }

    @Test
    public void whenBoughtAtHigherPriceAndSoldAtLowerReturnProfitAsZero(){
        Assert.assertEquals(0, AppleStock.getMaxProfit(new int[]{10,7}));
    }

    @Test
    public void whenThreeStockPricesAvailableReturnProfit(){
        Assert.assertEquals(3, AppleStock.getMaxProfit(new int[]{7, 10, 8}));
    }

    @Test
    public void whenMoreStockPricesAvailableCompareAndReturnProfit(){
        Assert.assertEquals(5, AppleStock.getMaxProfit(new int[]{7, 10, 8, 12, 5, 9}));
        Assert.assertEquals(6, AppleStock.getMaxProfit(new int[]{ 10, 7, 5, 8, 11, 9}));
        Assert.assertEquals(48, AppleStock.getMaxProfit(new int[]{ 10, 20, 5, 2, 11, 9, 50}));
        Assert.assertEquals(9, AppleStock.getMaxProfit(new int[]{ 1, 8, 2, 10, 9}));

    }

}
