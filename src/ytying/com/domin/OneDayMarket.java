package ytying.com.domin;

/**
 * Created by UKfire on 16/2/7.
 */
public class OneDayMarket {
    private String secID;
    private String ticker;
    private String secShortName;
    private String exchangeCD;
    private String tradeDate;
    private double preClosePrice;
    private double openPrice;
    private double highestPrice;
    private double lowestPrice;
    private double closePrice;
    private long turnoverVol;
    private long turnoverValue;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getSecShortName() {
        return secShortName;
    }

    public void setSecShortName(String secShortName) {
        this.secShortName = secShortName;
    }

    public String getExchangeCD() {
        return exchangeCD;
    }

    public void setExchangeCD(String exchangeCD) {
        this.exchangeCD = exchangeCD;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public double getPreClosePrice() {
        return preClosePrice;
    }

    public void setPreClosePrice(double preClosePrice) {
        this.preClosePrice = preClosePrice;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(double highestPrice) {
        this.highestPrice = highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public long getTurnoverVol() {
        return turnoverVol;
    }

    public void setTurnoverVol(long turnoverVol) {
        this.turnoverVol = turnoverVol;
    }

    public long getTurnoverValue() {
        return turnoverValue;
    }

    public void setTurnoverValue(long turnoverValue) {
        this.turnoverValue = turnoverValue;
    }

    public String getSecID() {

        return secID;
    }

    public void setSecID(String secID) {
        this.secID = secID;
    }
}
