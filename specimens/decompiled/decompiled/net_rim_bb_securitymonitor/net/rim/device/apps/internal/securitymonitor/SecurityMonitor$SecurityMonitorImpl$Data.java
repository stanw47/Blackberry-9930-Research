// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_securitymonitor.cod
// Module version  : 7.1.0.1066
// Class ID        : 4
// ########################################################


package net.rim.device.apps.internal.securitymonitor;


abstract final class SecurityMonitor$SecurityMonitorImpl$Data extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl$Data ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	bipush -1
	i2l 
	lputfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	new_lib net.rim.device.api.util.DataBuffer//net.rim.device.api.util.DataBuffer net.rim.device.api.util.DataBuffer net.rim.device.api.util.DataBuffer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
	}


<init>( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl$Data, net.rim.device.apps.internal.securitymonitor.SecurityMonitor$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl$Data.<init> // pc=1
	return 
	}

}
