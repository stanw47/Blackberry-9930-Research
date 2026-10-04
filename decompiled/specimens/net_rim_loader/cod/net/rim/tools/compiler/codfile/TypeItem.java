// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 50
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class TypeItem extends Object
implements net.rim.tools.compiler.vm.Constants

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.tools.compiler.codfile.TypeItem /*net.rim.tools.compiler.codfile.TypeItem[]*/  _cache ; // ofs = 13216 addr = 126)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _bits ; // ofs = 13208 addr = 0)
	private net.rim.tools.compiler.codfile.ClassDef /*net.rim.tools.compiler.codfile.ClassDef*/  _classDef ; // ofs = 13212 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static public final net.rim.tools.compiler.codfile.TypeItem makeTypeItem( int ); // address: 0
	{
	enter_narrow 
	getstatic _cache // TypeItem
	iload_0 
	aaload 
	areturn 
	}


private <init>( net.rim.tools.compiler.codfile.TypeItem, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iload_1 
	sipush 255
	iand 
	bipush 24
	ishl 
	iconst_1 
	ior 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.codfile.TypeItem, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iipush 134217728
	iload_1 
	sipush 255
	iand 
	bipush 16
	ishl 
	ior 
	iload_2 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	bipush 3
	ior 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.codfile.TypeItem, net.rim.tools.compiler.codfile.ClassDef, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_2 
	sipush 255
	iand 
	bipush 24
	ishl 
	bipush 3
	ior 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.codfile.TypeItem, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iipush 117440515
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.codfile.TypeItem, int, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iipush 134217728
	iload_1 
	sipush 255
	iand 
	bipush 16
	ishl 
	ior 
	sipush 1792
	ior 
	bipush 5
	ior 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static TypeItem
	clinit_wait 
	bipush 13
	newarray_object TypeItem
	dup 
	iconst_0 
	aconst_null 
	aastore 
	dup 
	iconst_1 
	new TypeItem
	dup 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 2
	new TypeItem
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 3
	new TypeItem
	dup 
	bipush 3
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 4
	new TypeItem
	dup 
	bipush 4
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 5
	new TypeItem
	dup 
	bipush 5
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 6
	new TypeItem
	dup 
	bipush 6
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 7
	aconst_null 
	aastore 
	dup 
	bipush 8
	aconst_null 
	aastore 
	dup 
	bipush 9
	aconst_null 
	aastore 
	dup 
	bipush 10
	new TypeItem
	dup 
	bipush 10
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 11
	new TypeItem
	dup 
	bipush 11
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	dup 
	bipush 12
	new TypeItem
	dup 
	bipush 12
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	aastore 
	putstatic _cache // TypeItem
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final makeSymbolic( net.rim.tools.compiler.codfile.TypeItem, module:net_rim_loader-1.class#57 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label6
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#57 ) // pc=2
Label6:
	return 
	}


public final write( net.rim.tools.compiler.codfile.TypeItem, net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_3 
	iload_3 
	bipush 24
	ishr 
	sipush 255
	iand 
	istore_4 
	aload_1 
	iload_2 
	bipush 15
	iand 
	bipush 4
	ishl 
	iload_4 
	ior 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iload_4 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		

Label20:
	iload_3 
	bipush 16
	ishr 
	sipush 255
	iand 
	istore_5 
	aload_1 
	iload_5 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iload_3 
	bipush 8
	ishr 
	sipush 255
	iand 
	istore_6 
	aload_1 
	iload_6 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iload_6 
	bipush 7
	if_icmpeq Label42
	return 
Label42:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	return 
Label46:
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_548:"unexpected type id: 0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_4 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label58:
	return 
	}


public final int getId( net.rim.tools.compiler.codfile.TypeItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 24
	ishr 
	sipush 255
	iand 
	ireturn 
	}


public final int getExtent( net.rim.tools.compiler.codfile.TypeItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 255
	iand 
	ireturn 
	}


public final int compareTo( net.rim.tools.compiler.codfile.TypeItem, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcast TypeItem
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_0 
	ireturn 
Label9:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmpge Label15
	bipush -1
	ireturn 
Label15:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmple Label21
	iconst_1 
	ireturn 
Label21:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label28
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int compareTo( module:net_rim_loader-1.class#35, java.lang.Object ) // pc=2
	ireturn 
Label28:
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label33
	bipush -1
	ireturn 
Label33:
	iconst_0 
	ireturn 
	}


public final boolean equals( net.rim.tools.compiler.codfile.TypeItem, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_1 
	ireturn 
Label9:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmpeq Label15
	iconst_0 
	ireturn 
Label15:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label22
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .equals // idx=1 pc=2
	ireturn 
Label22:
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label27
	iconst_1 
	ireturn 
Label27:
	iconst_0 
	ireturn 
Label29:
	iconst_0 
	ireturn 
	}


public final int hashCode( net.rim.tools.compiler.codfile.TypeItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label12
	iload_1 
	bipush 31
	imul 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	istore_1 
Label12:
	iload_1 
	ireturn 
	}

}
