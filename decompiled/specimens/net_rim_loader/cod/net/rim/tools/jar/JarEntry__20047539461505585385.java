// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 22
// ########################################################


package net.rim.tools.jar;


public class JarEntry extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private byte[] /*byte[]*/  _bytes ; // ofs = 11080 addr = 0)
	private int /*int*/  _offset ; // ofs = 11084 addr = 0)
	private int /*int*/  _compression ; // ofs = 11088 addr = 0)
	private int /*int*/  _compressedLength ; // ofs = 11092 addr = 0)
	private String /*java.lang.String*/  _name ; // ofs = 11096 addr = 0)
	private int /*int*/  _uncompressedLength ; // ofs = 11100 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.tools.jar.JarEntry, byte[], int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractInt( byte[], int ) // JarFile
	istore_3 
	iload_3 
	iipush 33639248
	if_icmpeq Label24
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_521:"missing central directory header signature: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label24:
	iload_2 
	bipush 4
	iadd 
	bipush 2
	iadd 
	bipush 2
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractShort( byte[], int ) // JarFile
	istore_4 
	iload_4 
	iconst_1 
	iand 
	ifeq Label45
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_522:"encrypted input not supported"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label45:
	iload_2 
	bipush 2
	iadd 
	istore_2 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractShort( byte[], int ) // JarFile
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial net.rim.tools.jar.JarEntry.checkCompression // pc=2
	iload_2 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 4
	iadd 
	istore_2 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractInt( byte[], int ) // JarFile
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_2 
	bipush 4
	iadd 
	istore_2 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractInt( byte[], int ) // JarFile
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_2 
	bipush 4
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractShort( byte[], int ) // JarFile
	istore_5 
	iload_2 
	bipush 2
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractShort( byte[], int ) // JarFile
	istore_6 
	iload_2 
	bipush 2
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractShort( byte[], int ) // JarFile
	istore_7 
	iload_2 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 4
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractInt( byte[], int ) // JarFile
	istore 8
	iload_2 
	bipush 4
	iadd 
	istore_2 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	iload_5 
	invokestatic java.lang.String extractString( byte[], int, int ) // JarEntry
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_2 
	iload_5 
	iadd 
	iload_6 
	iadd 
	iload_7 
	iadd 
	istore_2 
	iload 8
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractInt( byte[], int ) // JarFile
	istore_3 
	iload_3 
	iipush 67324752
	if_icmpeq Label151
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_523:"bad local file header signature"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label151:
	iload_2 
	bipush 4
	iadd 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 2
	iadd 
	bipush 4
	iadd 
	bipush 4
	iadd 
	bipush 4
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractShort( byte[], int ) // JarFile
	istore 9
	iload_2 
	bipush 2
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic int extractShort( byte[], int ) // JarFile
	istore 10
	iload_2 
	bipush 2
	iadd 
	istore_2 
	iload_2 
	iload 9
	iadd 
	iload 10
	iadd 
	istore_2 
	aload_0 
	iload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


