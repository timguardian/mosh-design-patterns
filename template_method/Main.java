package template_method;

import template_method.tasks.GenerateReportTask;

public class Main {
    public static void main(String[] args) {
        GenerateReportTask task = new GenerateReportTask(new AuditTrail());
        task.execute();
    }
}
