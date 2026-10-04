// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 29
// ########################################################


package net.rim.tools.compiler.exec;


public class MyArrays extends Object

{


	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.tools.compiler.exec.MyArrays ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public byte[] resize( byte[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public char[] resize( char[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public int[] resize( int[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public java.lang.Object[] resize( java.lang.Object[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public net.rim.tools.compiler.types.Method[] resize( net.rim.tools.compiler.types.Method[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public net.rim.tools.compiler.types.Field[] resize( net.rim.tools.compiler.types.Field[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public module:net_rim_loader.class#10[] resize( module:net_rim_loader.class#10[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public module:net_rim_loader-1.class#73[] resize( module:net_rim_loader-1.class#73[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public module:net_rim_loader-1.class#35[] resize( module:net_rim_loader-1.class#35[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public module:net_rim_loader-1.class#37[] resize( module:net_rim_loader-1.class#37[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokestatic_lib resize( java.lang.Object, int ) // Array
	aload_0 
	areturn 
	}


static public net.rim.tools.compiler.types.Type[] clone( net.rim.tools.compiler.types.Type[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib java.lang.Object clone( java.lang.Object ) // Arrays
	checkcast_arrayobject Type
	areturn 
	}

}
