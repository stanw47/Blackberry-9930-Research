// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 10
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeStackMapFrame extends net.rim.tools.compiler.classfile.AttributeStackMapEntry

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _frameValue ; // ofs = 16188 addr = 0)
	private int /*int*/  _codeOffsetDelta ; // ofs = 16192 addr = 0)
	private int /*int*/  _frameType ; // ofs = 16196 addr = 0)
	private int /*int*/  _numChopped ; // ofs = 16200 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeStackMapFrame, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapEntry.<init> // pc=1
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23550 // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapFrame.getFrameType // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	tableswitch  :
		
		
		
		
		
		
		
		
		

Label14:
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	goto_w Label87
Label18:
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 64
	isub 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_1 
	aload_2 
	iconst_1 
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ) // AttributeStackMapType
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	goto Label87
Label30:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_1 
	aload_2 
	iconst_1 
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ) // AttributeStackMapType
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	goto Label87
Label41:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	sipush 251
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	isub 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	goto Label87
Label51:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	goto Label87
Label56:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_1 
	aload_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 251
	isub 
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ) // AttributeStackMapType
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	goto Label87
Label69:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_1 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ) // AttributeStackMapType
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ) // AttributeStackMapType
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label87:
	iconst_1 
	istore_4 
	iload_3 
	bipush -1
	if_icmpne Label96
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label96:
	aload_0 
	iload_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iadd 
	iload_4 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int getFrameType( net.rim.tools.compiler.classfile.AttributeStackMapFrame, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	bipush 63
	if_icmpgt Label6
	iconst_0 
	ireturn 
Label6:
	iload_1 
	bipush 127
	if_icmpgt Label11
	iconst_1 
	ireturn 
Label11:
	iload_1 
	sipush 246
	if_icmpgt Label16
	bipush 2
	ireturn 
Label16:
	iload_1 
	sipush 247
	if_icmpgt Label21
	bipush 3
	ireturn 
Label21:
	iload_1 
	sipush 250
	if_icmpgt Label26
	bipush 4
	ireturn 
Label26:
	iload_1 
	sipush 251
	if_icmpgt Label31
	bipush 5
	ireturn 
Label31:
	iload_1 
	sipush 254
	if_icmpgt Label36
	bipush 6
	ireturn 
Label36:
	iload_1 
	sipush 255
	if_icmpgt Label41
	bipush 7
	ireturn 
Label41:
	bipush 2
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getFrameType( net.rim.tools.compiler.classfile.AttributeStackMapFrame ); // address: 0
	{
	ireturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final int getNumChopped( net.rim.tools.compiler.classfile.AttributeStackMapFrame ); // address: 0
	{
	ireturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}

}
