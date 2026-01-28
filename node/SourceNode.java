package com.denysov.streampipelinelab.model;



import java.util.List;

/**
 * SourceNode represents the start of a stream pipeline.
 * It holds initial elements and can be visualized on the canvas.
 */
public class SourceNode {

    private String name;                  // e.g., "My List" or "Queue"
    private List<ElementNode> elements;   // elements in this collection
    private String collectionType;        // e.g., ArrayList, Set, Queue

    public SourceNode(String name, String collectionType, List<ElementNode> elements) {
        this.name = name;
        this.collectionType = collectionType;
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public List<ElementNode> getElements() {
        return elements;
    }

    public void setElements(List<ElementNode> elements) {
        this.elements = elements;
    }

    /**
     * Add a new element to this source
     */
    public void addElement(ElementNode element) {
        this.elements.add(element);
    }

    /**
     * Remove an element
     */
    public void removeElement(ElementNode element) {
        this.elements.remove(element);
    }
}
