package com.wiltrahan;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public double totalCost;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public String getTotalCost() {
        totalCost = pagesPrinted * 0.10;
        DecimalFormat df2 = new DecimalFormat("#.00");

        return df2.format(totalCost);
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
