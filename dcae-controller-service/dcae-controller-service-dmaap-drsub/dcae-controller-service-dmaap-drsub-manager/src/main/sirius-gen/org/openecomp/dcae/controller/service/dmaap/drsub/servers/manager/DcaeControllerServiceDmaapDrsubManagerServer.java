
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
// Do not edit but extend this class as needed
package org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager;

import static org.openecomp.ncomp.utils.PropertyUtil.getPropertiesFromClasspath;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EFactory;
import org.json.JSONObject;
import org.openecomp.ncomp.sirius.manager.Jetty8Server;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;

import org.openecomp.dcae.controller.service.dmaap.drsub.manager.ControllerServiceDmaapDrsubManager;

    
import org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager.gui.DcaeModelFactory;





public class DcaeControllerServiceDmaapDrsubManagerServer implements ISiriusServer, IRequestHandler {
    public static final Logger logger = Logger.getLogger(DcaeControllerServiceDmaapDrsubManagerServer.class);
    String serverPath;
    ManagementServer server;
    DcaeControllerServiceDmaapDrsubManager controller;
    String directory = "data";
//      LocationControllerApi api ;
    Jetty8Server webServer;
    DcaeManagerFactory f = new DcaeManagerFactory(this);
	
    
    String guiPath;
    ManagementServer guiServer;


    public DcaeControllerServiceDmaapDrsubManagerServer(String filename) throws IOException {
		logger.warn("controller restarting");
		DcaeControllerServiceDmaapDrsubManager.ecoreSetup(); 
		props = getPropertiesFromClasspath(filename);
        serverPath = (String) props.get("server.dir");
        server = new ManagementServer(f, "ControllerServiceDmaapDrsubManager", serverPath, filename);
        ManagementServer.setBuildVersion("ONAP-R2");
        server.addFactory(f);

		server.addFactory(org.openecomp.dcae.controller.service.dmaap.drsub.service.ServiceFactory.eINSTANCE);
  

        server.addRuntimeFactories(this);
        server.start();
    }
    public void runWebserver() throws IOException {
        controller = (DcaeControllerServiceDmaapDrsubManager) server.find("/").o;
        webServer = new Jetty8Server("manager.properties");
        webServer.add("/resources",server);
        webServer.add("/api",this);


    
		EFactory guiFactory = new DcaeModelFactory(this);
		guiPath = serverPath + "/gui";
		guiServer = new ManagementServer(guiFactory, "GuiClientApi", guiPath, "gui.properties");
		guiServer.start();
		webServer.add("/gui",guiServer);



        logger.info("Joining webserver");
        webServer.join();
    }
    static Properties props = null;
    public static void main(String []args) throws IOException {
            // ALWAYS USE GMT.
            TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
            
            DcaeControllerServiceDmaapDrsubManagerServer s = new DcaeControllerServiceDmaapDrsubManagerServer("manager.properties");
            s.runWebserver();
    }
	public ControllerServiceDmaapDrsubManager getController() {
		return controller;
	}
	public ManagementServer getServer() {
		return server;
	}
	public Object handleJson(String userName, String action, String resourcePath, JSONObject json, JSONObject context,
			String clientVersion) {
		switch ((String) context.get("path")) {
		case "/api/versions":
			return server.supportedVersions();
		}
		logger.warn("Unknown request action=" + action + " path=" + resourcePath + " context=" + context.toString(2));
		throw new RuntimeException("Unknown request");
	}
	public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
		return null;
	}

}
