package com.talevski.viktor.constructor;

import com.talevski.viktor.chain.BillingSupportHandler;
import com.talevski.viktor.chain.GeneralSupportHandler;
import com.talevski.viktor.chain.SupportHandler;
import com.talevski.viktor.chain.TechnicalSupportHandler;

import java.util.Optional;

public class RequestClient {
    public static SupportHandler constructChainOfResponsibility() {
        SupportHandler technicalSupportHandler = new TechnicalSupportHandler(SupportHandler.TECHNICAL);
        SupportHandler billingSupportHandler = new BillingSupportHandler(SupportHandler.BILLING);
        SupportHandler generalSupportHandler = new GeneralSupportHandler(SupportHandler.GENERAL);

        technicalSupportHandler.setOptionalNextSupportHandler(Optional.of(billingSupportHandler));
        billingSupportHandler.setOptionalNextSupportHandler(Optional.of(generalSupportHandler));
        generalSupportHandler.setOptionalNextSupportHandler(Optional.empty());

        return technicalSupportHandler;
    }
}

