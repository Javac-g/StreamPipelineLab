package com.denysov.streampipelinelab.model;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CollectionNode {
    public UUID id = UUID.randomUUID();
    public String name;

    public CollectionKind kind;
    public boolean custom;

    public TypeDescriptor elementType;
    public VisualStyle style;

    public List<ElementNode> elements = new ArrayList<>();
}
