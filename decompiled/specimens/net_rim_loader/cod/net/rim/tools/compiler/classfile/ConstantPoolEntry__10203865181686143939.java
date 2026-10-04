// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 44
// ########################################################


package net.rim.tools.compiler.classfile;


public class ConstantPoolEntry extends Object
implements net.rim.tools.compiler.vm.Constants

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolEntry, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	return 
	}


public <init>( net.rim.tools.compiler.classfile.ConstantPoolEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush -1
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	return 
	}


static public net.rim.tools.compiler.classfile.ConstantPoolEntry read( module:net_rim_loader-2.class#45 ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_23533 // pc=1
	istore_1 
	iload_1 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		

Label6:
	new ConstantPoolUTF8
	dup 
	iload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolUTF8.<init> // pc=3
	areturn 
Label12:
	new ConstantPoolInteger
	dup 
	iload_1 
	aload_0 
	iload_1 
	bipush 4
	if_icmpne Label21
	iconst_1 
	goto Label22
Label21:
	iconst_0 
Label22:
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolInteger.<init> // pc=4
	areturn 
Label24:
	new ConstantPoolLong
	dup 
	iload_1 
	aload_0 
	iload_1 
	bipush 6
	if_icmpne Label33
	iconst_1 
	goto Label34
Label33:
	iconst_0 
Label34:
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolLong.<init> // pc=4
	areturn 
Label36:
	new ConstantPoolClass
	dup 
	iload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolClass.<init> // pc=3
	areturn 
Label42:
	new ConstantPoolString
	dup 
	iload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolString.<init> // pc=3
	areturn 
Label48:
	new ConstantPoolFieldRef
	dup 
	iload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolFieldRef.<init> // pc=3
	areturn 
Label54:
	new ConstantPoolMethodRef
	dup 
	iload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolMethodRef.<init> // pc=3
	areturn 
Label60:
	new ConstantPoolInterfaceMethodRef
	dup 
	iload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef.<init> // pc=3
	areturn 
Label66:
	new ConstantPoolNameAndType
	dup 
	iload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolNameAndType.<init> // pc=3
	areturn 
Label72:
	invokestatic invalid(  ) // ConstantPoolEntry
	aconst_null 
	areturn 
	}


static public invalid(  ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_356:"Invalid constant pool entry."
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public resolve( net.rim.tools.compiler.classfile.ConstantPoolEntry, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	noenter_return 
	}


public verify( net.rim.tools.compiler.classfile.ConstantPoolEntry ); // address: 0
	{
	noenter_return 
	}

}
