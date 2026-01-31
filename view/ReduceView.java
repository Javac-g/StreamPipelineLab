package com.denysov.streampipelinelab.apps;

import javafx.animation.ScaleTransition;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class ReduceView extends StackPane {

    private final Label value = new Label();

    public ReduceView(Object identity) {
        value.setText(identity.toString());
        value.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        getChildren().add(value);
    }

    public void update(Object newValue) {
        value.setText(newValue.toString());
        animatePulse();
    }

    private void animatePulse() {
        ScaleTransition st = new ScaleTransition(
                Duration.millis(200), this);
        st.setFromX(1);
        st.setToX(1.2);
        st.setAutoReverse(true);
        st.setCycleCount(2);
        st.play();
    }
}
