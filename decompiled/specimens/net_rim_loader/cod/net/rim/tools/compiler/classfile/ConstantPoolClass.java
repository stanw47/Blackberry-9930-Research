// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 43
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPoolClass extends net.rim.tools.compiler.classfile.ConstantPoolIndex

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolClass, int, module:net_rim_loader-2.class#45 ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.classfile.ConstantPoolIndex, int, module:net_rim_loader-2.class#45 )
	}


public <init>( net.rim.tools.compiler.classfile.ConstantPoolClass, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 7
	bipush -1
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolIndex.<init> // pc=3
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final resolve( net.rim.tools.compiler.classfile.ConstantPoolClass, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label9
	aload_0 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolUTF8
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label9:
	return 
	}


public final verify( net.rim.tools.compiler.classfile.ConstantPoolClass ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	astore_1 
	aload_1 
	stringlength 
	istore_2 
	iconst_0 
	istore_3 
Label9:
	iload_3 
	iload_2 
	if_icmpge Label34
	aload_1 
	iload_3 
	iinc 3 1
	stringaload 
	istore_4 
	iload_4 
Label19:
	iload_3 
	iload_2 
	if_icmpeq Label23
	goto Label9
Label23:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_355:"bad class name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label34:
	return 
	}


public final java.lang.String getName( net.rim.tools.compiler.classfile.ConstantPoolClass ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label10
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	bipush 47
	bipush 46
	invokenonvirtual_lib java.lang.String.replace // pc=3
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label10:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	areturn 
	}


public final setType( net.rim.tools.compiler.classfile.ConstantPoolClass, net.rim.tools.compiler.types.Type ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.classfile.ConstantPoolClass ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}

}
