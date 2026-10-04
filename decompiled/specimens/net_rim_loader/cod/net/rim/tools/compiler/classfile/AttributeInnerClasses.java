// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 2
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeInnerClasses extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _iInner ; // ofs = 15694 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeInnerClasses, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	pop 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	pop 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	pop 
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getInnerClassIndex( net.rim.tools.compiler.classfile.AttributeInnerClasses ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}

}
