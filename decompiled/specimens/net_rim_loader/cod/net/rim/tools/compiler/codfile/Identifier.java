// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 66
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class Identifier extends net.rim.tools.compiler.codfile.CodfileData

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _string ; // ofs = 20956 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static private final byte[] makeBytes( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib module:net_rim_loader-2.class#20.routine_13635(  ) // class#20
	astore_0 
	aload_0 
	stringlength 
	istore_1 
	iload_1 
	newarray 2
	astore_2 
	iconst_0 
	istore_3 
Label12:
	iload_3 
	iload_1 
	if_icmpge Label24
	aload_2 
	iload_3 
	aload_0 
	iload_3 
	stringaload 
	i2b 
	bastore 
	iinc 3 1
	goto Label12
Label24:
	aload_2 
	areturn 
	}


public <init>( net.rim.tools.compiler.codfile.Identifier, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic byte[] makeBytes( java.lang.String ) // Identifier
	bipush 2
	iconst_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileData.<init> // pc=5
	aload_0 
	aload_1 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


public <init>( net.rim.tools.compiler.codfile.Identifier ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileData.<init> // pc=1
	aload_0 
	iconst_0 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	ldc_nullstr 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final writeTerminator( net.rim.tools.compiler.codfile.Identifier, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	iconst_0 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final java.lang.String getString( net.rim.tools.compiler.codfile.Identifier ); // address: 0
	{
	areturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final boolean equals( net.rim.tools.compiler.codfile.Identifier, java.lang.Object ); // address: 0
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
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label16
	aload_2 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label16
	iconst_1 
	ireturn 
Label16:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label21
	aload_2 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label23
Label21:
	iconst_0 
	ireturn 
Label23:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_2 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual_short .equals // idx=1 pc=2
	ireturn 
Label28:
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label35
	iconst_0 
	ireturn 
Label35:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ireturn 
Label39:
	iconst_0 
	ireturn 
	}


public final int hashCode( net.rim.tools.compiler.codfile.Identifier ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label6
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual_short .virtual_ // idx=0 pc=1
	ireturn 
Label6:
	aload_0 
	invokespecial_lib java.lang.Object.hashCode // pc=1
	ireturn 
	}

}
