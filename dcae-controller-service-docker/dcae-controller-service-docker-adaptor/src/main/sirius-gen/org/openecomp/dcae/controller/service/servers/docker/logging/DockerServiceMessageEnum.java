
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
	

package org.openecomp.dcae.controller.service.servers.docker.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum DockerServiceMessageEnum implements EcompMessageEnum {

  dummy,
  deploy,
  undeploy,
  test,
  suspend,
  resume,
  pushManagerConfiguration,
  pollManagerConfiguration,
  managerConfiguration,
  managerOperation,
  updateConfigurationFromPolicy,
  runHealthTests,
  REMOTE_deploy,
  REMOTE_undeploy,
  REMOTE_test,
  REMOTE_suspend,
  REMOTE_resume,
  REMOTE_pushManagerConfiguration,
  REMOTE_pollManagerConfiguration,
  REMOTE_managerConfiguration,
  REMOTE_managerOperation,
  REMOTE_updateConfigurationFromPolicy,
  REMOTE_runHealthTests;

	static {
		EELFResourceManager.loadMessageBundle("org.openecomp.dcae.controller.service.servers.docker.logging.DockerService");
	}
}