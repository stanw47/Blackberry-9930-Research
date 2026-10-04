// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 80
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ModuleDomestic extends net.rim.tools.compiler.codfile.Module

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ModuleDomestic, net.rim.tools.compiler.codfile.DataSection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	invokespecial_lib .routine_37912 // pc=6
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.codfile.ClassDef makeClassDef( net.rim.tools.compiler.codfile.ModuleDomestic, net.rim.tools.compiler.codfile.DataSection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new ClassDefDomestic
	dup 
	aload_1 
	aload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.ClassDefDomestic.<init> // pc=4
	astore_4 
	aload_0 
	aload_4 
	invokenonvirtual_lib .routine_37623 // pc=2
	aload_4 
	areturn 
	}

}
