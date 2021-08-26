package com.bithumb.api.designPatterns;

import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StrategyTest {
    @Test
    @DisplayName("전략 패턴 테스트")
    void main() {
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL", 318.65, 10));
        stockList.add(new Stock("MSFT", 166.86, 45));
        stockList.add(new Stock("Google", 99, 12.5));
        stockList.add(new Stock("AMZ", 1866.74, 45));
        stockList.add(new Stock("GOOGL", 1480.20, 3.5));
        stockList.add(new Stock("AAPL", 318.65, 8));
        stockList.add(new Stock("AMZ", 1866.74, 9));
        StockFilters.filter(stockList, stock -> stock.getSymbol().equals("AMZ"))
                .forEach(System.out::println);
    }
}

@Data
class Stock {
    private final String symbol;
    private final double price;
    private final double units;
}

class StockFilters {
    static List<Stock> filter(List<Stock> list, Predicate<Stock> predicate) {
        List<Stock> filteredData = new ArrayList<>();
        for(Stock stock: list) {
            if(predicate.test(stock)) filteredData.add(stock);
        }
        return filteredData;
    }
}
