package com.denysov.streampipelinelab.apps;

import com.denysov.streampipelinelab.model.CollectionNode;
import com.denysov.streampipelinelab.model.ElementNode;
import com.denysov.streampipelinelab.model.GroupingCollectorNode;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.List;

public class BucketView extends VBox {

    public BucketView(Object key, CollectionNode list) {
        Label keyLabel = new Label("Key: " + key);
        keyLabel.setStyle("-fx-font-weight: bold");

        CollectionView listView =
                new ListCollectionView(list);

        getChildren().addAll(keyLabel, listView);
    }
    public void animateGrouping(
            ElementNode element,
            GroupingCollectorNode op,
            MapCollectionView mapView) {

        Object key = op.lambda.apply(element.value);

        CollectionNode bucket = op.buckets.computeIfAbsent(key, k -> {
            CollectionNode c = CollectionFactory.createList(
                    List.of(), op.outputType);
            mapView.addBucket(k, c);
            return c;
        });

        mapView.animateIntoBucket(element, bucket);
    }

}
