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
package com.jaspersoft.jasperreports.customvisualization.export;

import net.sf.jasperreports.engine.JRGenericPrintElement;
import net.sf.jasperreports.engine.JRPrintImage;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.export.GenericElementJExcelApiHandler;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JExcelApiExporterContext;
import net.sf.jasperreports.engine.export.JRExporterGridCell;
import net.sf.jasperreports.engine.export.JRGridLayout;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class CVElementJExcelApiHandler implements GenericElementJExcelApiHandler {
	
	private static final CVElementJExcelApiHandler INSTANCE = new CVElementJExcelApiHandler();
	private static final Log log = LogFactory.getLog(CVElementJExcelApiHandler.class);
	
        
        public static CVElementJExcelApiHandler getInstance()
	{
		return INSTANCE;
	}

	@Override
	public void exportElement(JExcelApiExporterContext exporterContext,
			JRGenericPrintElement element, JRExporterGridCell gridCell,
			int colIndex, int rowIndex, int emptyCols, int yCutsRow,
			JRGridLayout layout) {
		if (log.isDebugEnabled()) {
			log.debug("Exporting to JExcel " + element);
		}
		
		try {
			JRPrintImage chartImage = CVElementImageProvider.getDefaultProvider().getImage(exporterContext.getJasperReportsContext(), element, false);
			JExcelApiExporter exporter = (JExcelApiExporter) exporterContext.getExporter();
			exporter.exportImage(chartImage, gridCell, colIndex, rowIndex, emptyCols, yCutsRow, layout);
		} catch (Exception e) {
			throw new JRRuntimeException(e);
		}
	}

        @Override
        public boolean toExport(JRGenericPrintElement jrgpe) {
            return true;
        }

}
