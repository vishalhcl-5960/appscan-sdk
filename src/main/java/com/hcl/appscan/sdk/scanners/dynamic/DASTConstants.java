/**
 * © Copyright IBM Corporation 2016.
 * © Copyright HCL Technologies Ltd. 2017, 2024.
 * LICENSE: Apache License, Version 2.0 https://www.apache.org/licenses/LICENSE-2.0
 */

package com.hcl.appscan.sdk.scanners.dynamic;

public interface DASTConstants {

	String DAST							= "Dynamic Analyzer";				//$NON-NLS-1$
	String DYNAMIC_ANALYZER 			= "Dast";				//$NON-NLS-1$
	String DYNAMIC_ANALYZER_WITH_FILE	= "DynamicAnalyzerWithFile";		//$NON-NLS-1$
	String SCAN_FILE					= "ScanFile";						//$NON-NLS-1$
	String SCAN_FILE_ID					= "ScanOrTemplateFileId";						//$NON-NLS-1$
	String PRESENCE_ID					= "PresenceId";						//$NON-NLS-1$
	String STARTING_URL					= "StartingUrl";					//$NON-NLS-1$
	String TRAFFIC_FILE                 = "trafficFile";
	String TRAFFIC_FILE_ID              = "LoginSequenceFileId";
	String LOGIN_TYPE                   = "LoginType";
    	String SCAN_EXTENSION               = "scan";                          //$NON-NLS-1$
    	String SCANT_EXTENSION              = "scant";                         //$NON-NLS-1$
    	String CONFIG_EXTENSION             = "config";                        //$NON-NLS-1$
	String SCAN_CONFIGURATION	    = "ScanConfiguration";	       //$NON-NLS-1$
	String TARGET			    = "Target";			       //$NON-NLS-1$
	String TESTS			    = "Tests";			       //$NON-NLS-1$
	String LOGIN			    = "Login";			       //$NON-NLS-1$
	String AUTOMATIC		    = "Automatic";		       //$NON-NLS-1$
	String LOGIN_USER		    = "LoginUser";		       //$NON-NLS-1$
	String LOGIN_PASSWORD		    = "LoginPassword";		       //$NON-NLS-1$
	String TEST_OPTIMIZATION_LEVEL	    = "TestOptimizationLevel";	       //$NON-NLS-1$
	String USER_NAME		    = "UserName";		       //$NON-NLS-1$
	String PASSWORD			    = "Password";		       //$NON-NLS-1$
  	String EXTRA_FIELD		    = "ExtraField";		       //$NON-NLS-1$
	//Errors
	String ERROR_SUBMITTING_SCAN		= "error.submitting.scan";			//$NON-NLS-1$
}
