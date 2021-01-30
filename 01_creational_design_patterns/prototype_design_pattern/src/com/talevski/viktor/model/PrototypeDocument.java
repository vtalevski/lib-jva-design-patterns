package com.talevski.viktor.model;

public abstract class PrototypeDocument implements Cloneable {
    private String vendorName;
    private String documentContent;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public abstract PrototypeDocument cloneDocument() throws CloneNotSupportedException;
}
