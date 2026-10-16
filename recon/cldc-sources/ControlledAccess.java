// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_cldc.cod
// Module version  : 7.1.0.1066
// Class ID        : 21
// ########################################################


package net.rim.device.api.system;


abstract public final class ControlledAccess extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 
	private Object /*java.lang.Object*/  _obj ; // ofs = 11150 addr = 0)
	private net.rim.device.api.system.CodeSigningKey /*net.rim.device.api.system.CodeSigningKey*/  _readKey ; // ofs = 11154 addr = 0)
	private net.rim.device.api.system.CodeSigningKey /*net.rim.device.api.system.CodeSigningKey*/  _replaceKey ; // ofs = 11158 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.api.system.ControlledAccess, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_1 
	invokestatic net.rim.device.api.system.CodeSigningKey get( java.lang.Object ) // CodeSigningKey
	invokespecial net.rim.device.api.system.ControlledAccess.<init> // pc=3
	return 
	}


public <init>( net.rim.device.api.system.ControlledAccess, java.lang.Object, net.rim.device.api.system.CodeSigningKey ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_2 
	invokespecial net.rim.device.api.system.ControlledAccess.<init> // pc=4
	return 
	}


public <init>( net.rim.device.api.system.ControlledAccess, java.lang.Object, net.rim.device.api.system.CodeSigningKey, net.rim.device.api.system.CodeSigningKey ); // address: 0
	{
	enter 
	aload_0 
	invokespecial java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}


static private final assertSignature( int, net.rim.device.api.system.CodeSigningKey ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label15
	iload_0 
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24764(  ) // class#34
	ifne Label15
	new_lib net.rim.device.api.system.ControlledAccessException//module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42
	dup 
	aload_1 
	invokespecial_lib .routine_27151 // pc=2
	athrow 
Label15:
	return 
	}


static public final boolean verifyCodeModuleSignature( int, int ); // address: 0
	{
	enter_narrow 
	iload_0 
	iload_1 
	aconst_null 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24764(  ) // class#34
	ireturn 
	astore_2 
	new_lib IllegalArgumentException//module:net_rim_cldc-2.class#42 module:net_rim_cldc-2.class#42 module:net_rim_cldc-2.class#42
	dup 
	invokespecial_lib .routine_24917 // pc=1
	athrow 
	}


static public final boolean verifyCodeModuleSignature( int, net.rim.device.api.system.CodeSigningKey ); // address: 0
	{
	enter_narrow 
	iload_0 
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24764(  ) // class#34
	ireturn 
	}


static public final assertRRISignature( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	bipush 51
	invokestatic boolean verifyCodeModuleSignature( int, int ) // ControlledAccess
	ifne Label9
	new_lib net.rim.device.api.system.ControlledAccessException//module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42
	dup 
	invokespecial_lib .routine_27092 // pc=1
	athrow 
Label9:
	return 
	}


static public final assertRCISignature( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	iipush 4801362
	invokestatic boolean verifyCodeModuleSignature( int, int ) // ControlledAccess
	ifne Label9
	new_lib net.rim.device.api.system.ControlledAccessException//module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42
	dup 
	invokespecial_lib .routine_27092 // pc=1
	athrow 
Label9:
	return 
	}


static public final boolean verifySignatures( boolean, int ); // address: 0
	{
	enter 
	iload_0 
	ifeq Label14
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	astore_2 
	aload_2 
	invokevirtual_short .virtual_21 // idx=21 pc=1
	istore_3 
	iload_3 
	iload_1 
	invokestatic boolean verifyCodeModuleSignature( int, int ) // ControlledAccess
	ifne Label14
	iconst_0 
	ireturn 
Label14:
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6352(  ) // class#19
	astore_2 
	aload_2 
	arraylength 
	iconst_1 
	isub 
	istore_3 
Label21:
	iload_3 
	iflt Label33
	aload_2 
	iload_3 
	iaload 
	iload_1 
	invokestatic boolean verifyCodeModuleSignature( int, int ) // ControlledAccess
	ifne Label31
	iconst_0 
	ireturn 
Label31:
	iinc 3 -1
	goto Label21
Label33:
	iconst_1 
	ireturn 
	}


static public final boolean verifyRRISignature( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	bipush 51
	invokestatic boolean verifyCodeModuleSignature( int, int ) // ControlledAccess
	ireturn 
	}


static public final boolean verifyRRISignatures( boolean ); // address: 0
	{
	enter_narrow 
	iload_0 
	bipush 51
	invokestatic boolean verifySignatures( boolean, int ) // ControlledAccess
	ireturn 
	}


static public final boolean verifyRRISignatures(  ); // address: 0
	{
	enter_narrow 
	iconst_1 
	bipush 51
	invokestatic boolean verifySignatures( boolean, int ) // ControlledAccess
	ireturn 
	}


static public final assertRRISignatures( boolean ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic boolean verifyRRISignatures( boolean ) // ControlledAccess
	ifne Label8
	new_lib net.rim.device.api.system.ControlledAccessException//module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42
	dup 
	invokespecial_lib .routine_27092 // pc=1
	athrow 
Label8:
	return 
	}


static public final assertRRISignatures(  ); // address: 0
	{
	enter_narrow 
	invokestatic boolean verifyRRISignatures(  ) // ControlledAccess
	ifne Label7
	new_lib net.rim.device.api.system.ControlledAccessException//module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42
	dup 
	invokespecial_lib .routine_27092 // pc=1
	athrow 
Label7:
	return 
	}


static public final boolean verifyRCISignatures( boolean ); // address: 0
	{
	enter_narrow 
	iload_0 
	iipush 4801362
	invokestatic boolean verifySignatures( boolean, int ) // ControlledAccess
	ireturn 
	}


static public final assertRCISignatures( boolean ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic boolean verifyRCISignatures( boolean ) // ControlledAccess
	ifne Label8
	new_lib net.rim.device.api.system.ControlledAccessException//module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42
	dup 
	invokespecial_lib .routine_27092 // pc=1
	athrow 
Label8:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

final java.lang.Object getObject( net.rim.device.api.system.ControlledAccess ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


final assertReadPermission( net.rim.device.api.system.ControlledAccess, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic assertSignature( int, net.rim.device.api.system.CodeSigningKey ) // ControlledAccess
	return 
	}


final assertReplacePermission( net.rim.device.api.system.ControlledAccess, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic assertSignature( int, net.rim.device.api.system.CodeSigningKey ) // ControlledAccess
	return 
	}


public final boolean checkKeys( net.rim.device.api.system.ControlledAccess, net.rim.device.api.system.CodeSigningKey, net.rim.device.api.system.CodeSigningKey ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label7
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
Label7:
	aload_2 
	ifnull Label13
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
Label13:
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


public final assertKeys( net.rim.device.api.system.ControlledAccess, net.rim.device.api.system.CodeSigningKey, net.rim.device.api.system.CodeSigningKey ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual_short .virtual_6 // idx=6 pc=3
	ifne Label10
	new_lib net.rim.device.api.system.ControlledAccessException//module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42 module:net_rim_cldc-10.class#42
	dup 
	invokespecial_lib .routine_27092 // pc=1
	athrow 
Label10:
	return 
	}

}
