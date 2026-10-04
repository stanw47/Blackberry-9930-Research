// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 10
// ########################################################


package net.rim.tools.compiler.util;


public class CompilerProperties extends java.util.Hashtable

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _seps ; // ofs = 10282 addr = 0)
	private char[] /*char[]*/  _buffer ; // ofs = 10286 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.util.CompilerProperties ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	aload_0 
	ldc literal_502:"()<>@,;:'"/[]?={} ?"
	putfield _seps   // get_name_1:  _seps   // get_name_2:  _seps   // get_Name:    _seps   // getName->1:  _seps   // getName->2:  _seps   // getName->N:  _seps   // ofs = 10282 ord = 0 addr = 0
	return 
	}


static public java.util.Vector vectorize( java.lang.String ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	aload_0 
	ifnull Label75
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	aload_0 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_2 
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label17:
	iload_4 
	iload_3 
	if_icmpge Label63
	aload_2 
	iload_4 
	invokevirtual char charAt( java.lang.StringBuffer, int ) // pc=2
	istore_5 
	iload_5 
	bipush 34
	if_icmpne Label33
	aload_2 
	iload_4 
	invokevirtual java.lang.StringBuffer deleteCharAt( java.lang.StringBuffer, int ) // pc=2
	pop 
	iinc 3 -1
	goto Label17
Label33:
	iload_5 
	bipush 59
	if_icmpne Label61
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	iconst_0 
	iload_4 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_0 
	iinc 4 1
	aload_2 
	iconst_0 
	iload_4 
	invokevirtual java.lang.StringBuffer delete( java.lang.StringBuffer, int, int ) // pc=3
	pop 
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
	aload_1 
	aload_0 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label17
	aload_1 
	aload_0 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label17
Label61:
	iinc 4 1
	goto Label17
Label63:
	iload_3 
	ifle Label75
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	astore_0 
	aload_1 
	aload_0 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label75
	aload_1 
	aload_0 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label75:
	aload_1 
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private int readConfigLine( net.rim.tools.compiler.util.CompilerProperties, java.io.InputStream ); // address: 0
	{
	enter 
	iconst_1 
	istore_2 
	iconst_0 
	istore_3 
	bipush -1
	istore_4 
	iconst_0 
	istore_5 
Label9:
	aload_1 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_6 
	iload_6 
	ifge Label16
	bipush -1
	ireturn 
Label16:
	iload_6 
	bipush 13
	if_icmpne Label20
	goto Label9
Label20:
	iload_6 
	bipush 10
	if_icmpne Label24
	goto_w Label126
Label24:
	iload_2 
	ifeq Label30
	iload_6 
	bipush 32
	if_icmpgt Label30
	goto Label9
Label30:
	iconst_0 
	istore_2 
	iload_6 
	bipush 35
	if_icmpne Label37
	iconst_1 
	istore_3 
Label37:
	iload_3 
	ifeq Label40
	goto Label9
Label40:
	iload_6 
	bipush 37
	if_icmpne Label107
	iload_4 
	bipush -1
	if_icmpne Label51
	iload_5 
	iconst_1 
	iadd 
	istore_4 
	goto Label107
Label51:
	iload_4 
	iload_5 
	if_icmpeq Label104
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iload_4 
	iload_5 
	iload_4 
	isub 
	invokespecial_lib java.lang.String.<init> // pc=4
	astore_7 
	iload_4 
	iconst_1 
	isub 
	istore_5 
	aload_0 
	aload_7 
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore 8
	aload 8
	ifnull Label104
	aload 8
	stringlength 
	istore 9
	iload_5 
	iload 9
	iadd 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	arraylength 
	if_icmplt Label90
	aload_0 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	arraylength 
	iload 9
	iadd 
	invokestatic char[] resize( char[], int ) // MyArrays
	putfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
Label90:
	iconst_0 
	istore 10
Label92:
	iload 10
	iload 9
	if_icmpge Label104
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iload_5 
	iinc 5 1
	aload 8
	iload 10
	stringaload 
	castore 
	iinc 10 1
	goto Label92
Label104:
	bipush -1
	istore_4 
	goto_w Label9
Label107:
	iload_5 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	arraylength 
	if_icmpne Label119
	aload_0 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	arraylength 
	bipush 2
	imul 
	invokestatic char[] resize( char[], int ) // MyArrays
	putfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
Label119:
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iload_5 
	iinc 5 1
	iload_6 
	i2c 
	castore 
	goto_w Label9
Label126:
	iload_5 
	ifle Label137
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iload_5 
	iconst_1 
	isub 
	caload 
	bipush 32
	if_icmpgt Label137
	iinc 5 -1
	goto Label126
Label137:
	iload_5 
	ireturn 
	}


private java.util.Vector storeProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label28
	aload_2 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label28
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmpne Label22
	aload_0 
	aload_1 
	aload_2 
	invokevirtual java.lang.Object firstElement( java.util.Vector ) // pc=1
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokevirtual java.lang.Object setProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.lang.String ) // pc=3
	pop 
	aload_2 
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_2 
	areturn 
