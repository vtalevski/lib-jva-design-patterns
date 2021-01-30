package com.talevski.viktor.good.visitor;

import com.talevski.viktor.good.OperaMailClient;
import com.talevski.viktor.good.OutlookMailClient;

public interface MailClientVisitor {
    void visit(OperaMailClient operaMailClient);

    void visit(OutlookMailClient outlookMailClient);
}
