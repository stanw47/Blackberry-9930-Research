// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_cldc-6.cod
// Module version  : 7.1.0.1066
// Class ID        : 62
// ########################################################


package net.rim.device.api.crypto;


public class MIDletSecurityCrypto extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	protected static String /*module:net_rim_cldc.class#78*/  CURVE_NAME ; // ofs = 18354 addr = 153)
	private static net.rim.device.api.system.PersistentObject /*module:net_rim_cldc.class#67*/  _persist ; // ofs = 18360 addr = 154)
	private static java.util.Hashtable /*module:net_rim_cldc.class#36*/  _hashtable ; // ofs = 18366 addr = 155)
	private static int /*int*/  _moduleHandle ; // ofs = 18372 addr = 156)
	private static byte[] /*byte[]*/  _moduleHash ; // ofs = 18378 addr = 157)
	private static net.rim.device.internal.util.ByteArray /*module:net_rim_cldc-1.class#5*/  _moduleHashByteArray ; // ofs = 18384 addr = 158)
	private static net.rim.device.api.crypto.MIDletSecurityCrypto /*net.rim.device.api.crypto.MIDletSecurityCrypto*/  _impl ; // ofs = 18390 addr = 159)


	// @@@@@@@@@@@@@ Static routines 

static private module:net_rim_cldc.class#36 sanitizeSettingsStoreIfNecessary( module:net_rim_cldc.class#36 ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label8
	new_lib java.util.Hashtable//module:net_rim_cldc.class#36 module:net_rim_cldc.class#36 module:net_rim_cldc.class#36
	dup 
	bipush 41
	invokespecial_lib .routine_25637 // pc=2
	areturn 
Label8:
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23041(  ) // class#34
	astore_1 
	aload_1 
	arraylength 
	istore_2 
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iload_2 
	if_icmple Label60
	new_lib java.util.Hashtable//module:net_rim_cldc.class#36 module:net_rim_cldc.class#36 module:net_rim_cldc.class#36
	dup 
	bipush 89
	invokespecial_lib .routine_25637 // pc=2
	astore_3 
	iconst_0 
	istore_4 
Label24:
	iload_4 
	iload_2 
	if_icmpge Label58
	aload_1 
	iload_4 
	iaload 
	istore_5 
	iload_5 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23634(  ) // class#34
	ifeq Label56
	iload_5 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23451(  ) // class#34
	astore_6 
	new_lib net.rim.device.internal.util.ByteArray//module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5
	dup 
	aload_6 
	invokespecial_lib .routine_1583 // pc=2
	astore_7 
	aload_0 
	aload_7 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	checkcast_array 1 2
	astore 8
	aload 8
	ifnull Label56
	aload_3 
	aload_7 
	aload 8
	invokevirtual_short .virtual_13 // idx=13 pc=3
	pop 
	goto Label56
	astore_6 
Label56:
	iinc 4 1
	goto Label24
Label58:
	aload_3 
	areturn 
Label60:
	aload_0 
	areturn 
	}


protected <init>( net.rim.device.api.crypto.MIDletSecurityCrypto ); // address: 0
	{
	jumpspecial_lib .routine_42329(  )
	}


