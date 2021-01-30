package com.talevski.viktor.model;

public class TermsAndConditionsAgreementDocument extends PrototypeDocument {

    @Override
    public PrototypeDocument cloneDocument() throws CloneNotSupportedException {
        return (TermsAndConditionsAgreementDocument) super.clone();
    }

    @Override
    public String toString() {
        return "The vendor's name is - '" + super.getVendorName() + "' and the document's content is - '" + super.getDocumentContent() + "'.";
    }
}
