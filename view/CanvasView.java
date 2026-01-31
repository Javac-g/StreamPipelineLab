package com.denysov.streampipelinelab.apps;


import javafx.scene.Node;
import javafx.scene.input.*;
import javafx.scene.layout.Pane;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CanvasView extends Pane {

    private final Map<UUID, VisualNode> nodes = new HashMap<>();

    public CanvasView() {
        setStyle("-fx-background-color: #1e1e1e;");
        enableDrop();
    }

    private void enableDrop() {
        setOnDragOver(e -> {
            if (e.getDragboard().hasString()) {
                e.acceptTransferModes(TransferMode.COPY);
            }
            e.consume();
        });



        setOnDragDropped(e -> {
            Dragboard db = e.getDragboard();
            if (db.hasString()) {
                Object model = AppContext.get().resolve(db.getString());
                addVisual(model, e.getX(), e.getY());
            }
            e.setDropCompleted(true);
            e.consume();
        });
    }

    public void addVisual(Object model, double x, double y) {
        VisualNode node = VisualFactory.create(model);
        node.relocate(x, y);
        enableDrag(node);
        getChildren().add(node);
        nodes.put(node.getId(), node);
    }

    private void enableDrag(Node node) {
        final Delta d = new Delta();
        node.setOnMousePressed(e -> {
            d.x = node.getLayoutX() - e.getSceneX();
            d.y = node.getLayoutY() - e.getSceneY();
        });
        node.setOnMouseDragged(e -> {
            node.relocate(e.getSceneX() + d.x, e.getSceneY() + d.y);
        });
    }

    private static class Delta { double x, y; }
}
