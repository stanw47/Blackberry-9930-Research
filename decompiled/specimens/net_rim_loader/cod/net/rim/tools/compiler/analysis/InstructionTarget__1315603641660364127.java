// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 73
// ########################################################


package net.rim.tools.compiler.analysis;


abstract public final class InstructionTarget extends net.rim.tools.compiler.analysis.Instruction

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.analysis.InstructionStackEntry /*net.rim.tools.compiler.analysis.InstructionStackEntry*/  _stackEntry ; // ofs = 21670 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileLabel /*net.rim.tools.compiler.codfile.CodfileLabel*/  _label ; // ofs = 21674 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.analysis.InstructionTarget, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	bipush -1
	iload_2 
	invokespecial_lib .routine_19265 // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	enter 
	new InstructionTarget
	dup 
	aload_0 
	invokenonvirtual_lib .routine_18932 // pc=1
	aload_0 
	invokenonvirtual_lib .routine_18979 // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionTarget.<init> // pc=3
	astore_1 
	aload_1 
	areturn 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionTarget, net.rim.tools.compiler.analysis.InstructionWalker ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0 
	invokevirtual walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionTarget ) // pc=2
	return 
	}


public final int setOffset( net.rim.tools.compiler.analysis.InstructionTarget, int, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokenonvirtual_lib .routine_18907 // pc=2
	iload_1 
	ireturn 
	}


public final setStackEntry( net.rim.tools.compiler.analysis.InstructionTarget, net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	putfield_return .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final net.rim.tools.compiler.analysis.InstructionStackEntry getStackEntry( net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final setLabel( net.rim.tools.compiler.analysis.InstructionTarget, net.rim.tools.compiler.codfile.CodfileLabel ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final net.rim.tools.compiler.codfile.CodfileLabel getLabel( net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}

}
