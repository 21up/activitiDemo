package com.wen.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class ActivitiTest {
    @Test
    public void testGenTable(){
        //1.创建ProcessEngineConfiguration对象
        ProcessEngineConfiguration configuration=ProcessEngineConfiguration.
                createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        //2.创建ProcessEngine对象
        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println(processEngine);
    }
}
