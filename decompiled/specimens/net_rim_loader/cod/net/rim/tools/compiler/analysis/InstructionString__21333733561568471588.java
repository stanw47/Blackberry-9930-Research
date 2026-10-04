// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 71
// ########################################################


package net.rim.tools.compiler.analysis;


abstract public final class InstructionString extends net.rim.tools.compiler.analysis.Instruction

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _str ; // ofs = 21552 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.analysis.InstructionString, int, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial_lib .routine_19265 // pc=4
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.analysis.Instruction makeClone( net.rim.tools.compiler.analysis.InstructionString ); // address: 0
	{
	enter 
	new InstructionString
	dup 
	aload_0 
	invokenonvirtual_lib .routine_18932 // pc=1
	aload_0 
	invokenonvirtual_lib .routine_18979 // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial net.rim.tools.compiler.analysis.InstructionString.<init> // pc=4
	astore_1 
	aload_1 
	areturn 
	}


public final java.lang.String getString( net.rim.tools.compiler.analysis.InstructionString ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionString, net.rim.tools.compiler.analysis.InstructionWalker ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0 
	invokevirtual walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionString ) // pc=2
	return 
	}

}
