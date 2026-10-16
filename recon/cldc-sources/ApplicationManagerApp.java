// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_app_manager.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.device.api.system;


abstract final class ApplicationManagerApp extends Object

{


	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.api.system.ApplicationManagerApp ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final main( java.lang.String[] ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.vm.Process currentProcess(  ) // Process
	pop 
	ldc literal_4:"Application Manager threw Out of Memory"
	astore_1 
	new_lib net.rim.vm.Process//net.rim.vm.Process net.rim.vm.Process net.rim.vm.Process
	dup 
	invokespecial_lib net.rim.device.api.system.ApplicationManagerImpl.<init> // pc=1
	pop 
	return 
	astore_2 
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore_3 
	aload_3 
	ifnonnull Label19
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
Label19:
	sipush 200
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_5:"Application Manager threw "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib catastrophicFailure( int, java.lang.String ) // InternalServices
	return 
	astore_3 
	sipush 200
	aload_1 
	invokestatic_lib catastrophicFailure( int, java.lang.String ) // InternalServices
	return 
	}

}
