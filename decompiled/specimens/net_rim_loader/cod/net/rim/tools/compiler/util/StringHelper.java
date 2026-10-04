// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 44
// ########################################################


package net.rim.tools.compiler.util;


abstract public final class StringHelper extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.util.StringHelper ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String trim( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	aload_0 
	stringlength 
	istore_1 
	iconst_0 
	istore_2 
Label10:
	iload_2 
	iload_1 
	if_icmpge Label20
	aload_0 
	iload_2 
	stringaload 
	bipush 32
	if_icmpne Label20
	iinc 2 1
	goto Label10
Label20:
	iload_1 
	istore_3 
Label22:
	iload_3 
	iload_2 
	if_icmple Label34
	aload_0 
	iload_3 
	iconst_1 
	isub 
	stringaload 
	bipush 32
	if_icmpne Label34
	iinc 3 -1
	goto Label22
Label34:
	iload_2 
	ifgt Label39
	iload_3 
	iload_1 
	if_icmpge Label44
Label39:
	aload_0 
	iload_2 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_0 
Label44:
	aload_0 
	areturn 
	}


static public final boolean validateIdentifier( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	stringlength 
	istore_1 
	iload_1 
	ifne Label8
	iconst_0 
	ireturn 
Label8:
	aload_0 
	iconst_0 
	stringaload 
	invokestatic boolean isJavaIdentifierStart( char ) // CharacterHelper
	ifne Label15
	iconst_0 
	ireturn 
Label15:
	iconst_1 
	istore_2 
Label17:
	iload_2 
	iload_1 
	if_icmpge Label29
	aload_0 
	iload_2 
	stringaload 
	invokestatic boolean isJavaIdentifierPart( char ) // CharacterHelper
	ifne Label27
	iconst_0 
	ireturn 
Label27:
	iinc 2 1
	goto Label17
Label29:
	iconst_1 
	ireturn 
	}

}
