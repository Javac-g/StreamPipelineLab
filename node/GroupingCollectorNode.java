package com.denysov.streampipelinelab.model;

import java.util.HashMap;
import java.util.Map;

public class GroupingCollectorNode extends StreamOperationNode {
    public Map<Object, CollectionNode> buckets = new HashMap<>();
}