Label22:
	aload_0 
	aload_1 
	aload_2 
	invokevirtual putVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.util.Vector ) // pc=3
	aconst_null 
	astore_2 
Label28:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public java.lang.Object setProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual routine
	areturn 
	}


public java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokevirtual routine
	astore_2 
	aload_2 
	ifnonnull Label9
	aconst_null 
	areturn 
Label9:
	aload_2 
	checkcastbranch_lib 
	areturn 
Label12:
	aload_2 
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_3 
	aload_3 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label22
	aload_3 
	invokevirtual java.lang.Object firstElement( java.util.Vector ) // pc=1
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
Label22:
	aconst_null 
	areturn 
	}


public java.lang.String getQuotedProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_2 
	aload_2 
	ifnull Label10
	aload_2 
	stringlength 
	ifne Label12
Label10:
	aconst_null 
	areturn 
Label12:
	aload_2 
	iconst_0 
	stringaload 
	bipush 34
	if_icmpne Label25
	aload_2 
	iconst_1 
	aload_2 
	stringlength 
	iconst_1 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	areturn 
Label25:
	aload_2 
	areturn 
	}


public putVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual routine
	pop 
	return 
	}


public java.util.Vector getVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokevirtual routine
	astore_3 
	aload_3 
	ifnonnull Label17
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual putVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.util.Vector ) // pc=3
	aload_2 
	areturn 
Label17:
	aload_3 
	checkcastbranch_lib 
	invokestatic java.util.Vector vectorize( java.lang.String ) // CompilerProperties
	astore_2 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual putVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.util.Vector ) // pc=3
	aload_2 
	areturn 
Label27:
	aload_3 
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_2 
	aload_2 
	areturn 
	}


public java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokevirtual java.util.Vector getVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label66
	iload_2 
	ifeq Label66
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_5 
	iconst_0 
	istore_6 
Label19:
	iload_6 
	iload_4 
	if_icmpge Label66
	aload_3 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_7 
	aload_7 
	ifnull Label64
	iconst_0 
	istore 8
	aload_5 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
	aload_7 
	stringlength 
	istore 9
	iconst_0 
	istore 10
Label39:
	iload 10
	iload 9
	if_icmpge Label57
	aload_7 
	iload 10
	stringaload 
	istore 11
	iload 11
Label48:
	iconst_1 
	istore 8
	goto Label55
Label51:
	aload_5 
	iload 11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label55:
	iinc 10 1
	goto Label39
Label57:
	iload 8
	ifeq Label64
	aload_3 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	iload_6 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
Label64:
	iinc 6 1
	goto Label19
Label66:
	aload_0 
	aload_1 
	invokevirtual routine
	pop 
	aload_3 
	areturn 
	}


