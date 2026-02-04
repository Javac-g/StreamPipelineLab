package com.denysov.streampipelinelab.model;

import java.util.Map;

class TypeDescriptor {
    String simpleName;
    String fqcn;
    Map<String, TypeDescriptor> generics; // K,V etc
    public TypeDescriptor(String simpleName, String fqcn) {
        this.simpleName = simpleName;
        this.fqcn = fqcn;
    }
}
