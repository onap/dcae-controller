
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
	

package org.openecomp.dcae.controller.service.standardeventcollector.servers.service;





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import org.openecomp.dcae.controller.service.servers.docker.DcaeDockerServiceProvider;
import org.openecomp.dcae.controller.service.standardeventcollector.manager.ControllerServiceStandardeventcollectorManager;
import org.openecomp.dcae.controller.service.standardeventcollector.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceImpl;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorService;


public class DcaeControllerServiceStandardeventcollectorServiceProvider extends DcaeDockerServiceProvider {
	private static final Logger logger = Logger.getLogger(DcaeControllerServiceStandardeventcollectorServiceProvider.class);
	ControllerServiceStandardeventcollectorService o;

	public DcaeControllerServiceStandardeventcollectorServiceProvider(ISiriusServer controller, ControllerServiceStandardeventcollectorService o) {
		super(controller, o);
		this.o = o;
	}

	@Override
    public EObject managerConfiguration(String instanceName) {
            //EObject o1 =  ManagerFactory.eINSTANCE.createControllerServiceStandardeventcollectorManager();
			ControllerServiceStandardeventcollectorManager o1 =  ManagerFactory.eINSTANCE.createControllerServiceStandardeventcollectorManager();
            ManagementServer.copy(findInstance(instanceName),o1);
            o1.setKeystorepwd(JavaHttpClient.decryptPassword(o1.getKeystorepwd()));
            
            return o1;
    }




	
}