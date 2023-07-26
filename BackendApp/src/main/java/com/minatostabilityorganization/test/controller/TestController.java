package com.minatostabilityorganization.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatostabilityorganization.test.base.controller.TestBaseController;
import com.minatostabilityorganization.test.service.ITestService;
import com.minatostabilityorganization.test.service.TestService;
import com.minatostabilityorganization.test.model.Test;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/tests/", produces = "application/json")
public class TestController extends TestBaseController<ITestService<Test>, Test> {
	private static XLogger LOGGER = XLoggerFactory.getXLogger(TestController.class);
	public TestController(TestService testService) {
		super(testService);
	}
}
