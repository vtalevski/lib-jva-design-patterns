package com.talevski.viktor.manager;

import com.talevski.viktor.model.AuthorizedSignatory;
import com.talevski.viktor.model.NonDisclosureAgreementDocument;
import com.talevski.viktor.model.PrototypeDocument;
import com.talevski.viktor.model.TermsAndConditionsAgreementDocument;

import java.util.HashMap;
import java.util.Map;

public class PrototypeDocumentManager {
    private static Map<String, PrototypeDocument> prototypeDocuments = new HashMap<>();

    static {
        prototypeDocuments.put("termsAndConditionsAgreement", createTermsAndConditionsAgreementDocument());
        prototypeDocuments.put("nonDisclosureAgreementDocument", createNonDisclosureAgreementDocument());
    }

    public PrototypeDocument cloneDocument(String documentType) throws CloneNotSupportedException {
        return prototypeDocuments.get(documentType).cloneDocument();
    }

    private static PrototypeDocument createTermsAndConditionsAgreementDocument() {
        PrototypeDocument termsAndConditionsAgreementDocument = new TermsAndConditionsAgreementDocument();
        termsAndConditionsAgreementDocument.setVendorName("Vendor name");
        termsAndConditionsAgreementDocument.setDocumentContent("Terms & Conditions agreement document's content");
        return termsAndConditionsAgreementDocument;
    }

    private static PrototypeDocument createNonDisclosureAgreementDocument() {
        NonDisclosureAgreementDocument nonDisclosureAgreementDocument = new NonDisclosureAgreementDocument();
        nonDisclosureAgreementDocument.setVendorName("Vendor name");
        nonDisclosureAgreementDocument.setDocumentContent("Non Disclosure agreement document's content");
        nonDisclosureAgreementDocument.setAuthorizedSignatory(createAuthorizedSignatory());
        return nonDisclosureAgreementDocument;
    }

    private static AuthorizedSignatory createAuthorizedSignatory() {
        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Viktor Talevski");
        authorizedSignatory.setDesignation("Company's owner");
        return authorizedSignatory;
    }
}
