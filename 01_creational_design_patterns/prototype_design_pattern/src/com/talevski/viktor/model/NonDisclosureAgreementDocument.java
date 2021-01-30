package com.talevski.viktor.model;

public class NonDisclosureAgreementDocument extends PrototypeDocument {
    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public PrototypeDocument cloneDocument() throws CloneNotSupportedException {
        NonDisclosureAgreementDocument clonedNonDisclosureAgreementDocument = (NonDisclosureAgreementDocument) super.clone();

        AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) clonedNonDisclosureAgreementDocument.getAuthorizedSignatory().clone();
        clonedNonDisclosureAgreementDocument.setAuthorizedSignatory(clonedAuthorizedSignatory);

        return clonedNonDisclosureAgreementDocument;
    }

    @Override
    public String toString() {
        return "The vendor's name is - '" + super.getVendorName() + "'," +
                "the document's content is - '" + super.getDocumentContent() + "'," +
                "the authorized signatory's name is - '" + this.authorizedSignatory.getName() + "'" +
                "and the authorized signatory's designation is - '" + this.authorizedSignatory.getDesignation() + "'.";
    }
}
