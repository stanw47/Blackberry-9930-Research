// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_cldc-6.cod
// Module version  : 7.1.0.1066
// Class ID        : 86
// ########################################################


package net.rim.device.api.crypto;


abstract public final class RIMSignature extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static byte[] /*byte[]*/  DEFAULT_RSA_E ; // ofs = 20036 addr = 212)
	private final static byte[] /*byte[]*/  RSA_PKCS1_SHA1_DIGEST_PREFIX ; // ofs = 20042 addr = 213)
	private final static byte[] /*byte[]*/  RSA_PKCS1_MD5_DIGEST_PREFIX ; // ofs = 20048 addr = 214)


	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.device.api.crypto.RIMSignature ); // address: 0
	{
	jumpspecial_lib .routine_42329(  )
	}


static public final long verify( byte[], int, int, byte[], int, byte[] ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label21
	iload_1 
	iflt Label21
	aload_0 
	arraylength 
	iload_2 
	isub 
	iload_1 
	if_icmplt Label21
	aload_3 
	ifnull Label21
	iload_4 
	iflt Label21
	iload_4 
	aload_3 
	arraylength 
	if_icmpgt Label21
	aload_5 
	ifnonnull Label25
Label21:
	new_lib IllegalArgumentException//module:net_rim_cldc-2.class#42 module:net_rim_cldc-2.class#42 module:net_rim_cldc-2.class#42
	dup 
	invokespecial_lib .routine_24917 // pc=1
	athrow 
Label25:
	aload_0 
	iload_1 
	iload_2 
	aload_3 
	iload_4 
	aload_5 
	invokestatic long verifyRIMFileSignerSignature( byte[], int, int, byte[], int, byte[] ) // RIMSignature
	lreturn 
	astore_6 
	goto Label36
	astore_6 
Label36:
	aload_0 
	iload_1 
	iload_2 
	aload_3 
	iload_4 
	aload_5 
	invokestatic long verifyPGPSignature( byte[], int, int, byte[], int, byte[] ) // RIMSignature
	lreturn 
	astore_6 
	goto Label47
	astore_6 
Label47:
	bipush -1
	i2l 
	lreturn 
	}


static private final long verifyRIMFileSignerSignature( byte[], int, int, byte[], int, byte[] ); // address: 0
	{
	enter 
	aload_3 
	iload_4 
	iinc 4 1
	bipush 31
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	aload_3 
	iload_4 
	iinc 4 1
	bipush 45
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	aload_3 
	iload_4 
	iinc 4 1
	sipush 200
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	aload_3 
	iload_4 
	iinc 4 1
	sipush 215
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	iinc 4 4
	iload_4 
	istore_6 
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	i2l 
	lstore 7
	lload 7
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	i2l 
	lor 
	lstore 7
	lload 7
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	bipush 16
	ishl 
	i2l 
	lor 
	lstore 7
	lload 7
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	bipush 24
	ishl 
	i2l 
	lor 
	lstore 7
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	istore 9
	iload 9
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	istore 9
	iload 9
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	bipush 16
	ishl 
	ior 
	istore 9
	iload 9
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	sipush 255
	iand 
	bipush 24
	ishl 
	ior 
	istore 9
	getstatic DEFAULT_RSA_E // RIMSignature
	astore 10
	aload_5 
	astore 11
	aload_3 
	iload_4 
	iload 9
	aload 11
	arraylength 
	invokestatic byte[] getBytes( byte[], int, int, int ) // RIMSignature
	astore 12
	new SHA1Digest
	dup 
	invokespecial net.rim.device.api.crypto.SHA1Digest.<init> // pc=1
	astore 13
	aload 13
	aload_0 
	iload_1 
	iload_2 
	invokeinterface interfacemethodref_285 // pc=4 guess=82
	aload 13
	aload_3 
	iload_6 
	bipush 4
	invokeinterface interfacemethodref_285 // pc=4 guess=82
	aload 10
	aload 11
	aload 12
	aload 13
	getstatic RSA_PKCS1_SHA1_DIGEST_PREFIX // RIMSignature
	invokestatic boolean verifyRSASignature( byte[], byte[], byte[], net.rim.device.api.crypto.Digest, byte[] ) // RIMSignature
	ifne Label143
	iconst_0 
	i2l 
	lreturn 
Label143:
	lload 7
	sipush 1000
	i2l 
	lmul 
	lreturn 
	}


