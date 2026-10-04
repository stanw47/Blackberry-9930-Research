// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 12
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeStackMapType extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.tools.compiler.classfile.AttributeStackMapType /*net.rim.tools.compiler.classfile.AttributeStackMapType[]*/  _cache ; // ofs = 16336 addr = 37)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _type ; // ofs = 16316 addr = 0)
	private String /*java.lang.String*/  _typeName ; // ofs = 16320 addr = 0)
	private int /*int*/  _newOffset ; // ofs = 16324 addr = 0)
	private net.rim.tools.compiler.classfile.ConstantPool /*net.rim.tools.compiler.classfile.ConstantPool*/  _constantPool ; // ofs = 16328 addr = 0)
	private net.rim.tools.compiler.classfile.ConstantPoolClass /*net.rim.tools.compiler.classfile.ConstantPoolClass*/  _constantPoolClass ; // ofs = 16332 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.tools.compiler.classfile.AttributeStackMapType, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


private <init>( net.rim.tools.compiler.classfile.AttributeStackMapType, int, int, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapType.<init> // pc=2
	iload_1 
	bipush 7
	if_icmpne Label13
	aload_0 
	aload_3 
	iload_2 
	invokevirtual_short .virtual_6 // idx=6 pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
Label13:
	iload_1 
	bipush 8
	if_icmpne Label22
	aload_0 
	iload_2 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_3 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label22:
	return 
	}


static public final net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	iload_2 
	ifle Label21
	iload_2 
	newarray_object AttributeStackMapType
	astore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_2 
	if_icmpge Label21
	aload_3 
	iload_4 
	aload_0 
	aload_1 
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType read( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool ) // AttributeStackMapType
	aastore 
	iinc 4 1
	goto Label10
Label21:
	aload_3 
	areturn 
	}


static public final net.rim.tools.compiler.classfile.AttributeStackMapType read( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	invokenonvirtual_lib .routine_23550 // pc=1
	istore_3 
	iload_3 
	bipush 7
	if_icmpeq Label12
	iload_3 
	bipush 8
	if_icmpne Label22
Label12:
	new AttributeStackMapType
	dup 
	iload_3 
	aload_0 
	invokenonvirtual_lib .routine_23570 // pc=1
	aload_1 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapType.<init> // pc=4
	astore_2 
	aload_2 
	areturn 
Label22:
	getstatic _cache // AttributeStackMapType
	dup 
	astore_4 
	monitorenter 
	getstatic _cache // AttributeStackMapType
	iload_3 
	aaload 
	astore_2 
	aload_2 
	ifnonnull Label41
	getstatic _cache // AttributeStackMapType
	iload_3 
	new AttributeStackMapType
	dup 
	iload_3 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapType.<init> // pc=2
	dup_x2 
	aastore 
	astore_2 
Label41:
	aload_4 
	monitorexit 
	aload_2 
	areturn 
	astore_5 
	aload_4 
	monitorexit 
	aload_5 
	athrow 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static AttributeStackMapType
	clinit_wait 
	bipush 7
	newarray_object AttributeStackMapType
	putstatic _cache // AttributeStackMapType
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getType( net.rim.tools.compiler.classfile.AttributeStackMapType ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final java.lang.String getTypeName( net.rim.tools.compiler.classfile.AttributeStackMapType ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final int getNewOffset( net.rim.tools.compiler.classfile.AttributeStackMapType ); // address: 0
	{
	ireturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final net.rim.tools.compiler.classfile.ConstantPoolClass getNewClass( net.rim.tools.compiler.classfile.AttributeStackMapType, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label12
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolClass
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label12:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
	}

}
