package coronavirus.data;

import org.zkoss.chart.model.CategoryModel;
import org.zkoss.chart.model.DefaultCategoryModel;

import coronavirus.model.CountryStatistic;

public class BarStackedData {
    private static CategoryModel model;
    static {
        CountryStatsData data = new CountryStatsData();
        model = new DefaultCategoryModel();
        for(CountryStatistic stat : data.getStatistics()) {
        	model.setValue("Total Casos",stat.getCountry(),  stat.getTotalCases());
        	model.setValue("Nuevos Casos",stat.getCountry(),  stat.getNewCases());
        	model.setValue("Total muertes",stat.getCountry(),  stat.getTotalDeaths());
        	model.setValue("Nuevas muertes",stat.getCountry(),  stat.getNewDeaths());
        	model.setValue("Total recuperados",stat.getCountry(),  stat.getTotalRecovered());
        	model.setValue("Casos activos",stat.getCountry(),  stat.getActiveCases());
        	model.setValue("Casos criticos",stat.getCountry(),  stat.getSeriousCriticalCases());
        }
        
    }
    
    public static CategoryModel getCategoryModel() {
        return model;
    }
}