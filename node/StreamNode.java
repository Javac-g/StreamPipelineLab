package com.denysov.streampipelinelab.model;

import java.util.List;
import java.util.UUID;

class StreamNode {
    UUID id;
    SourceNode source; // CollectionNode or StreamNode

    TypeDescriptor currentType;
    List<StreamOperationNode> operations;
}