static private final int checkPGPPacketHeader( byte[], int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	baload 
	sipush 255
	iand 
	istore_3 
	sipush 128
	iload_2 
	bipush 2
	ishl 
	ior 
	istore_4 
	iload_3 
	iload_4 
	ixor 
	istore_5 
	iload_5 
	bipush 3
	if_icmplt Label24
	new_lib java.io.IOException//module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27
	dup 
	invokespecial_lib .routine_13761 // pc=1
	athrow 
Label24:
	iconst_1 
	iconst_1 
	iload_5 
	ishl 
	iadd 
	ireturn 
	}


static private final long verifyPGPSignature( byte[], int, int, byte[], int, byte[] ); // address: 0
	{
	enter 
	iload_4 
	aload_3 
	iload_4 
	bipush 2
	invokestatic int checkPGPPacketHeader( byte[], int, int ) // RIMSignature
	iadd 
	istore_4 
	aload_3 
	iload_4 
	iinc 4 1
	bipush 3
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	aload_3 
	iload_4 
	iinc 4 1
	bipush 5
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	iload_4 
	istore_6 
	aload_3 
	iload_4 
	iinc 4 1
	iconst_0 
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	aload_3 
	iload_4 
	bipush 4
	invokestatic int getInteger( byte[], int, int ) // RIMSignature
	bipush -1
	iand 
	i2l 
	lstore 7
	iinc 4 12
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	istore 9
	aload_3 
	iload_4 
	iinc 4 1
	baload 
	istore 10
	iload 10
	tableswitch  :
		
		
		

Label46:
	new MD5Digest
	dup 
	invokespecial net.rim.device.api.crypto.MD5Digest.<init> // pc=1
	astore 11
	getstatic RSA_PKCS1_MD5_DIGEST_PREFIX // RIMSignature
	astore 12
	goto Label64
Label53:
	new SHA1Digest
	dup 
	invokespecial net.rim.device.api.crypto.SHA1Digest.<init> // pc=1
	astore 11
	getstatic RSA_PKCS1_SHA1_DIGEST_PREFIX // RIMSignature
	astore 12
	goto Label64
Label60:
	new_lib java.io.IOException//module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27
	dup 
	invokespecial_lib .routine_13761 // pc=1
	athrow 
Label64:
	aload 11
	aload_0 
	iload_1 
	iload_2 
	invokeinterface interfacemethodref_285 // pc=4 guess=83
	aload 11
	aload_3 
	iload_6 
	bipush 5
	invokeinterface interfacemethodref_285 // pc=4 guess=83
	iinc 4 2
	aload_5 
	iconst_0 
	bipush 6
	invokestatic int checkPGPPacketHeader( byte[], int, int ) // RIMSignature
	istore 13
	aload_5 
	iload 13
	iinc 13 1
	baload 
	istore 14
	iload 14
	tableswitch  :
		
		
		

Label87:
	iinc 13 6
	goto Label95
Label89:
	iinc 13 4
	goto Label95
Label91:
	new_lib java.io.IOException//module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27
	dup 
	invokespecial_lib .routine_13761 // pc=1
	athrow 
Label95:
	iload 9
Label97:
	aload 11
	aload 12
	aload_3 
	iload_4 
	aload_5 
	iload 13
	invokestatic boolean verifyPGPRSASignature( net.rim.device.api.crypto.Digest, byte[], byte[], int, byte[], int ) // RIMSignature
	istore 15
	goto Label119
Label106:
	aload 11
	invokeinterface interfacemethodref_311 // pc=1 guess=84
	aload_3 
	iload_4 
	aload_5 
	iload 13
	invokestatic boolean verifyPGPDSASignature( byte[], byte[], int, byte[], int ) // RIMSignature
	istore 15
	goto Label119
Label115:
	new_lib java.io.IOException//module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27
	dup 
	invokespecial_lib .routine_13761 // pc=1
	athrow 
Label119:
	iload 15
	ifne Label124
	iconst_0 
	i2l 
	lreturn 
Label124:
	lload 7
	sipush 1000
	i2l 
	lmul 
	lreturn 
	}


