/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * The Custom Visualization Component program and the accompanying materials
 * has been dual licensed under the the following licenses:
 * 
 * Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Custom Visualization Component is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License.
 * If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.jaspersoft.jasperreports.customvisualization;

import java.io.Serializable;
import java.util.List;

import net.sf.jasperreports.engine.type.EvaluationTimeEnum;
import net.sf.jasperreports.engine.type.OnErrorTypeEnum;


public interface CVComponent 
    extends net.sf.jasperreports.engine.component.Component, 
            net.sf.jasperreports.engine.component.ContextAwareComponent,
            net.sf.jasperreports.engine.JRCloneable,
            Serializable
{

       public EvaluationTimeEnum getEvaluationTime();
       public String getEvaluationGroup();
       
       public String getProcessingClass();
       
       public List<CVItemProperty> getItemProperties();
       
       public List<CVItemData> getItemData();
       
       /**
	 * Indicates how the engine will treat a situation where there is an error.
	 * @return a value representing one of the missing image handling constants in {@link OnErrorTypeEnum}
	 */
       public OnErrorTypeEnum getOnErrorType();
       
}
