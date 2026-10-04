// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 41
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPool extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.classfile.ConstantPoolEntry /*net.rim.tools.compiler.classfile.ConstantPoolEntry[]*/  _entries ; // ofs = 19162 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPool, module:net_rim_loader-2.class#45, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_3 
	iload_3 
	iconst_1 
	if_icmple Label51
	aload_0 
	iload_3 
	newarray_object ConstantPoolEntry
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	new ConstantPoolEntry
	dup 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=1
	aastore 
	iconst_1 
	istore_4 
Label21:
	iload_4 
	iload_3 
	if_icmpge Label51
	aload_1 
	invokestatic net.rim.tools.compiler.classfile.ConstantPoolEntry read( module:net_rim_loader-2.class#45 ) // ConstantPoolEntry
	astore_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	aload_5 
	aastore 
	aload_5 
	instanceof ConstantPoolLong
	ifeq Label49
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iinc 4 1
	iload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	aaload 
	aastore 
	iload_4 
	iload_3 
	if_icmplt Label49
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_354:"invalid constant pool in class file"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label49:
	iinc 4 1
	goto Label21
Label51:
	iload_2 
	ifne Label82
	iconst_1 
	istore_4 
Label55:
	iload_4 
	iload_3 
	if_icmpge Label65
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	aaload 
	aload_0 
	invokevirtual resolve( net.rim.tools.compiler.classfile.ConstantPoolEntry, net.rim.tools.compiler.classfile.ConstantPool ) // pc=2
	iinc 4 1
	goto Label55
Label65:
	iconst_1 
	istore_4 
Label67:
	iload_4 
	iload_3 
	if_icmpge Label82
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	aaload 
	invokevirtual verify( net.rim.tools.compiler.classfile.ConstantPoolEntry ) // pc=1
	iinc 4 1
	goto Label67
	astore_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_354:"invalid constant pool in class file"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label82:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getNumEntries( net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	iconst_1 
	ireturn 
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ConstantPoolEntry getEntry( net.rim.tools.compiler.classfile.ConstantPool, int ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label7
	iload_1 
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	if_icmplt Label18
Label7:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_353:"invalid constant pool index: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label18:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	aaload 
	astore_2 
	aload_2 
	areturn 
	}


public final java.lang.String getString( net.rim.tools.compiler.classfile.ConstantPool, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_2 
	aload_2 
	checkcastbranch 
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	areturn 
Label11:
	invokestatic invalid(  ) // ConstantPoolEntry
	aconst_null 
	areturn 
	}


public final java.lang.String getClassName( net.rim.tools.compiler.classfile.ConstantPool, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_2 
	aload_2 
	checkcastbranch 
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.getName // pc=1
	areturn 
Label11:
	invokestatic invalid(  ) // ConstantPoolEntry
	aconst_null 
	areturn 
	}


public final java.lang.String getStringValue( net.rim.tools.compiler.classfile.ConstantPool, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_2 
	aload_2 
	checkcastbranch 
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolString.getString // pc=1
	areturn 
Label11:
	invokestatic invalid(  ) // ConstantPoolEntry
	aconst_null 
	areturn 
	}


public final int getValue( net.rim.tools.compiler.classfile.ConstantPool, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_3 
	aload_3 
	checkcastbranch 
	astore_4 
	iload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolInteger.isFloat // pc=1
	ixor 
	ifeq Label14
	invokestatic invalid(  ) // ConstantPoolEntry
Label14:
	aload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolInteger.getValue // pc=1
	ireturn 
Label17:
	invokestatic invalid(  ) // ConstantPoolEntry
	iconst_0 
	ireturn 
	}


public final long getLongValue( net.rim.tools.compiler.classfile.ConstantPool, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_3 
	aload_3 
	checkcastbranch 
	astore_4 
	iload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolLong.isDouble // pc=1
	ixor 
	ifeq Label14
	invokestatic invalid(  ) // ConstantPoolEntry
Label14:
	aload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolLong.getValue // pc=1
	lreturn 
Label17:
	invokestatic invalid(  ) // ConstantPoolEntry
	iconst_0 
	i2l 
	lreturn 
	}

}
