// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 24
// ########################################################


package net.rim.tools.jar;


public class JarInputStream extends java.io.InputStream

{
	// @@@@@@@@@@@@@ Static fields 
	private static byte[] /*byte[]*/  _four ; // ofs = 11234 addr = 69)
	private static byte[] /*byte[]*/  _two ; // ofs = 11240 addr = 70)

	// @@@@@@@@@@@@@ Fields 
	private java.io.InputStream /*java.io.InputStream*/  _inputStream ; // ofs = 11218 addr = 0)
	private java.io.InputStream /*java.io.InputStream*/  _entryStream ; // ofs = 11222 addr = 0)
	private net.rim.tools.jar.JarEntry /*net.rim.tools.jar.JarEntry*/  _firstEntry ; // ofs = 11226 addr = 0)
	private net.rim.tools.jar.Manifest /*net.rim.tools.jar.Manifest*/  _manifest ; // ofs = 11230 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.jar.JarInputStream, java.io.InputStream, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.io.InputStream.<init> // pc=1
	aload_0 
	aload_1 
	putfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	invokestatic int readInt( java.io.InputStream ) // JarInputStream
	istore_3 
	iload_3 
	iipush 67324752
	if_icmpeq Label24
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_529:"bad local file header signature: 0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label24:
	aload_0 
	new JarEntry
	dup 
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	invokespecial net.rim.tools.jar.JarEntry.<init> // pc=2
	putfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	aload_0_getfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	ifnull Label60
	aload_0_getfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	invokevirtual_short .virtual_4 // idx=4 pc=1
	ifne Label60
	aload_0_getfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	astore_4 
	aload_4 
	iconst_1 
	iconst_0 
	ldc literal_530:"META-INF/MANIFEST.MF"
	iconst_0 
	bipush 20
	invokenonvirtual_lib java.lang.String.regionMatches // pc=6
	ifeq Label60
	aload_0_getfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_5 
	aload_0 
	new Manifest
	dup 
	aload_5 
	invokespecial net.rim.tools.jar.Manifest.<init> // pc=2
	putfield _manifest   // get_name_1:  _manifest   // get_name_2:  _manifest   // get_Name:    _manifest   // getName->1:  _manifest   // getName->2:  _manifest   // getName->N:  _manifest   // ofs = 11230 ord = 3 addr = 0
	aload_5 
	invokevirtual close( java.io.InputStream ) // pc=1
	aload_0 
	aconst_null 
	putfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
Label60:
	return 
	}


static int readBytes( java.io.InputStream, byte[], int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_4 
Label3:
	iload_4 
	iload_3 
	if_icmpge Label28
	aload_0 
	aload_1 
	iload_2 
	iload_4 
	iadd 
	iload_3 
	iload_4 
	isub 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore_5 
	iload_5 
	ifgt Label23
	iload_4 
	ifne Label28
	bipush -1
	istore_4 
	goto Label28
Label23:
	iload_4 
	iload_5 
	iadd 
	istore_4 
	goto Label3
Label28:
	iload_4 
	ireturn 
	}


static int readShort( java.io.InputStream ); // address: 0
	{
	enter 
	getstatic _two // JarInputStream
	dup 
	astore_1 
	monitorenter 
	getstatic _two // JarInputStream
	astore_2 
	aload_0 
	aload_2 
	iconst_0 
	aload_2 
	arraylength 
	invokestatic int readBytes( java.io.InputStream, byte[], int, int ) // JarInputStream
	aload_2 
	arraylength 
	if_icmpeq Label21
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_531:"unable to read short"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label21:
	aload_2 
	iconst_0 
	baload 
	sipush 255
	iand 
	aload_2 
	iconst_1 
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	iipush 65535
	iand 
	aload_1 
	monitorexit 
	ireturn 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
	}


