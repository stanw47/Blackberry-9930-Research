// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 28
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class Modifier extends Object
implements net.rim.tools.compiler.vm.Constants

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.Modifier ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final int translateClassfileAccessFlags( int ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	iload_0 
	iconst_1 
	iand 
	ifeq Label11
	iload_1 
	sipush 128
	ior 
	istore_1 
Label11:
	iload_0 
	bipush 2
	iand 
	ifeq Label19
	iload_1 
	sipush 512
	ior 
	istore_1 
Label19:
	iload_0 
	bipush 4
	iand 
	ifeq Label27
	iload_1 
	sipush 256
	ior 
	istore_1 
Label27:
	iload_0 
	bipush 8
	iand 
	ifeq Label35
	iload_1 
	bipush 2
	ior 
	istore_1 
Label35:
	iload_0 
	bipush 16
	iand 
	ifeq Label43
	iload_1 
	bipush 64
	ior 
	istore_1 
Label43:
	iload_0 
	bipush 32
	iand 
	ifeq Label51
	iload_1 
	iipush 32768
	ior 
	istore_1 
Label51:
	iload_0 
	bipush 64
	iand 
	ifeq Label59
	iload_1 
	sipush 8192
	ior 
	istore_1 
Label59:
	iload_0 
	sipush 128
	iand 
	ifeq Label67
	iload_1 
	sipush 4096
	ior 
	istore_1 
Label67:
	iload_0 
	sipush 256
	iand 
	ifeq Label75
	iload_1 
	iconst_1 
	ior 
	istore_1 
Label75:
	iload_0 
	sipush 512
	iand 
	ifeq Label83
	iload_1 
	sipush 2048
	ior 
	istore_1 
Label83:
	iload_0 
	sipush 1024
	iand 
	ifeq Label91
	iload_1 
	bipush 32
	ior 
	istore_1 
Label91:
	iload_0 
	sipush 2048
	iand 
	ifeq Label99
	iload_1 
	sipush 16384
	ior 
	istore_1 
Label99:
	iload_0 
	sipush 4096
	iand 
	ifeq Label107
	iload_1 
	iipush 33554432
	ior 
	istore_1 
Label107:
	iload_1 
	ireturn 
	}


static public final int translateCodfileAttributes( int ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	iload_0 
	iconst_1 
	iand 
	ifeq Label11
	iload_1 
	sipush 128
	ior 
	istore_1 
Label11:
	iload_0 
	bipush 2
	iand 
	ifeq Label19
	iload_1 
	sipush 512
	ior 
	istore_1 
Label19:
	iload_0 
	bipush 4
	iand 
	ifeq Label27
	iload_1 
	sipush 256
	ior 
	istore_1 
Label27:
	iload_0 
	bipush 8
	iand 
	ifeq Label35
	iload_1 
	bipush 64
	ior 
	istore_1 
Label35:
	iload_1 
	ireturn 
	}


static public final int translateCodfileClassAttributes( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic int translateCodfileAttributes( int ) // Modifier
	istore_1 
	iload_0 
	bipush 32
	iand 
	ifeq Label12
	iload_1 
	sipush 2048
	ior 
	istore_1 
Label12:
	iload_0 
	bipush 16
	iand 
	ifeq Label20
	iload_1 
	bipush 32
	ior 
	istore_1 
Label20:
	iload_0 
	sipush 128
	iand 
	ifeq Label28
	iload_1 
	iipush 4194304
	ior 
	istore_1 
Label28:
	iload_0 
	sipush 256
	iand 
	ifeq Label36
	iload_1 
	iipush 67108864
	ior 
	istore_1 
Label36:
	iload_0 
	bipush 64
	iand 
	ifeq Label44
	iload_1 
	iipush 134217728
	ior 
	istore_1 
Label44:
	iload_1 
	ireturn 
	}


static public final int toCodfileProtectionAttribute( int ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	iload_0 
	bipush 64
	iand 
	ifeq Label11
	iload_1 
	bipush 8
	ior 
	istore_1 
Label11:
	iload_0 
	sipush 128
	iand 
	ifeq Label19
	iload_1 
	iconst_1 
	ior 
	istore_1 
Label19:
	iload_0 
	sipush 256
	iand 
	ifeq Label27
	iload_1 
	bipush 4
	ior 
	istore_1 
Label27:
	iload_0 
	sipush 512
	iand 
	ifeq Label35
	iload_1 
	bipush 2
	ior 
	istore_1 
Label35:
	iload_0 
	iipush 2097152
	iand 
	ifeq Label43
	iload_1 
	iipush 65536
	ior 
	istore_1 
Label43:
	iload_1 
	ireturn 
	}


static public final int toCodfileClassAttribute( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic int toCodfileProtectionAttribute( int ) // Modifier
	istore_1 
	iload_0 
	sipush 2048
	iand 
	ifeq Label12
	iload_1 
	bipush 32
	ior 
	istore_1 
Label12:
	iload_0 
	bipush 32
	iand 
	ifeq Label20
	iload_1 
	bipush 16
	ior 
	istore_1 
Label20:
	iload_0 
	iipush 134217728
	iand 
	ifeq Label28
	iload_1 
	bipush 64
	ior 
	istore_1 
Label28:
	iload_1 
	ireturn 
	}


static public final int toCodfileRoutineAttribute( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic int toCodfileProtectionAttribute( int ) // Modifier
	istore_1 
	iload_0 
	bipush 2
	iand 
	ifeq Label12
	iload_1 
	bipush 16
	ior 
	istore_1 
Label12:
	iload_0 
	iipush 1048576
	iand 
	ifeq Label20
	iload_1 
	sipush 256
	ior 
	istore_1 
Label20:
	iload_0 
	bipush 16
	iand 
	ifeq Label28
	iload_1 
	sipush 128
	ior 
	istore_1 
Label28:
	iload_0 
	bipush 32
	iand 
	ifeq Label36
	iload_1 
	bipush 32
	ior 
	istore_1 
Label36:
	iload_1 
	ireturn 
	}

}
