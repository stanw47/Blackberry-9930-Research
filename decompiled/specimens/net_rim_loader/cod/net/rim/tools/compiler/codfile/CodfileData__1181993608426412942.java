// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 34
// ########################################################


package net.rim.tools.compiler.codfile;


public class CodfileData extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	protected boolean /*boolean*/  _needsHeader ; // ofs = 18654 addr = 0)
	protected boolean /*boolean*/  _isString ; // ofs = 18658 addr = 0)
	protected int /*int*/  _arrayType ; // ofs = 18662 addr = 0)
	protected int /*int*/  _length ; // ofs = 18666 addr = 0)
	protected byte[] /*byte[]*/  _bytes ; // ofs = 18670 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( net.rim.tools.compiler.codfile.CodfileData ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.codfile.CodfileItem )
	}


protected <init>( net.rim.tools.compiler.codfile.CodfileData, byte[], int, boolean, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_1 
	arraylength 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	iload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iload_3 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iload_4 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


static int elementSize( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	tableswitch  :
		
		
		
		
		
		
		

Label3:
	iconst_1 
	ireturn 
Label5:
	iconst_1 
	ireturn 
Label7:
	bipush 2
	ireturn 
Label9:
	bipush 2
	ireturn 
Label11:
	bipush 4
	ireturn 
Label13:
	bipush 8
	ireturn 
Label15:
	iconst_1 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public write( net.rim.tools.compiler.codfile.CodfileData, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic int elementSize( int ) // CodfileData
	istore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label52
	aload_1 
	bipush 4
	invokevirtual int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	pop 
	iload_2 
	bipush 8
	if_icmpne Label21
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	bipush 7
	iand 
	ifne Label21
	aload_1 
	iconst_0 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label21:
	iipush -805306368
	istore_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label29
	iload_3 
	iipush 136314880
	ior 
	istore_3 
Label29:
	iload_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 17
	ishl 
	iipush 1966080
	iand 
	ior 
	istore_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	idiv 
	istore_4 
	iload_3 
	iload_4 
	iconst_0 
	ishl 
	iipush 131071
	iand 
	ior 
	istore_3 
	aload_1 
	iload_3 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label52:
	aload_1 
	iload_2 
	invokevirtual int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokevirtual routine
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual write( net.rim.tools.compiler.io.StructuredOutputStream, byte[] ) // pc=2
	aload_0 
	aload_1 
	invokevirtual writeTerminator( net.rim.tools.compiler.codfile.CodfileData, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokevirtual routine
	return 
	}


abstract public writeTerminator( net.rim.tools.compiler.codfile.CodfileData, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	halt 
	}


public setNeedsHeader( net.rim.tools.compiler.codfile.CodfileData ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public boolean getNeedsHeader( net.rim.tools.compiler.codfile.CodfileData ); // address: 0
	{
	ireturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public setArrayType( net.rim.tools.compiler.codfile.CodfileData, int ); // address: 0
	{
	putfield_return .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public int length( net.rim.tools.compiler.codfile.CodfileData ); // address: 0
	{
	ireturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public int compareTo( net.rim.tools.compiler.codfile.CodfileData, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast CodfileData
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_0 
	ireturn 
Label9:
	aload_2 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	astore_3 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label16
	iconst_1 
	ireturn 
Label16:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	istore_4 
	iload_4 
	aload_3 
	arraylength 
	if_icmple Label26
	aload_3 
	arraylength 
	istore_4 
Label26:
	iconst_0 
	istore_5 
Label28:
	iload_5 
	iload_4 
	if_icmpge Label52
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	baload 
	sipush 255
	iand 
	istore_6 
	aload_3 
	iload_5 
	baload 
	sipush 255
	iand 
	istore_7 
	iload_6 
	iload_7 
	if_icmpeq Label50
	iload_6 
	iload_7 
	isub 
	ireturn 
Label50:
	iinc 5 1
	goto Label28
Label52:
	iload_4 
	aload_3 
	arraylength 
	if_icmpge Label58
	bipush -1
	ireturn 
Label58:
	iload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	if_icmpge Label64
	iconst_1 
	ireturn 
Label64:
	iconst_0 
	ireturn 
	}

}
