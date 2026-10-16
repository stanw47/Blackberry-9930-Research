// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_app_manager.cod
// Module version  : 7.1.0.1066
// Class ID        : 1
// ########################################################


package com.rim.resources;


abstract public final class net_rim_app_managerRIMResources extends net.rim.device.resources.Resource

{
	// @@@@@@@@@@@@@ Static fields 
	public static java.util.Hashtable /*java.util.Hashtable*/  _resources ; // ofs = 778 addr = 4)
	public static java.util.Hashtable /*java.util.Hashtable*/  _properties ; // ofs = 784 addr = 5)
	public static byte[] /*byte[]*/  _appIcons ; // ofs = 790 addr = 6)
	public static byte[] /*byte[]*/  _appExtIcons ; // ofs = 796 addr = 7)
	public static byte[] /*byte[]*/  _appCount ; // ofs = 802 addr = 8)
	public static byte[] /*byte[]*/  _resourceExtensions ; // ofs = 808 addr = 9)
	public static byte[] /*byte[]*/  _appNames ; // ofs = 814 addr = 10)
	public static byte[] /*byte[]*/  _appFlags ; // ofs = 820 addr = 11)
	public static byte[] /*byte[]*/  _version ; // ofs = 826 addr = 12)
	public static byte[] /*byte[]*/  _vendor ; // ofs = 832 addr = 13)
	public static int[] /*int[]*/  _securityVendorIds ; // ofs = 838 addr = 14)
	public static byte[] /*byte[]*/  _securityDescriptions ; // ofs = 844 addr = 15)
	public static byte[] /*byte[]*/  _securityKeys ; // ofs = 850 addr = 16)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.rim.resources.net_rim_app_managerRIMResources ); // address: 0
	{
	enter 
	aload_0 
	getstatic _resources // net_rim_app_managerRIMResources
	getstatic _properties // net_rim_app_managerRIMResources
	getstatic _appIcons // net_rim_app_managerRIMResources
	invokespecial_lib net.rim.device.resources.Resource.<init> // pc=4
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	synch_static net_rim_app_managerRIMResources
	clinit_wait 
	arrayinit [1]
	putstatic _appCount // net_rim_app_managerRIMResources
	arrayinit []
	putstatic _resourceExtensions // net_rim_app_managerRIMResources
	arrayinit [0, 15, 82, 73, 77, 32, 65, 112, 112, 32, 77, 97, 110, 97, 103, 101, 114]
	putstatic _appNames // net_rim_app_managerRIMResources
	arrayinit [0, 0]
	putstatic _appIcons // net_rim_app_managerRIMResources
	arrayinit [0, 0]
	putstatic _appExtIcons // net_rim_app_managerRIMResources
	arrayinit [2]
	putstatic _appFlags // net_rim_app_managerRIMResources
	arrayinit [0, 10, 55, 46, 49, 46, 48, 46, 49, 48, 54, 54]
	putstatic _version // net_rim_app_managerRIMResources
	arrayinit [0, 23, 82, 101, 115, 101, 97, 114, 99, 104, 32, 73, 110, 32, 77, 111, 116, 105, 111, 110, 32, 76, 116, 100, 46]
	putstatic _vendor // net_rim_app_managerRIMResources
	arrayinit [51, 0, 0, 0]
	putstatic _securityVendorIds // net_rim_app_managerRIMResources
	arrayinit [0, 0]
	putstatic _securityDescriptions // net_rim_app_managerRIMResources
	arrayinit [0, 0]
	putstatic _securityKeys // net_rim_app_managerRIMResources
	clinit_return 
	}

}
