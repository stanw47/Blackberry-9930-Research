// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 18
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ByteCodeInstructions extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  _hasError ; // ofs = 17008 addr = 0)
	private boolean /*boolean*/  _merged ; // ofs = 17012 addr = 0)
	private net.rim.tools.compiler.analysis.Instruction /*net.rim.tools.compiler.analysis.Instruction*/  _instruction ; // ofs = 17016 addr = 0)
	private int[] /*int[]*/  _opcodes ; // ofs = 17020 addr = 0)
	private int[] /*int[]*/  _ops ; // ofs = 17024 addr = 0)
	private int /*int*/  _numInstructions ; // ofs = 17028 addr = 0)
	private net.rim.tools.compiler.analysis.Instruction /*net.rim.tools.compiler.analysis.Instruction[]*/  _instructions ; // ofs = 17032 addr = 0)
	private net.rim.tools.compiler.analysis.InstructionTarget /*net.rim.tools.compiler.analysis.InstructionTarget[]*/  _targets ; // ofs = 17036 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeExceptionRange /*net.rim.tools.compiler.classfile.ByteCodeExceptionRange[]*/  _exceptionRanges ; // ofs = 17040 addr = 0)
	private int /*int*/  _numStackEntries ; // ofs = 17044 addr = 0)
	private int /*int*/  _length ; // ofs = 17048 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.<init> // pc=2
	return 
	}


