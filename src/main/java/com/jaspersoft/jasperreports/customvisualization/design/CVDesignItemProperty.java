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
package com.jaspersoft.jasperreports.customvisualization.design;

import java.io.Serializable;

import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.design.events.JRChangeEventsSupport;
import net.sf.jasperreports.engine.design.events.JRPropertyChangeSupport;
import net.sf.jasperreports.engine.util.JRCloneUtils;

import com.jaspersoft.jasperreports.customvisualization.CVConstants;
import com.jaspersoft.jasperreports.customvisualization.CVItemProperty;

/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: CVDesignItemProperty.java 6002 2013-03-20 08:15:32Z teodord $
 */
public class CVDesignItemProperty implements CVItemProperty, JRChangeEventsSupport, Serializable
{
	
	private static final long serialVersionUID = CVConstants.SERIAL_VERSION_UID;
	
	public static final String PROPERTY_NAME = "name";
	public static final String PROPERTY_VALUE = "value";
	public static final String PROPERTY_VALUE_EXPRESSION = "valueExpression";
	
	private transient JRPropertyChangeSupport eventSupport;

	private String name;
	private String value;
	private JRExpression valueExpression;

	public CVDesignItemProperty()
	{
	}
	
	public CVDesignItemProperty(String name, String value, JRExpression valueExpression)
	{
		this.name = name;
		this.valueExpression = valueExpression;
		this.value = value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		Object old = this.name;
		this.name = name;
		getEventSupport().firePropertyChange(PROPERTY_NAME, old, this.name);
	}

	public String getValue()
	{
		return value;
	}
	
	public void setValue(String value)
	{
		Object old = this.value;
		this.value = value;
		getEventSupport().firePropertyChange(PROPERTY_VALUE, old, this.value);
	}
	
	public JRExpression getValueExpression()
	{
		return valueExpression;
	}

	public void setValueExpression(JRExpression valueExpression)
	{
                Object old = this.valueExpression;
		this.valueExpression = valueExpression;
		getEventSupport().firePropertyChange(PROPERTY_VALUE_EXPRESSION, old, this.valueExpression);
	}

	public JRPropertyChangeSupport getEventSupport()
	{
		synchronized (this)
		{
			if (eventSupport == null)
			{
				eventSupport = new JRPropertyChangeSupport(this);
			}
		}
		
		return eventSupport;
	}

	public Object clone()
	{
		try
		{
			CVDesignItemProperty clone = (CVDesignItemProperty) super.clone();
			clone.valueExpression = JRCloneUtils.nullSafeClone(valueExpression);
			return clone;
		}
		catch (CloneNotSupportedException e)
		{
			// never
			throw new RuntimeException(e);
		}
	}
}
