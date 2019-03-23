///**
// * graph 测试类 GUI
// */
//
//import java.awt.Color;
//import java.awt.Font;
//
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartFrame;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.StandardChartTheme;
//import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.CategoryDataset;
//import org.jfree.data.category.DefaultCategoryDataset;
//
//public class GUIGraphTextPerso {
//    public GUIGraphTextPerso() {
//        StandardChartTheme guiChartTheme = new StandardChartTheme("test");
//
//        //set GUI color reference
//        Color bgColor = new Color(20, 29, 39);
//        Color white = new Color(255, 255, 255);
//        Color grey = new Color(196, 196, 196);
//
//        //set GUI Font reference
//        Font impactTitle = new Font("Impact", 0, 20);
//        Font impactTextTime = new Font("Impact", 0, 80);
//        Font impactTextDate = new Font("Malgun Gothic", 0, 20);
//        Font impactText = new Font("Impact", 0, 47);
//        Font mg = new Font("Malgun Gothic", 1, 40);
//
//        guiChartTheme.setChartBackgroundPaint(bgColor);
//        guiChartTheme.setAxisLabelPaint(white);
//        guiChartTheme.setItemLabelPaint(white);
//        guiChartTheme.setTickLabelPaint(white);
//        // mChartTheme.setTitlePaint(Color.green);//图表标题颜色
//        // mChartTheme.setLargeFont(new Font("黑体", Font.BOLD, 20));
//        // mChartTheme.setExtraLargeFont(new Font("宋体", Font.PLAIN, 15));
//        // mChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
//
//
//        // ChartFactory.setChartTheme(mChartTheme);
//        // CategoryDataset mDataset = GetDataset();
//        JFreeChart mChart = ChartFactory.createLineChart(
//        //         "折线图",
//        //         "Time",
//        //         "Temp",
//        //         mDataset,
//        //         PlotOrientation.VERTICAL,
//        //         true,
//        //         true,
//        //         false);
//        // CategoryPlot mPlot = (CategoryPlot) mChart.getPlot();
//        // mPlot.setBackgroundPaint(Color.LIGHT_GRAY);
//        // mPlot.setRangeGridlinePaint(Color.BLUE);//背景底部横虚线
//        // mPlot.setOutlinePaint(Color.RED);//边界线
//        ChartFrame guiChartFrame= new ChartFrame("test_title", mChart);
//        // mChartFrame.pack();
//        guiChartFrame.setVisible(true);
//    }
//
//
//    //Dataset test value
//    public static CategoryDataset GetDataset() {
//        DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
//        mDataset.addValue(1, "First", "2013");
//        mDataset.addValue(3, "First", "2014");
//        mDataset.addValue(2, "First", "2015");
//        mDataset.addValue(6, "First", "2016");
//        mDataset.addValue(5, "First", "2017");
//        mDataset.addValue(12, "First", "2018");
//        mDataset.addValue(14, "Second", "2013");
//        mDataset.addValue(13, "Second", "2014");
//        mDataset.addValue(12, "Second", "2015");
//        mDataset.addValue(9, "Second", "2016");
//        mDataset.addValue(5, "Second", "2017");
//        mDataset.addValue(7, "Second", "2018");
//        return mDataset;
//    }
//
//    public static void team.CPO.Project1.App.main(String[] args) {
//
//        GUIGraphTextPerso test1 = new GUIGraphTextPerso();
//    }
//
//}
