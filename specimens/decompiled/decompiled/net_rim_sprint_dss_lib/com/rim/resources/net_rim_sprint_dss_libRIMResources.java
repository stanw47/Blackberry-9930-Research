// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_sprint_dss_lib.cod
// Module version  : 7.1.0.1066
// Class ID        : 2
// ########################################################


package com.rim.resources;


abstract public final class net_rim_sprint_dss_libRIMResources extends net.rim.device.resources.Resource

{
	// @@@@@@@@@@@@@ Static fields 
	public static java.util.Hashtable /*java.util.Hashtable*/  _resources ; // ofs = 1038 addr = 7)
	public static java.util.Hashtable /*java.util.Hashtable*/  _properties ; // ofs = 1044 addr = 8)
	public static byte[] /*byte[]*/  _appFlags ; // ofs = 1050 addr = 9)
	public static byte[] /*byte[]*/  _appCount ; // ofs = 1056 addr = 10)
	public static byte[] /*byte[]*/  _resourceExtensions ; // ofs = 1062 addr = 11)
	public static byte[] /*byte[]*/  _version ; // ofs = 1068 addr = 12)
	public static byte[] /*byte[]*/  _vendor ; // ofs = 1074 addr = 13)
	public static int[] /*int[]*/  _securityVendorIds ; // ofs = 1080 addr = 14)
	public static byte[] /*byte[]*/  _securityDescriptions ; // ofs = 1086 addr = 15)
	public static byte[] /*byte[]*/  _securityKeys ; // ofs = 1092 addr = 16)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.rim.resources.net_rim_sprint_dss_libRIMResources ); // address: 0
	{
	enter 
	aload_0 
	getstatic _resources // net_rim_sprint_dss_libRIMResources
	getstatic _properties // net_rim_sprint_dss_libRIMResources
	aconst_null 
	invokespecial_lib net.rim.device.resources.Resource.<init> // pc=4
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.resources.Resource//net.rim.device.resources.Resource net.rim.device.resources.Resource net.rim.device.resources.Resource
	synch_static net_rim_sprint_dss_libRIMResources
	clinit_wait 
	arrayinit [2]
	putstatic _appFlags // net_rim_sprint_dss_libRIMResources
	arrayinit [0]
	putstatic _appCount // net_rim_sprint_dss_libRIMResources
	arrayinit []
	putstatic _resourceExtensions // net_rim_sprint_dss_libRIMResources
	arrayinit [0, 10, 55, 46, 49, 46, 48, 46, 49, 48, 54, 54]
	putstatic _version // net_rim_sprint_dss_libRIMResources
	arrayinit [0, 23, 82, 101, 115, 101, 97, 114, 99, 104, 32, 73, 110, 32, 77, 111, 116, 105, 111, 110, 32, 76, 116, 100, 46]
	putstatic _vendor // net_rim_sprint_dss_libRIMResources
	arrayinit [51, 0, 0, 0]
	putstatic _securityVendorIds // net_rim_sprint_dss_libRIMResources
	arrayinit [0, 0]
	putstatic _securityDescriptions // net_rim_sprint_dss_libRIMResources
	arrayinit [0, 0]
	putstatic _securityKeys // net_rim_sprint_dss_libRIMResources
	clinit_return 
	}

}