static private final boolean verifyPGPRSASignature( net.rim.device.api.crypto.Digest, byte[], byte[], int, byte[], int ); // address: 0
	{
	enter 
	aload_4 
	iload_5 
	iinc 5 1
	iconst_1 
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	aload_4 
	iload_5 
	invokestatic byte[] getMPI( byte[], int ) // RIMSignature
	astore_6 
	iload_5 
	bipush 2
	aload_6 
	arraylength 
	iadd 
	iadd 
	istore_5 
	aload_4 
	iload_5 
	invokestatic byte[] getMPI( byte[], int ) // RIMSignature
	astore_7 
	aload_6 
	arraylength 
	newarray 2
	astore 8
	iload_3 
	aload_2 
	iload_3 
	aload 8
	invokestatic int getMPI( byte[], int, byte[] ) // RIMSignature
	iadd 
	istore_3 
	aload_7 
	aload_6 
	aload 8
	aload_0 
	aload_1 
	invokestatic boolean verifyRSASignature( byte[], byte[], byte[], net.rim.device.api.crypto.Digest, byte[] ) // RIMSignature
	ireturn 
	}


static private final boolean verifyRSASignature( byte[], byte[], byte[], net.rim.device.api.crypto.Digest, byte[] ); // address: 0
	{
	enter 
	aload_1 
	arraylength 
	istore_5 
	iload_5 
	newarray 2
	astore_6 
	aload_1 
	arraylength 
	bipush 3
	ishl 
	aload_0 
	aload_1 
	aload_2 
	iconst_0 
	aload_6 
	iconst_0 
	invokestatic publicKeyOperation( int, byte[], byte[], byte[], int, byte[], int ) // NativeRSA
	aload_3 
	invokeinterface interfacemethodref_283 // pc=1 guess=85
	istore_7 
	aload_4 
	arraylength 
	istore 8
	iload_5 
	newarray 2
	astore 9
	aload 9
	iconst_1 
	iconst_1 
	bastore 
	aload 9
	bipush -1
	bipush 2
	iload_5 
	iload_7 
	isub 
	iload 8
	isub 
	iconst_1 
	isub 
	bipush 2
	isub 
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_1112(  ) // class#3
	aload_4 
	iconst_0 
	aload 9
	iload_5 
	iload_7 
	isub 
	iload 8
	isub 
	iload 8
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42208(  ) // class#84
	aload_3 
	aload 9
	iload_5 
	iload_7 
	isub 
	invokeinterface interfacemethodref_312 // pc=3 guess=86
	pop 
	aload 9
	aload_6 
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_2029(  ) // class#3
	ireturn 
	}


