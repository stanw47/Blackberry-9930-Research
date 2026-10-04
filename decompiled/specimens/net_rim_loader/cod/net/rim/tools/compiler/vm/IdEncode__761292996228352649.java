// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 20
// ########################################################


package net.rim.tools.compiler.vm;


abstract public final class IdEncode extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static char[] /*char[]*/  _chars ; // ofs = 10952 addr = 57)
	private static byte[] /*byte[]*/  _bytes ; // ofs = 10958 addr = 58)


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.vm.IdEncode ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String encode( java.lang.String ); // address: 0
	{
	enter 
	synch_static IdEncode
	aload_0 
	stringlength 
	istore_2 
	iload_2 
	iconst_1 
	if_icmpge Label10
	aload_0 
	areturn 
Label10:
	getstatic _chars // IdEncode
	astore_3 
	iload_2 
	aload_3 
	arraylength 
	if_icmple Label21
	iload_2 
	newarray 3
	putstatic _chars // IdEncode
	getstatic _chars // IdEncode
	astore_3 
Label21:
	aload_0 
	iconst_0 
	iload_2 
	aload_3 
	iconst_0 
	invokenonvirtual_lib java.lang.String.getChars // pc=5
	iconst_0 
	istore_4 
	getstatic _bytes // IdEncode
	astore_5 
	iload_2 
	bipush 4
	imul 
	aload_5 
	arraylength 
	if_icmple Label44
	iload_2 
	bipush 4
	imul 
	newarray 2
	putstatic _bytes // IdEncode
	getstatic _bytes // IdEncode
	astore_5 
Label44:
	getstatic codeChar2 // IdEncoding
	astore_6 
	aload_6 
	arraylength 
	istore_7 
	iconst_0 
	istore 8
	iconst_0 
	istore_1 
Label53:
	iload_1 
	iload_2 
	if_icmpge Label107
	aload_3 
	iload_1 
	caload 
	istore 9
	iload 9
	sipush 255
	if_icmpeq Label72
	iload 9
	iflt Label72
	iload 9
	iload_7 
	if_icmpge Label72
	aload_6 
	iload 9
	caload 
	ifeq Label97
Label72:
	iload 9
	sipush 255
	if_icmple Label91
	iinc 4 1
	aload_5 
	iload 8
	iinc 8 1
	bipush -1
	bastore 
	aload_5 
	iload 8
	iinc 8 1
	iload 9
	bipush 8
	ishr 
	sipush 255
	iand 
	i2b 
	bastore 
Label91:
	iinc 4 1
	aload_5 
	iload 8
	iinc 8 1
	bipush -1
	bastore 
Label97:
	aload_5 
	iload 8
	iinc 8 1
	iload 9
	sipush 255
	iand 
	i2b 
	bastore 
	iinc 1 1
	goto Label53
Label107:
	iload 8
	iload_4 
	isub 
	iconst_1 
	if_icmple Label116
	aload_5 
	iload 8
	invokestatic_lib int encodeBytes( byte[], int ) // ClassInfo
	istore 8
Label116:
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_5 
	iconst_0 
	iload 8
	invokespecial_lib java.lang.String.<init> // pc=4
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static IdEncode
	clinit_wait 
	bipush 8
	newarray 3
	putstatic _chars // IdEncode
	bipush 8
	newarray 2
	putstatic _bytes // IdEncode
	clinit_return 
	}

}
