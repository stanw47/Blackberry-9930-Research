// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_models.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.device.apps.internal.commonmodels.title;


abstract final class AddressBookTitleEditField extends net.rim.device.api.ui.component.ActiveAutoTextEditField

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.apps.internal.commonmodels.title.AddressBookTitleEditField, java.lang.String, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	lload 4
	invokespecial_lib net.rim.device.api.ui.component.ActiveAutoTextEditField.<init> // pc=6
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final int getMaxLinesToFormat( net.rim.device.apps.internal.commonmodels.title.AddressBookTitleEditField ); // address: 0
	{
	ireturn_iipush 2147483647
	}

}
