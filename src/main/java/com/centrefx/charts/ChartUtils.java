package com.centrefx.charts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.chart.*;

import java.time.Month;

public class ChartUtils {

    public static Group pieChart() {
        PieChart pieChart = new PieChart();
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("Windows 10", 73),
                new PieChart.Data("Windows 8.1", 9),
                new PieChart.Data("Windows 7", 14),
                new PieChart.Data("Windows Vista", 1),
                new PieChart.Data("Windows XP", 2),
                new PieChart.Data("Windows 2000", 1));

        pieChart.setData(data);
        pieChart.setTitle("Windows Users in 2021");
        pieChart.setClockwise(true);
        pieChart.setLabelLineLength(50);
        pieChart.setLabelsVisible(true);
        pieChart.setStartAngle(180);

        return new Group(pieChart);
    }

    public static Group lineChart() {
        // Axis for Line Chart
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Month");
        NumberAxis yAxis = new NumberAxis("Bitcon Price $", 30000.0, 50000.0, 2000.0);

        // A Series, can have many series in LineChart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Bitcoin Price in 2020");
        series.getData().add(new XYChart.Data<>(Month.JANUARY.toString(), 30160.0));
        series.getData().add(new XYChart.Data<>(Month.FEBRUARY.toString(), 31700.0));
        series.getData().add(new XYChart.Data<>(Month.MARCH.toString(), 32560.0));
        series.getData().add(new XYChart.Data<>(Month.APRIL.toString(), 34780.0));
        series.getData().add(new XYChart.Data<>(Month.MAY.toString(), 36020.0));
        series.getData().add(new XYChart.Data<>(Month.JUNE.toString(), 35860.0));
        series.getData().add(new XYChart.Data<>(Month.JULY.toString(), 37100.0));
        series.getData().add(new XYChart.Data<>(Month.AUGUST.toString(), 38790.0));
        series.getData().add(new XYChart.Data<>(Month.SEPTEMBER.toString(), 40210.0));
        series.getData().add(new XYChart.Data<>(Month.OCTOBER.toString(), 42400.0));
        series.getData().add(new XYChart.Data<>(Month.NOVEMBER.toString(), 45600.0));
        series.getData().add(new XYChart.Data<>(Month.DECEMBER.toString(), 43290.0));

        /*ObservableList<XYChart.Data> data = FXCollections.observableArrayList(
                new XYChart.Data<>(30160.0, 1),
                new XYChart.Data<>(31700.0, 2),
                new XYChart.Data<>(32560.0, 3),
                new XYChart.Data<>(34780.0, 4),
                new XYChart.Data<>(36020.0, 5),
                new XYChart.Data<>(35860.0, 6),
                new XYChart.Data<>(37100.0, 7),
                new XYChart.Data<>(38790.0, 8),
                new XYChart.Data<>(40210.0, 9),
                new XYChart.Data<>(42400.0, 10),
                new XYChart.Data<>(45600.0, 11),
                new XYChart.Data<>(43290.0, 12));*/
//        series.setData(data);

        LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.getData().add(series);
        return new Group(lineChart);
    }

    public static Group areaChart() {
        NumberAxis xAxis = new NumberAxis("Voltage V", 0, 12.0, 2.0);
        NumberAxis yAxis = new NumberAxis("Current I(mA)", 0, 1000, 200);

        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        series1.setName("Power Test 1");
        series1.getData().add(new XYChart.Data<>(0, 0));
        series1.getData().add(new XYChart.Data<>(1.5, 75));
        series1.getData().add(new XYChart.Data<>(3.0, 180));
        series1.getData().add(new XYChart.Data<>(6.0, 380));
        series1.getData().add(new XYChart.Data<>(9.0, 645));

        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
        series2.setName("Power Test 2");
        series2.getData().add(new XYChart.Data<>(0, 0));
        series2.getData().add(new XYChart.Data<>(1.5, 45));
        series2.getData().add(new XYChart.Data<>(3.0, 460));
        series2.getData().add(new XYChart.Data<>(6.0, 670));
        series2.getData().add(new XYChart.Data<>(9.0, 920));

        AreaChart<Number, Number> areaChart = new AreaChart<>(xAxis, yAxis);
        areaChart.getData().addAll(series1, series2);
        return new Group(areaChart);
    }

    public static Group barChart() {
//        ObservableList<String> categories = FXCollections.observableArrayList("Bus", "Van", "Bike", "Train");
        CategoryAxis xAxis = new CategoryAxis(FXCollections.observableArrayList("Bus", "Van", "Bike", "Train"));
        xAxis.setLabel("Vehicle Category");
        NumberAxis yAxis = new NumberAxis("Count", 0, 100, 20);

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Boys");
        series1.getData().add(new XYChart.Data<>("Bus", 74));
        series1.getData().add(new XYChart.Data<>("Van", 42));
        series1.getData().add(new XYChart.Data<>("Bike", 27));
        series1.getData().add(new XYChart.Data<>("Train", 3));

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Girls");
        series2.getData().add(new XYChart.Data<>("Bus", 40));
        series2.getData().add(new XYChart.Data<>("Van", 61));
        series2.getData().add(new XYChart.Data<>("Bike", 24));
        series2.getData().add(new XYChart.Data<>("Train", 1));

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("How Students come to school");
        barChart.getData().addAll(series1, series2);
        return new Group(barChart);
    }

    public static Group bubbleChart() {
        NumberAxis xAxis = new NumberAxis("Days", 1, 30, 3);
        NumberAxis yAxis = new NumberAxis("Units (KWH)", 1, 200, 20);

        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        series1.setName("April");
        series1.getData().add(new XYChart.Data<>(1, 4));
        series1.getData().add(new XYChart.Data<>(5, 26));
        series1.getData().add(new XYChart.Data<>(12, 42));
        series1.getData().add(new XYChart.Data<>(21, 64));
        series1.getData().add(new XYChart.Data<>(30, 95));

        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
        series2.setName("May");
        series2.getData().add(new XYChart.Data<>(1, 0));
        series2.getData().add(new XYChart.Data<>(5, 34));
        series2.getData().add(new XYChart.Data<>(12, 65));
        series2.getData().add(new XYChart.Data<>(21, 97));
        series2.getData().add(new XYChart.Data<>(30, 126));

        BubbleChart<Number, Number> bubbleChart = new BubbleChart<>(xAxis, yAxis);
        bubbleChart.getData().addAll(series1, series2);
        bubbleChart.setTitle("Power Usage");
        return new Group(bubbleChart);
    }

    public static Group scatterChart() {
        NumberAxis xAxis = new NumberAxis("Sold Item Count", 0, 100, 20);
        NumberAxis yAxis = new NumberAxis("Profit $", 0, 1000, 200);

        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        series1.setName("April");
        series1.getData().add(new XYChart.Data<>(35, 200));
        series1.getData().add(new XYChart.Data<>(60, 450));
        series1.getData().add(new XYChart.Data<>(20, 60));
        series1.getData().add(new XYChart.Data<>(85, 720));
        series1.getData().add(new XYChart.Data<>(58, 640));

        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
        series2.setName("May");
        series2.getData().add(new XYChart.Data<>(12, 120));
        series2.getData().add(new XYChart.Data<>(28, 270));
        series2.getData().add(new XYChart.Data<>(48, 500));
        series2.getData().add(new XYChart.Data<>(36, 450));
        series2.getData().add(new XYChart.Data<>(72, 830));

        ScatterChart<Number, Number> scatterChart = new ScatterChart<>(xAxis, yAxis);
        scatterChart.getData().addAll(series1, series2);
        scatterChart.setTitle("Goods Export Log");
        return new Group(scatterChart);
    }

    public static Group cryptoLineChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Time");
        NumberAxis yAxis = new NumberAxis("Price $", 47200, 49000, 200);
        yAxis.setLabel("Price $");

        // A Series, can have many series in LineChart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("BTC");
        series.getData().add(new XYChart.Data<>("08:53", 47857.0));
        series.getData().add(new XYChart.Data<>("09:06", 47885.0));
        series.getData().add(new XYChart.Data<>("09:19", 47912.0));
        series.getData().add(new XYChart.Data<>("09:32", 47846.0));
        series.getData().add(new XYChart.Data<>("09:45", 48022.0));
        series.getData().add(new XYChart.Data<>("09:58", 47847.0));
        series.getData().add(new XYChart.Data<>("10:11", 47864.0));

        LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.getData().add(series);
        lineChart.setTitle("Bitcoin Price");
        return new Group(lineChart);
    }

    public static Group[] getAllCharts() {
        return new Group[]{lineChart(), pieChart(), areaChart(), barChart(), bubbleChart(), scatterChart(), cryptoLineChart()};
    }
}
