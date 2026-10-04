// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 46
// ########################################################


package net.rim.tools.compiler.io;


public class StructuredOutputStream extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  _writingCode ; // ofs = 12848 addr = 0)
	protected int /*int*/  _offset ; // ofs = 12852 addr = 0)
	private java.io.OutputStream /*java.io.OutputStream*/  _out ; // ofs = 12856 addr = 0)
	private byte[] /*byte[]*/  _buffer ; // ofs = 12860 addr = 0)
	private int /*int*/  _used ; // ofs = 12864 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


public <init>( net.rim.tools.compiler.io.StructuredOutputStream, java.io.OutputStream, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	iload_2 
	aconst_null 
	invokevirtual init( net.rim.tools.compiler.io.StructuredOutputStream, java.io.OutputStream, boolean, java.io.PrintStream ) // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected init( net.rim.tools.compiler.io.StructuredOutputStream, java.io.OutputStream, boolean, java.io.PrintStream ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	sipush 128
	newarray 2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public setWritingCode( net.rim.tools.compiler.io.StructuredOutputStream, boolean ); // address: 0
	{
	putfield_return .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public boolean writingCode( net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	ireturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public resetOffset( net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 3
	iand 
	ifeq Label10
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_546:"output stream offset may only be reset on 4 byte aligned boundary"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label10:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public flush( net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public write( net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	arraylength 
	if_icmpne Label17
	aload_0 
	invokevirtual flush( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
Label17:
	return 
	}


public int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter 
	iload_1 
	iconst_1 
	isub 
	istore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	iadd 
	iload_2 
	bipush -1
	ixor 
	iand 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	isub 
	istore_3 
	iload_3 
	istore_4 
Label17:
	iload_4 
	ifle Label24
	aload_0 
	iconst_0 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iinc 4 -1
	goto Label17
Label24:
	iload_3 
	ireturn 
	}


public write( net.rim.tools.compiler.io.StructuredOutputStream, byte[], int, int ); // address: 0
	{
	enter 
	iload_2 
	iload_3 
	iadd 
	istore_4 
	iload_2 
	istore_5 
Label7:
	iload_5 
	iload_4 
	if_icmpge Label17
	aload_0 
	aload_1 
	iload_5 
	baload 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iinc 5 1
	goto Label7
Label17:
	return 
	}


public write( net.rim.tools.compiler.io.StructuredOutputStream, byte[] ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, byte[], int, int ) // pc=4
	return 
	}


public writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_1 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public writeChar( net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 2
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_1 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	bipush 8
	ishr 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 2
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_1 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	bipush 8
	ishr 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public writeMultiByteShort( net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	iipush 65535
	iand 
	istore_1 
Label5:
	iload_1 
	bipush -128
	iand 
	ifeq Label21
	aload_0 
	iload_1 
	bipush 127
	iand 
	sipush 128
	ior 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iload_1 
	bipush 7
	iushr 
	istore_1 
	goto Label5
Label21:
	aload_0 
	iload_1 
	bipush 127
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 4
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_1 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	bipush 8
	ishr 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	bipush 16
	ishr 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	bipush 24
	ishr 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public writeLong( net.rim.tools.compiler.io.StructuredOutputStream, long ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 8
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	lload 1
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	lload 1
	bipush 8
	lshr 
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	lload 1
	bipush 16
	lshr 
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	lload 1
	bipush 24
	lshr 
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	lload 1
	bipush 32
	lshr 
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	lload 1
	bipush 40
	lshr 
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	lload 1
	bipush 48
	lshr 
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	lload 1
	bipush 56
	lshr 
	l2i 
	i2b 
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public close( net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual flush( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual close( java.io.OutputStream ) // pc=1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

}