public readDefFile( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.io.InputStream ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	ifnonnull Label11
	aload_0 
	bipush 32
	newarray 3
	putfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
Label11:
	iconst_0 
	istore_5 
Label13:
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.util.CompilerProperties.readConfigLine // pc=2
	istore_6 
	iload_6 
	bipush -1
	if_icmpne Label21
	goto_w Label153
Label21:
	iinc 5 1
	iload_6 
	ifne Label25
	goto Label13
Label25:
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iconst_0 
	caload 
	bipush 91
	if_icmpeq Label31
	goto_w Label107
Label31:
	iinc 6 -1
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iload_6 
	caload 
	bipush 93
	if_icmpeq Label63
	iinc 6 1
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_493:"("
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_494:"): Error!: Expecting ']' but found '"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iconst_0 
	iload_6 
	invokespecial_lib java.lang.String.<init> // pc=4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_495:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label63:
	iinc 6 -1
	aload_0 
	aload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.util.CompilerProperties.storeProperty // pc=3
	astore_4 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iconst_1 
	iload_6 
	invokespecial_lib java.lang.String.<init> // pc=4
	astore_3 
	aload_0 
	aload_3 
	invokevirtual routine
	astore_7 
	aload_7 
	ifnonnull Label90
	aload_4 
	ifnull Label85
	goto_w Label13
Label85:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_4 
	goto_w Label13
Label90:
	aload_7 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifeq Label103
	aload_4 
	ifnonnull Label99
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_4 
Label99:
	aload_4 
	aload_7 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto_w Label13
Label103:
	aload_7 
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_4 
	goto_w Label13
Label107:
	aload_3 
	ifnonnull Label134
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_493:"("
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_496:"): Error!: Expecting '[' but found '"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iconst_0 
	iload_6 
	invokespecial_lib java.lang.String.<init> // pc=4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_495:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label134:
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_0_getfield _buffer   // get_name_1:  _buffer   // get_name_2:  _buffer   // get_Name:    _buffer   // getName->1:  _buffer   // getName->2:  _buffer   // getName->N:  _buffer   // ofs = 10286 ord = 1 addr = 0
	iconst_0 
	iload_6 
	invokespecial_lib java.lang.String.<init> // pc=4
	astore_7 
	aload_4 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label149
	aload_4 
	aload_7 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label149
	goto_w Label13
Label149:
	aload_4 
	aload_7 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto_w Label13
Label153:
	aload_0 
	aload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.util.CompilerProperties.storeProperty // pc=3
	astore_4 
	return 
	}


