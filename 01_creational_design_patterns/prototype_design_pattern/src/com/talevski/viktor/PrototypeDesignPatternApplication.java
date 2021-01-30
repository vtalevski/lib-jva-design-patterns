package com.talevski.viktor;

import com.talevski.viktor.manager.PrototypeDocumentManager;
import com.talevski.viktor.model.PrototypeDocument;

/**
 * Reference link for the Prototype Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/prototype-pattern'.
 */
public class PrototypeDesignPatternApplication {
    public static void main(String[] args) {
        PrototypeDocumentManager prototypeDocumentManager = new PrototypeDocumentManager();

        PrototypeDocument clonedTermsAndConditionsAgreement = null;
        try {
            clonedTermsAndConditionsAgreement = prototypeDocumentManager.cloneDocument("termsAndConditionsAgreement");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        clonedTermsAndConditionsAgreement.setVendorName("Isaac Newton");
    }
}
