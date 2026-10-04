// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.tools.compiler;


public class Applet extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _name ; // ofs = 40272 addr = 0)
	private String /*java.lang.String*/  _className ; // ofs = 40276 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _iconNames ; // ofs = 40280 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _iconProps ; // ofs = 40284 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _icons ; // ofs = 40288 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.Applet, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setName( net.rim.tools.compiler.Applet, java.lang.String ); // address: 0
	{
	putfield_return .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public java.lang.String getName( net.rim.tools.compiler.Applet ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public setClassName( net.rim.tools.compiler.Applet, java.lang.String ); // address: 0
	{
	putfield_return .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public java.lang.String getClassName( net.rim.tools.compiler.Applet ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public int getNumIconNames( net.rim.tools.compiler.Applet ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public java.lang.String getIconName( net.rim.tools.compiler.Applet, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
	}


public java.lang.String getIconProps( net.rim.tools.compiler.Applet, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
	}


public setIconName( net.rim.tools.compiler.Applet, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aconst_null 
	iload_2 
	invokevirtual_short .virtual_11 // idx=11 pc=4
	return 
	}


public setIconName( net.rim.tools.compiler.Applet, java.lang.String, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_3 
	if_icmpgt Label19
	aload_4 
	iload_3 
	iconst_1 
	iadd 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_5 
	iload_3 
	iconst_1 
	iadd 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
Label19:
	aload_4 
	aload_1 
	iload_3 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	aload_2 
	ifnull Label29
	aload_5 
	aload_2 
	iload_3 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
Label29:
	return 
	}


public int getNumIcons( net.rim.tools.compiler.Applet ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public net.rim.tools.compiler.ImageFile getIcon( net.rim.tools.compiler.Applet, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ImageFile
	areturn 
	}


public setIcon( net.rim.tools.compiler.Applet, net.rim.tools.compiler.ImageFile, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_3 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_2 
	if_icmpgt Label12
	aload_3 
	iload_2 
	iconst_1 
	iadd 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
Label12:
	aload_3 
	aload_1 
	iload_2 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	aload_1 
	invokevirtual_short .virtual_11 // idx=11 pc=1
	return 
	}

}
