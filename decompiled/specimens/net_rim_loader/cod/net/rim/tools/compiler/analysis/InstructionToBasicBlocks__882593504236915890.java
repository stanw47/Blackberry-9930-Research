// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 74
// ########################################################


package net.rim.tools.compiler.analysis;


abstract public final class InstructionToBasicBlocks extends net.rim.tools.compiler.analysis.InstructionWalker
implements net.rim.tools.compiler.classfile.ByteCodeBlockTypes

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _pendingSplit ; // ofs = 21750 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeBasicBlocks /*net.rim.tools.compiler.classfile.ByteCodeBasicBlocks*/  _blocks ; // ofs = 21754 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeBlock /*net.rim.tools.compiler.classfile.ByteCodeBlock*/  _block ; // ofs = 21758 addr = 0)
	private int /*int*/  _ip ; // ofs = 21762 addr = 0)
	private int /*int*/  _length ; // ofs = 21766 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.tools.compiler.analysis.InstructionToBasicBlocks ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.analysis.InstructionWalker )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final setBlockAndPendingSplit( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getIp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifeq Label58
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	invokevirtual_short .virtual_12 // idx=12 pc=2
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	if_icmpne Label35
	aload_3 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iload_2 
	if_icmpne Label25
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .virtual_12 // idx=12 pc=2
	astore_4 
	aload_4 
	aconst_null 
	invokevirtual_short .virtual_27 // idx=27 pc=2
	goto Label55
Label25:
	aload_3 
	iload_2 
	iconst_0 
	iconst_1 
	invokevirtual_short .virtual_51 // idx=51 pc=4
	astore_3 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	goto Label55
Label35:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .virtual_12 // idx=12 pc=2
	astore_4 
	aload_3 
	aload_4 
	if_acmpne Label52
	aload_3 
	iload_2 
	iconst_1 
	iconst_1 
	invokevirtual_short .virtual_51 // idx=51 pc=4
	astore_3 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	goto Label55
Label52:
	aload_4 
	aload_3 
	invokevirtual_short .virtual_27 // idx=27 pc=2
Label55:
	aload_0 
	iconst_0 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label58:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label64
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	ifne Label69
Label64:
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	invokevirtual_short .virtual_12 // idx=12 pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label69:
	aload_0 
	iload_2 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


private final net.rim.tools.compiler.classfile.ByteCodeBlock getBranchTarget( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_18932 // pc=1
	istore_2 
	aconst_null 
	astore_3 
	iload_2 
	iflt Label18
	iload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmpge Label18
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	iconst_1 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	astore_3 
	aload_3 
	areturn 
Label18:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	astore_3 
	aload_3 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

final init( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


final fini( net.rim.tools.compiler.analysis.InstructionToBasicBlocks ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.getBranchTarget // pc=2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionTarget.getStackEntry // pc=1
	invokevirtual_short .virtual_29 // idx=29 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_1 
	invokevirtual int getOpcode( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_2 
	iload_2 
Label9:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	iadd 
	iconst_0 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aconst_null 
	invokevirtual_short .virtual_27 // idx=27 pc=2
	return 
Label27:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.InstructionBranch ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_1 
	invokevirtual int getOpcode( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_2 
	iload_2 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

Label9:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.InstructionBranch ) // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	aload_0 
	bipush 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	iconst_0 
	invokevirtual net.rim.tools.compiler.analysis.InstructionTarget getBranchTarget( net.rim.tools.compiler.analysis.InstructionBranch, int ) // pc=2
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.getBranchTarget // pc=2
	invokevirtual_short .virtual_38 // idx=38 pc=2
	return 
Label24:
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual int getIp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	iconst_1 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.InstructionBranch ) // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_0 
	iconst_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	iconst_0 
	invokevirtual net.rim.tools.compiler.analysis.InstructionTarget getBranchTarget( net.rim.tools.compiler.analysis.InstructionBranch, int ) // pc=2
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.getBranchTarget // pc=2
	invokevirtual_short .virtual_38 // idx=38 pc=2
	return 
Label49:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.InstructionBranch ) // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, module:net_rim_loader.class#15 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_2 
	iload_2 
Label9:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual_lib .routine_23345 // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 11
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_0 
	iconst_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_19389 // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label24:
	iload_4 
	iload_3 
	if_icmpge Label35
	aload_0 
	aload_1 
	iload_4 
	invokenonvirtual_lib .routine_19409 // pc=2
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.getBranchTarget // pc=2
	pop 
	iinc 4 1
	goto Label24
Label35:
	iconst_0 
	istore_4 
Label37:
	iload_4 
	iload_3 
	if_icmpge Label53
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	iload_4 
	invokenonvirtual_lib .routine_19409 // pc=2
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.getBranchTarget // pc=2
	invokevirtual_short .virtual_38 // idx=38 pc=2
	iinc 4 1
	goto Label37
Label49:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual_lib .routine_23345 // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
Label53:
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.InstructionStringArray ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStringArray.makeClone // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, module:net_rim_loader.class#12 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual_lib .routine_19487 // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, module:net_rim_loader.class#16 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual_lib .routine_23780 // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, module:net_rim_loader.class#17 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual_lib .routine_23938 // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.InstructionString ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionString.makeClone // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionToBasicBlocks, net.rim.tools.compiler.analysis.InstructionType ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.setBlockAndPendingSplit // pc=2
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_2 
	iload_2 
	tableswitch  :
		
		
		
		

Label9:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionType.makeClone // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	aload_0 
	bipush 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_19409 // pc=2
	invokespecial net.rim.tools.compiler.analysis.InstructionToBasicBlocks.getBranchTarget // pc=2
	invokevirtual_short .virtual_38 // idx=38 pc=2
	return 
Label24:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionType.makeClone // pc=1
	invokevirtual_short .virtual_33 // idx=33 pc=2
	return 
	}

}
