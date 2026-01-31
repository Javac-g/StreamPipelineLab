package com.denysov.streampipelinelab.apps;

import javafx.scene.layout.Pane;

public abstract class VisualNode extends Pane {
    protected final CollectionNode model;

    protected VisualNode(CollectionNode model) {
        this.model = model;
        setPrefSize(300, 120);
        render();
    }

    protected abstract void render();
}
