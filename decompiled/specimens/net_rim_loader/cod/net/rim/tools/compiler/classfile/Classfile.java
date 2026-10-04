// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 27
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class Classfile extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _nMajorVersion ; // ofs = 17924 addr = 0)
	private net.rim.tools.compiler.classfile.ConstantPool /*net.rim.tools.compiler.classfile.ConstantPool*/  _constantPool ; // ofs = 17928 addr = 0)
	private int /*int*/  _accessFlags ; // ofs = 17932 addr = 0)
	private int /*int*/  _thisClass ; // ofs = 17936 addr = 0)
	private int /*int*/  _superClass ; // ofs = 17940 addr = 0)
	private int[] /*int[]*/  _interfaces ; // ofs = 17944 addr = 0)
	private net.rim.tools.compiler.classfile.ClassfileField /*net.rim.tools.compiler.classfile.ClassfileField[]*/  _fields ; // ofs = 17948 addr = 0)
	private net.rim.tools.compiler.classfile.ClassfileMethod /*net.rim.tools.compiler.classfile.ClassfileMethod[]*/  _methods ; // ofs = 17952 addr = 0)
	private net.rim.tools.compiler.classfile.AttributeList /*net.rim.tools.compiler.classfile.AttributeList*/  _attributes ; // ofs = 17956 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.Classfile, byte[], boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	new_lib net.rim.tools.compiler.io.StructuredInputStream//module:net_rim_loader-2.class#45 module:net_rim_loader-2.class#45 module:net_rim_loader-2.class#45
	dup 
	aload_1 
	iconst_0 
	invokespecial_lib .routine_23920 // pc=3
	astore_5 
	aload_5 
	invokenonvirtual_lib .routine_23533 // pc=1
	bipush -54
	if_icmpne Label25
	aload_5 
	invokenonvirtual_lib .routine_23533 // pc=1
	bipush -2
	if_icmpne Label25
	aload_5 
	invokenonvirtual_lib .routine_23533 // pc=1
	bipush -70
	if_icmpne Label25
	aload_5 
	invokenonvirtual_lib .routine_23533 // pc=1
	bipush -66
	if_icmpeq Label30
Label25:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_338:"Not a classfile"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label30:
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	pop 
	aload_0 
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 45
	if_icmplt Label43
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 50
	if_icmple Label48
Label43:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_339:"Incorrect classfile version"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label48:
	aload_0 
	new ConstantPool
	dup 
	aload_5 
	iload_2 
	invokespecial net.rim.tools.compiler.classfile.ConstantPool.<init> // pc=3
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_4 
	iload_4 
	ifle Label88
	aload_0 
	iload_4 
	newarray 5
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	istore_3 
Label78:
	iload_3 
	iload_4 
	if_icmpge Label88
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	iastore 
	iinc 3 1
	goto Label78
Label88:
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_4 
	iload_4 
	ifle Label113
	aload_0 
	iload_4 
	newarray_object ClassfileField
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	istore_3 
Label99:
	iload_3 
	iload_4 
	if_icmpge Label113
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_3 
	new ClassfileField
	dup 
	aload_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	invokespecial net.rim.tools.compiler.classfile.ClassfileField.<init> // pc=4
	aastore 
	iinc 3 1
	goto Label99
Label113:
	aload_5 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_4 
	iload_4 
	ifle Label138
	aload_0 
	iload_4 
	newarray_object ClassfileMethod
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_0 
	istore_3 
Label124:
	iload_3 
	iload_4 
	if_icmpge Label138
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_3 
	new ClassfileMethod
	dup 
	aload_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	invokespecial net.rim.tools.compiler.classfile.ClassfileMethod.<init> // pc=4
	aastore 
	iinc 3 1
	goto Label124
Label138:
	aload_0 
	new AttributeList
	dup 
	aload_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	iload_2 
	invokespecial net.rim.tools.compiler.classfile.AttributeList.<init> // pc=5
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_5 
	invokenonvirtual_lib .routine_23476 // pc=1
	bipush -1
	if_icmpeq Label156
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_340:"Extra bytes in class file"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label156:
	aload_5 
	invokenonvirtual_lib .routine_23840 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getAccessFlags( net.rim.tools.compiler.classfile.Classfile ); // address: 0
	{
	ireturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final java.lang.String getFullClassName( net.rim.tools.compiler.classfile.Classfile ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label25
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .virtual_6 // idx=6 pc=2
	astore_1 
	aload_1 
	iconst_0 
	stringaload 
	bipush 91
	if_icmpne Label25
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_336:"invalid class name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label25:
	aload_1 
	areturn 
	}


public final java.lang.String getFullBaseClassName( net.rim.tools.compiler.classfile.Classfile ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label25
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_6 // idx=6 pc=2
	astore_1 
	aload_1 
	iconst_0 
	stringaload 
	bipush 91
	if_icmpne Label25
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_336:"invalid class name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label25:
	aload_1 
	areturn 
	}


public final net.rim.tools.compiler.classfile.ConstantPool getConstantPool( net.rim.tools.compiler.classfile.Classfile ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final int getNumInterfaces( net.rim.tools.compiler.classfile.Classfile ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	arraylength 
	ireturn 
	}


public final java.lang.String getFullInterfaceName( net.rim.tools.compiler.classfile.Classfile, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	iaload 
	invokevirtual_short .virtual_6 // idx=6 pc=2
	astore_2 
	aload_2 
	iconst_0 
	stringaload 
	bipush 91
	if_icmpne Label23
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_337:"invalid interface name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label23:
	aload_2 
	areturn 
	}


public final int getNumFields( net.rim.tools.compiler.classfile.Classfile ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ClassfileField getField( net.rim.tools.compiler.classfile.Classfile, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	aaload 
	areturn 
	}


public final int getNumMethods( net.rim.tools.compiler.classfile.Classfile ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ClassfileMethod getMethod( net.rim.tools.compiler.classfile.Classfile, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	aaload 
	areturn 
	}


public final boolean hasAttribute( net.rim.tools.compiler.classfile.Classfile, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.Classfile.getAttribute // pc=2
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.Attribute getAttribute( net.rim.tools.compiler.classfile.Classfile, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=2
	areturn 
	}

}
