// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_sprint_dss_lib.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.device.custom.sprint.dss.lib;


public class DSSClientAPI extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.device.apps.api.framework.registration.VerbFactory /*net.rim.device.apps.api.framework.registration.VerbFactory*/  _verbFactory ; // ofs = 944 addr = 2)


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.custom.sprint.dss.lib.DSSClientAPI ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public boolean setRadioMode( short ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	iload_0 
	iconst_1 
	if_icmpeq Label9
	iload_0 
	bipush 2
	if_icmpne Label40
Label9:
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_2 
	aload_2 
	lipush 8638011710704339547
	bipush 2
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_2 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 7
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	lipush -8544217552895501449
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	iload_0 
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	invokestatic boolean setValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	istore_1 
	iload_1 
	ireturn 
	astore_3 
	aload_3 
	athrow 
Label40:
	iload_1 
	ireturn 
	}


static public int getRadioMode(  ); // address: 0
	{
	enter 
	bipush -1
	istore_0 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_1 
	aload_1 
	lipush 8638011710704339547
	bipush 3
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_1 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 7
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_1 
	invokestatic java.lang.Object getValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	astore_2 
	aload_2 
	checkcastbranch_lib 
	invokevirtual short shortValue( java.lang.Short ) // pc=1
	istore_0 
	iload_0 
	ireturn 
	astore_2 
	aload_2 
	athrow 
Label30:
	iload_0 
	ireturn 
	}


static public boolean setSlotOneEnabled( boolean ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_2 
	aload_2 
	lipush 8638011710704339547
	bipush 2
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_2 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 8
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	lipush -1295277558294898759
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	iload_0 
	invokespecial_lib java.lang.Boolean.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	invokestatic boolean setValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	ireturn 
	astore_3 
	aload_3 
	athrow 
	}


static public boolean isSlotOneEnabled(  ); // address: 0
	{
	enter 
	iconst_0 
	istore_0 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_1 
	aload_1 
	lipush 8638011710704339547
	bipush 3
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_1 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 8
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_1 
	invokestatic java.lang.Object getValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	astore_2 
	aload_2 
	checkcastbranch_lib 
	invokevirtual boolean booleanValue( java.lang.Boolean ) // pc=1
	istore_0 
	iload_0 
	ireturn 
	astore_2 
	aload_2 
	athrow 
Label30:
	iload_0 
	ireturn 
	}


static public boolean setServerURL( java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_2 
	aload_2 
	lipush 8638011710704339547
	bipush 2
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_2 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 4
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	lipush 7632596723461518189
	aload_0 
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	invokestatic boolean setValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	ireturn 
	astore_3 
	aload_3 
	athrow 
	}


static public java.lang.String getServerURL(  ); // address: 0
	{
	enter 
	aconst_null 
	astore_0 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_1 
	aload_1 
	lipush 8638011710704339547
	bipush 3
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_1 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 4
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_1 
	invokestatic java.lang.Object getValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_0 
	aload_0 
	areturn 
	astore_2 
	aload_2 
	athrow 
Label29:
	aload_0 
	areturn 
	}


static public boolean setIP( java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_2 
	aload_2 
	lipush 8638011710704339547
	bipush 2
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_2 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 5
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	lipush -300891971064428130
	aload_0 
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	invokestatic boolean setValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	ireturn 
	astore_3 
	aload_3 
	athrow 
	}


static public java.lang.String getIP(  ); // address: 0
	{
	enter 
	aconst_null 
	astore_0 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_1 
	aload_1 
	lipush 8638011710704339547
	bipush 3
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_1 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 5
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_1 
	invokestatic java.lang.Object getValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_0 
	aload_0 
	areturn 
	astore_2 
	aload_2 
	athrow 
Label29:
	aload_0 
	areturn 
	}


static public boolean setPort( int ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_2 
	aload_2 
	lipush 8638011710704339547
	bipush 2
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_2 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 6
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	lipush 6239210832703115299
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iload_0 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_2 
	invokestatic boolean setValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	ireturn 
	astore_3 
	aload_3 
	athrow 
	}


