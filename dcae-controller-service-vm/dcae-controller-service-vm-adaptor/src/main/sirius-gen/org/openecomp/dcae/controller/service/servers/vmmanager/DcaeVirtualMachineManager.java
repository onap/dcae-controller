
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
package org.openecomp.dcae.controller.service.servers.vmmanager;





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISwaggerHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ISiriusProvider;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.SwaggerUtils;
import org.openecomp.ncomp.sirius.function.FunctionUtils;
import org.openecomp.ncomp.component.ApiRequestStatus;

import org.apache.log4j.Logger;

import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;
import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.logger.EcompException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import java.util.Date;

import org.openecomp.dcae.controller.service.servers.vmmanager.logging.VirtualMachineManagerOperationEnum;
import org.openecomp.dcae.controller.service.servers.vmmanager.logging.VirtualMachineManagerMessageEnum;







import java.util.Date;





import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;





import org.openecomp.ncomp.sirius.manager.server.ServerFactory;


import org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl;



public class DcaeVirtualMachineManager extends VirtualMachineManagerImpl implements ISiriusProvider {
	public static final Logger logger = Logger.getLogger(DcaeVirtualMachineManager.class);
	static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
	public DcaeVirtualMachineManagerProvider controller;
	ISiriusServer server;

	public DcaeVirtualMachineManager(ISiriusServer server) {
		this.server = server;
		this.controller = new DcaeVirtualMachineManagerProvider(server,this);
	}

	public org.openecomp.dcae.controller.core.service.HealthTestResponse test() {
		org.openecomp.dcae.controller.core.service.HealthTestResponse res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "test", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_test,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_test,"self:" + ManagementServer.object2ref(this));
		try {
			res =  controller.test();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "test", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_test, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_test,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_test, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_suspend,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_suspend,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.suspend();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "suspend", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_suspend, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_suspend,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_suspend, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_resume,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_resume,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.resume();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "resume", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_resume, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_resume,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_resume, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_publicKey,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_publicKey,"self:" + ManagementServer.object2ref(this));
		try {
			res =  controller.publicKey();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "publicKey", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_publicKey, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_publicKey,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_publicKey, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_configurationChanged,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_configurationChanged,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.configurationChanged();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "configurationChanged", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_configurationChanged, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_configurationChanged,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_configurationChanged, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_updateStreams,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_updateStreams,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.updateStreams(inputStreams,outputStreams);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "updateStreams", ApiRequestStatus.ERROR, duration_,inputStreams,outputStreams);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_updateStreams, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_updateStreams,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_updateStreams, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_logs,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_logs,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.logs(cx,logs);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "logs", ApiRequestStatus.ERROR, duration_,cx,logs);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_logs, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_logs,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_logs, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_metrics,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_metrics,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.metrics(cx,metrics);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "metrics", ApiRequestStatus.ERROR, duration_,cx,metrics);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_metrics, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_metrics,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_metrics, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_properties,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_properties,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.properties(cx,l);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "properties", ApiRequestStatus.ERROR, duration_,cx,l);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_properties, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_properties,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_properties, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_uploadInfo,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_uploadInfo,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.uploadInfo(cx,info);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "uploadInfo", ApiRequestStatus.ERROR, duration_,cx,info);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_uploadInfo, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_uploadInfo,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_uploadInfo, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_getValues,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_getValues,"self:" + ManagementServer.object2ref(this));
		try {
			res =  controller.getValues(cx,path,start,end,option,relativeInterval);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getValues", ApiRequestStatus.ERROR, duration_,cx,path,start,end,option,relativeInterval);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getValues, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getValues,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_getValues, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_getValuesAll,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_getValuesAll,"self:" + ManagementServer.object2ref(this));
		try {
			res =  controller.getValuesAll(cx,path,metrics,start,end,option,relativeInterval);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getValuesAll", ApiRequestStatus.ERROR, duration_,cx,path,metrics,start,end,option,relativeInterval);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getValuesAll, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getValuesAll,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_getValuesAll, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_getMessages,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_getMessages,"self:" + ManagementServer.object2ref(this));
		try {
			res =  controller.getMessages(cx,path,start,end);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getMessages", ApiRequestStatus.ERROR, duration_,cx,path,start,end);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getMessages, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getMessages,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_getMessages, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_getRequestLogger,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_getRequestLogger,"self:" + ManagementServer.object2ref(this));
		try {
			res =  controller.getRequestLogger(userName,action,resourcePath,context);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getRequestLogger", ApiRequestStatus.ERROR, duration_,userName,action,resourcePath,context);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getRequestLogger, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_getRequestLogger,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_getRequestLogger, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_evaluate,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_evaluate,"self:" + ManagementServer.object2ref(this));
		try {
			res =  controller.evaluate(path,function);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "evaluate", ApiRequestStatus.ERROR, duration_,path,function);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_evaluate, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_evaluate,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_evaluate, e.getMessage());
			throw e1;
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
		ecomplogger.recordAuditEventStartIfNeeded(VirtualMachineManagerOperationEnum.VirtualMachineManager_update,server,this);
		ecomplogger.recordMetricEventStart(VirtualMachineManagerOperationEnum.VirtualMachineManager_update,"self:" + ManagementServer.object2ref(this));
		try {
			 controller.update(path,function);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "update", ApiRequestStatus.ERROR, duration_,path,function);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(VirtualMachineManagerMessageEnum.REQUEST_FAILED_update, e.toString());
			EcompException e1 =  EcompException.create(VirtualMachineManagerMessageEnum.REQUEST_FAILED_update,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, VirtualMachineManagerMessageEnum.REQUEST_FAILED_update, e.getMessage());
			throw e1;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "update", ApiRequestStatus.OKAY, duration_,path,function);
		
	}








	public static void ecoreSetup() {
		DcaeVirtualMachineManagerProvider.ecoreSetup();
	}
	public DcaeVirtualMachineManagerProvider getSiriusProvider() {
		return controller;
	}
}
