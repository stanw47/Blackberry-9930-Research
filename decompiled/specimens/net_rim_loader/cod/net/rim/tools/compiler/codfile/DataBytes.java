// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 56
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class DataBytes extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.CodfileVectorHash /*net.rim.tools.compiler.codfile.CodfileVectorHash*/  _unicodeLiterals ; // ofs = 20046 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _bytes ; // ofs = 20050 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVectorHash /*net.rim.tools.compiler.codfile.CodfileVectorHash*/  _identifiers ; // ofs = 20054 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVectorHash /*net.rim.tools.compiler.codfile.CodfileVectorHash*/  _literals ; // ofs = 20058 addr = 0)
	private net.rim.tools.compiler.codfile.Identifier /*net.rim.tools.compiler.codfile.Identifier*/  _nullIdentifier ; // ofs = 20062 addr = 0)
	private net.rim.tools.compiler.codfile.DataSection /*net.rim.tools.compiler.codfile.DataSection*/  _dataSection ; // ofs = 20066 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.DataBytes, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_0 
	new CodfileVectorHash
	dup 
	bipush 5
	invokespecial net.rim.tools.compiler.codfile.CodfileVectorHash.<init> // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	new CodfileVectorHash
	dup 
	sipush 131
	invokespecial net.rim.tools.compiler.codfile.CodfileVectorHash.<init> // pc=2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new CodfileVectorHash
	dup 
	sipush 131
	invokespecial net.rim.tools.compiler.codfile.CodfileVectorHash.<init> // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new Identifier
	dup 
	invokespecial net.rim.tools.compiler.codfile.Identifier.<init> // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_1 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.DataBytes, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	iconst_1 
	invokevirtual routine
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	iconst_1 
	invokevirtual routine
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	iconst_1 
	invokevirtual routine
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final net.rim.tools.compiler.codfile.Identifier getNullIdentifier( net.rim.tools.compiler.codfile.DataBytes ); // address: 0
	{
	areturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final net.rim.tools.compiler.codfile.Identifier getIdentifier( net.rim.tools.compiler.codfile.DataBytes, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	astore_1 
Label6:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	aload_1 
	invokevirtual net.rim.tools.compiler.codfile.CodfileItem get( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object ) // pc=2
	checkcast Identifier
	astore_3 
	aload_3 
	ifnonnull Label24
	new Identifier
	dup 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Identifier.<init> // pc=2
	astore_3 
	aload_2 
	aload_1 
	aload_3 
	invokevirtual put( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object, net.rim.tools.compiler.codfile.CodfileItem ) // pc=3
Label24:
	aload_3 
	areturn 
	}


public final net.rim.tools.compiler.codfile.Bytes getBytes( net.rim.tools.compiler.codfile.DataBytes, byte[], int, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	astore_5 
	aload_5 
	invokevirtual routine
	istore_6 
	iconst_0 
	istore_7 
Label10:
	iload_7 
	iload_6 
	if_icmpge Label47
	aload_5 
	iload_7 
	invokevirtual routine
	checkcast Bytes
	astore_4 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.getNeedsHeader // pc=1
	istore 8
	iload_3 
	ifeq Label27
	iload 8
	ifeq Label27
	iload_2 
	goto Label28
Label27:
	bipush -1
Label28:
	istore 9
	aload_4 
	aload_1 
	iload 9
	invokenonvirtual net.rim.tools.compiler.codfile.Bytes.matches // pc=3
	ifeq Label45
	iload_3 
	ifeq Label43
	iload 8
	ifne Label43
	aload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.setNeedsHeader // pc=1
	aload_4 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.setArrayType // pc=2
Label43:
	aload_4 
	areturn 
Label45:
	iinc 7 1
	goto Label10
Label47:
	new Bytes
	dup 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.Bytes.<init> // pc=5
	astore_4 
	aload_5 
	aload_4 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	aload_4 
	areturn 
	}


public final module:net_rim_loader.class#22 getLiteral( net.rim.tools.compiler.codfile.DataBytes, java.lang.String, boolean, boolean ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	astore_1 
Label6:
	iload_2 
	ifeq Label10
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label11
Label10:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label11:
	astore_4 
	aload_4 
	aload_1 
	invokevirtual net.rim.tools.compiler.codfile.CodfileItem get( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object ) // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.Literal//module:net_rim_loader.class#22 module:net_rim_loader.class#22 module:net_rim_loader.class#22
	astore_5 
	aload_5 
	ifnonnull Label32
	new_lib net.rim.tools.compiler.codfile.Literal//module:net_rim_loader.class#22 module:net_rim_loader.class#22 module:net_rim_loader.class#22
	dup 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	iload_2 
	iload_3 
	invokespecial_lib .routine_37073 // pc=5
	astore_5 
	aload_4 
	aload_1 
	aload_5 
	invokevirtual put( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object, net.rim.tools.compiler.codfile.CodfileItem ) // pc=3
	goto Label36
Label32:
	iload_3 
	ifeq Label36
	aload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.setNeedsHeader // pc=1
Label36:
	aload_5 
	areturn 
	}

}
