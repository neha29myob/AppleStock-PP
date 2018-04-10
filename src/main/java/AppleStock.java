import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppleStock {

    public static int getMaxProfit(int[] stockPrices) {

        int size = stockPrices.length;

        if (size <= 1) {
            throw new Error("No stock prices available to calculate profit");
        }

        int maxStockPrice = stockPrices[size - 1];
        List<Integer> profitList = new ArrayList<>();

        for (int i = size - 2; i >= 0; i--) {

            profitList.add(calculateProfit(maxStockPrice, stockPrices[i]));
            maxStockPrice = getMaxStockPrice(stockPrices[i], maxStockPrice);
        }
        return Collections.max(profitList);
    }

    private static int getMaxStockPrice(int stockPrice, int maxStockPrice) {
        return stockPrice > maxStockPrice ? stockPrice : maxStockPrice;
    }

    private static int calculateProfit(int sellingPrice, int costPrice ) {
        int profit = sellingPrice - costPrice;
        return profit > 0 ? profit: 0 ;
    }
}
