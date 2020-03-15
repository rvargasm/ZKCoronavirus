package coronavirus.viewmodel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import coronavirus.data.CountryStatsData;

public class CountryStatisticsViewModel {
	CountryStatsData data = new CountryStatsData();
    
    public CountryStatsData getData() {
        return data;
    }
 
    @Command
    @NotifyChange("statData")
    public void revertData() {
    	data.revertDeletedStat();
    }
     
    @Command
    @NotifyChange("statData")
    public void deleteAllData() {
    	data.deleteAllStatistics();
    }
     
}
