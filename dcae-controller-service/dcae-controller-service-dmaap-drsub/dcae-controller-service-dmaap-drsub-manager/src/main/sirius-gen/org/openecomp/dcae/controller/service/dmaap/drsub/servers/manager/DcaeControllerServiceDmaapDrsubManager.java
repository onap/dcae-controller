
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
package org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager;



import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;
import org.openecomp.ncomp.component.ApiRequestStatus;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import java.util.Date;

import org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager.logging.ControllerServiceDmaapDrsubManagerOperationEnum;







import java.util.Date;





import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;





import org.openecomp.ncomp.sirius.manager.server.ServerFactory;


import org.openecomp.dcae.controller.service.dmaap.drsub.manager.impl.ControllerServiceDmaapDrsubManagerImpl;



public class DcaeControllerServiceDmaapDrsubManager extends ControllerServiceDmaapDrsubManagerImpl {
	public static final Logger logger = Logger.getLogger(DcaeControllerServiceDmaapDrsubManager.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public DcaeControllerServiceDmaapDrsubManagerProvider controller;
	ISiriusServer server;

	public DcaeControllerServiceDmaapDrsubManager(ISiriusServer server) {
		this.server = server;
		this.controller = new DcaeControllerServiceDmaapDrsubManagerProvider(server,this);
	}

	public org.openecomp.dcae.controller.core.service.HealthTestResponse test() {
		org.openecomp.dcae.controller.core.service.HealthTestResponse res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "test", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.test);
		try {
			res =  controller.test();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "test", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "test", ApiRequestStatus.OKAY, duration_);
		return res;
	}

