package ru.mirea.task30;

import org.junit.Assert;
import ru.mirea.task29.CurrencyInfo;

import java.util.Date;

public class Test {

    @org.junit.Test
    public void addCurrency() {
        CurrencyInfo currencyInfo = new CurrencyInfo(new Date());
        currencyInfo.addCurrency("RUB", 1.0);
        currencyInfo.addCurrency("CHF", 79.62);

        Assert.assertNotNull(currencyInfo.getCurrencies());
    }

    @org.junit.Test
    public void equals() {
        CurrencyInfo currencyInfo1 = new CurrencyInfo(new Date());
        CurrencyInfo currencyInfo2 = new CurrencyInfo(new Date());

        currencyInfo1.addCurrency("KZT", 0.17);
        currencyInfo2.addCurrency("KZT", 0.17);

        Assert.assertEquals(currencyInfo1, currencyInfo2);
    }

}
