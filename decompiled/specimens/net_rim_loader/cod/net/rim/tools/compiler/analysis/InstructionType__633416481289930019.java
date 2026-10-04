// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 75
// ########################################################


package net.rim.tools.compiler.analysis;


abstract public final class InstructionType extends net.rim.tools.compiler.analysis.InstructionBranch

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type*/  _type ; // ofs = 21834 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.analysis.InstructionType, int, int, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	aload_3 
	iconst_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionType.<init> // pc=5
	return 
	}


public <init>( net.rim.tools.compiler.analysis.InstructionType, int, int, net.rim.tools.compiler.types.Type, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	iload_4 
	invokespecial_lib .routine_19470 // pc=4
	aload_0 
	aload_3 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.InstructionType ); // address: 0
	{
	enter 
	new InstructionType
	dup 
	aload_0 
	invokenonvirtual_lib .routine_18932 // pc=1
	aload_0 
	invokenonvirtual_lib .routine_18979 // pc=1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial net.rim.tools.compiler.analysis.InstructionType.<init> // pc=5
	astore_1 
	aload_1 
	areturn 
	}


public final net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.analysis.InstructionType ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionType, net.rim.tools.compiler.analysis.InstructionWalker ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0 
	invokevirtual walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionType ) // pc=2
	return 
	}


public final int setOffset( net.rim.tools.compiler.analysis.InstructionType, int, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib .routine_19040 // pc=3
	istore_1 
	iload_2 
	ifeq Label12
	aload_0 
	invokenonvirtual_lib .routine_18979 // pc=1
Label11:
	iinc 1 1
Label12:
	iload_1 
	ireturn 
	}


public final int getStackImpact( net.rim.tools.compiler.analysis.InstructionType ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	aload_0 
	invokenonvirtual_lib .routine_18979 // pc=1
Label6:
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	isub 
	isub 
	istore_1 
	iload_1 
	ireturn 
Label14:
	aload_0 
	invokespecial_lib .routine_19073 // pc=1
	istore_1 
	iload_1 
	ireturn 
	}


public final boolean sameInstruction( net.rim.tools.compiler.analysis.InstructionType, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	aload_2 
	invokespecial_lib .routine_19095 // pc=2
	ifne Label10
	iconst_0 
	ireturn 
Label10:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}

}
