package com.denysov.streampipelinelab.apps;

import com.denysov.streampipelinelab.model.CollectionNode;
import com.denysov.streampipelinelab.model.StreamNode;

import static com.denysov.streampipelinelab.model.CollectionKind.*;

public final class VisualFactory {

    public static VisualNode create(Object model) {
        if (model instanceof CollectionNode c) {
            return switch (c.kind) {
                case LIST -> new ListCollectionView(c);
                case SET -> new SetCollectionView(c);
                case CUSTOM -> new CustomCollectionView(c);
                default -> throw new IllegalStateException();
            };
        }

        if (model instanceof StreamNode s) {
            return new StreamView(s);
        }

        throw new IllegalArgumentException("Unknown model");
    }
}
