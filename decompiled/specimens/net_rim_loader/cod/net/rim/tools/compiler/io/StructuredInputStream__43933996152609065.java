// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 45
// ########################################################


package net.rim.tools.compiler.io;


abstract public final class StructuredInputStream extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private byte[] /*byte[]*/  _bytes ; // ofs = 12746 addr = 0)
	private int /*int*/  _delta ; // ofs = 12750 addr = 0)
	private int /*int*/  _length ; // ofs = 12754 addr = 0)
	private int /*int*/  _offset ; // ofs = 12758 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.io.StructuredInputStream, byte[], int, int, boolean, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iload_5 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public <init>( net.rim.tools.compiler.io.StructuredInputStream, byte[], boolean, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.io.StructuredInputStream.<init> // pc=6
	return 
	}


public <init>( net.rim.tools.compiler.io.StructuredInputStream, byte[], boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.io.StructuredInputStream.<init> // pc=6
	return 
	}


static public final byte[] readFully( java.io.InputStream, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	aload_2 
	invokestatic byte[] readAll( java.io.InputStream, int, java.lang.String ) // StructuredInputStream
	astore_3 
	aload_0 
	invokevirtual close( java.io.InputStream ) // pc=1
	aload_3 
	areturn 
	}


static public final byte[] readAll( java.io.InputStream, int, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	iload_1 
	bipush -1
	if_icmpne Label11
	aload_0 
	invokestatic_lib byte[] streamToBytes( java.io.InputStream ) // IOUtilities
	astore_3 
	aload_3 
	areturn 
Label11:
	iload_1 
	newarray 2
	astore_3 
	iconst_0 
	istore_4 
Label16:
	iload_4 
	iload_1 
	if_icmpge Label45
	aload_0 
	aload_3 
	iload_4 
	iload_1 
	iload_4 
	isub 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore_5 
	iload_5 
	ifgt Label40
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_545:"Unable to read all input from: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label40:
	iload_4 
	iload_5 
	iadd 
	istore_4 
	goto Label16
Label45:
	aload_3 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final byte[] getBytes( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final int getOffset( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	ireturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final int skipBytes( net.rim.tools.compiler.io.StructuredInputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	isub 
	istore_2 
	iload_2 
	ifge Label11
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	invokespecial_lib java.io.EOFException.<init> // pc=1
	athrow 
Label11:
	iload_1 
	iload_2 
	if_icmple Label18
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	invokespecial_lib java.io.EOFException.<init> // pc=1
	athrow 
Label18:
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iadd 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	ireturn 
	}


public final int read( net.rim.tools.compiler.io.StructuredInputStream, byte[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	isub 
	istore_2 
	iload_2 
	ifge Label11
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	invokespecial_lib java.io.EOFException.<init> // pc=1
	athrow 
Label11:
	aload_1 
	arraylength 
	istore_3 
	iload_3 
	iload_2 
	if_icmple Label19
	iload_2 
	istore_3 
Label19:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iadd 
	aload_1 
	iconst_0 
	iload_3 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_3 
	iadd 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_3 
	ireturn 
	}


public final int read( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_icmpne Label11
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	iadd 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	ireturn 
Label11:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_icmple Label18
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	invokespecial_lib java.io.EOFException.<init> // pc=1
	athrow 
Label18:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iadd 
	baload 
	ireturn 
	}


public final byte readByte( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.read // pc=1
	i2b 
	ireturn 
	}


public final int readUnsignedByte( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.read // pc=1
	sipush 255
	iand 
	ireturn 
	}


public final int readUnsignedShort( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readByte // pc=1
	istore_2 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readByte // pc=1
	istore_1 
	iload_1 
	sipush 255
	iand 
	iload_2 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	iipush 65535
	iand 
	ireturn 
	}


public final int readInt( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readByte // pc=1
	istore_4 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	istore_3 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	istore_2 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	istore_1 
	iload_1 
	sipush 255
	iand 
	iload_2 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	iload_3 
	sipush 255
	iand 
	bipush 16
	ishl 
	ior 
	iload_4 
	bipush 24
	ishl 
	ior 
	ireturn 
	}


public final long readLong( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readByte // pc=1
	i2l 
	lstore 15
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	i2l 
	lstore 13
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	i2l 
	lstore 11
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	i2l 
	lstore 9
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	i2l 
	lstore 7
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	i2l 
	lstore 5
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	i2l 
	lstore 3
	aload_0 
	invokenonvirtual net.rim.tools.compiler.io.StructuredInputStream.readUnsignedByte // pc=1
	i2l 
	lstore 1
	lload 1
	sipush 255
	i2l 
	land 
	lload 3
	sipush 255
	i2l 
	land 
	bipush 8
	lshl 
	lor 
	lload 5
	sipush 255
	i2l 
	land 
	bipush 16
	lshl 
	lor 
	lload 7
	sipush 255
	i2l 
	land 
	bipush 24
	lshl 
	lor 
	lload 9
	sipush 255
	i2l 
	land 
	bipush 32
	lshl 
	lor 
	lload 11
	sipush 255
	i2l 
	land 
	bipush 40
	lshl 
	lor 
	lload 13
	sipush 255
	i2l 
	land 
	bipush 48
	lshl 
	lor 
	lload 15
	bipush 56
	lshl 
	lor 
	lreturn 
	}


public final close( net.rim.tools.compiler.io.StructuredInputStream ); // address: 0
	{
	noenter_return 
	}

}
