
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
package org.openecomp.dcae.controller.platform.controller.util;

import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.platform.controller.*;

import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApi;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage
 * @generated
 */
public class ControllerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControllerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerSwitch() {
		if (modelPackage == null) {
			modelPackage = ControllerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER: {
				DcaePlatformController dcaePlatformController = (DcaePlatformController)theEObject;
				T result = caseDcaePlatformController(dcaePlatformController);
				if (result == null) result = caseAbstractManagementServer(dcaePlatformController);
				if (result == null) result = caseSouthBoundApiWithProxy(dcaePlatformController);
				if (result == null) result = caseSouthBoundApi(dcaePlatformController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllerPackage.DCAE_DATA_BUS: {
				DcaeDataBus dcaeDataBus = (DcaeDataBus)theEObject;
				T result = caseDcaeDataBus(dcaeDataBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllerPackage.CONTROLLER_CLUSTER: {
				ControllerCluster controllerCluster = (ControllerCluster)theEObject;
				T result = caseControllerCluster(controllerCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER: {
				ControllerClusterServer controllerClusterServer = (ControllerClusterServer)theEObject;
				T result = caseControllerClusterServer(controllerClusterServer);
				if (result == null) result = caseNamedEntity(controllerClusterServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA: {
				ControllerClusterServerData controllerClusterServerData = (ControllerClusterServerData)theEObject;
				T result = caseControllerClusterServerData(controllerClusterServerData);
				if (result == null) result = caseNamedEntity(controllerClusterServerData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllerPackage.CONTROLLER_VIRTUAL_MACHINE_SERVICE: {
				ControllerVirtualMachineService controllerVirtualMachineService = (ControllerVirtualMachineService)theEObject;
				T result = caseControllerVirtualMachineService(controllerVirtualMachineService);
				if (result == null) result = caseVirtualMachineService(controllerVirtualMachineService);
				if (result == null) result = caseDcaeService(controllerVirtualMachineService);
				if (result == null) result = caseNamedEntity(controllerVirtualMachineService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Platform Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Platform Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaePlatformController(DcaePlatformController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Data Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Data Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeDataBus(DcaeDataBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerCluster(ControllerCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerClusterServer(ControllerClusterServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Server Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Server Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerClusterServerData(ControllerClusterServerData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerVirtualMachineService(ControllerVirtualMachineService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>South Bound Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>South Bound Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSouthBoundApi(SouthBoundApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>South Bound Api With Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>South Bound Api With Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSouthBoundApiWithProxy(SouthBoundApiWithProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Management Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Management Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractManagementServer(AbstractManagementServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeService(DcaeService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineService(VirtualMachineService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ControllerSwitch