static private java.lang.String extractString( byte[], int, int ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	iload_2 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_2 
	if_icmpge Label22
	aload_3 
	aload_0 
	iload_1 
	iload_4 
	iadd 
	baload 
	i2c 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iinc 4 1
	goto Label8
Label22:
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


<init>( net.rim.tools.jar.JarEntry, java.io.InputStream ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_1 
	bipush 2
	i2l 
	invokevirtual long skip( java.io.InputStream, long ) // pc=3
	pop2 
	aload_1 
	invokestatic int readShort( java.io.InputStream ) // JarInputStream
	istore_2 
	iload_2 
	bipush 8
	iand 
	ifeq Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	istore_3 
	aload_0 
	aload_1 
	invokestatic int readShort( java.io.InputStream ) // JarInputStream
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial net.rim.tools.jar.JarEntry.checkCompression // pc=2
	aload_1 
	bipush 8
	i2l 
	invokevirtual long skip( java.io.InputStream, long ) // pc=3
	pop2 
	aload_0 
	aload_1 
	invokestatic int readInt( java.io.InputStream ) // JarInputStream
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	invokestatic int readInt( java.io.InputStream ) // JarInputStream
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokestatic int readShort( java.io.InputStream ) // JarInputStream
	istore_4 
	aload_1 
	invokestatic int readShort( java.io.InputStream ) // JarInputStream
	istore_5 
	iload_4 
	newarray 2
	astore_6 
	aload_1 
	aload_6 
	iconst_0 
	iload_4 
	invokestatic int readBytes( java.io.InputStream, byte[], int, int ) // JarInputStream
	iload_4 
	if_icmpeq Label60
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_524:"unable to read entry name"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label60:
	aload_0 
	aload_6 
	iconst_0 
	iload_4 
	invokestatic java.lang.String extractString( byte[], int, int ) // JarEntry
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aconst_null 
	astore_6 
	aload_1 
	iload_5 
	i2l 
	invokevirtual long skip( java.io.InputStream, long ) // pc=3
	pop2 
	iload_3 
	ifne Label76
	goto_w Label171
Label76:
	aload_0 
	sipush 4096
	newarray 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	istore_7 
	bipush 16
	istore 8
Label84:
	iload_7 
	iload 8
	if_icmpge Label107
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_7 
	iload 8
	iload_7 
	isub 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore 9
	iload 9
	ifge Label102
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_525:"unable to find trailer bytes"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label102:
	iload_7 
	iload 9
	iadd 
	istore_7 
	goto Label84
Label107:
	iload 8
	bipush 16
	isub 
	istore 9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 9
	baload 
	bipush 80
	if_icmpne Label134
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 9
	invokestatic int extractInt( byte[], int ) // JarFile
	istore 10
	iload 10
	iipush 134695760
	if_icmpne Label134
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 9
	bipush 8
	iadd 
	invokestatic int extractInt( byte[], int ) // JarFile
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload 9
	if_icmpne Label134
	goto Label163
Label134:
	iload 8
	bipush 16
	iadd 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	if_icmplt Label147
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 8
	sipush 4096
	iadd 
	invokestatic byte[] resize( byte[], int ) // MyArrays
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label147:
	iinc 9 1
Label148:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 9
	baload 
	bipush 80
	if_icmpeq Label158
	iload 9
	iload 8
	if_icmpge Label158
	iinc 9 1
	goto Label148
Label158:
	iload 9
	bipush 16
	iadd 
	istore 8
	goto_w Label84
Label163:
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 8
	bipush 4
	isub 
	invokestatic int extractInt( byte[], int ) // JarFile
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
Label171:
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	newarray 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	istore_7 
Label177:
	iload_7 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	if_icmpge Label202
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_7 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	iload_7 
	isub 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore 8
	iload 8
	ifge Label197
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_526:"unable to read all data bytes"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label197:
	iload_7 
	iload 8
	iadd 
	istore_7 
	goto Label177
Label202:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final checkCompression( net.rim.tools.jar.JarEntry, int ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label17
	iload_1 
	bipush 8
	if_icmpeq Label17
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_520:"bad file header compression method: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label17:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public java.lang.String getName( net.rim.tools.jar.JarEntry ); // address: 0
	{
	areturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public boolean isDirectory( net.rim.tools.jar.JarEntry ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringlength 
	iconst_1 
	isub 
	stringaload 
	bipush 47
	if_icmpne Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


public int getSize( net.rim.tools.jar.JarEntry ); // address: 0
	{
	ireturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


java.io.InputStream makeInputStream( net.rim.tools.jar.JarEntry ); // address: 0
	{
	enter 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial_lib java.io.ByteArrayInputStream.<init> // pc=4
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	if_icmpne Label17
	new_lib net.rim.device.internal.system.ApplicationDescriptorConstants//net.rim.device.internal.system.ApplicationDescriptorConstants net.rim.device.internal.system.ApplicationDescriptorConstants net.rim.device.internal.system.ApplicationDescriptorConstants
	dup 
	aload_1 
	iconst_1 
	invokespecial_lib net.rim.device.api.compress.ZLibInputStream.<init> // pc=3
	astore_1 
Label17:
	aload_1 
	areturn 
	}

}