public <init>( net.rim.tools.compiler.classfile.ByteCodeInstructions, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iload_1 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final addInstruction( net.rim.tools.compiler.classfile.ByteCodeInstructions, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label29
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	istore_2 
	iload_2 
	ifne Label9
	bipush 8
	istore_2 
Label9:
	aload_0 
	iload_2 
	newarray 5
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iload_2 
	newarray 5
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iload_2 
	newarray_object_lib net.rim.tools.compiler.analysis.Instruction//net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new_lib net.rim.tools.compiler.analysis.Instruction//net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction
	dup 
	iconst_0 
	iconst_0 
	invokespecial_lib .routine_19241 // pc=3
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	goto Label57
Label29:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	arraylength 
	if_icmpne Label57
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	arraylength 
	bipush 2
	imul 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19098(  ) // class#29
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	arraylength 
	bipush 2
	imul 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19098(  ) // class#29
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	arraylength 
	bipush 2
	imul 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19174(  ) // class#29
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label57:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	aastore 
	return 
	}


private final setOpcode( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	isub 
	istore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_4 
	iload_1 
	bipush 12
	ishl 
	iload_2 
	sipush 4095
	iand 
	ior 
	iastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	iload_3 
	iastore 
	return 
	}


private final insertTarget( net.rim.tools.compiler.classfile.ByteCodeInstructions, net.rim.tools.compiler.analysis.InstructionTarget, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_3 
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_3 
	iconst_1 
	iadd 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19193(  ) // class#29
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	iload_3 
	if_icmpge Label24
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	iconst_1 
	iadd 
	iload_3 
	iload_2 
	isub 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
Label24:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	aload_1 
	aastore 
	return 
	}


private final int findTarget( net.rim.tools.compiler.classfile.ByteCodeInstructions, net.rim.tools.compiler.analysis.InstructionTarget[], int, int ); // address: 0
	{
	enter 
	bipush -1
	istore_4 
	iconst_0 
	istore_5 
	iload_2 
	iconst_1 
	isub 
	istore_6 
	iload_2 
	ifle Label45
Label11:
	iload_5 
	iload_6 
	iadd 
	bipush 2
	idiv 
	istore_7 
	aload_1 
	iload_7 
	aaload 
	invokenonvirtual_lib .routine_18932 // pc=1
	istore 8
	iload_3 
	iload 8
	if_icmpge Label30
	iload_7 
	iconst_1 
	isub 
	istore_6 
	goto Label42
Label30:
	iload_3 
	iload 8
	if_icmpne Label38
	iload_7 
	iconst_1 
	isub 
	istore_4 
	goto Label45
Label38:
	iload_7 
	iconst_1 
	iadd 
	istore_5 
Label42:
	iload_5 
	iload_6 
	if_icmple Label11
Label45:
	iload_4 
	ifge Label58
	iload_5 
	iload_6 
	iadd 
	bipush 2
	idiv 
	istore_4 
	iinc 4 -1
	iload_4 
	ifge Label58
	iconst_0 
	istore_4 
Label58:
	iload_4 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final mergeArray( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label4
	goto_w Label154
Label4:
	aload_0 
	iconst_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label10
	return 
Label10:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iinc 1 -1
	iload_1 
	aaload 
	astore_2 
	aload_2 
	invokevirtual int getIp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	istore_4 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iinc 4 -1
	iload_4 
	aaload 
	astore_5 
	aload_5 
	ifnonnull Label39
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_4 
	iaload 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	iaload 
	invokevirtual net.rim.tools.compiler.analysis.Instruction setValueOp( net.rim.tools.compiler.analysis.Instruction, int, int ) // pc=3
	astore_5 
Label39:
	aload_5 
	invokevirtual int getIp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_6 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	iadd 
	istore_7 
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_7 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19098(  ) // class#29
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_7 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19098(  ) // class#29
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_7 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19174(  ) // class#29
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label62:
	aload_2 
	ifnonnull Label67
	aload_5 
	ifnonnull Label67
	goto_w Label150
Label67:
	iload_6 
	iload_3 
	if_icmplt Label117
	iinc 7 -1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_7 
	aload_5 
	invokevirtual int getValue( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_7 
	aload_5 
	invokevirtual int getOp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	aload_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_acmpne Label86
	aconst_null 
	astore_5 
Label86:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_7 
	aload_5 
	aastore 
	iload_4 
	ifle Label112
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iinc 4 -1
	iload_4 
	aaload 
	astore_5 
	aload_5 
	ifnonnull Label108
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_4 
	iaload 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	iaload 
	invokevirtual net.rim.tools.compiler.analysis.Instruction setValueOp( net.rim.tools.compiler.analysis.Instruction, int, int ) // pc=3
	astore_5 
Label108:
	aload_5 
	invokevirtual int getIp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_6 
	goto Label62
Label112:
	aconst_null 
	astore_5 
	iipush -2147483648
	istore_6 
	goto Label62
Label117:
	iinc 7 -1
	aload_2 
	ifnull Label134
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_7 
	aload_2 
	invokevirtual int getValue( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_7 
	aload_2 
	invokevirtual int getOp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_7 
	aload_2 
	aastore 
Label134:
	iload_1 
	ifle Label145
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iinc 1 -1
	iload_1 
	aaload 
	astore_2 
	aload_2 
	invokevirtual int getIp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_3 
	goto_w Label62
Label145:
	aconst_null 
	astore_2 
	iipush -2147483648
	istore_3 
	goto_w Label62
Label150:
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	arraylength 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label154:
	return 
	}


public final int getNumInstructions( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	ireturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final net.rim.tools.compiler.analysis.Instruction getLastInstruction( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	isub 
	istore_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	aaload 
	astore_2 
	aload_2 
	ifnonnull Label21
	new_lib net.rim.tools.compiler.analysis.Instruction//net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction
	dup 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iaload 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	iaload 
	invokespecial_lib .routine_19241 // pc=3
	astore_2 
Label21:
	aload_2 
	areturn 
	}


public final int getLastOpcode( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	isub 
	iaload 
	ireturn 
	}


public final int getLastOp( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	isub 
	iaload 
	ireturn 
	}


public final addInstructionBranch( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionBranch//net.rim.tools.compiler.analysis.InstructionBranch net.rim.tools.compiler.analysis.InstructionBranch net.rim.tools.compiler.analysis.InstructionBranch
	dup 
	iload_1 
	iload_2 
	invokespecial_lib .routine_19446 // pc=3
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstruction( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstruction( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionBytes( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, int, byte[] ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionBytes//module:net_rim_loader.class#12 module:net_rim_loader.class#12 module:net_rim_loader.class#12
	dup 
	iload_1 
	iload_2 
	iload_3 
	aload_4 
	invokespecial_lib .routine_19554 // pc=5
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionLong( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionLong//module:net_rim_loader.class#16 module:net_rim_loader.class#16 module:net_rim_loader.class#16
	dup 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib .routine_23851 // pc=5
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionLong( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, int, long ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionLong//module:net_rim_loader.class#16 module:net_rim_loader.class#16 module:net_rim_loader.class#16
	dup 
	iload_1 
	iload_2 
	iload_3 
	lload 4
	invokespecial_lib .routine_23909 // pc=6
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionLong( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, long ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionLong//module:net_rim_loader.class#16 module:net_rim_loader.class#16 module:net_rim_loader.class#16
	dup 
	iload_1 
	iload_2 
	lload 3
	invokespecial_lib .routine_23880 // pc=5
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionStringArray( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	new InstructionStringArray
	dup 
	iload_1 
	iload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionStringArray.<init> // pc=4
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionString( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new InstructionString
	dup 
	iload_1 
	iload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionString.<init> // pc=4
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionType( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0 
	new InstructionType
	dup 
	iload_1 
	iload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionType.<init> // pc=4
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionType( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, net.rim.tools.compiler.types.Type, int ); // address: 0
	{
	enter 
	aload_0 
	new InstructionType
	dup 
	iload_1 
	iload_2 
	aload_3 
	iload_4 
	invokespecial net.rim.tools.compiler.analysis.InstructionType.<init> // pc=5
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_4 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionInts( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, int[], boolean ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionInts//module:net_rim_loader.class#15 module:net_rim_loader.class#15 module:net_rim_loader.class#15
	dup 
	iload_1 
	iload_2 
	aload_3 
	iload_4 
	invokespecial_lib .routine_23715 // pc=5
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionNameAndType( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionNameAndType//module:net_rim_loader.class#17 module:net_rim_loader.class#17 module:net_rim_loader.class#17
	dup 
	iload_1 
	iload_2 
	aload_3 
	aload_4 
	invokespecial_lib .routine_24304 // pc=5
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionNameAndType( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.NameAndType, boolean ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionNameAndType//module:net_rim_loader.class#17 module:net_rim_loader.class#17 module:net_rim_loader.class#17
	dup 
	iload_1 
	iload_2 
	aload_3 
	aload_4 
	iload_5 
	invokespecial_lib .routine_24362 // pc=6
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addInstructionNameAndType( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.NameAndType, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.analysis.InstructionNameAndType//module:net_rim_loader.class#17 module:net_rim_loader.class#17 module:net_rim_loader.class#17
	dup 
	iload_1 
	iload_2 
	aload_3 
	aload_4 
	iload_5 
	iload_6 
	invokespecial_lib .routine_24389 // pc=7
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstruction // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_5 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.setOpcode // pc=4
	return 
	}


public final addBranchTarget( net.rim.tools.compiler.classfile.ByteCodeInstructions, net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	isub 
	aaload 
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	aload_1 
	invokevirtual addBranchTarget( net.rim.tools.compiler.analysis.InstructionBranch, net.rim.tools.compiler.analysis.InstructionTarget ) // pc=2
Label13:
	return 
	}


public final int getNumTargets( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.analysis.InstructionTarget getTarget( net.rim.tools.compiler.classfile.ByteCodeInstructions, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	aaload 
	areturn 
	}


public final net.rim.tools.compiler.analysis.InstructionTarget plantTarget( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, boolean ); // address: 0
	{
	enter 
	iload_2 
	ifeq Label5
	iconst_1 
	goto Label6
Label5:
	iconst_0 
Label6:
	istore_3 
	aconst_null 
	astore_4 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label26
	aload_0 
	iconst_1 
	newarray_object InstructionTarget
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	new InstructionTarget
	dup 
	iload_1 
	iload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionTarget.<init> // pc=3
	astore_4 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_0 
	aload_4 
	aastore 
	goto Label74
Label26:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_5 
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_5 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.findTarget // pc=4
	istore_6 
Label35:
	iload_6 
	iload_5 
	if_icmpge Label64
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_6 
	aaload 
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_18932 // pc=1
	istore_7 
	iload_7 
	iload_1 
	if_icmpne Label58
	iload_2 
	ifeq Label56
	aload_4 
	aload_4 
	invokenonvirtual_lib .routine_18996 // pc=1
	iload_3 
	ior 
	invokenonvirtual_lib .routine_19007 // pc=2
Label56:
	aload_4 
	areturn 
Label58:
	iload_7 
	iload_1 
	if_icmple Label62
	goto Label64
Label62:
	iinc 6 1
	goto Label35
Label64:
	new InstructionTarget
	dup 
	iload_1 
	iload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionTarget.<init> // pc=3
	astore_4 
	aload_0 
	aload_4 
	iload_6 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.insertTarget // pc=3
Label74:
	aload_4 
	areturn 
	}


public final boolean hasError( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final markBadTarget( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	enter 
	aload_2 
	aload_2 
	invokenonvirtual_lib .routine_18996 // pc=1
	bipush 2
	ior 
	invokenonvirtual_lib .routine_19007 // pc=2
	aload_2 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	iadd 
	invokenonvirtual_lib .routine_18907 // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	iconst_1 
	isub 
	istore_3 
	iload_1 
	iload_3 
	if_icmpge Label34
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	iconst_1 
	iadd 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	iload_3 
	iload_1 
	isub 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_3 
	aload_2 
	aastore 
Label34:
	aload_0 
	iconst_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public final allocateExceptionRanges( net.rim.tools.compiler.classfile.ByteCodeInstructions, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label9
	iload_1 
	ifle Label9
	aload_0 
	iload_1 
	newarray_object ByteCodeExceptionRange
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label9:
	return 
	}


public final addExceptionRange( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, int, int, int, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0 
	iload_2 
	iconst_0 
	invokevirtual_short .virtual_26 // idx=26 pc=3
	astore_6 
	aload_0 
	iload_3 
	iconst_0 
	invokevirtual_short .virtual_26 // idx=26 pc=3
	astore_7 
	aload_0 
	iload_4 
	iconst_1 
	invokevirtual_short .virtual_26 // idx=26 pc=3
	astore 8
	new ByteCodeExceptionRange
	dup 
	aload_6 
	aload_7 
	aload 8
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeExceptionRange.<init> // pc=5
	astore 9
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	aload 9
	aastore 
	return 
	}


public final int getNumExceptionRanges( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeExceptionRange getExceptionRange( net.rim.tools.compiler.classfile.ByteCodeInstructions, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	aaload 
	areturn 
	}


public final addStackEntry( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iconst_0 
	invokevirtual_short .virtual_26 // idx=26 pc=3
	aload_2 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionTarget.setStackEntry // pc=2
	aload_0 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	iadd 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


public final int getNumStackEntries( net.rim.tools.compiler.classfile.ByteCodeInstructions ); // address: 0
	{
	ireturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final int setOffsets( net.rim.tools.compiler.classfile.ByteCodeInstructions, int, boolean ); // address: 0
	{
	enter 
	iload_1 
	istore_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	istore_4 
	iconst_0 
	istore_5 
Label7:
	iload_5 
	iload_4 
	if_icmpge Label42
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_5 
	aaload 
	astore_6 
	aload_6 
	ifnonnull Label25
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_5 
	iaload 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_5 
	iaload 
	invokevirtual net.rim.tools.compiler.analysis.Instruction setValueOp( net.rim.tools.compiler.analysis.Instruction, int, int ) // pc=3
	astore_6 
Label25:
	aload_6 
	iload_1 
	iload_2 
	invokevirtual int setOffset( net.rim.tools.compiler.analysis.Instruction, int, boolean ) // pc=3
	istore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_5 
	aload_6 
	invokevirtual int getValue( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_5 
	aload_6 
	invokevirtual int getOp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	iinc 5 1
	goto Label7
Label42:
	aload_0 
	iload_1 
	iload_3 
	isub 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_1 
	ireturn 
	}


public final boolean walkInstructions( net.rim.tools.compiler.classfile.ByteCodeInstructions, net.rim.tools.compiler.analysis.InstructionWalker ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	istore_2 
	iconst_0 
	istore_3 
Label5:
	iload_3 
	iload_2 
	if_icmpge Label38
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_3 
	aaload 
	astore_4 
	aload_4 
	ifnonnull Label23
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_3 
	iaload 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_3 
	iaload 
	invokevirtual net.rim.tools.compiler.analysis.Instruction setValueOp( net.rim.tools.compiler.analysis.Instruction, int, int ) // pc=3
	astore_4 
Label23:
	aload_4 
	aload_1 
	invokevirtual walkInstruction( net.rim.tools.compiler.analysis.Instruction, net.rim.tools.compiler.analysis.InstructionWalker ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_3 
	aload_4 
	invokevirtual int getValue( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_3 
	aload_4 
	invokevirtual int getOp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iastore 
	iinc 3 1
	goto Label5
Label38:
	iconst_0 
	ireturn 
	}


public final resolveBadLabel( net.rim.tools.compiler.classfile.ByteCodeInstructions, net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#26, boolean[], boolean ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_24 // idx=24 pc=1
	istore_5 
	iconst_0 
	istore_6 
Label6:
	iload_6 
	iload_5 
	if_icmplt Label10
	goto_w Label98
Label10:
	aload_0 
	iload_6 
	invokevirtual_short .virtual_25 // idx=25 pc=2
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_18932 // pc=1
	istore 8
	iload 8
	aload_3 
	arraylength 
	if_icmpge Label31
	aload_3 
	iload 8
	baload 
	ifne Label31
	aload_0 
	iload_6 
	aload_7 
	invokevirtual_short .virtual_28 // idx=28 pc=3
	iinc 6 -1
	goto_w Label96
Label31:
	aload_7 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionTarget.getStackEntry // pc=1
	astore 9
	aload 9
	ifnonnull Label71
	iload_4 
	ifeq Label39
	goto_w Label96
Label39:
	aload_1 
	invokevirtual boolean isPreverified( net.rim.tools.compiler.Compiler ) // pc=1
	ifne Label43
	goto_w Label96
Label43:
	aload_7 
	invokenonvirtual_lib .routine_18996 // pc=1
	iconst_1 
	iand 
	ifne Label49
	goto_w Label96
Label49:
	aload_2 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore 10
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload 10
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_327:"Missing stack map in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual_lib .routine_16530 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_328:" at label: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokenonvirtual_lib .routine_18932 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label71:
	aload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.verifyUninitializedOffsets // pc=1
	aload_7 
	invokenonvirtual_lib .routine_18996 // pc=1
	iconst_1 
	iand 
	ifne Label96
	aload_2 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore 10
	aload_1 
	aload 10
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_330:"Bad StackMap target in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual_lib .routine_16530 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_2 
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
Label96:
	iinc 6 1
	goto_w Label6
Label98:
	return 
	}

}
