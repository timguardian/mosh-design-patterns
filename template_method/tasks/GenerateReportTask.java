package template_method.tasks;

import template_method.AuditTrail;
import template_method.Task;

public class GenerateReportTask extends Task{
    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generate Report...");
    }
}
