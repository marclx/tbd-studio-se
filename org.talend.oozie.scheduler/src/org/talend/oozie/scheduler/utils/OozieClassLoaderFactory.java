// ============================================================================
//
// Copyright (C) 2006-2013 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.oozie.scheduler.utils;

import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.designer.hdfsbrowse.manager.HadoopClassLoaderFactory;

/**
 * DOC ycbai class global comment. Detailled comment
 */
public class OozieClassLoaderFactory {

    public static ClassLoader getClassLoader() {
        ClassLoader classLoader = null;

        String distributionValue = TOozieParamUtils.getParamValue(ITalendCorePrefConstants.OOZIE_SHCEDULER_HADOOP_DISTRIBUTION);
        String versionValue = TOozieParamUtils.getParamValue(ITalendCorePrefConstants.OOZIE_SHCEDULER_HADOOP_VERSION);

        classLoader = HadoopClassLoaderFactory.getClassLoader(distributionValue, versionValue);

        if (classLoader == null) {
            classLoader = OozieClassLoaderFactory.class.getClassLoader();
        }
        return classLoader;
    }

}