public load( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_1 
	stringlength 
	istore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label16:
	iload_7 
	ifeq Label19
	goto_w Label318
Label19:
	iconst_0 
	istore 8
	iconst_0 
	istore 9
	aload_6 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
Label26:
	iload_2 
	iload_3 
	if_icmpne Label36
	aload_6 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifne Label33
	return 
Label33:
	iconst_1 
	istore_4 
	goto Label86
Label36:
	aload_1 
	iload_2 
	iinc 2 1
	stringaload 
	istore 9
	iload 9
	bipush 13
	if_icmpeq Label47
	iload 9
	bipush 10
	if_icmpne Label56
Label47:
	aload_6 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifne Label53
	iconst_0 
	istore_4 
	goto Label26
Label53:
	iconst_1 
	istore_4 
	goto Label86
Label56:
	iinc 8 1
	iload 9
	bipush 58
	if_icmpne Label61
	goto Label86
Label61:
	iload 9
	bipush 61
	if_icmpne Label65
	goto Label86
Label65:
	iload 9
	bipush 31
	if_icmple Label77
	iload 9
	bipush 127
	if_icmpeq Label77
	aload_0_getfield _seps   // get_name_1:  _seps   // get_name_2:  _seps   // get_Name:    _seps   // getName->1:  _seps   // getName->2:  _seps   // getName->N:  _seps   // ofs = 10282 ord = 0 addr = 0
	iload 9
	i2c 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpeq Label80
Label77:
	iconst_1 
	istore_4 
	goto Label26
Label80:
	aload_6 
	iload 9
	i2c 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label26
Label86:
	aload_6 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifne Label94
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_497:"Invalid empty key name in property"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label94:
	iload_4 
	ifeq Label110
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_498:"Invalid key name in property: '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_499:"'."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label110:
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	astore 10
	aload_6 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
Label116:
	iload_2 
	iload_3 
	if_icmpne Label122
	iconst_1 
	istore_7 
	goto_w Label263
Label122:
	aload_1 
	iload_2 
	iinc 2 1
	stringaload 
	istore 9
	iload 9
	bipush 13
	if_icmpne Label131
	goto Label116
Label131:
	iload 9
	bipush 10
	if_icmpne Label155
	iload 8
	bipush 72
	if_icmpeq Label141
	iload 8
	bipush 70
	if_icmpeq Label141
	goto_w Label263
Label141:
	iload_2 
	iload_3 
	if_icmplt Label145
	goto_w Label263
Label145:
	aload_1 
	iload_2 
	stringaload 
	bipush 32
	if_icmpeq Label151
	goto_w Label263
Label151:
	iinc 2 1
	iconst_1 
	istore 8
	goto Label116
Label155:
	iinc 8 1
	iload 9
	bipush 32
	if_icmpeq Label162
	iload 9
	bipush 9
	if_icmpne Label166
Label162:
	aload_6 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifne Label166
	goto Label116
Label166:
	iload 9
	bipush 92
	if_icmpeq Label170
	goto_w Label246
Label170:
	iload_2 
	iload_3 
	if_icmplt Label174
	goto_w Label246
Label174:
	aload_1 
	iload_2 
	stringaload 
	bipush 117
	if_icmpne Label246
	iinc 2 1
	iconst_0 
	istore 9
	iconst_0 
	istore 11
Label184:
	iload 11
	bipush 4
	if_icmpge Label246
	iload_2 
	iload_3 
	if_icmpge Label246
	aload_1 
	iload_2 
	iinc 2 1
	stringaload 
	istore 12
	iconst_0 
	istore 13
	bipush 48
	iload 12
	if_icmpgt Label208
	iload 12
	bipush 57
	if_icmpgt Label208
	iload 12
	bipush 48
	isub 
	istore 13
	goto Label237
Label208:
	bipush 97
	iload 12
	if_icmpgt Label221
	iload 12
	bipush 102
	if_icmpgt Label221
	iload 12
	bipush 97
	isub 
	bipush 10
	iadd 
	istore 13
	goto Label237
Label221:
	bipush 65
	iload 12
	if_icmpgt Label234
	iload 12
	bipush 70
	if_icmpgt Label234
	iload 12
	bipush 65
	isub 
	bipush 10
	iadd 
	istore 13
	goto Label237
Label234:
	iconst_1 
	istore_7 
	goto Label246
Label237:
	iinc 8 1
	iload 9
	bipush 4
	ishl 
	iload 13
	iadd 
	istore 9
	iinc 11 1
	goto Label184
Label246:
	iload 9
	bipush 31
	if_icmple Label252
	iload 9
	bipush 127
	if_icmpne Label257
Label252:
	iload 9
	bipush 9
	if_icmpeq Label257
	iconst_1 
	istore_5 
Label257:
	aload_6 
	iload 9
	i2c 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto_w Label116
Label263:
	aload_6 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	istore 8
	iconst_0 
	istore 11
Label268:
	iinc 8 -1
	iload 8
	iflt Label284
	aload_6 
	iload 8
	invokevirtual char charAt( java.lang.StringBuffer, int ) // pc=2
	dup 
	istore 9
	bipush 32
	if_icmpeq Label281
	iload 9
	bipush 9
	if_icmpne Label284
Label281:
	iconst_1 
	istore 11
	goto Label268
Label284:
	iload 11
	ifeq Label290
	aload_6 
	iinc 8 1
	iload 8
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
Label290:
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	astore 12
	iload_5 
	ifeq Label312
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_500:"Value for key: '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_501:"', is invalid: '"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_499:"'."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label312:
	aload_0 
	aload 10
	aload 12
	invokevirtual routine
	pop 
	goto_w Label16
Label318:
	return 
	}

}
