// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 19
// ########################################################


package net.rim.tools.compiler.util;


abstract public final class FileHelper extends Object
implements net.rim.tools.compiler.vm.Constants

{
	// @@@@@@@@@@@@@ Static fields 
	public static String /*java.lang.String*/  ext_cod ; // ofs = 10834 addr = 45)
	public static String /*java.lang.String*/  ext_tmp ; // ofs = 10840 addr = 46)
	public static String /*java.lang.String*/  ext_jar ; // ofs = 10846 addr = 47)
	public static String /*java.lang.String*/  ext_wgt ; // ofs = 10852 addr = 48)
	public static String /*java.lang.String*/  ext_jad ; // ofs = 10858 addr = 49)
	public static String /*java.lang.String*/  ext_rapc ; // ofs = 10864 addr = 50)
	public static String /*java.lang.String*/  ext_class ; // ofs = 10870 addr = 51)
	public static String /*java.lang.String[]*/  ext_images ; // ofs = 10876 addr = 52)
	public static String /*java.lang.String*/  pfx_rapc1 ; // ofs = 10882 addr = 53)
	public static String /*java.lang.String*/  pfx_rapc ; // ofs = 10888 addr = 54)


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.util.FileHelper, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	return 
	}


static public final java.lang.String fixSlashes( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 92
	bipush 47
	invokenonvirtual_lib java.lang.String.replace // pc=3
	areturn 
	}


static public final int findSeparator( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 92
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	aload_0 
	bipush 47
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_2 
	iload_2 
	iload_1 
	if_icmple Label14
	iload_2 
	istore_1 
Label14:
	iload_1 
	ireturn 
	}


static public final java.lang.String removePathPrefix( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic int findSeparator( java.lang.String ) // FileHelper
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label13
	aload_0 
	iload_1 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	areturn 
Label13:
	aload_0 
	areturn 
	}


static public final int checkExtension( java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	stringlength 
	istore_2 
	aload_0 
	stringlength 
	iload_2 
	isub 
	istore_3 
	iload_3 
	iflt Label21
	aload_0 
	iconst_1 
	iload_3 
	aload_1 
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.regionMatches // pc=6
	ifeq Label21
	iload_3 
	ireturn 
Label21:
	bipush -1
	ireturn 
	}


static public final int checkExtensions( java.lang.String, java.lang.String[] ); // address: 0
	{
	enter 
	aload_1 
	arraylength 
	istore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label20
	aload_0 
	aload_1 
	iload_3 
	aaload 
	invokestatic int checkExtension( java.lang.String, java.lang.String ) // FileHelper
	bipush -1
	if_icmpeq Label18
	iload_3 
	ireturn 
Label18:
	iinc 3 1
	goto Label6
Label20:
	bipush -1
	ireturn 
	}


static public final java.lang.String removeExtension( java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokestatic int checkExtension( java.lang.String, java.lang.String ) // FileHelper
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label13
	aload_0 
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	areturn 
Label13:
	aload_0 
	areturn 
	}


static public final java.lang.String extractExtension( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label14
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label14
	aload_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	areturn 
Label14:
	aconst_null 
	areturn 
	}


static public final java.lang.String makeMultiName( java.lang.String, int, java.lang.String ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	sipush 256
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_3 
	aconst_null 
	astore_4 
	iload_1 
	ifne Label27
	aload_2 
	ifnull Label24
	aload_3 
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	goto Label48
Label24:
	aload_0 
	astore_4 
	goto Label48
Label27:
	aload_3 
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	ldc literal_506:"-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_2 
	ifnull Label45
	aload_3 
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label45:
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
Label48:
	aload_4 
	areturn 
	}


static public final boolean needProcessArgs( java.lang.String[] ); // address: 0
	{
	enter_narrow 
	iconst_0 
	ireturn 
	}


static public final java.lang.String[] processArgs( java.lang.String[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static FileHelper
	clinit_wait 
	ldc literal_507:".cod"
	putstatic ext_cod // FileHelper
	ldc literal_508:".tmp"
	putstatic ext_tmp // FileHelper
	ldc literal_509:".jar"
	putstatic ext_jar // FileHelper
	ldc literal_510:".wgt"
	putstatic ext_wgt // FileHelper
	ldc literal_511:".jad"
	putstatic ext_jad // FileHelper
	ldc literal_512:".rapc"
	putstatic ext_rapc // FileHelper
	ldc literal_513:".class"
	putstatic ext_class // FileHelper
	op01xx 
	stringarrayinit [.gif, .png, .jpg, .jpeg]
	putstatic ext_images // FileHelper
	ldc literal_518:"rapc"
	putstatic pfx_rapc1 // FileHelper
	ldc literal_519:"rapc_"
	putstatic pfx_rapc // FileHelper
	clinit_return 
	}

}
