
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
// Autogenerated
// Do not edit. No need to extend this class.
package org.openecomp.dcae.controller.service.docker.host.servers.service;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openecomp.dcae.controller.service.docker.host.service.impl.DockerHostServiceImpl;
import org.openecomp.dcae.controller.service.docker.host.service.ServicePackage;
import org.openecomp.dcae.controller.service.docker.host.servers.service.logging.DockerHostServiceOperationEnum;
import org.openecomp.dcae.controller.service.docker.host.servers.service.logging.DockerHostServiceMessageEnum;





 
@SuppressWarnings("unchecked")
public class DcaeDockerHostServiceClient extends DockerHostServiceImpl {
	public static final Logger logger = Logger.getLogger(DcaeDockerHostServiceClient.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public AbstractClient client;

	public DcaeDockerHostServiceClient(String file, String name) {
		DcaeDockerHostService.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/resources", this);
	}

	public DcaeDockerHostServiceClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/resources", this);
	}
	
	public DcaeDockerHostServiceClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
	}



	@Override
	public void deploy(java.lang.String instanceName, java.lang.String containerPath) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_deploy);
		
		try {
		  client.operationPath("/resources", c, "deploy", null, instanceName,containerPath);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_deploy, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deploy: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void undeploy(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_undeploy);
		
		try {
		  client.operationPath("/resources", c, "undeploy", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_undeploy, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@undeploy: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public org.openecomp.dcae.controller.core.service.HealthTestResponse test(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_test);
		org.openecomp.dcae.controller.core.service.HealthTestResponse res;
		try {
		  res = (org.openecomp.dcae.controller.core.service.HealthTestResponse) client.operationPath("/resources", c, "test", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_test, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@test: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public void suspend(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_suspend);
		
		try {
		  client.operationPath("/resources", c, "suspend", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_suspend, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@suspend: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void resume(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_resume);
		
		try {
		  client.operationPath("/resources", c, "resume", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_resume, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@resume: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void pushManagerConfiguration(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_pushManagerConfiguration);
		
		try {
		  client.operationPath("/resources", c, "pushManagerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_pushManagerConfiguration, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@pushManagerConfiguration: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void pollManagerConfiguration(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_pollManagerConfiguration);
		
		try {
		  client.operationPath("/resources", c, "pollManagerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_pollManagerConfiguration, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@pollManagerConfiguration: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public org.eclipse.emf.ecore.EObject managerConfiguration(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_managerConfiguration);
		org.eclipse.emf.ecore.EObject res;
		try {
		  res = (org.eclipse.emf.ecore.EObject) client.operationPath("/resources", c, "managerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_managerConfiguration, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@managerConfiguration: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.json.JSONObject managerOperation(java.lang.String instanceName, java.lang.String operation, org.json.JSONObject parameters) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_managerOperation);
		org.json.JSONObject res;
		try {
		  res = (org.json.JSONObject) client.operationPath("/resources", c, "managerOperation", null, instanceName,operation,parameters);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_managerOperation, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@managerOperation: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public void updateConfigurationFromPolicy(java.lang.String instanceName) {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_updateConfigurationFromPolicy);
		
		try {
		  client.operationPath("/resources", c, "updateConfigurationFromPolicy", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_updateConfigurationFromPolicy, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@updateConfigurationFromPolicy: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void runHealthTests() {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_runHealthTests);
		
		try {
		  client.operationPath("/resources", c, "runHealthTests", null);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_runHealthTests, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@runHealthTests: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void updateDeploymentStatus() {
		EClass c = ServicePackage.eINSTANCE.getDockerHostService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerHostServiceOperationEnum.REMOTE_updateDeploymentStatus);
		
		try {
		  client.operationPath("/resources", c, "updateDeploymentStatus", null);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerHostServiceMessageEnum.REMOTE_updateDeploymentStatus, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@updateDeploymentStatus: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

}