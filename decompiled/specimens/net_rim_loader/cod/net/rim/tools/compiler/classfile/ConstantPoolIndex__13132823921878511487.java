// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 47
// ########################################################


package net.rim.tools.compiler.classfile;


public class ConstantPoolIndex extends net.rim.tools.compiler.classfile.ConstantPoolEntry

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolIndex, int, module:net_rim_loader-2.class#45 ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.classfile.ConstantPoolIndex, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

}
