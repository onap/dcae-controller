
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
package org.openecomp.dcae.controller.core.service;

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Service Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceContainer#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceContainer()
 * @model abstract="true"
 * @generated
 */
public interface DcaeServiceContainer extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance}.
	 * It is bidirectional and its opposite is '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getServiceContainer <em>Service Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceContainer_Instances()
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getServiceContainer
	 * @model opposite="serviceContainer"
	 * @generated
	 */
	EList<DcaeServiceInstance> getInstances();

} // DcaeServiceContainer
