// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 52
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPoolNameAndType extends net.rim.tools.compiler.classfile.ConstantPoolTwoIndex

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.classfile.ConstantPoolUTF8 /*net.rim.tools.compiler.classfile.ConstantPoolUTF8*/  _name ; // ofs = 19814 addr = 0)
	private net.rim.tools.compiler.classfile.ConstantPoolUTF8 /*net.rim.tools.compiler.classfile.ConstantPoolUTF8*/  _type ; // ofs = 19818 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolNameAndType, int, module:net_rim_loader-2.class#45 ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.classfile.ConstantPoolTwoIndex, int, module:net_rim_loader-2.class#45 )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final resolve( net.rim.tools.compiler.classfile.ConstantPoolNameAndType, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label15
	aload_0 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolUTF8
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolUTF8
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label15:
	return 
	}


public final java.lang.String getName( net.rim.tools.compiler.classfile.ConstantPoolNameAndType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	areturn 
	}


public final java.lang.String getType( net.rim.tools.compiler.classfile.ConstantPoolNameAndType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	areturn 
	}


public final checkFieldType( net.rim.tools.compiler.classfile.ConstantPoolNameAndType ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	astore_1 
	aload_1 
	iconst_0 
	stringaload 
	bipush 40
	if_icmpne Label20
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_357:"bad field type: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label20:
	return 
	}


public final checkMethodType( net.rim.tools.compiler.classfile.ConstantPoolNameAndType ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	astore_1 
	aload_1 
	iconst_0 
	stringaload 
	bipush 40
	if_icmpeq Label20
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_358:"bad method type: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label20:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	ldc literal_359:"<init>"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label40
	aload_1 
	ldc literal_360:")V"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label40
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_361:"bad <init> method return type: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label40:
	return 
	}


public final checkMethodName( net.rim.tools.compiler.classfile.ConstantPoolNameAndType ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	astore_1 
	aload_1 
	iconst_0 
	stringaload 
	bipush 60
	if_icmpne Label24
	aload_1 
	ldc literal_359:"<init>"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label24
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_362:"bad method name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label24:
	return 
	}

}