static int readInt( java.io.InputStream ); // address: 0
	{
	enter 
	getstatic _four // JarInputStream
	dup 
	astore_1 
	monitorenter 
	getstatic _four // JarInputStream
	astore_2 
	aload_0 
	aload_2 
	iconst_0 
	aload_2 
	arraylength 
	invokestatic int readBytes( java.io.InputStream, byte[], int, int ) // JarInputStream
	aload_2 
	arraylength 
	if_icmpeq Label21
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_532:"unable to read int"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label21:
	aload_2 
	iconst_0 
	baload 
	sipush 255
	iand 
	aload_2 
	iconst_1 
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	aload_2 
	bipush 2
	baload 
	sipush 255
	iand 
	bipush 16
	ishl 
	ior 
	aload_2 
	bipush 3
	baload 
	bipush 24
	ishl 
	ior 
	aload_1 
	monitorexit 
	ireturn 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.io.InputStream//java.io.InputStream java.io.InputStream java.io.InputStream
	synch_static JarInputStream
	clinit_wait 
	bipush 4
	newarray 2
	putstatic _four // JarInputStream
	bipush 2
	newarray 2
	putstatic _two // JarInputStream
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public net.rim.tools.jar.Manifest getManifest( net.rim.tools.jar.JarInputStream ); // address: 0
	{
	areturn_field _manifest   // get_name_1:  _manifest   // get_name_2:  _manifest   // get_Name:    _manifest   // getName->1:  _manifest   // getName->2:  _manifest   // getName->N:  _manifest   // ofs = 11230 ord = 3 addr = 0
	}


public net.rim.tools.jar.JarEntry getNextJarEntry( net.rim.tools.jar.JarInputStream ); // address: 0
	{
	enter 
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	ifnonnull Label8
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_527:"stream closed"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label8:
	aconst_null 
	astore_1 
	aload_0_getfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	ifnull Label18
	aload_0_getfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	astore_1 
	aload_0 
	aconst_null 
	putfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	goto Label45
Label18:
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	invokestatic int readInt( java.io.InputStream ) // JarInputStream
	istore_2 
	iload_2 
	iipush 67324752
	if_icmpne Label30
	new JarEntry
	dup 
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	invokespecial net.rim.tools.jar.JarEntry.<init> // pc=2
	astore_1 
	goto Label45
Label30:
	iload_2 
	iipush 33639248
	if_icmpeq Label45
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_528:"bad central file header signature: 0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label45:
	aload_1 
	ifnull Label51
	aload_0 
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	putfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
Label51:
	aload_1 
	areturn 
	}


public closeEntry( net.rim.tools.jar.JarInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	invokevirtual close( java.io.InputStream ) // pc=1
	aload_0 
	aconst_null 
	putfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	return 
	}


public int read( net.rim.tools.jar.JarInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	ifnonnull Label8
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_527:"stream closed"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label8:
	aload_0_getfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	invokevirtual int read( java.io.InputStream ) // pc=1
	ireturn 
	}


public int read( net.rim.tools.jar.JarInputStream, byte[], int, int ); // address: 0
	{
	enter 
	aload_0_getfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	ifnonnull Label8
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_527:"stream closed"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label8:
	aload_0_getfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokestatic int readBytes( java.io.InputStream, byte[], int, int ) // JarInputStream
	ireturn 
	}


public close( net.rim.tools.jar.JarInputStream ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	putfield _firstEntry   // get_name_1:  _firstEntry   // get_name_2:  _firstEntry   // get_Name:    _firstEntry   // getName->1:  _firstEntry   // getName->2:  _firstEntry   // getName->N:  _firstEntry   // ofs = 11226 ord = 2 addr = 0
	aload_0 
	aconst_null 
	putfield _manifest   // get_name_1:  _manifest   // get_name_2:  _manifest   // get_Name:    _manifest   // getName->1:  _manifest   // getName->2:  _manifest   // getName->N:  _manifest   // ofs = 11230 ord = 3 addr = 0
	aload_0_getfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	ifnull Label14
	aload_0_getfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
	invokevirtual close( java.io.InputStream ) // pc=1
	aload_0 
	aconst_null 
	putfield _entryStream   // get_name_1:  _entryStream   // get_name_2:  _entryStream   // get_Name:    _entryStream   // getName->1:  _entryStream   // getName->2:  _entryStream   // getName->N:  _entryStream   // ofs = 11222 ord = 1 addr = 0
Label14:
	sipush 128
	newarray 2
	astore_1 
Label17:
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	bipush -1
	if_icmpeq Label26
	goto Label17
Label26:
	aconst_null 
	astore_1 
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	invokevirtual close( java.io.InputStream ) // pc=1
	aload_0 
	aconst_null 
	putfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 11218 ord = 0 addr = 0
	return 
	}

}
