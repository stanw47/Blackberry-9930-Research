// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_securitymonitor.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.device.apps.internal.securitymonitor;


abstract final class SecurityMonitor extends net.rim.device.api.system.Application

{


	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.apps.internal.securitymonitor.SecurityMonitor ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.device.api.system.Application )
	}


static public final main( java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	arraylength 
	ifne Label17
	new SecurityMonitor$SecurityMonitorImpl
	dup 
	aconst_null 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.<init> // pc=2
	astore_1 
	invokestatic_lib net.rim.device.api.system.ApplicationRegistry getApplicationRegistry(  ) // ApplicationRegistry
	lipush 4540117967283091590
	aload_1 
	invokevirtual put( net.rim.device.api.system.ApplicationRegistry, long, java.lang.Object ) // pc=4
	invokestatic_lib net.rim.device.internal.services.runtime.ServiceStartup getInstance(  ) // ServiceStartup
	bipush 4
	invokevirtual registerCriticalService( net.rim.device.internal.services.runtime.ServiceStartup, int ) // pc=2
	return 
Label17:
	aload_0 
	arraylength 
	bipush 2
	if_icmpeq Label25
	aload_0 
	arraylength 
	bipush 3
	if_icmpne Label32
Label25:
	invokestatic_lib net.rim.device.internal.proxy.Proxy getInstance(  ) // Proxy
	new SecurityMonitor$DoSecurityMonitorWorkRunnable
	dup 
	aload_0 
	aconst_null 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$DoSecurityMonitorWorkRunnable.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.internal.proxy.Proxy, java.lang.Runnable ) // pc=2
Label32:
	return 
	}

}