static private final boolean verifyPGPDSASignature( byte[], byte[], int, byte[], int ); // address: 0
	{
	enter 
	aload_3 
	iload_4 
	iinc 4 1
	bipush 17
	invokestatic assertByte( byte[], int, int ) // RIMSignature
	aload_3 
	iload_4 
	invokestatic byte[] getMPI( byte[], int ) // RIMSignature
	astore_5 
	iload_4 
	bipush 2
	aload_5 
	arraylength 
	iadd 
	iadd 
	istore_4 
	bipush 20
	newarray 2
	astore_6 
	aload_5 
	arraylength 
	newarray 2
	astore_7 
	aload_5 
	arraylength 
	newarray 2
	astore 8
	iload_4 
	aload_3 
	iload_4 
	aload_6 
	invokestatic int getMPI( byte[], int, byte[] ) // RIMSignature
	iadd 
	istore_4 
	iload_4 
	aload_3 
	iload_4 
	aload_7 
	invokestatic int getMPI( byte[], int, byte[] ) // RIMSignature
	iadd 
	istore_4 
	iload_4 
	aload_3 
	iload_4 
	aload 8
	invokestatic int getMPI( byte[], int, byte[] ) // RIMSignature
	iadd 
	istore_4 
	aload_6 
	arraylength 
	newarray 2
	astore 9
	aload_6 
	arraylength 
	newarray 2
	astore 10
	iload_2 
	aload_1 
	iload_2 
	aload 9
	invokestatic int getMPI( byte[], int, byte[] ) // RIMSignature
	iadd 
	istore_2 
	iload_2 
	aload_1 
	iload_2 
	aload 10
	invokestatic int getMPI( byte[], int, byte[] ) // RIMSignature
	iadd 
	istore_2 
	aload_5 
	aload_6 
	aload_7 
	aload 8
	aload_0 
	aload 9
	aload 10
	invokestatic boolean verifyDSA( byte[], byte[], byte[], byte[], byte[], byte[], byte[] ) // NativeDL
	ireturn 
	}


static private final assertByte( byte[], int, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	aload_0 
	iload_1 
	iinc 1 1
	baload 
	sipush 255
	iand 
	if_icmpeq Label13
	new_lib java.io.IOException//module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27 module:net_rim_cldc-1.class#27
	dup 
	invokespecial_lib .routine_13761 // pc=1
	athrow 
Label13:
	return 
	}


static private final int getInteger( byte[], int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iinc 1 1
	baload 
	sipush 255
	iand 
	istore_3 
Label8:
	iinc 2 -1
	iload_2 
	ifle Label25
	iload_3 
	bipush 8
	ishl 
	istore_3 
	iload_3 
	aload_0 
	iload_1 
	iinc 1 1
	baload 
	sipush 255
	iand 
	ior 
	istore_3 
	goto Label8
Label25:
	iload_3 
	ireturn 
	}


static private final byte[] getBytes( byte[], int, int, int ); // address: 0
	{
	enter 
	iload_3 
	newarray 2
	astore_4 
	aload_0 
	iload_1 
	aload_4 
	iload_3 
	iload_2 
	isub 
	iload_2 
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42208(  ) // class#84
	aload_4 
	areturn 
	}


static private final int getMPILength( byte[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	bipush 2
	invokestatic int getInteger( byte[], int, int ) // RIMSignature
	bipush 7
	iadd 
	bipush 3
	ishr 
	ireturn 
	}


static private final byte[] getMPI( byte[], int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokestatic int getMPILength( byte[], int ) // RIMSignature
	istore_2 
	iload_2 
	newarray 2
	astore_3 
	aload_0 
	iload_1 
	aload_3 
	invokestatic int getMPI( byte[], int, byte[] ) // RIMSignature
	pop 
	aload_3 
	areturn 
	}


static private final int getMPI( byte[], int, byte[] ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokestatic int getMPILength( byte[], int ) // RIMSignature
	istore_3 
	aload_0 
	iload_1 
	bipush 2
	iadd 
	aload_2 
	aload_2 
	arraylength 
	iload_3 
	isub 
	iload_3 
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42208(  ) // class#84
	bipush 2
	iload_3 
	iadd 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static RIMSignature
	clinit_wait 
	arrayinit [3]
	putstatic DEFAULT_RSA_E // RIMSignature
	arrayinit [48, 33, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 4, 20]
	putstatic RSA_PKCS1_SHA1_DIGEST_PREFIX // RIMSignature
	arrayinit [48, 32, 48, 12, 6, 8, 42, -122, 72, -122, -9, 13, 2, 5, 5, 0, 4, 16]
	putstatic RSA_PKCS1_MD5_DIGEST_PREFIX // RIMSignature
	clinit_return 
	}

}
