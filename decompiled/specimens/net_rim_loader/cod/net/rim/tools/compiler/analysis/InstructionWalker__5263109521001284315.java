// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 76
// ########################################################


package net.rim.tools.compiler.analysis;


public class InstructionWalker extends Object
implements net.rim.tools.compiler.vm.Constants

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.analysis.InstructionWalker ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public walkBlockStart( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	noenter_return 
	}


public walkItemStart( net.rim.tools.compiler.analysis.InstructionWalker, int, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	noenter_return 
	}


public walkItemEnd( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.classfile.ByteCodeBlock, boolean ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionTarget ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionBranch ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, module:net_rim_loader.class#15 ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, module:net_rim_loader.class#12 ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, module:net_rim_loader.class#16 ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, module:net_rim_loader.class#17 ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionString ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionStringArray ); // address: 0
	{
	noenter_return 
	}


public walkInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.InstructionType ); // address: 0
	{
	noenter_return 
	}


public unexpectedInstruction( net.rim.tools.compiler.analysis.InstructionWalker, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_451:"Unexpected instruction: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual int getOpcode( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9845 // pc=2
	athrow 
	}

}
