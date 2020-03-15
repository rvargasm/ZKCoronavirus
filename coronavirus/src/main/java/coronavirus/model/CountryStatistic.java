package coronavirus.model;

public class CountryStatistic {

	private String country;
	private int totalCases;
	private int newCases;
	private int totalDeaths;
	private int newDeaths;
	private int totalRecovered;
	private int activeCases;
	private int seriousCriticalCases;
	
	
	public CountryStatistic(String country, int i, int j, int k, int l,
			int m, int n, int o) {
		super();
		this.country = country;
		this.totalCases = i;
		this.newCases = j;
		this.totalDeaths = k;
		this.newDeaths = l;
		this.totalRecovered = m;
		this.activeCases = n;
		this.seriousCriticalCases = o;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public int getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}

	public int getNewCases() {
		return newCases;
	}

	public void setNewCases(int newCases) {
		this.newCases = newCases;
	}

	public int getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public int getNewDeaths() {
		return newDeaths;
	}

	public void setNewDeaths(int newDeaths) {
		this.newDeaths = newDeaths;
	}

	public int getActiveCases() {
		return activeCases;
	}

	public void setActiveCases(int activeCases) {
		this.activeCases = activeCases;
	}

	public int getSeriousCriticalCases() {
		return seriousCriticalCases;
	}

	public void setSeriousCriticalCases(int seriousCriticalCases) {
		this.seriousCriticalCases = seriousCriticalCases;
	}

	public int getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(int totalRecovered) {
		this.totalRecovered = totalRecovered;
	}
	
}
