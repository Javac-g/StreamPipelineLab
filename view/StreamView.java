package com.denysov.streampipelinelab.apps;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class StreamView extends VisualNode {

    private final HBox pipeline = new HBox(12);

    public StreamView(StreamNode model) {
        super(model);
        pipeline.setPadding(new Insets(16));
    }

    @Override
    protected void render() {
        Label title = new Label("Stream");
        title.setTextFill(Color.WHITE);

        pipeline.getChildren().clear();
        for (StreamOperationNode op : model.operations) {
            pipeline.getChildren().add(new OperationView(op));
        }

        VBox root = new VBox(6, title, pipeline);
        getChildren().add(root);
    }
}
