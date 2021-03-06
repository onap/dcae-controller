
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
	
/**
 */
package org.openecomp.dcae.controller.service.standardeventcollector.service.impl;

import org.openecomp.dcae.controller.service.standardeventcollector.service.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceFactoryImpl extends EFactoryImpl implements ServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceFactory init() {
		try {
			ServiceFactory theServiceFactory = (ServiceFactory)EPackage.Registry.INSTANCE.getEFactory(ServicePackage.eNS_URI);
			if (theServiceFactory != null) {
				return theServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE: return createControllerServiceStandardeventcollectorService();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE: return createControllerServiceStandardeventcollectorServiceInstance();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION: return createControllerServiceStandardeventcollectorServiceConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerServiceStandardeventcollectorService createControllerServiceStandardeventcollectorService() {
		ControllerServiceStandardeventcollectorServiceImpl controllerServiceStandardeventcollectorService = new ControllerServiceStandardeventcollectorServiceImpl();
		return controllerServiceStandardeventcollectorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerServiceStandardeventcollectorServiceInstance createControllerServiceStandardeventcollectorServiceInstance() {
		ControllerServiceStandardeventcollectorServiceInstanceImpl controllerServiceStandardeventcollectorServiceInstance = new ControllerServiceStandardeventcollectorServiceInstanceImpl();
		return controllerServiceStandardeventcollectorServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerServiceStandardeventcollectorServiceConfiguration createControllerServiceStandardeventcollectorServiceConfiguration() {
		ControllerServiceStandardeventcollectorServiceConfigurationImpl controllerServiceStandardeventcollectorServiceConfiguration = new ControllerServiceStandardeventcollectorServiceConfigurationImpl();
		return controllerServiceStandardeventcollectorServiceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePackage getServicePackage() {
		return (ServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicePackage getPackage() {
		return ServicePackage.eINSTANCE;
	}

} //ServiceFactoryImpl
