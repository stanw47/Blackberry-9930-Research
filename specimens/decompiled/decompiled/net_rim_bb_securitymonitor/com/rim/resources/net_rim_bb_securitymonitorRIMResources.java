// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_securitymonitor.cod
// Module version  : 7.1.0.1066
// Class ID        : 5
// ########################################################


package com.rim.resources;


abstract public final class net_rim_bb_securitymonitorRIMResources extends net.rim.device.resources.Resource

{
	// @@@@@@@@@@@@@ Static fields 
	public static java.util.Hashtable /*java.util.Hashtable*/  _resources ; // ofs = 2558 addr = 12)
	public static java.util.Hashtable /*java.util.Hashtable*/  _properties ; // ofs = 2564 addr = 13)
	public static byte[] /*byte[]*/  _appIcons ; // ofs = 2570 addr = 14)
	public static byte[] /*byte[]*/  _appExtIcons ; // ofs = 2576 addr = 15)
	public static byte[] /*byte[]*/  _appCount ; // ofs = 2582 addr = 16)
	public static byte[] /*byte[]*/  _resourceExtensions ; // ofs = 2588 addr = 17)
	public static byte[] /*byte[]*/  _appFlags ; // ofs = 2594 addr = 18)
	public static byte[] /*byte[]*/  _version ; // ofs = 2600 addr = 19)
	public static byte[] /*byte[]*/  _vendor ; // ofs = 2606 addr = 20)
	public static int[] /*int[]*/  _securityVendorIds ; // ofs = 2612 addr = 21)
	public static byte[] /*byte[]*/  _securityDescriptions ; // ofs = 2618 addr = 22)
	public static byte[] /*byte[]*/  _securityKeys ; // ofs = 2624 addr = 23)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.rim.resources.net_rim_bb_securitymonitorRIMResources ); // address: 0
	{
	enter 
	aload_0 
	getstatic _resources // net_rim_bb_securitymonitorRIMResources
	getstatic _properties // net_rim_bb_securitymonitorRIMResources
	getstatic _appIcons // net_rim_bb_securitymonitorRIMResources
	invokespecial_lib net.rim.device.resources.Resource.<init> // pc=4
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.util.Persistable//net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable
	synch_static net_rim_bb_securitymonitorRIMResources
	clinit_wait 
	new_lib net.rim.device.resources.Resource//net.rim.device.resources.Resource net.rim.device.resources.Resource net.rim.device.resources.Resource
	dup 
	bipush 6
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putstatic _resources // net_rim_bb_securitymonitorRIMResources
	arrayinit [1]
	putstatic _appCount // net_rim_bb_securitymonitorRIMResources
	arrayinit [46, 116, 120, 116, 10]
	putstatic _resourceExtensions // net_rim_bb_securitymonitorRIMResources
	arrayinit [0, 0]
	putstatic _appIcons // net_rim_bb_securitymonitorRIMResources
	arrayinit [0, 0]
	putstatic _appExtIcons // net_rim_bb_securitymonitorRIMResources
	arrayinit [67]
	putstatic _appFlags // net_rim_bb_securitymonitorRIMResources
	arrayinit [0, 10, 55, 46, 49, 46, 48, 46, 49, 48, 54, 54]
	putstatic _version // net_rim_bb_securitymonitorRIMResources
	arrayinit [0, 23, 82, 101, 115, 101, 97, 114, 99, 104, 32, 73, 110, 32, 77, 111, 116, 105, 111, 110, 32, 76, 116, 100, 46]
	putstatic _vendor // net_rim_bb_securitymonitorRIMResources
	arrayinit [51, 0, 0, 0]
	putstatic _securityVendorIds // net_rim_bb_securitymonitorRIMResources
	arrayinit [0, 0]
	putstatic _securityDescriptions // net_rim_bb_securitymonitorRIMResources
	arrayinit [0, 0]
	putstatic _securityKeys // net_rim_bb_securitymonitorRIMResources
	getstatic _resources // net_rim_bb_securitymonitorRIMResources
	invokestatic populate( java.util.Hashtable ) // net_rim_bb_securitymonitorRIMResourcesPopulator0
	clinit_return 
	}

}
