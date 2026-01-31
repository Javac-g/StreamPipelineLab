package com.denysov.streampipelinelab.apps;

import javafx.scene.layout.VBox;

public class MapCollectionView extends VisualNode {

    private final VBox buckets = new VBox(10);

    @Override
    protected void render() {
        Label title = new Label("Map<K, List<V>>");
        title.setTextFill(Color.WHITE);

        getChildren().addAll(title, buckets);
    }

    public void addBucket(Object key, CollectionNode bucket) {
        buckets.getChildren().add(
                new BucketView(key, bucket)
        );
    }
}
