// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 30
// ########################################################


package net.rim.tools.compiler.types;


public class NameAndType extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.NameAndType, java.lang.String, net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.ClassType, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iload_4 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iload_5 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getName( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final setType( net.rim.tools.compiler.types.NameAndType, net.rim.tools.compiler.types.Type ); // address: 0
	{
	putfield_return .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final net.rim.tools.compiler.types.ClassType getClassType( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public populate( net.rim.tools.compiler.types.NameAndType, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.exec.CodDigest$ClassDigest ); // address: 0
	{
	noenter_return 
	}


boolean suppressMemberName( net.rim.tools.compiler.types.NameAndType, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual boolean isNoName( net.rim.tools.compiler.Compiler ) // pc=1
	ifne Label6
	iconst_0 
	ireturn 
Label6:
	aload_0 
	iipush 136314880
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label12
	iconst_0 
	ireturn 
Label12:
	aload_0 
	sipush 512
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifne Label23
	aload_0 
	sipush 384
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifne Label25
	aload_1 
	invokevirtual boolean isOptimizePackage( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label25
Label23:
	iconst_1 
	ireturn 
Label25:
	iconst_0 
	ireturn 
	}


final module:net_rim_loader.class#23 getMember( net.rim.tools.compiler.types.NameAndType, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label7
	aload_0 
	iload_2 
	newarray_object_lib net.rim.tools.compiler.codfile.Member//module:net_rim_loader.class#23 module:net_rim_loader.class#23 module:net_rim_loader.class#23
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label7:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	aaload 
	areturn 
	}


final module:net_rim_loader.class#23 setMember( net.rim.tools.compiler.types.NameAndType, module:net_rim_loader.class#23, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_2 
	aload_1 
	aastore 
	aload_1 
	areturn 
	}


public module:net_rim_loader.class#23 getMember( net.rim.tools.compiler.types.NameAndType, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	new CompileException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_537:"no member associated with variable: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
	}


public final int getSize( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getSize( net.rim.tools.compiler.types.Type ) // pc=1
	ireturn 
	}


public final setOffset( net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	putfield_return .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public final boolean hasOffset( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush -1
	if_icmpeq Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public final int getOffset( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	ireturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public int getAbsoluteOffset( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	ireturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public boolean isUndefined( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	ireturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public setUndefined( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public final addModifiers( net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	ior 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public final clearModifiers( net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	bipush -1
	ixor 
	iand 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public final int getModifiers( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	ireturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final boolean is( net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iand 
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public boolean isAnd( net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iand 
	iload_1 
	if_icmpne Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public boolean equals( net.rim.tools.compiler.types.NameAndType, java.lang.Object ); // address: 0
	{
	enter 
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
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label16
	iconst_0 
	ireturn 
Label16:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	if_acmpeq Label22
	iconst_0 
	ireturn 
Label22:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ixor 
	istore_3 
	iload_3 
	iipush 1048606
	iand 
	ifeq Label33
	iconst_0 
	ireturn 
Label33:
	iconst_1 
	ireturn 
Label35:
	iconst_0 
	ireturn 
	}


public int hashCode( net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_ // idx=0 pc=1
	bipush 31
	imul 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	ireturn 
	}

}
