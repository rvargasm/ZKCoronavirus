package coronavirus.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import coronavirus.model.CountryStatistic;

public class CountryStatsData {


List<CountryStatistic> statistics = new ArrayList<CountryStatistic>();

	public CountryStatsData() {
	    initData();
	}

	private void initData() {
	    if (!statistics.isEmpty())
	    	statistics.clear();	    
	    statistics.add(new CountryStatistic("China",80824,11,3189,13,65573,12062,3610));
	    statistics.add(new CountryStatistic("Italy",21157,3497,1441,175,1966,17750,1518));
	    statistics.add(new CountryStatistic("Iran",12729,1365,611,97,4339,7779,0));
	    statistics.add(new CountryStatistic("S.Korea",8086,107,72,5,714,7300,59));
	    statistics.add(new CountryStatistic("Spain",6315,1083,193,60,517,5605,293));
	    statistics.add(new CountryStatistic("Germany",4525,850,8,0,46,4471,9));
	    statistics.add(new CountryStatistic("France",4469,808,91,12,12,4366,154));
	    statistics.add(new CountryStatistic("USA",2499,252,55,6,49,2395,10));
	    statistics.add(new CountryStatistic("Switzerland",1375,236,13,2,4,1358,0));
	    statistics.add(new CountryStatistic("UK",1140,342,21,10,18,1101,20));
	    statistics.add(new CountryStatistic("Norway",1078,82,2,1,1,1075,27));
	    statistics.add(new CountryStatistic("Sweden",961,147,2,1,1,958,2));
	    statistics.add(new CountryStatistic("Netherlands",959,155,12,2,2,945,45));
	    statistics.add(new CountryStatistic("Denmark",827,23,1,1,1,825,2));
	    statistics.add(new CountryStatistic("Japan",804,70,22,1,144,638,35));
	    statistics.add(new CountryStatistic("Diamond Princess",696,0,7,0,456,233,15));
	    statistics.add(new CountryStatistic("Belgium",689,130,4,1,1,684,24));
	    statistics.add(new CountryStatistic("Austria",655,151,1,0,6,648,1));
	    statistics.add(new CountryStatistic("Qatar",337,17,0,0,4,333,0));
	    statistics.add(new CountryStatistic("Australia",248,49,3,0,27,218,1));
	}
	
	public void revertDeletedStat() {
	    initData();
	}
	
	public void deleteAllStatistics() {
		statistics.clear();
	}
	
	public void addStatistics(Collection<CountryStatistic> c) {
		statistics.addAll(c);
	}
	
	public List<CountryStatistic> getStatistics() {
	    return statistics;
	}
	
	public void deleteMail(CountryStatistic m) {
		statistics.remove(m);
	}
	 
	public int getSize(){
	    return statistics.size();
	}
}
