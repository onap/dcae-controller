
package org.openecomp.dcae.controller.service.standardeventcollector.servers.service.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum ControllerServiceStandardeventcollectorServiceOperationEnum implements EcompOperationEnum {

  ControllerServiceStandardeventcollectorService_deploy("ControllerServiceStandardeventcollectorService@deploy"),
  ControllerServiceStandardeventcollectorService_undeploy("ControllerServiceStandardeventcollectorService@undeploy"),
  ControllerServiceStandardeventcollectorService_test("ControllerServiceStandardeventcollectorService@test"),
  ControllerServiceStandardeventcollectorService_suspend("ControllerServiceStandardeventcollectorService@suspend"),
  ControllerServiceStandardeventcollectorService_resume("ControllerServiceStandardeventcollectorService@resume"),
  ControllerServiceStandardeventcollectorService_pushManagerConfiguration("ControllerServiceStandardeventcollectorService@pushManagerConfiguration"),
  ControllerServiceStandardeventcollectorService_pollManagerConfiguration("ControllerServiceStandardeventcollectorService@pollManagerConfiguration"),
  ControllerServiceStandardeventcollectorService_managerConfiguration("ControllerServiceStandardeventcollectorService@managerConfiguration"),
  ControllerServiceStandardeventcollectorService_managerOperation("ControllerServiceStandardeventcollectorService@managerOperation"),
  ControllerServiceStandardeventcollectorService_updateConfigurationFromPolicy("ControllerServiceStandardeventcollectorService@updateConfigurationFromPolicy"),
  ControllerServiceStandardeventcollectorService_runHealthTests("ControllerServiceStandardeventcollectorService@runHealthTests") ; 


	private String n;
	
	private ControllerServiceStandardeventcollectorServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
