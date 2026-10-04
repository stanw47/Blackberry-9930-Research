// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 17
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ByteCodeExceptionRange extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.analysis.InstructionTarget /*net.rim.tools.compiler.analysis.InstructionTarget*/  _start ; // ofs = 16866 addr = 0)
	private net.rim.tools.compiler.analysis.InstructionTarget /*net.rim.tools.compiler.analysis.InstructionTarget*/  _end ; // ofs = 16870 addr = 0)
	private net.rim.tools.compiler.analysis.InstructionTarget /*net.rim.tools.compiler.analysis.InstructionTarget*/  _handler ; // ofs = 16874 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _classType ; // ofs = 16878 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ByteCodeExceptionRange, net.rim.tools.compiler.analysis.InstructionTarget, net.rim.tools.compiler.analysis.InstructionTarget, net.rim.tools.compiler.analysis.InstructionTarget, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_4 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.analysis.InstructionTarget getStart( net.rim.tools.compiler.classfile.ByteCodeExceptionRange ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final net.rim.tools.compiler.analysis.InstructionTarget getEnd( net.rim.tools.compiler.classfile.ByteCodeExceptionRange ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final net.rim.tools.compiler.analysis.InstructionTarget getHandler( net.rim.tools.compiler.classfile.ByteCodeExceptionRange ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.classfile.ByteCodeExceptionRange ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}

}
