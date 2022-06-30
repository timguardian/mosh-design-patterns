package template_method.tasks;

import template_method.AuditTrail;
import template_method.Task;

public class TransferMoneyTask extends Task{
    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfering money...");
    }
}
