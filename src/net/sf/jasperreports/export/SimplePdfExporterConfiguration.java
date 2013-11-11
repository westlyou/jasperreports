/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.export;

import net.sf.jasperreports.export.type.PdfPrintScalingEnum;
import net.sf.jasperreports.export.type.PdfVersionEnum;
import net.sf.jasperreports.export.type.PdfaConformanceEnum;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class SimplePdfExporterConfiguration extends SimpleExporterConfiguration implements PdfExporterConfiguration
{
	private Boolean isCreatingBatchModeBookmarks;
	private Boolean isForceSvgShapes;
	private Boolean isCompressed;
	private Boolean isEncrypted;
	private Boolean is128BitKey;
	private String userPassword;
	private String ownerPassword;
	private PdfVersionEnum pdfVersion;
	private String pdfJavaScript;
	private PdfPrintScalingEnum printScaling;
	private Boolean isCollapseMissingBookmarkLevels;
	private Boolean isTagged;
	private String tagLanguage;
	private Boolean isSizePageToContent;
	private PdfaConformanceEnum pdfaConformance;
	private String iccProfilePath;
	private Boolean isIgnoreHyperlink;
	private Integer permissions;
	private String metadataTitle;
	private String metadataAuthor;
	private String metadataSubject;
	private String metadataKeywords;
	private String metadataCreator;
	private Boolean isForceLineBreakPolicy;

	
	/**
	 * 
	 */
	public SimplePdfExporterConfiguration()
	{
	}
	
	/**
	 * 
	 */
	public Boolean isCreatingBatchModeBookmarks()
	{
		return isCreatingBatchModeBookmarks;
	}
	
	/**
	 * 
	 */
	public void setCreatingBatchModeBookmarks(Boolean isCreatingBatchModeBookmarks)
	{
		this.isCreatingBatchModeBookmarks = isCreatingBatchModeBookmarks;
	}
	
	/**
	 * 
	 */
	public Boolean isForceSvgShapes()
	{
		return isForceSvgShapes;
	}
	
	/**
	 * 
	 */
	public void setForceSvgShapes(Boolean isForceSvgShapes)
	{
		this.isForceSvgShapes = isForceSvgShapes;
	}
	
	/**
	 * 
	 */
	public Boolean isCompressed()
	{
		return isCompressed;
	}
	
	/**
	 * 
	 */
	public void setCompressed(Boolean isCompressed)
	{
		this.isCompressed = isCompressed;
	}
	
	/**
	 * 
	 */
	public Boolean isEncrypted()
	{
		return isEncrypted;
	}
	
	/**
	 * 
	 */
	public void setEncrypted(Boolean isEncrypted)
	{
		this.isEncrypted = isEncrypted;
	}
	
	/**
	 * 
	 */
	public Boolean is128BitKey()
	{
		return is128BitKey;
	}
	
	/**
	 * 
	 */
	public void set128BitKey(Boolean is128BitKey)
	{
		this.is128BitKey = is128BitKey;
	}
	
	/**
	 * 
	 */
	public String getUserPassword()
	{
		return userPassword;
	}
	
	/**
	 * 
	 */
	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}
	
	/**
	 * 
	 */
	public String getOwnerPassword()
	{
		return ownerPassword;
	}
	
	/**
	 * 
	 */
	public void setOwnerPassword(String ownerPassword)
	{
		this.ownerPassword = ownerPassword;
	}
	
	/**
	 * 
	 */
	public PdfVersionEnum getPdfVersion()
	{
		return pdfVersion;
	}
	
	/**
	 * 
	 */
	public void setPdfVersion(PdfVersionEnum pdfVersion)
	{
		this.pdfVersion = pdfVersion;
	}
	
	/**
	 * 
	 */
	public String getPdfJavaScript()
	{
		return pdfJavaScript;
	}
	
	/**
	 * 
	 */
	public void setPdfJavaScript(String pdfJavaScript)
	{
		this.pdfJavaScript = pdfJavaScript;
	}
	
	/**
	 * 
	 */
	public PdfPrintScalingEnum getPrintScaling()
	{
		return printScaling;
	}
	
	/**
	 * 
	 */
	public void setPrintScaling(PdfPrintScalingEnum printScaling)
	{
		this.printScaling = printScaling;
	}
	
	/**
	 * 
	 */
	public Boolean isCollapseMissingBookmarkLevels()
	{
		return isCollapseMissingBookmarkLevels;
	}
	
	/**
	 * 
	 */
	public void setCollapseMissingBookmarkLevels(Boolean isCollapseMissingBookmarkLevels)
	{
		this.isCollapseMissingBookmarkLevels = isCollapseMissingBookmarkLevels;
	}
	
	/**
	 * 
	 */
	public Boolean isTagged()
	{
		return isTagged;
	}
	
	/**
	 * 
	 */
	public void setTagged(Boolean isTagged)
	{
		this.isTagged = isTagged;
	}
	
	/**
	 * 
	 */
	public String getTagLanguage()
	{
		return tagLanguage;
	}
	
	/**
	 * 
	 */
	public void setTagLanguage(String tagLanguage)
	{
		this.tagLanguage = tagLanguage;
	}
	
	/**
	 * 
	 */
	public Boolean isSizePageToContent()
	{
		return isSizePageToContent;
	}
	
	/**
	 * 
	 */
	public void setSizePageToContent(Boolean isSizePageToContent)
	{
		this.isSizePageToContent = isSizePageToContent;
	}
	
	/**
	 * 
	 */
	public PdfaConformanceEnum getPdfaConformance()
	{
		return pdfaConformance;
	}
	
	/**
	 * 
	 */
	public void setPdfaConformance(PdfaConformanceEnum pdfaConformance)
	{
		this.pdfaConformance = pdfaConformance;
	}
	
	/**
	 * 
	 */
	public String getIccProfilePath()
	{
		return iccProfilePath;
	}
	
	/**
	 * 
	 */
	public void setIccProfilePath(String iccProfilePath)
	{
		this.iccProfilePath = iccProfilePath;
	}
	
	/**
	 * 
	 */
	public Boolean isIgnoreHyperlink()
	{
		return isIgnoreHyperlink;
	}
	
	/**
	 * 
	 */
	public void setIgnoreHyperlink(Boolean isIgnoreHyperlink)
	{
		this.isIgnoreHyperlink = isIgnoreHyperlink;
	}
	
	/**
	 * 
	 */
	public Integer getPermissions()
	{
		return permissions;
	}
	
	/**
	 * 
	 */
	public void setPermissions(Integer permissions)
	{
		this.permissions = permissions;
	}
	
	/**
	 * 
	 */
	public String getMetadataTitle()
	{
		return metadataTitle;
	}
	
	/**
	 * 
	 */
	public void setMetadataTitle(String metadataTitle)
	{
		this.metadataTitle = metadataTitle;
	}
	
	/**
	 * 
	 */
	public String getMetadataAuthor()
	{
		return metadataAuthor;
	}
	
	/**
	 * 
	 */
	public void setMetadataAuthor(String metadataAuthor)
	{
		this.metadataAuthor = metadataAuthor;
	}
	
	/**
	 * 
	 */
	public String getMetadataSubject()
	{
		return metadataSubject;
	}
	
	/**
	 * 
	 */
	public void setMetadataSubject(String metadataSubject)
	{
		this.metadataSubject = metadataSubject;
	}
	
	/**
	 * 
	 */
	public String getMetadataKeywords()
	{
		return metadataKeywords;
	}
	
	/**
	 * 
	 */
	public void setMetadataKeywords(String metadataKeywords)
	{
		this.metadataKeywords = metadataKeywords;
	}
	
	/**
	 * 
	 */
	public String getMetadataCreator()
	{
		return metadataCreator;
	}
	
	/**
	 * 
	 */
	public void setMetadataCreator(String metadataCreator)
	{
		this.metadataCreator = metadataCreator;
	}
	
	/**
	 * 
	 */
	public Boolean isForceLineBreakPolicy()
	{
		return isForceLineBreakPolicy;
	}
	
	/**
	 * 
	 */
	public void setForceLineBreakPolicy(Boolean isForceLineBreakPolicy)
	{
		this.isForceLineBreakPolicy = isForceLineBreakPolicy;
	}
}
