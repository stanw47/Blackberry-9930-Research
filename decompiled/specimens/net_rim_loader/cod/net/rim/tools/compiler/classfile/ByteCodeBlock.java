// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 14
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ByteCodeBlock extends Object
implements net.rim.tools.compiler.classfile.ByteCodeBlockTypes

{
	// @@@@@@@@@@@@@ Static fields 
	public static boolean /*boolean*/  ENABLE_COMMON_TAIL_OPT ; // ofs = 16672 addr = 42)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _index ; // ofs = 16604 addr = 0)
	private int /*int*/  _offset ; // ofs = 16608 addr = 0)
	private int /*int*/  _length ; // ofs = 16612 addr = 0)
	private int /*int*/  _type ; // ofs = 16616 addr = 0)
	private boolean /*boolean*/  _changed ; // ofs = 16620 addr = 0)
	private boolean /*boolean*/  _sequential ; // ofs = 16624 addr = 0)
	private boolean /*boolean*/  _fwdBranch ; // ofs = 16628 addr = 0)
	private boolean /*boolean*/  _backBranch ; // ofs = 16632 addr = 0)
	private boolean /*boolean*/  _exceptional ; // ofs = 16636 addr = 0)
	private int /*int*/  _startStack ; // ofs = 16640 addr = 0)
	private int /*int*/  _maxStack ; // ofs = 16644 addr = 0)
	private int /*int*/  _hiLocals ; // ofs = 16648 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeBlock /*net.rim.tools.compiler.classfile.ByteCodeBlock*/  _nextBlock ; // ofs = 16652 addr = 0)
	private net.rim.tools.compiler.analysis.InstructionStackEntry /*net.rim.tools.compiler.analysis.InstructionStackEntry*/  _stackEntry ; // ofs = 16656 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _instructions ; // ofs = 16660 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _branchTargets ; // ofs = 16664 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _exceptionHandlers ; // ofs = 16668 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ByteCodeBlock, int, int, net.rim.tools.compiler.classfile.ByteCodeBlock, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_2 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	bipush -1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_3 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	aload_4 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ByteCodeBlock
	clinit_wait 
	iconst_0 
	putstatic ENABLE_COMMON_TAIL_OPT // ByteCodeBlock
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setIndex( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	putfield_return .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final int getIndex( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final setOffset( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	putfield_return .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final int setOffsets( net.rim.tools.compiler.classfile.ByteCodeBlock, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore_3 
	iload_3 
	ifle Label23
	iconst_0 
	istore_4 
Label11:
	iload_4 
	iload_3 
	if_icmpge Label23
	aload_0 
	iload_4 
	invokevirtual_short .virtual_36 // idx=36 pc=2
	iload_1 
	iload_2 
	invokevirtual int setOffset( net.rim.tools.compiler.analysis.Instruction, int, boolean ) // pc=3
	istore_1 
	iinc 4 1
	goto Label11
Label23:
	aload_0 
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	isub 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	ireturn 
	}


public final int getOffset( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final setLength( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	putfield_return .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final int getLength( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final boolean containsOffset( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	if_icmpgt Label11
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	if_icmpge Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


public final setType( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final boolean is( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	if_icmpne Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public final setChanged( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final clearChanged( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final boolean isChanged( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public final setSequential( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public final boolean isSequential( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final boolean isSequentialOnly( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label11
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifne Label11
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifne Label11
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifne Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


public final boolean isNonSequential( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label9
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifne Label7
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifeq Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


public final setFwdBranch( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


public final boolean isFwdBranch( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final setBackBranch( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public final boolean isBackBranch( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final setExceptional( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public final clearLabelled( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	aload_0 
	aload_0 
	iconst_0 
	dup_x1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	dup_x1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	dup_x1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public final boolean isLabelled( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label7
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifne Label7
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifeq Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


public final setNextBlock( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	putfield_return .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock getNextBlock( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	areturn_field .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	}


public final setStackEntry( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	putfield_return .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	}


public final net.rim.tools.compiler.analysis.InstructionStackEntry getStackEntry( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	areturn_field .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	}


public final setInstruction( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.analysis.Instruction, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_1 
	iload_2 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
	}


public final insertInstruction( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.analysis.Instruction, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore_3 
	aload_3 
	ifnonnull Label12
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_0 
	aload_3 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label12:
	aload_3 
	aload_1 
	iload_2 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
	}


public final addInstruction( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore_2 
	aload_2 
	ifnonnull Label12
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_0 
	aload_2 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label12:
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final removeInstruction( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore_2 
	aload_2 
	iload_1 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label12
	aload_0 
	aconst_null 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label12:
	return 
	}


public final int getNumInstructions( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore_1 
	aload_1 
	ifnonnull Label7
	iconst_0 
	ireturn 
Label7:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final net.rim.tools.compiler.analysis.Instruction getInstruction( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.analysis.Instruction//net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction net.rim.tools.compiler.analysis.Instruction
	areturn 
	}


public final setBranchTarget( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	iload_2 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
	}


public final addBranchTarget( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	astore_2 
	aload_2 
	ifnonnull Label12
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_0 
	aload_2 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
Label12:
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final removeBranchTarget( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	astore_2 
	aload_2 
	iload_1 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label12
	aload_0 
	aconst_null 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
Label12:
	return 
	}


public final int getNumBranchTargets( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	astore_1 
	aload_1 
	ifnonnull Label7
	iconst_0 
	ireturn 
Label7:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock getBranchTarget( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ByteCodeBlock
	areturn 
	}


public final addExceptionHandler( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	astore_2 
	aload_2 
	ifnonnull Label12
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_0 
	aload_2 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label12:
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final int getNumExceptionHandlers( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	astore_1 
	aload_1 
	ifnonnull Label7
	iconst_0 
	ireturn 
Label7:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock getExceptionHandler( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ByteCodeBlock
	areturn 
	}


public final setStartStack( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	putfield_return .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final int getStartStack( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final int getMaxStack( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	}


public final setHiLocals( net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	putfield_return .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	}


public final int getHiLocals( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	ireturn_field .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	}


public final int cleanupBlock( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	aload_0 
	aconst_null 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	aconst_null 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	iconst_0 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aconst_null 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	aconst_null 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iload_1 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock splitBlock( net.rim.tools.compiler.classfile.ByteCodeBlock, int, boolean, boolean ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpne Label6
	aload_0 
	areturn 
Label6:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iadd 
	iload_1 
	isub 
	istore_4 
	aload_0 
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	isub 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aconst_null 
	astore_5 
	aconst_null 
	astore_6 
	iload_3 
	ifeq Label26
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	astore_5 
	goto Label28
Label26:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	astore_6 
Label28:
	new ByteCodeBlock
	dup 
	iload_1 
	iload_4 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBlock.<init> // pc=5
	astore_7 
	aload_0 
	aload_5 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iload_2 
	ifeq Label45
	aload_0 
	aload_7 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	goto Label48
Label45:
	aload_0 
	aconst_null 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label48:
	aload_0 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore 8
	iload 8
	iconst_1 
	isub 
	istore 9
Label55:
	iload 9
	iflt Label74
	aload_0 
	iload 9
	invokevirtual_short .virtual_36 // idx=36 pc=2
	astore 10
	aload 10
	invokevirtual int getIp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iload_1 
	if_icmplt Label74
	aload_0 
	iload 9
	invokevirtual_short .virtual_34 // idx=34 pc=2
	aload_7 
	aload 10
	iconst_0 
	invokevirtual_short .virtual_32 // idx=32 pc=3
	iinc 9 -1
	goto Label55
Label74:
	aload_0 
	invokevirtual_short .virtual_43 // idx=43 pc=1
	istore 8
	iconst_0 
	istore 9
Label79:
	iload 9
	iload 8
	if_icmpge Label89
	aload_7 
	aload_0 
	iload 9
	invokevirtual_short .virtual_44 // idx=44 pc=2
	invokevirtual_short .virtual_42 // idx=42 pc=2
	iinc 9 1
	goto Label79
Label89:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush 4
	if_icmpne Label98
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_7 
	bipush 4
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label98:
	aload_7 
	areturn 
	}


final mergeBlock( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label18
	aload_1 
	iload_3 
	invokevirtual_short .virtual_36 // idx=36 pc=2
	astore_4 
	aload_0 
	aload_4 
	invokevirtual_short .virtual_33 // idx=33 pc=2
	iinc 3 1
	goto Label6
Label18:
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	aload_1 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	invokevirtual_short .virtual_50 // idx=50 pc=1
	pop 
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	return 
	}


public final boolean walkBlock( net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.analysis.InstructionWalker ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
Label3:
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	aload_0 
	invokevirtual walkBlockStart( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.classfile.ByteCodeBlock ) // pc=2
	aload_0 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore_3 
	iconst_0 
	istore_4 
Label14:
	iload_4 
	iload_3 
	if_icmpge Label43
	aload_0 
	iload_4 
	invokevirtual_short .virtual_36 // idx=36 pc=2
	astore_5 
	aload_5 
	ifnull Label30
	aload_1 
	iload_4 
	aload_5 
	invokevirtual walkItemStart( net.rim.tools.compiler.analysis.InstructionWalker, int, net.rim.tools.compiler.analysis.Instruction ) // pc=3
	aload_5 
	aload_1 
	invokevirtual walkInstruction( net.rim.tools.compiler.analysis.Instruction, net.rim.tools.compiler.analysis.InstructionWalker ) // pc=2
Label30:
	aload_1 
	aload_0 
	iload_4 
	iload_3 
	iconst_1 
	isub 
	if_icmpne Label39
	iconst_1 
	goto Label40
Label39:
	iconst_0 
Label40:
	invokevirtual walkItemEnd( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.classfile.ByteCodeBlock, boolean ) // pc=3
	iinc 4 1
	goto Label14
Label43:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label65
	iconst_1 
	istore_2 
	aload_0 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore_3 
	iload_3 
	iconst_1 
	isub 
	istore_4 
Label54:
	iload_4 
	iflt Label65
	aload_0 
	iload_4 
	invokevirtual_short .virtual_36 // idx=36 pc=2
	ifnonnull Label63
	aload_0 
	iload_4 
	invokevirtual_short .virtual_34 // idx=34 pc=2
Label63:
	iinc 4 -1
	goto Label54
Label65:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label3
	iload_2 
	ireturn 
	}


public final int computeStackImpact( net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	istore_1 
	iload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmple Label9
	aload_0 
	iload_1 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label9:
	aload_0 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore_2 
	iconst_0 
	istore_3 
Label14:
	iload_3 
	iload_2 
	if_icmpge Label37
	aload_0 
	iload_3 
	invokevirtual_short .virtual_36 // idx=36 pc=2
	astore_4 
	aload_4 
	ifnonnull Label24
	goto Label35
Label24:
	iload_1 
	aload_4 
	invokevirtual int getStackImpact( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iadd 
	istore_1 
	iload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmple Label35
	aload_0 
	iload_1 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label35:
	iinc 3 1
	goto Label14
Label37:
	iload_1 
	ireturn 
	}

}
