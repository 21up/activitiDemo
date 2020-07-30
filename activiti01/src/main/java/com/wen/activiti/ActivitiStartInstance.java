package com.wen.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

public class ActivitiStartInstance {
    public static void main(String[] args) {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holiday");
        System.out.println("流程部署ID"+processInstance.getDeploymentId());
        System.out.println("流程实例ID"+processInstance.getId());
        System.out.println("活动ID"+processInstance.getActivityId());
    }
}
