// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 32
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class Codfile extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	protected int /*int*/  _flashId ; // ofs = 18452 addr = 0)
	protected int /*int*/  _timeStamp ; // ofs = 18456 addr = 0)
	protected int /*int*/  _userVersion ; // ofs = 18460 addr = 0)
	protected int /*int*/  _maxTypeListSize ; // ofs = 18464 addr = 0)
	protected int /*int*/  _version ; // ofs = 18468 addr = 0)
	protected int /*int*/  _flags ; // ofs = 18472 addr = 0)
	protected net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _routines ; // ofs = 18476 addr = 0)
	protected net.rim.tools.compiler.codfile.DataSection /*net.rim.tools.compiler.codfile.DataSection*/  _dataSection ; // ofs = 18480 addr = 0)
	protected int /*int*/  _codeSize ; // ofs = 18484 addr = 0)
	protected int /*int*/  _dataSize ; // ofs = 18488 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.Codfile, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.Codfile.init // pc=1
	aload_0 
	bipush 82
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


private <init>( net.rim.tools.compiler.codfile.Codfile ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final init( net.rim.tools.compiler.codfile.Codfile ); // address: 0
	{
	enter 
	aload_0 
	sipush -16162
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new DataSection
	dup 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.DataSection.<init> // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int write( net.rim.tools.compiler.codfile.Codfile, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual resetOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	bipush -1
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	bipush -1
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.assignClassRefOrdinals // pc=1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.harvestRoutines // pc=1
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	istore_2 
	aload_1 
	invokevirtual resetOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	aload_1 
	iconst_1 
	invokevirtual setWritingCode( net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_1 
	bipush 4
	invokevirtual int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	pop 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual setExtent( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int getExtent( net.rim.tools.compiler.codfile.CodfileVector ) // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_2 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	iadd 
	istore_2 
	aload_1 
	invokevirtual resetOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	aload_1 
	iconst_0 
	invokevirtual setWritingCode( net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.write // pc=2
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getExtent // pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_2 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	iadd 
	istore_2 
	aload_1 
	invokevirtual close( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	iload_2 
	ireturn 
	}


public final write( net.rim.tools.compiler.codfile.Codfile, java.io.OutputStream ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	new_lib net.rim.tools.compiler.io.StructuredOutputStream//net.rim.tools.compiler.io.StructuredOutputStream net.rim.tools.compiler.io.StructuredOutputStream net.rim.tools.compiler.io.StructuredOutputStream
	dup 
	aload_1 
	iconst_1 
	invokespecial_lib .routine_24741 // pc=3
	astore_2 
	aload_0 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.Codfile.write // pc=2
	pop 
	return 
	}


public final int count( net.rim.tools.compiler.codfile.Codfile, java.lang.String, java.lang.StringBuffer ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.io.StructuredOutputStreamCounter//module:net_rim_loader-2.class#47 module:net_rim_loader-2.class#47 module:net_rim_loader-2.class#47
	dup 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial_lib .routine_24994 // pc=2
	astore_3 
	aload_0 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.Codfile.write // pc=2
	istore_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iipush 65000
	if_icmpgt Label17
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iipush 65000
	if_icmpgt Label17
	goto_w Label79
Label17:
	iconst_0 
	istore_5 
	aload_2 
	ldc literal_342:"output file: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	ldc literal_343:".cod "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iipush 65000
	if_icmple Label49
	aload_2 
	ldc literal_344:"code section too large: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	ldc literal_345:" bytes"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iconst_1 
	istore_5 
Label49:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iipush 65000
	if_icmple Label73
	iload_5 
	ifeq Label60
	iconst_0 
	istore_5 
	aload_2 
	ldc literal_346:", "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label60:
	aload_2 
	ldc literal_347:"data section too large: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	ldc literal_348:" bytes.?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label73:
	iload_5 
	ifeq Label79
	aload_2 
	ldc literal_349:".?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label79:
	iload_4 
	ireturn 
	}


public final setTimeStamp( net.rim.tools.compiler.codfile.Codfile, int ); // address: 0
	{
	putfield_return .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final setMaxTypeListSize( net.rim.tools.compiler.codfile.Codfile, int ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final setFlags( net.rim.tools.compiler.codfile.Codfile, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	ior 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.setAttributes // pc=2
	return 
	}


public final net.rim.tools.compiler.codfile.DataSection getDataSection( net.rim.tools.compiler.codfile.Codfile ); // address: 0
	{
	areturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final net.rim.tools.compiler.codfile.CodfileVector getRoutines( net.rim.tools.compiler.codfile.Codfile ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}

}
