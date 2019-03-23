package team.CPO.Project1.Gui;

import java.awt.Color;
import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GUIGraphTest {
    public DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
    public GUIGraphTest() {
        StandardChartTheme mChartTheme = new StandardChartTheme("CN");

        //set GUI color reference
        Color bgColor = new Color(20, 29, 39);
        Color white = new Color(255, 255, 255);
        Color grey = new Color(196, 196, 196);

        //set GUI Font reference
        Font impactTitle = new Font("Impact", 0, 20);
        Font impactTextTime = new Font("Impact", 0, 80);
        Font impactTextDate = new Font("Malgun Gothic", 0, 20);
        Font impactText = new Font("Impact", 0, 47);
        Font mg = new Font("Malgun Gothic", 1, 40);

        mChartTheme.setChartBackgroundPaint(bgColor);
        mChartTheme.setAxisLabelPaint(white);
        mChartTheme.setItemLabelPaint(white);
        mChartTheme.setTickLabelPaint(white);
        mChartTheme.setTitlePaint(white);//图表标题颜色
        mChartTheme.setLegendBackgroundPaint(white);//底部 图例区域背景色
        mChartTheme.setLargeFont(new Font("黑体", Font.BOLD, 20));
        mChartTheme.setExtraLargeFont(new Font("宋体", Font.PLAIN, 15));
        mChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));

        ChartFactory.setChartTheme(mChartTheme);
        CategoryDataset mDataset = GetDataset();
        JFreeChart mChart = ChartFactory.createLineChart(
                "Graph",
                "Time",
                "Temperature",
                mDataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        CategoryPlot mPlot = (CategoryPlot) mChart.getPlot();
        //图表设置mPlot
        mPlot.setBackgroundPaint(white);
        mPlot.setRangeGridlinePaint(bgColor);//背景底部横虚线
        mPlot.setOutlinePaint(bgColor);//边界线
        ChartFrame mChartFrame = new ChartFrame("Graph", mChart);
        mChartFrame.pack();
        mChartFrame.setVisible(true);
    }

    public CategoryDataset GetDataset() {
//        this.mDataset.addValue(1, "First", "2013");
//        this.mDataset.addValue(3, "First", "2014");
//        this.mDataset.addValue(2, "First", "2015");
//        this.mDataset.addValue(6, "First", "2016");
//        this.mDataset.addValue(5, "First", "2017");
//        this.mDataset.addValue(12, "First", "2018");
//        this.mDataset.addValue(14, "Second", "2013");
//        this.mDataset.addValue(13, "Second", "2014");
//        this.mDataset.addValue(12, "Second", "2015");
//        this.mDataset.addValue(9, "Second", "2016");
//        this.mDataset.addValue(5, "Second", "2017");
//        this.mDataset.addValue(7, "Second", "2018");
        return mDataset;
    }

//    public static void team.CPO.Project1.App.main(String[] args) {
//        team.CPO.Project1.Test.GUIGraphTest test1 = new team.CPO.Project1.Test.GUIGraphTest();
//    }

}
