package enumTest;

/**
 * @author siliang.zheng
 * Date : 2018/6/5
 * Describle
 */

public class GsonTest {


    /**
     * todaySale : 1000.00
     * yesterdaySale : 100.99
     * dailyAverageSale : 199.77
     * totalSale : 1000.99
     */

    private String todaySale;
    private String yesterdaySale;
    private String dailyAverageSale;
    private String totalSale;

    public String getTodaySale() {
        return todaySale;
    }

    public void setTodaySale(String todaySale) {
        this.todaySale = todaySale;
    }

    public String getYesterdaySale() {
        return yesterdaySale;
    }

    public void setYesterdaySale(String yesterdaySale) {
        this.yesterdaySale = yesterdaySale;
    }

    public String getDailyAverageSale() {
        return dailyAverageSale;
    }

    public void setDailyAverageSale(String dailyAverageSale) {
        this.dailyAverageSale = dailyAverageSale;
    }

    public String getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(String totalSale) {
        this.totalSale = totalSale;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GsonTest)) return false;
        final GsonTest other = (GsonTest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$todaySale = this.getTodaySale();
        final Object other$todaySale = other.getTodaySale();
        if (this$todaySale == null ? other$todaySale != null : !this$todaySale.equals(other$todaySale)) return false;
        final Object this$yesterdaySale = this.getYesterdaySale();
        final Object other$yesterdaySale = other.getYesterdaySale();
        if (this$yesterdaySale == null ? other$yesterdaySale != null : !this$yesterdaySale.equals(other$yesterdaySale))
            return false;
        final Object this$dailyAverageSale = this.getDailyAverageSale();
        final Object other$dailyAverageSale = other.getDailyAverageSale();
        if (this$dailyAverageSale == null ? other$dailyAverageSale != null : !this$dailyAverageSale.equals(other$dailyAverageSale))
            return false;
        final Object this$totalSale = this.getTotalSale();
        final Object other$totalSale = other.getTotalSale();
        if (this$totalSale == null ? other$totalSale != null : !this$totalSale.equals(other$totalSale)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $todaySale = this.getTodaySale();
        result = result * PRIME + ($todaySale == null ? 43 : $todaySale.hashCode());
        final Object $yesterdaySale = this.getYesterdaySale();
        result = result * PRIME + ($yesterdaySale == null ? 43 : $yesterdaySale.hashCode());
        final Object $dailyAverageSale = this.getDailyAverageSale();
        result = result * PRIME + ($dailyAverageSale == null ? 43 : $dailyAverageSale.hashCode());
        final Object $totalSale = this.getTotalSale();
        result = result * PRIME + ($totalSale == null ? 43 : $totalSale.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GsonTest;
    }
}
