package com.denysov.streampipelinelab.model;

class StreamOperationNode {
    OperationKind kind;
    LambdaExpression lambda;

    TypeDescriptor in;
    TypeDescriptor out;

    VisualStyle style;
}
