package coronavirus.composer;

import org.zkoss.chart.Charts;
import org.zkoss.chart.Point;
import org.zkoss.chart.Series;
import org.zkoss.chart.options3D.Options3D;
import org.zkoss.chart.plotOptions.DataLabels;
import org.zkoss.chart.plotOptions.PiePlotOptions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

import coronavirus.data.CountryStatsData;
import coronavirus.model.CountryStatistic;

public class Pie3DComposer extends SelectorComposer<Window> {

    @Wire
    Charts chart;
    
    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);
        
        Options3D opt3d = chart.getOptions3D();
        opt3d.setEnabled(true);
        opt3d.setAlpha(45);
        opt3d.setBeta(0);
        chart.getTooltip().setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
        PiePlotOptions pot = chart.getPlotOptions().getPie();
        pot.setAllowPointSelect(true);
        pot.setCursor("pointer");
        pot.setDepth(35);
        
        DataLabels dls = pot.getDataLabels();
        dls.setEnabled(true);
        dls.setFormat("{point.name}");
        
        initSeries();
    }
    
    private void initSeries() {
    	CountryStatsData data = new CountryStatsData();
    	Series series = chart.getSeries();
        series.setType("pie");
        series.setName("Casos coronavirus");
        
    	for(CountryStatistic cs : data.getStatistics())
    	{
    		series.addPoint(new Point(cs.getCountry(), cs.getTotalCases()));
    	}                       
    }
}