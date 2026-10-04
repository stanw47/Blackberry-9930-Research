// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 16
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ByteCodeExceptionHandler extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.classfile.ByteCodeBlock /*net.rim.tools.compiler.classfile.ByteCodeBlock*/  _start ; // ofs = 16796 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeBlock /*net.rim.tools.compiler.classfile.ByteCodeBlock*/  _end ; // ofs = 16800 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeBlock /*net.rim.tools.compiler.classfile.ByteCodeBlock*/  _handler ; // ofs = 16804 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _classType ; // ofs = 16808 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler, net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock, module:net_rim_loader-2.class#4 ); // address: 0
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

public final setStart( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	putfield_return .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final setEnd( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	putfield_return .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final setHandler( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	putfield_return .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock getStart( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock getEnd( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock getHandler( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final boolean containsBlock( net.rim.tools.compiler.classfile.ByteCodeExceptionHandler, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iload_2 
	if_icmpgt Label14
	iload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_7 // idx=7 pc=1
	if_icmpge Label14
	iconst_1 
	ireturn 
Label14:
	iconst_0 
	ireturn 
	}

}
