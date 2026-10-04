// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 42
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPoolArrayData extends net.rim.tools.compiler.classfile.ConstantPoolEntry
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _arrayType ; // ofs = 19224 addr = 0)
	private byte[] /*byte[]*/  _bytes ; // ofs = 19228 addr = 0)
	private net.rim.tools.compiler.classfile.ConstantPoolFieldRef /*net.rim.tools.compiler.classfile.ConstantPoolFieldRef*/  _fieldRef ; // ofs = 19232 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolArrayData, int, long[], net.rim.tools.compiler.classfile.ConstantPoolFieldRef ); // address: 0
	{
	enter 
	aload_0 
	bipush -1
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	aload_0 
	iload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	tableswitch  :
		
		
		
		
		
		
		

Label12:
	aload_0 
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolArrayData.byteToByte // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
Label18:
	aload_0 
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolArrayData.charToByte // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
Label24:
	aload_0 
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolArrayData.intToByte // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
Label30:
	aload_0 
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolArrayData.longToByte // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label35:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final byte[] byteToByte( net.rim.tools.compiler.classfile.ConstantPoolArrayData, long[] ); // address: 0
	{
	enter 
	aload_1 
	arraylength 
	newarray 2
	astore_2 
	iconst_0 
	istore_3 
Label7:
	iload_3 
	aload_1 
	arraylength 
	if_icmpge Label21
	aload_2 
	iload_3 
	aload_1 
	iload_3 
	laload 
	l2i 
	i2b 
	bastore 
	iinc 3 1
	goto Label7
Label21:
	aload_2 
	areturn 
	}


private final byte[] charToByte( net.rim.tools.compiler.classfile.ConstantPoolArrayData, long[] ); // address: 0
	{
	enter 
	bipush 2
	aload_1 
	arraylength 
	imul 
	newarray 2
	astore_2 
	iconst_0 
	istore_3 
Label9:
	iload_3 
	aload_1 
	arraylength 
	if_icmpge Label51
	aload_1 
	iload_3 
	laload 
	lstore 4
	lload 4
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore_6 
	lload 4
	bipush 8
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore_7 
	aload_2 
	bipush 2
	iload_3 
	imul 
	iconst_0 
	iadd 
	iload_6 
	bastore 
	aload_2 
	bipush 2
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_7 
	bastore 
	iinc 3 1
	goto Label9
Label51:
	aload_2 
	areturn 
	}


private final byte[] intToByte( net.rim.tools.compiler.classfile.ConstantPoolArrayData, long[] ); // address: 0
	{
	enter 
	bipush 4
	aload_1 
	arraylength 
	imul 
	newarray 2
	astore_2 
	iconst_0 
	istore_3 
Label9:
	iload_3 
	aload_1 
	arraylength 
	if_icmpge Label85
	aload_1 
	iload_3 
	laload 
	lstore 4
	lload 4
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore_6 
	lload 4
	bipush 8
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore_7 
	lload 4
	bipush 16
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 8
	lload 4
	bipush 24
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 9
	aload_2 
	bipush 4
	iload_3 
	imul 
	iconst_0 
	iadd 
	iload_6 
	bastore 
	aload_2 
	bipush 4
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_7 
	bastore 
	aload_2 
	bipush 4
	iload_3 
	imul 
	bipush 2
	iadd 
	iload 8
	bastore 
	aload_2 
	bipush 4
	iload_3 
	imul 
	bipush 3
	iadd 
	iload 9
	bastore 
	iinc 3 1
	goto Label9
Label85:
	aload_2 
	areturn 
	}


private final byte[] longToByte( net.rim.tools.compiler.classfile.ConstantPoolArrayData, long[] ); // address: 0
	{
	enter 
	bipush 8
	aload_1 
	arraylength 
	imul 
	newarray 2
	astore_2 
	iconst_0 
	istore_3 
Label9:
	iload_3 
	aload_1 
	arraylength 
	if_icmplt Label14
	goto_w Label154
Label14:
	aload_1 
	iload_3 
	laload 
	lstore 4
	lload 4
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore_6 
	lload 4
	bipush 8
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore_7 
	lload 4
	bipush 16
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 8
	lload 4
	bipush 24
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 9
	lload 4
	bipush 32
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 10
	lload 4
	bipush 40
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 11
	lload 4
	bipush 48
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 12
	lload 4
	bipush 56
	lshr 
	sipush 255
	i2l 
	land 
	l2i 
	i2b 
	istore 13
	aload_2 
	bipush 8
	iload_3 
	imul 
	iconst_0 
	iadd 
	iload_6 
	bastore 
	aload_2 
	bipush 8
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_7 
	bastore 
	aload_2 
	bipush 8
	iload_3 
	imul 
	bipush 2
	iadd 
	iload 8
	bastore 
	aload_2 
	bipush 8
	iload_3 
	imul 
	bipush 3
	iadd 
	iload 9
	bastore 
	aload_2 
	bipush 8
	iload_3 
	imul 
	bipush 4
	iadd 
	iload 10
	bastore 
	aload_2 
	bipush 8
	iload_3 
	imul 
	bipush 5
	iadd 
	iload 11
	bastore 
	aload_2 
	bipush 8
	iload_3 
	imul 
	bipush 6
	iadd 
	iload 12
	bastore 
	aload_2 
	bipush 8
	iload_3 
	imul 
	bipush 7
	iadd 
	iload 13
	bastore 
	iinc 3 1
	goto_w Label9
Label154:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getArrayType( net.rim.tools.compiler.classfile.ConstantPoolArrayData ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final byte[] getBytes( net.rim.tools.compiler.classfile.ConstantPoolArrayData ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final net.rim.tools.compiler.classfile.ConstantPoolFieldRef getFieldRef( net.rim.tools.compiler.classfile.ConstantPoolArrayData ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}

}
