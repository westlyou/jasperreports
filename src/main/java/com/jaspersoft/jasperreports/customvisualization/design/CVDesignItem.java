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
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.design.events.JRPropertyChangeSupport;
import net.sf.jasperreports.engine.util.JRCloneUtils;

import com.jaspersoft.jasperreports.customvisualization.CVConstants;
import com.jaspersoft.jasperreports.customvisualization.CVItem;
import com.jaspersoft.jasperreports.customvisualization.CVItemProperty;

/**
 *
 * @author Giulio Toffoli (gtoffoli@tibco.com)
 */
public class CVDesignItem implements CVItem, Serializable {

    private static final long serialVersionUID = CVConstants.SERIAL_VERSION_UID;
    
    public static final String PROPERTY_ITEM_PROPERTIES = "itemProperties";
    
    private transient JRPropertyChangeSupport eventSupport;

    private List<CVItemProperty> properties = new ArrayList<CVItemProperty>();

    public CVDesignItem()
    {
    }

    public CVDesignItem(List<CVItemProperty> properties)
    {
            this.properties = properties;
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
            CVDesignItem clone = null;
            try
            {
                    clone = (CVDesignItem) super.clone();
            }
            catch (CloneNotSupportedException e)
            {
                    // never
                    throw new RuntimeException(e);
            }
            clone.properties = JRCloneUtils.cloneList(properties);
            return clone;
    }

    public List<CVItemProperty> getItemProperties() 
    {
            return properties;
    }

    public void addItemProperty(CVItemProperty property)
    {
            properties.add(property);
            getEventSupport().fireCollectionElementAddedEvent(PROPERTY_ITEM_PROPERTIES, property, properties.size() - 1);
    }

    public void removeItemProperty(CVItemProperty property)
    {
            int idx = properties.indexOf(property);
            if (idx >= 0)
            {
                    properties.remove(idx);

                    getEventSupport().fireCollectionElementRemovedEvent(PROPERTY_ITEM_PROPERTIES, 
                                    property, idx);
            }
    }
    
}