static public final int checkMIDletSignature( net.rim.device.api.crypto.Digest, module:net_rim_cldc.class#78, module:net_rim_cldc.class#78[], byte[], byte[] ); // address: 0
	{
	enter 
	getstatic _impl // MIDletSecurityCrypto
	ifnonnull Label7
	iipush 1111716473
	invokestatic logEvent( int ) // MIDletSecurityCrypto
	bipush 5
	ireturn 
Label7:
	getstatic _impl // MIDletSecurityCrypto
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	invokevirtual .virtual_3(  ) // pc=6
	ireturn 
	}


static public final net.rim.device.api.crypto.Digest getMIDletSignatureDigest(  ); // address: 0
	{
	enter_narrow 
	new SHA1Digest
	dup 
	invokespecial net.rim.device.api.crypto.SHA1Digest.<init> // pc=1
	areturn 
	}


static public final byte[] signMIDletTrailer( byte[], byte[] ); // address: 0
	{
	enter_narrow 
	getstatic _impl // MIDletSecurityCrypto
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	getstatic _impl // MIDletSecurityCrypto
	aload_0 
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=3
	areturn 
	}


static public final int checkJADCertChain( module:net_rim_cldc.class#78[] ); // address: 0
	{
	enter_narrow 
	getstatic _impl // MIDletSecurityCrypto
	ifnonnull Label7
	iipush 1111716473
	invokestatic logEvent( int ) // MIDletSecurityCrypto
	bipush 5
	ireturn 
Label7:
	getstatic _impl // MIDletSecurityCrypto
	aload_0 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	ireturn 
	}


static public final int getJADCertInfo( module:net_rim_cldc.class#78, module:net_rim_cldc.class#36 ); // address: 0
	{
	enter_narrow 
	getstatic _impl // MIDletSecurityCrypto
	ifnonnull Label7
	iipush 1111716473
	invokestatic logEvent( int ) // MIDletSecurityCrypto
	bipush 5
	ireturn 
Label7:
	getstatic _impl // MIDletSecurityCrypto
	aload_0 
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=3
	ireturn 
	}


static public final int verifyMIDletTrailer( byte[] ); // address: 0
	{
	enter_narrow 
	getstatic _moduleHandle // MIDletSecurityCrypto
	ifne Label5
	bipush 2
	ireturn 
Label5:
	getstatic _moduleHandle // MIDletSecurityCrypto
	bipush 51
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifne Label13
	getstatic _moduleHandle // MIDletSecurityCrypto
	iipush 4342354
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifeq Label15
Label13:
	bipush 3
	ireturn 
Label15:
	getstatic _moduleHandle // MIDletSecurityCrypto
	iipush 1346652493
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23490(  ) // class#34
	astore_1 
	getstatic _moduleHandle // MIDletSecurityCrypto
	bipush 2
	iconst_0 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24842(  ) // class#34
	astore_2 
	aload_1 
	ifnonnull Label30
	aload_2 
	ifnonnull Label30
	iconst_1 
	ireturn 
Label30:
	getstatic _moduleHash // MIDletSecurityCrypto
	aload_2 
	aload_1 
	invokestatic boolean verify( byte[], byte[], byte[] ) // MIDletSecurityCrypto
	ifne Label37
	bipush 2
	ireturn 
Label37:
	aload_0 
	ifnull Label42
	aload_2 
	aload_0 
	invokestatic_lib module:net_rim_cldc-30.class#41.routine_32146(  ) // class#41
Label42:
	iconst_0 
	ireturn 
	}


static public final int verifyMIDletTrailer( int, byte[] ); // address: 0
	{
	enter 
	iload_0 
	ifne Label5
	bipush 2
	ireturn 
Label5:
	iload_0 
	bipush 51
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifne Label13
	iload_0 
	iipush 4342354
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifeq Label15
Label13:
	bipush 3
	ireturn 
Label15:
	iload_0 
	iipush 1346652493
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23490(  ) // class#34
	astore_2 
	iload_0 
	bipush 2
	iconst_0 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24842(  ) // class#34
	astore_3 
	aload_2 
	ifnonnull Label30
	aload_3 
	ifnonnull Label30
	iconst_1 
	ireturn 
Label30:
	iload_0 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23451(  ) // class#34
	astore_4 
	aload_4 
	aload_3 
	aload_2 
	invokestatic boolean verify( byte[], byte[], byte[] ) // MIDletSecurityCrypto
	ifne Label40
	bipush 2
	ireturn 
Label40:
	aload_1 
	ifnull Label45
	aload_3 
	aload_1 
	invokestatic_lib module:net_rim_cldc-30.class#41.routine_32146(  ) // class#41
Label45:
	iconst_0 
	ireturn 
	}


static private boolean verify( byte[], byte[], byte[] ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label7
	aload_1 
	ifnull Label7
	aload_2 
	ifnonnull Label9
Label7:
	iconst_0 
	ireturn 
Label9:
	aload_0 
	arraylength 
	bipush 20
	if_icmpeq Label15
	iconst_0 
	ireturn 
Label15:
	new SHA1Digest
	dup 
	invokespecial net.rim.device.api.crypto.SHA1Digest.<init> // pc=1
	astore_3 
	aload_3 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_3 
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=2
	new_lib net.rim.device.api.util.DataBuffer//module:net_rim_cldc.class#25 module:net_rim_cldc.class#25 module:net_rim_cldc.class#25
	dup 
	aload_2 
	iconst_0 
	aload_2 
	arraylength 
	iconst_1 
	invokespecial_lib .routine_19151 // pc=5
	astore_4 
	aload_4 
	iconst_1 
	invokestatic_lib module:net_rim_cldc-23.class#128.routine_38332(  ) // class#128
	astore_5 
	aload_4 
	bipush 2
	invokestatic_lib module:net_rim_cldc-23.class#128.routine_38332(  ) // class#128
	astore_6 
	bipush 23
	invokestatic_lib module:net_rim_cldc-30.class#60.routine_37778(  ) // class#60
	astore_7 
	aload_7 
	ifnonnull Label49
	iconst_0 
	ireturn 
Label49:
	getstatic CURVE_NAME // MIDletSecurityCrypto
	aload_7 
	aload_3 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	aload_5 
	aload_6 
	invokestatic boolean verifyDSA( module:net_rim_cldc.class#78, byte[], byte[], byte[], byte[] ) // NativeEC
	ireturn 
	astore_4 
	new_lib RuntimeException//module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79
	dup 
	invokespecial_lib .routine_39675 // pc=1
	athrow 
	}


static public final byte[] fetchStoredSettings(  ); // address: 0
	{
	enter_narrow 
	getstatic _hashtable // MIDletSecurityCrypto
	getstatic _moduleHashByteArray // MIDletSecurityCrypto
	invokevirtual_short .virtual_11 // idx=11 pc=2
	checkcast_array 1 2
	areturn 
	}


static public final byte[] fetchStoredSettings( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23634(  ) // class#34
	ifeq Label17
	iload_0 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23451(  ) // class#34
	astore_1 
	new_lib net.rim.device.internal.util.ByteArray//module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5
	dup 
	aload_1 
	invokespecial_lib .routine_1583 // pc=2
	astore_2 
	getstatic _hashtable // MIDletSecurityCrypto
	aload_2 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	checkcast_array 1 2
	areturn 
Label17:
	aconst_null 
	areturn 
	}


static public final updateStoredSettings( byte[] ); // address: 0
	{
	enter_narrow 
	getstatic _hashtable // MIDletSecurityCrypto
	getstatic _moduleHashByteArray // MIDletSecurityCrypto
	aload_0 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	pop 
	getstatic _persist // MIDletSecurityCrypto
	invokevirtual_short .virtual_3 // idx=3 pc=1
	return 
	}


static public final updateStoredSettings( int, byte[] ); // address: 0
	{
	enter 
	iload_0 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23634(  ) // class#34
	ifeq Label19
	iload_0 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23451(  ) // class#34
	astore_2 
	new_lib net.rim.device.internal.util.ByteArray//module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5
	dup 
	aload_2 
	invokespecial_lib .routine_1583 // pc=2
	astore_3 
	getstatic _hashtable // MIDletSecurityCrypto
	aload_3 
	aload_1 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	pop 
	getstatic _persist // MIDletSecurityCrypto
	invokevirtual_short .virtual_3 // idx=3 pc=1
Label19:
	return 
	}


static public final boolean checkDRMTrailer(  ); // address: 0
	{
	enter_narrow 
	getstatic _moduleHandle // MIDletSecurityCrypto
	invokestatic_lib module:net_rim_cldc-30.class#1.routine_2067(  ) // class#1
	ireturn 
	}


static public logEvent( int ); // address: 0
	{
	enter_narrow 
	lipush -1500249857606919096
	iload_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15394(  ) // class#27
	pop 
	return 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	synch_static MIDletSecurityCrypto
	clinit_wait 
	ldc literal_984:"EC163K1"
	putstatic CURVE_NAME // MIDletSecurityCrypto
	ldc literal_985:"net.rim.device.api.crypto.MIDletSecurityCryptoImpl"
	invokestatic_lib module:net_rim_cldc-2.class#9.routine_2720(  ) // class#9
	astore_0 
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	checkcast MIDletSecurityCrypto
	putstatic _impl // MIDletSecurityCrypto
	lipush -1500249857606919096
	ldc literal_986:"MIDletSecurity"
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_13585(  ) // class#27
	pop 
	goto Label21
	astore_0 
	goto Label21
	astore_0 
Label21:
	lipush 8257156306518465173
	invokestatic_lib module:net_rim_cldc.class#71.routine_43937(  ) // class#71
	putstatic _persist // MIDletSecurityCrypto
	invokestatic_lib module:net_rim_cldc-11.class#9.routine_21971(  ) // class#9
	astore_0 
	aload_0 
	lipush -1535600215457087636
	invokevirtual_short .virtual_4 // idx=4 pc=3
	checkcast_lib java.util.Hashtable//module:net_rim_cldc.class#36 module:net_rim_cldc.class#36 module:net_rim_cldc.class#36
	putstatic _hashtable // MIDletSecurityCrypto
	getstatic _hashtable // MIDletSecurityCrypto
	ifnonnull Label53
	getstatic _persist // MIDletSecurityCrypto
	invokevirtual_short .virtual_5 // idx=5 pc=1
	checkcast_lib java.util.Hashtable//module:net_rim_cldc.class#36 module:net_rim_cldc.class#36 module:net_rim_cldc.class#36
	putstatic _hashtable // MIDletSecurityCrypto
	getstatic _hashtable // MIDletSecurityCrypto
	invokestatic module:net_rim_cldc.class#36 sanitizeSettingsStoreIfNecessary( module:net_rim_cldc.class#36 ) // MIDletSecurityCrypto
	astore_1 
	aload_1 
	getstatic _hashtable // MIDletSecurityCrypto
	if_acmpeq Label49
	aload_1 
	putstatic _hashtable // MIDletSecurityCrypto
	getstatic _persist // MIDletSecurityCrypto
	getstatic _hashtable // MIDletSecurityCrypto
	bipush 51
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label49:
	aload_0 
	lipush -1535600215457087636
	getstatic _hashtable // MIDletSecurityCrypto
	invokevirtual_short .virtual_12 // idx=12 pc=4
Label53:
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	invokevirtual_short .virtual_21 // idx=21 pc=1
	putstatic _moduleHandle // MIDletSecurityCrypto
	getstatic _moduleHandle // MIDletSecurityCrypto
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23451(  ) // class#34
	putstatic _moduleHash // MIDletSecurityCrypto
	goto Label64
	astore_1 
	iconst_0 
	newarray 2
	putstatic _moduleHash // MIDletSecurityCrypto
Label64:
	new_lib net.rim.device.internal.util.ByteArray//module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5 module:net_rim_cldc-1.class#5
	dup 
	getstatic _moduleHash // MIDletSecurityCrypto
	invokespecial_lib .routine_1583 // pc=2
	putstatic _moduleHashByteArray // MIDletSecurityCrypto
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract protected int checkMIDletSignatureImpl( net.rim.device.api.crypto.MIDletSecurityCrypto, net.rim.device.api.crypto.Digest, module:net_rim_cldc.class#78, module:net_rim_cldc.class#78[], byte[], byte[] ); // address: 0
	{
	halt 
	}


abstract protected byte[] signMIDletTrailerImpl( net.rim.device.api.crypto.MIDletSecurityCrypto, byte[], byte[] ); // address: 0
	{
	halt 
	}


abstract protected int checkJADCertChainImpl( net.rim.device.api.crypto.MIDletSecurityCrypto, module:net_rim_cldc.class#78[] ); // address: 0
	{
	halt 
	}


abstract protected int getJADCertInfoImpl( net.rim.device.api.crypto.MIDletSecurityCrypto, module:net_rim_cldc.class#78, module:net_rim_cldc.class#36 ); // address: 0
	{
	halt 
	}

}