static public int getPort(  ); // address: 0
	{
	enter 
	bipush -1
	istore_0 
	aconst_null 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject castOrCreate( java.lang.Object ) // ContextObject
	astore_1 
	aload_1 
	lipush 8638011710704339547
	bipush 3
	invokevirtual setPrivateFlag( net.rim.device.apps.api.framework.model.ContextObject, long, int ) // pc=4
	aload_1 
	lipush -2020136226723638984
	new_lib Short//java.lang.Short java.lang.Short java.lang.Short
	dup 
	bipush 6
	invokespecial_lib java.lang.Short.<init> // pc=2
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	aload_1 
	invokestatic java.lang.Object getValue( net.rim.device.apps.api.framework.model.ContextObject ) // DSSClientAPI
	astore_2 
	aload_2 
	checkcastbranch_lib 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	istore_0 
	iload_0 
	ireturn 
	astore_2 
	aload_2 
	athrow 
Label30:
	iload_0 
	ireturn 
	}


static public boolean isDSSClientInstalled(  ); // address: 0
	{
	enter_narrow 
	getstatic _verbFactory // DSSClientAPI
	ifnonnull Label8
	invokestatic_lib net.rim.device.api.system.ApplicationRegistry getApplicationRegistry(  ) // ApplicationRegistry
	lipush 8638011710704339547
	invokevirtual java.lang.Object get( net.rim.device.api.system.ApplicationRegistry, long ) // pc=3
	checkcast_lib net.rim.device.apps.api.framework.registration.VerbFactory//net.rim.device.apps.api.framework.registration.VerbFactory net.rim.device.apps.api.framework.registration.VerbFactory net.rim.device.apps.api.framework.registration.VerbFactory
	putstatic _verbFactory // DSSClientAPI
Label8:
	getstatic _verbFactory // DSSClientAPI
	ifnull Label12
	iconst_1 
	ireturn 
Label12:
	iconst_0 
	ireturn 
	}


static private boolean setValue( net.rim.device.apps.api.framework.model.ContextObject ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aload_0 
	invokestatic net.rim.device.apps.api.framework.verb.Verb getSearchVerb( java.lang.Object ) // DSSClientAPI
	astore_2 
	aload_2 
	ifnonnull Label12
	new DSSNotInstalledException
	dup 
	invokespecial net.rim.device.custom.sprint.dss.DSSNotInstalledException.<init> // pc=1
	athrow 
Label12:
	aload_2 
	aload_0 
	invokevirtual java.lang.Object invoke( net.rim.device.apps.api.framework.verb.Verb, java.lang.Object ) // pc=2
	astore_3 
	aload_3 
	checkcastbranch_lib 
	invokevirtual boolean booleanValue( java.lang.Boolean ) // pc=1
	istore_1 
Label20:
	iload_1 
	ireturn 
	}


static private java.lang.Object getValue( net.rim.device.apps.api.framework.model.ContextObject ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic net.rim.device.apps.api.framework.verb.Verb getSearchVerb( java.lang.Object ) // DSSClientAPI
	astore_1 
	aload_1 
	ifnonnull Label10
	new DSSNotInstalledException
	dup 
	invokespecial net.rim.device.custom.sprint.dss.DSSNotInstalledException.<init> // pc=1
	athrow 
Label10:
	aload_1 
	aload_0 
	invokevirtual java.lang.Object invoke( net.rim.device.apps.api.framework.verb.Verb, java.lang.Object ) // pc=2
	areturn 
	}


static private net.rim.device.apps.api.framework.verb.Verb getSearchVerb( java.lang.Object ); // address: 0
	{
	enter_narrow 
	getstatic _verbFactory // DSSClientAPI
	ifnonnull Label8
	invokestatic_lib net.rim.device.api.system.ApplicationRegistry getApplicationRegistry(  ) // ApplicationRegistry
	lipush 8638011710704339547
	invokevirtual java.lang.Object get( net.rim.device.api.system.ApplicationRegistry, long ) // pc=3
	checkcast_lib net.rim.device.apps.api.framework.registration.VerbFactory//net.rim.device.apps.api.framework.registration.VerbFactory net.rim.device.apps.api.framework.registration.VerbFactory net.rim.device.apps.api.framework.registration.VerbFactory
	putstatic _verbFactory // DSSClientAPI
Label8:
	aconst_null 
	astore_1 
	getstatic _verbFactory // DSSClientAPI
	ifnull Label25
	getstatic _verbFactory // DSSClientAPI
	aload_0 
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	astore_2 
	aload_2 
	ifnull Label25
	aload_2 
	arraylength 
	ifle Label25
	aload_2 
	iconst_0 
	aaload 
	astore_1 
Label25:
	aload_1 
	areturn 
	}

}