	public void suspend() {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "suspend", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.suspend);
		try {
			 controller.suspend();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "suspend", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "suspend", ApiRequestStatus.OKAY, duration_);
		
	}

	public void resume() {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "resume", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.resume);
		try {
			 controller.resume();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "resume", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "resume", ApiRequestStatus.OKAY, duration_);
		
	}

	public java.lang.String publicKey() {
		java.lang.String res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "publicKey", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.publicKey);
		try {
			res =  controller.publicKey();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "publicKey", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "publicKey", ApiRequestStatus.OKAY, duration_);
		return res;
	}

	public void configurationChanged() {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "configurationChanged", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.configurationChanged);
		try {
			 controller.configurationChanged();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "configurationChanged", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "configurationChanged", ApiRequestStatus.OKAY, duration_);
		
	}

	public void updateStreams(EList<org.openecomp.dcae.controller.core.stream.DcaeStream> inputStreams, EList<org.openecomp.dcae.controller.core.stream.DcaeStream> outputStreams) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "updateStreams", ApiRequestStatus.START, duration_,inputStreams,outputStreams);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.updateStreams);
		try {
			 controller.updateStreams(inputStreams,outputStreams);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "updateStreams", ApiRequestStatus.ERROR, duration_,inputStreams,outputStreams);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "updateStreams", ApiRequestStatus.OKAY, duration_,inputStreams,outputStreams);
		
	}

	public void logs(org.json.JSONObject cx, EList<org.openecomp.ncomp.core.logs.LogMessage> logs) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "logs", ApiRequestStatus.START, duration_,cx,logs);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.logs);
		try {
			 controller.logs(cx,logs);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "logs", ApiRequestStatus.ERROR, duration_,cx,logs);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "logs", ApiRequestStatus.OKAY, duration_,cx,logs);
		
	}

	public void metrics(org.json.JSONObject cx, EList<org.openecomp.ncomp.core.metrics.Metric> metrics) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "metrics", ApiRequestStatus.START, duration_,cx,metrics);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.metrics);
		try {
			 controller.metrics(cx,metrics);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "metrics", ApiRequestStatus.ERROR, duration_,cx,metrics);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "metrics", ApiRequestStatus.OKAY, duration_,cx,metrics);
		
	}

	public void properties(org.json.JSONObject cx, EList<org.openecomp.ncomp.sirius.manager.properties.AbstractProperty> l) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "properties", ApiRequestStatus.START, duration_,cx,l);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.properties);
		try {
			 controller.properties(cx,l);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "properties", ApiRequestStatus.ERROR, duration_,cx,l);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "properties", ApiRequestStatus.OKAY, duration_,cx,l);
		
	}

	public void uploadInfo(org.json.JSONObject cx, EList<org.openecomp.ncomp.sirius.manager.server.ManagementInfo> info) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "uploadInfo", ApiRequestStatus.START, duration_,cx,info);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.uploadInfo);
		try {
			 controller.uploadInfo(cx,info);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "uploadInfo", ApiRequestStatus.ERROR, duration_,cx,info);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "uploadInfo", ApiRequestStatus.OKAY, duration_,cx,info);
		
	}

	public EList<org.openecomp.ncomp.core.metrics.DoubleMetric> getValues(org.json.JSONObject cx, java.lang.String path, java.lang.Long start, java.lang.Long end, org.openecomp.ncomp.core.metrics.MetricValueOption option, boolean relativeInterval) {
		EList<org.openecomp.ncomp.core.metrics.DoubleMetric> res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getValues", ApiRequestStatus.START, duration_,cx,path,start,end,option,relativeInterval);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.getValues);
		try {
			res =  controller.getValues(cx,path,start,end,option,relativeInterval);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getValues", ApiRequestStatus.ERROR, duration_,cx,path,start,end,option,relativeInterval);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getValues", ApiRequestStatus.OKAY, duration_,cx,path,start,end,option,relativeInterval);
		return res;
	}

	public EList<org.openecomp.ncomp.core.metrics.DoubleMetric> getValuesAll(org.json.JSONObject cx, java.lang.String path, EList<java.lang.String> metrics, java.lang.Long start, java.lang.Long end, org.openecomp.ncomp.core.metrics.MetricValueOption option, boolean relativeInterval) {
		EList<org.openecomp.ncomp.core.metrics.DoubleMetric> res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getValuesAll", ApiRequestStatus.START, duration_,cx,path,metrics,start,end,option,relativeInterval);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.getValuesAll);
		try {
			res =  controller.getValuesAll(cx,path,metrics,start,end,option,relativeInterval);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getValuesAll", ApiRequestStatus.ERROR, duration_,cx,path,metrics,start,end,option,relativeInterval);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getValuesAll", ApiRequestStatus.OKAY, duration_,cx,path,metrics,start,end,option,relativeInterval);
		return res;
	}

	public EList<org.openecomp.ncomp.core.logs.LogMessage> getMessages(org.json.JSONObject cx, java.lang.String path, java.lang.Long start, java.lang.Long end) {
		EList<org.openecomp.ncomp.core.logs.LogMessage> res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getMessages", ApiRequestStatus.START, duration_,cx,path,start,end);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.getMessages);
		try {
			res =  controller.getMessages(cx,path,start,end);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getMessages", ApiRequestStatus.ERROR, duration_,cx,path,start,end);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getMessages", ApiRequestStatus.OKAY, duration_,cx,path,start,end);
		return res;
	}

	public org.openecomp.ncomp.sirius.manager.server.LoggerInfo getRequestLogger(java.lang.String userName, java.lang.String action, java.lang.String resourcePath, org.json.JSONObject context) {
		org.openecomp.ncomp.sirius.manager.server.LoggerInfo res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getRequestLogger", ApiRequestStatus.START, duration_,userName,action,resourcePath,context);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.getRequestLogger);
		try {
			res =  controller.getRequestLogger(userName,action,resourcePath,context);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getRequestLogger", ApiRequestStatus.ERROR, duration_,userName,action,resourcePath,context);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getRequestLogger", ApiRequestStatus.OKAY, duration_,userName,action,resourcePath,context);
		return res;
	}

	public EList<org.openecomp.ncomp.core.function.ValuePair> evaluate(java.lang.String path, org.openecomp.ncomp.core.function.Function function) {
		EList<org.openecomp.ncomp.core.function.ValuePair> res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "evaluate", ApiRequestStatus.START, duration_,path,function);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.evaluate);
		try {
			res =  controller.evaluate(path,function);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "evaluate", ApiRequestStatus.ERROR, duration_,path,function);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "evaluate", ApiRequestStatus.OKAY, duration_,path,function);
		return res;
	}

	public void update(java.lang.String path, org.openecomp.ncomp.core.function.Function function) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "update", ApiRequestStatus.START, duration_,path,function);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerServiceDmaapDrsubManagerOperationEnum.update);
		try {
			 controller.update(path,function);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "update", ApiRequestStatus.ERROR, duration_,path,function);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "update", ApiRequestStatus.OKAY, duration_,path,function);
		
	}






	public static void ecoreSetup() {
		DcaeControllerServiceDmaapDrsubManagerProvider.ecoreSetup();
	}
	public DcaeControllerServiceDmaapDrsubManagerProvider getSomfProvider() {
		return controller;
	}
}