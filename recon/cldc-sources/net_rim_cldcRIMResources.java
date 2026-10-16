// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_cldc.cod
// Module version  : 7.1.0.1066
// Class ID        : 85
// ########################################################


package com.rim.resources;


abstract public final class net_rim_cldcRIMResources extends net.rim.device.resources.Resource

{
	// @@@@@@@@@@@@@ Static fields 
	public static java.util.Hashtable /*java.util.Hashtable*/  _resources ; // ofs = 16612 addr = 187)
	public static java.util.Hashtable /*java.util.Hashtable*/  _properties ; // ofs = 16618 addr = 188)
	public static byte[] /*byte[]*/  _appFlags ; // ofs = 16624 addr = 189)
	public static byte[] /*byte[]*/  _appCount ; // ofs = 16630 addr = 190)
	public static byte[] /*byte[]*/  _resourceExtensions ; // ofs = 16636 addr = 191)
	public static byte[] /*byte[]*/  _version ; // ofs = 16642 addr = 192)
	public static byte[] /*byte[]*/  _description ; // ofs = 16648 addr = 193)
	public static byte[] /*byte[]*/  _vendor ; // ofs = 16654 addr = 194)
	public static int[] /*int[]*/  _securityVendorIds ; // ofs = 16660 addr = 195)
	public static byte[] /*byte[]*/  _securityDescriptions ; // ofs = 16666 addr = 196)
	public static byte[] /*byte[]*/  _securityKeys ; // ofs = 16672 addr = 197)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.rim.resources.net_rim_cldcRIMResources ); // address: 0
	{
	enter 
	aload_0 
	getstatic _resources // net_rim_cldcRIMResources
	getstatic _properties // net_rim_cldcRIMResources
	aconst_null 
	invokespecial_lib .routine_33541 // pc=4
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.resources.Resource//module:net_rim_cldc-35.class#76 module:net_rim_cldc-35.class#76 module:net_rim_cldc-35.class#76
	synch_static net_rim_cldcRIMResources
	clinit_wait 
	new Hashtable
	dup 
	bipush 83
	invokespecial java.util.Hashtable.<init> // pc=2
	putstatic _resources // net_rim_cldcRIMResources
	arrayinit [-30]
	putstatic _appFlags // net_rim_cldcRIMResources
	arrayinit [0]
	putstatic _appCount // net_rim_cldcRIMResources
	arrayinit [46, 112, 110, 103, 10, 46, 103, 105, 102, 10]
	putstatic _resourceExtensions // net_rim_cldcRIMResources
	arrayinit [0, 10, 55, 46, 49, 46, 48, 46, 49, 48, 54, 54]
	putstatic _version // net_rim_cldcRIMResources
	arrayinit [0, 16, 82, 73, 77, 32, 67, 76, 68, 67, 32, 76, 105, 98, 114, 97, 114, 121]
	putstatic _description // net_rim_cldcRIMResources
	arrayinit [0, 23, 82, 101, 115, 101, 97, 114, 99, 104, 32, 73, 110, 32, 77, 111, 116, 105, 111, 110, 32, 76, 116, 100, 46]
	putstatic _vendor // net_rim_cldcRIMResources
	arrayinit [51, 0, 0, 0, 82, 66, 66, 0, 82, 67, 73, 0, 82, 67, 82, 0, 82, 82, 84, 0]
	putstatic _securityVendorIds // net_rim_cldcRIMResources
	arrayinit [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	putstatic _securityDescriptions // net_rim_cldcRIMResources
	arrayinit [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	putstatic _securityKeys // net_rim_cldcRIMResources
	getstatic _resources // net_rim_cldcRIMResources
	invokestatic_lib module:net_rim_cldc-1.class#95.routine_53083(  ) // class#95
	clinit_return 
	}

}
