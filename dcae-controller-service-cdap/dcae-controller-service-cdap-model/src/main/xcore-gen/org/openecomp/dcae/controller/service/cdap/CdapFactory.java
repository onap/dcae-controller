
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
package org.openecomp.dcae.controller.service.cdap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage
 * @generated
 */
public interface CdapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdapFactory eINSTANCE = org.openecomp.dcae.controller.service.cdap.impl.CdapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	CdapService createCdapService();

	/**
	 * Returns a new object of class '<em>Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Instance</em>'.
	 * @generated
	 */
	CdapServiceInstance createCdapServiceInstance();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	CdapApplication createCdapApplication();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	CdapArtifact createCdapArtifact();

	/**
	 * Returns a new object of class '<em>Service Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Instance Configuration</em>'.
	 * @generated
	 */
	CdapServiceInstanceConfiguration createCdapServiceInstanceConfiguration();

	/**
	 * Returns a new object of class '<em>Internal Application Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Application Configuration</em>'.
	 * @generated
	 */
	CdapInternalApplicationConfiguration createCdapInternalApplicationConfiguration();

	/**
	 * Returns a new object of class '<em>Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Descriptor</em>'.
	 * @generated
	 */
	CdapServiceDescriptor createCdapServiceDescriptor();

	/**
	 * Returns a new object of class '<em>Load Artifact Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Artifact Step</em>'.
	 * @generated
	 */
	CdapLoadArtifactStep createCdapLoadArtifactStep();

	/**
	 * Returns a new object of class '<em>Load Artifact With Config Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Artifact With Config Step</em>'.
	 * @generated
	 */
	CdapLoadArtifactWithConfigStep createCdapLoadArtifactWithConfigStep();

	/**
	 * Returns a new object of class '<em>Create App Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create App Step</em>'.
	 * @generated
	 */
	CdapCreateAppStep createCdapCreateAppStep();

	/**
	 * Returns a new object of class '<em>Create App With Config Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create App With Config Step</em>'.
	 * @generated
	 */
	CdapCreateAppWithConfigStep createCdapCreateAppWithConfigStep();

	/**
	 * Returns a new object of class '<em>Deploy App Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deploy App Step</em>'.
	 * @generated
	 */
	CdapDeployAppStep createCdapDeployAppStep();

	/**
	 * Returns a new object of class '<em>Stop Flow Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Flow Step</em>'.
	 * @generated
	 */
	CdapStopFlowStep createCdapStopFlowStep();

	/**
	 * Returns a new object of class '<em>Stop Worker Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Worker Step</em>'.
	 * @generated
	 */
	CdapStopWorkerStep createCdapStopWorkerStep();

	/**
	 * Returns a new object of class '<em>Stop Service Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Service Step</em>'.
	 * @generated
	 */
	CdapStopServiceStep createCdapStopServiceStep();

	/**
	 * Returns a new object of class '<em>Stop App Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop App Step</em>'.
	 * @generated
	 */
	CdapStopAppStep createCdapStopAppStep();

	/**
	 * Returns a new object of class '<em>Start Flow Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Flow Step</em>'.
	 * @generated
	 */
	CdapStartFlowStep createCdapStartFlowStep();

	/**
	 * Returns a new object of class '<em>Start Worker Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Worker Step</em>'.
	 * @generated
	 */
	CdapStartWorkerStep createCdapStartWorkerStep();

	/**
	 * Returns a new object of class '<em>Start Service Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Service Step</em>'.
	 * @generated
	 */
	CdapStartServiceStep createCdapStartServiceStep();

	/**
	 * Returns a new object of class '<em>Start App Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start App Step</em>'.
	 * @generated
	 */
	CdapStartAppStep createCdapStartAppStep();

	/**
	 * Returns a new object of class '<em>Delete App Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete App Step</em>'.
	 * @generated
	 */
	CdapDeleteAppStep createCdapDeleteAppStep();

	/**
	 * Returns a new object of class '<em>Delete Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Artifact</em>'.
	 * @generated
	 */
	CdapDeleteArtifact createCdapDeleteArtifact();

	/**
	 * Returns a new object of class '<em>Suspend Schedule Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Schedule Step</em>'.
	 * @generated
	 */
	CdapSuspendScheduleStep createCdapSuspendScheduleStep();

	/**
	 * Returns a new object of class '<em>Resume Schedule Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resume Schedule Step</em>'.
	 * @generated
	 */
	CdapResumeScheduleStep createCdapResumeScheduleStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CdapPackage getCdapPackage();

} //CdapFactory
