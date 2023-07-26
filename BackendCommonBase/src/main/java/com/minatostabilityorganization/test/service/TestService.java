package com.minatostabilityorganization.test.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatostabilityorganization.test.base.service.TestBaseService;
import com.minatostabilityorganization.test.model.Test;
import com.minatostabilityorganization.test.service.TestPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Test")
public class TestService extends TestBaseService<Test> implements ITestService<Test>{

		@Autowired
		private  TestPerimeterImpl  testPerimeterImpl;

		public TestService(ChangelogService changelogService) {
		super(Test.class);	
		setChangelogService(changelogService); 
		
	}
	
	
	protected IPerimeterManager<Test> getPerimeterManager() {
		return testPerimeterImpl;
	}
}