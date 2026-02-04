package com.denysov.streampipelinelab.model;

import java.util.function.BinaryOperator;

public class ReduceOperationNode extends StreamOperationNode {

    public Object identity;
    public BinaryOperator<Object> reducer;

    public Object accumulator;
}
