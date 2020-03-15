package coronavirus.composer;

import org.zkoss.chart.Charts;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

import coronavirus.data.BarStackedData;


public class BarStackedComposer extends SelectorComposer<Window> {

    @Wire
    Charts chart;
    
    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);
        
        chart.setModel(BarStackedData.getCategoryModel());
        
        chart.getYAxis().setMin(0);
        chart.getYAxis().setTitle("Casos coronavirus");
        
        chart.getLegend().setReversed(true);
        
        chart.getPlotOptions().getSeries().setStacking("normal");
        
        chart.getCredits().setEnabled(false);
    }
}