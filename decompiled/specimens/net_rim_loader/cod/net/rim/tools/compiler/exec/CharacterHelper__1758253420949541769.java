// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 3
// ########################################################


package net.rim.tools.compiler.exec;


public class CharacterHelper extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static char[] /*char[]*/  _chars ; // ofs = 9622 addr = 8)
	private static char[] /*char[]*/  _charLock ; // ofs = 9628 addr = 9)


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.exec.CharacterHelper ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public boolean isJavaIdentifierStart( char ); // address: 0
	{
	enter_narrow 
	bipush 97
	iload_0 
	if_icmpgt Label9
	iload_0 
	bipush 122
	if_icmpgt Label9
	iconst_1 
	ireturn 
Label9:
	bipush 65
	iload_0 
	if_icmpgt Label17
	iload_0 
	bipush 90
	if_icmpgt Label17
	iconst_1 
	ireturn 
Label17:
	iload_0 
	bipush 95
	if_icmpne Label22
	iconst_1 
	ireturn 
Label22:
	iload_0 
	bipush 36
	if_icmpne Label27
	iconst_1 
	ireturn 
Label27:
	iload_0 
	bipush 127
	if_icmple Label32
	iconst_1 
	ireturn 
Label32:
	iconst_0 
	ireturn 
	}


static public boolean isJavaIdentifierPart( char ); // address: 0
	{
	enter_narrow 
	bipush 97
	iload_0 
	if_icmpgt Label9
	iload_0 
	bipush 122
	if_icmpgt Label9
	iconst_1 
	ireturn 
Label9:
	bipush 65
	iload_0 
	if_icmpgt Label17
	iload_0 
	bipush 90
	if_icmpgt Label17
	iconst_1 
	ireturn 
Label17:
	bipush 48
	iload_0 
	if_icmpgt Label25
	iload_0 
	bipush 57
	if_icmpgt Label25
	iconst_1 
	ireturn 
Label25:
	iload_0 
	bipush 95
	if_icmpne Label30
	iconst_1 
	ireturn 
Label30:
	iload_0 
	bipush 36
	if_icmpne Label35
	iconst_1 
	ireturn 
Label35:
	iload_0 
	bipush 127
	if_icmple Label40
	iconst_1 
	ireturn 
Label40:
	iconst_0 
	ireturn 
	}


static public java.lang.String intern( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib java.lang.String stringIntern( java.lang.String ) // Memory
	areturn 
	}


static public java.lang.String utf8ToString( byte[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	aload_0 
	arraylength 
	invokestatic java.lang.String utf8ToString( byte[], int, int ) // CharacterHelper
	areturn 
	}


static public java.lang.String utf8ToString( byte[], int, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	iconst_0 
	istore 8
	iload_1 
	iload_2 
	iadd 
	istore 9
	iload_1 
	istore_4 
Label11:
	iload_4 
	iload 9
	if_icmplt Label15
	goto_w Label84
Label15:
	aload_0 
	iload_4 
	baload 
	i2c 
	istore_5 
	iload_5 
	ifne Label27
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_465:"invalid UTF-8 encoding"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label27:
	iload_5 
	sipush 128
	iand 
	ifne Label32
	goto Label82
Label32:
	iinc 8 1
	aload_0 
	iinc 4 1
	iload_4 
	baload 
	i2c 
	istore_6 
	iload_6 
	sipush 192
	iand 
	sipush 128
	if_icmpeq Label49
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_465:"invalid UTF-8 encoding"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label49:
	iload_5 
	sipush 224
	iand 
	sipush 192
	if_icmpne Label55
	goto Label82
Label55:
	iload_5 
	sipush 240
	iand 
	sipush 224
	if_icmpne Label77
	iinc 8 1
	aload_0 
	iinc 4 1
	iload_4 
	baload 
	i2c 
	istore_7 
	iload_7 
	sipush 192
	iand 
	sipush 128
	if_icmpeq Label82
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_465:"invalid UTF-8 encoding"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label77:
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_465:"invalid UTF-8 encoding"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label82:
	iinc 4 1
	goto_w Label11
Label84:
	iload 8
	ifne Label94
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib java.lang.String.<init> // pc=4
	astore_3 
	goto_w Label211
Label94:
	getstatic _charLock // CharacterHelper
	dup 
	astore 10
	monitorenter 
	getstatic _chars // CharacterHelper
	astore 11
	aload 11
	arraylength 
	iload_2 
	iload 8
	isub 
	if_icmpge Label114
	aload 11
	iload_2 
	iload 8
	isub 
	invokestatic char[] resize( char[], int ) // MyArrays
	astore 11
	aload 11
	putstatic _chars // CharacterHelper
Label114:
	iconst_0 
	istore 12
	iload_1 
	istore_4 
Label118:
	iload_4 
	iload 9
	if_icmpge Label196
	aload_0 
	iload_4 
	baload 
	i2c 
	istore_5 
	iload_5 
	sipush 128
	iand 
	ifne Label136
	aload 11
	iload 12
	iinc 12 1
	iload_5 
	castore 
	goto Label194
Label136:
	iload_5 
	sipush 224
	iand 
	sipush 192
	if_icmpne Label162
	aload_0 
	iinc 4 1
	iload_4 
	baload 
	i2c 
	istore_6 
	aload 11
	iload 12
	iinc 12 1
	iload_5 
	bipush 31
	iand 
	bipush 6
	ishl 
	iload_6 
	bipush 63
	iand 
	ior 
	i2c 
	castore 
	goto Label194
Label162:
	aload_0 
	iinc 4 1
	iload_4 
	baload 
	i2c 
	istore_6 
	aload_0 
	iinc 4 1
	iload_4 
	baload 
	i2c 
	istore_7 
	aload 11
	iload 12
	iinc 12 1
	iload_5 
	bipush 15
	iand 
	bipush 12
	ishl 
	iload_6 
	bipush 63
	iand 
	bipush 6
	ishl 
	ior 
	iload_7 
	bipush 63
	iand 
	ior 
	i2c 
	castore 
Label194:
	iinc 4 1
	goto Label118
Label196:
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload 11
	iconst_0 
	iload 12
	invokespecial_lib java.lang.String.<init> // pc=4
	astore_3 
	aload 10
	monitorexit 
	goto Label211
	astore 13
	aload 10
	monitorexit 
	aload 13
	athrow 
Label211:
	aload_3 
	invokestatic java.lang.String intern( java.lang.String ) // CharacterHelper
	areturn 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	synch_static CharacterHelper
	clinit_wait 
	bipush 8
	newarray 3
	putstatic _chars // CharacterHelper
	getstatic _chars // CharacterHelper
	putstatic _charLock // CharacterHelper
	clinit_return 
	}

}
