// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_sprint_dss_lib.cod
// Module version  : 7.1.0.1066
// Class ID        : 1
// ########################################################


package net.rim.device.custom.sprint.dss;


public class DSSNotInstalledException extends Exception

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.custom.sprint.dss.DSSNotInstalledException ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_5:"DSS client is not installed"
	invokespecial_lib java.lang.Exception.<init> // pc=2
	return 
	}

}
