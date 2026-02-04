package com.denysov.streampipelinelab.model;

import javafx.scene.paint.*;

class VisualStyle {
    ShapeType shape; // RECT, CLOUD, HEX
    Color primaryColor;
    Color borderColor;
    BorderStyle border;

    public VisualStyle(ShapeType shape, Color fill, Color stroke, BorderStyle border) {
        this.shape = shape;
        this.fill = fill;
        this.stroke = stroke;
        this.border = border;
    }
}
