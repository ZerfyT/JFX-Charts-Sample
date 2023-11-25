package com.centrefx.charts;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        TilePane flowPane = new TilePane(Orientation.HORIZONTAL);
        flowPane.setVgap(20);
        flowPane.setHgap(20);
        flowPane.setPrefSize(1024, 768);
        flowPane.setPrefColumns(2);
        flowPane.setPrefRows(4);
        flowPane.setTileAlignment(Pos.CENTER);
        flowPane.getChildren().addAll(ChartUtils.getAllCharts());

        ScrollPane scrollPane = new ScrollPane(flowPane);

        Scene scene = new Scene(scrollPane);
        stage.setTitle("JavaFX Charts");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setMinWidth(1024);
        stage.setMinHeight(768);
        stage.show();
    }
}