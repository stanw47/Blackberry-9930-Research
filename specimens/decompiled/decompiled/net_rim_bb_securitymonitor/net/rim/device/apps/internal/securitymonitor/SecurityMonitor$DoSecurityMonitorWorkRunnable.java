// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_securitymonitor.cod
// Module version  : 7.1.0.1066
// Class ID        : 2
// ########################################################


package net.rim.device.apps.internal.securitymonitor;


abstract final class SecurityMonitor$DoSecurityMonitorWorkRunnable extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$DoSecurityMonitorWorkRunnable, java.lang.String[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


<init>( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$DoSecurityMonitorWorkRunnable, java.lang.String[], net.rim.device.apps.internal.securitymonitor.SecurityMonitor$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$DoSecurityMonitorWorkRunnable.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$DoSecurityMonitorWorkRunnable ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	bipush 2
	if_icmpne Label19
	invokestatic_lib net.rim.device.api.system.ApplicationRegistry getApplicationRegistry(  ) // ApplicationRegistry
	lipush 4540117967283091590
	invokevirtual java.lang.Object get( net.rim.device.api.system.ApplicationRegistry, long ) // pc=3
	checkcast SecurityMonitor$SecurityMonitorImpl
	astore_1 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	aaload 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	aaload 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.checkTimers // pc=3
	return 
Label19:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	bipush 3
	if_icmpne Label39
	invokestatic_lib net.rim.device.api.system.ApplicationRegistry getApplicationRegistry(  ) // ApplicationRegistry
	lipush 4540117967283091590
	invokevirtual java.lang.Object get( net.rim.device.api.system.ApplicationRegistry, long ) // pc=3
	checkcast SecurityMonitor$SecurityMonitorImpl
	astore_1 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	aaload 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	aaload 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 2
	aaload 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.cleanOrphanTransactionIds // pc=4
Label39:
	return 
	}

}
