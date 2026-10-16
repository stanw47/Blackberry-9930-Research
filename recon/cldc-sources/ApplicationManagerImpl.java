// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_cldc-11.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.device.api.system;


abstract final class ApplicationManagerImpl extends net.rim.device.api.system.ApplicationManager
implements net.rim.device.internal.system.ApplicationManagerInternal, net.rim.device.api.system.RealtimeClockListener

{
	// @@@@@@@@@@@@@ Static fields 
	private static int /*int*/  _navUnclickTimestamp ; // ofs = 20102 addr = 2)
	private static boolean /*boolean*/  _navRollReceivedSinceUnclick ; // ofs = 20108 addr = 3)
	private final static int /*int*/  CRC_CHECK_ID ; // ofs = 20114 addr = 4)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer /*net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer*/  _processes ; // ofs = 19862 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _foregroundProcess ; // ofs = 19866 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _pendingForeground ; // ofs = 19870 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _consoleProcess ; // ofs = 19874 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _inHolsterInputProcess ; // ofs = 19878 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _redirectInputProcess ; // ofs = 19882 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _inputProcess ; // ofs = 19886 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _securityProcess ; // ofs = 19890 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _nativeSocketProcess ; // ofs = 19894 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _tunnelAllocatorProcess ; // ofs = 19898 addr = 0)
	private net.rim.device.api.system.GlobalKeyProcessRegistry /*module:net_rim_cldc-12.class#40*/  _globalKeyProcessRegistry ; // ofs = 19902 addr = 0)
	private net.rim.device.api.system.GlobalKeyBackgroundProcessRegistry /*module:net_rim_cldc-12.class#39*/  _globalKeyBackgroundProcessRegistry ; // ofs = 19906 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _permissionsRequestingProcess ; // ofs = 19910 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _applicationPermissionsProxyProcess ; // ofs = 19914 addr = 0)
	private int /*int*/  _securityLockSupercedingProcessId ; // ofs = 19918 addr = 0)
	private net.rim.device.api.system.EventLogger /*module:net_rim_cldc-12.class#27*/  _eventLogger ; // ofs = 19922 addr = 0)
	private net.rim.vm.Process /*module:net_rim_cldc-37.class#10*/  _thisProcess ; // ofs = 19926 addr = 0)
	private net.rim.vm.Message /*module:net_rim_cldc-36.class#69*/  _switchForegroundMessage ; // ofs = 19930 addr = 0)
	private net.rim.vm.Message /*module:net_rim_cldc-36.class#69*/  _switchBackgroundMessage ; // ofs = 19934 addr = 0)
	private net.rim.vm.Message /*module:net_rim_cldc-36.class#69*/  _refreshDisplayMessage ; // ofs = 19938 addr = 0)
	private net.rim.vm.Message /*module:net_rim_cldc-36.class#69*/  _globalEventMessage ; // ofs = 19942 addr = 0)
	private net.rim.device.internal.system.SecurityManager /*module:net_rim_cldc-31.class#70*/  _securityManager ; // ofs = 19946 addr = 0)
	private java.util.Vector /*module:net_rim_cldc.class#83*/  _scheduledApps ; // ofs = 19950 addr = 0)
	private long /*long*/  _alarmTime ; // ofs = 19954 addr = 0)
	private net.rim.device.api.system.ApplicationDescriptor /*module:net_rim_cldc-10.class#25*/  _engScreenDescriptor ; // ofs = 19958 addr = 0)
	private Object /*module:net_rim_cldc.class#61[]*/  _foregroundChangeListeners ; // ofs = 19962 addr = 0)
	private boolean /*boolean*/  _isFastReset ; // ofs = 19966 addr = 0)
	private boolean /*boolean*/  _fastResetHavePowerUp ; // ofs = 19970 addr = 0)
	private net.rim.device.api.system.ApplicationManagerImpl$StartupGetMessageThread /*net.rim.device.api.system.ApplicationManagerImpl$StartupGetMessageThread*/  _startupThread ; // ofs = 19974 addr = 0)
	private boolean /*boolean*/  _startupTiersRun ; // ofs = 19978 addr = 0)
	private int /*int*/  _startupTierInProgress ; // ofs = 19982 addr = 0)
	private net.rim.device.api.system.ApplicationRegistry /*net.rim.device.api.system.ApplicationRegistry*/  _applicationRegistry ; // ofs = 19986 addr = 0)
	private net.rim.device.internal.system.EventDispatchManager /*module:net_rim_cldc-30.class#11*/  _eventDispatchManager ; // ofs = 19990 addr = 0)
	private int /*int*/  _currentPowerOnBehavior ; // ofs = 19994 addr = 0)
	private boolean /*boolean*/  _usePowerOnBehaviourForScheduling ; // ofs = 19998 addr = 0)
	private boolean /*boolean*/  _dateTimeWasValidOnStartup ; // ofs = 20002 addr = 0)
	private String /*module:net_rim_cldc.class#78[]*/  _schedulingLog ; // ofs = 20006 addr = 0)
	private int /*int*/  _schedulingLogIndex ; // ofs = 20010 addr = 0)
	private Object /*module:net_rim_cldc.class#61*/  _startupMonitor ; // ofs = 20014 addr = 0)
	private net.rim.device.api.system.ApplicationProcess /*net.rim.device.api.system.ApplicationProcess*/  _kbProcess ; // ofs = 20018 addr = 0)
	private boolean /*boolean*/  _isCancellingTouch ; // ofs = 20022 addr = 0)
	private boolean[] /*boolean[]*/  _touchDownReceived ; // ofs = 20026 addr = 0)
	private int /*int*/  _lastDroppedTouchTimestamp ; // ofs = 20030 addr = 0)
	private int /*int*/  _lastLoggedTouchTimestamp ; // ofs = 20034 addr = 0)
	private int /*int*/  _touchUpsDropped ; // ofs = 20038 addr = 0)
	private int /*int*/  _activeBacklightDomain ; // ofs = 20042 addr = 0)
	private final long[] /*long[]*/  _forwardAllowedGUIDs ; // ofs = 20046 addr = 0)
	private int /*int*/  _lastStartupTimeID ; // ofs = 20050 addr = 0)
	private int /*int*/  _lastStartupTime ; // ofs = 20054 addr = 0)
	private net.rim.device.api.system.ApplicationManagerImpl$StartupProgressThread /*net.rim.device.api.system.ApplicationManagerImpl$StartupProgressThread*/  _startupProgressThread ; // ofs = 20058 addr = 0)
	private net.rim.device.api.system.ApplicationUsageStorage /*net.rim.device.api.system.ApplicationUsageStorage*/  _appUsageStorage ; // ofs = 20062 addr = 0)
	private net.rim.device.api.system.ApplicationUsageAnalyzer /*net.rim.device.api.system.ApplicationUsageAnalyzer*/  _appUsageAnalyzer ; // ofs = 20066 addr = 0)
	private net.rim.device.internal.systemprofiling.SystemProfilingDeviceStartup /*module:net_rim_cldc-31.class#83*/  _startupProfiler ; // ofs = 20070 addr = 0)
	private boolean /*boolean*/  _deadProcessChecking ; // ofs = 20074 addr = 0)
	private java.util.Vector /*module:net_rim_cldc.class#83*/  _autoRestartAfterKilledNames ; // ofs = 20078 addr = 0)
	private net.rim.device.api.util.IntVector /*module:net_rim_cldc.class#45*/  _autoRestartAfterKilledIndexes ; // ofs = 20082 addr = 0)
	private net.rim.device.api.util.IntVector /*module:net_rim_cldc.class#45*/  _autoRestartAfterKilledForeground ; // ofs = 20086 addr = 0)
	private Object /*module:net_rim_cldc.class#61*/  _consoleMonitor ; // ofs = 20090 addr = 0)
	private boolean /*boolean*/  _loadCRCChanged ; // ofs = 20094 addr = 0)
	private net.rim.device.api.system.AMICleanupRunnable /*module:net_rim_cldc-10.class#0*/  _cleanupBody ; // ofs = 20098 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static private final module:net_rim_cldc-10.class#25 getNewDescriptor( module:net_rim_cldc-10.class#25, module:net_rim_cldc.class#78[] ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_21 // idx=21 pc=1
	istore_2 
	aload_1 
	ifnonnull Label12
	iload_2 
	bipush 4
	iand 
	ifne Label12
	aload_0 
	areturn 
Label12:
	iload_2 
	bipush -5
	iand 
	istore_2 
	new_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	dup 
	aload_0 
	aload_0 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	aload_1 
	aload_0 
	invokevirtual_short .virtual_29 // idx=29 pc=1
	aload_0 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	aload_0 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iload_2 
	invokespecial_lib .routine_19047 // pc=8
	areturn 
	}


static private final log( module:net_rim_cldc.class#78 ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	return 
	}


static private final log( module:net_rim_cldc.class#78, boolean ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label4
	return 
Label4:
	getstatic_lib module:net_rim_cldc-2.class#84.static_202 // class#84
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2070:"AM: "
	invokespecial_lib .routine_42025 // pc=2
	aload_0 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_27 // idx=27 pc=2
	iload_1 
	ifeq Label21
	lipush 926941884388532065
	aload_0 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_13711(  ) // class#27
	pop 
Label21:
	return 
	}


static private final startupDone(  ); // address: 0
	{
	invokenative startupDone(  )
	}


static private final updateStartupProgress( int ); // address: 0
	{
	invokenative updateStartupProgress( int )
	}


<init>( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_19821 // pc=1
	aload_0 
	lipush 9223372036854775807
	lputfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	iipush -2147483648
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_0 
	iconst_1 
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0 
	iconst_0 
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0 
	new_lib Object//module:net_rim_cldc.class#61 module:net_rim_cldc.class#61 module:net_rim_cldc.class#61
	dup 
	invokespecial_lib .routine_42329 // pc=1
	putfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	aload_0 
	bipush 4
	newarray 1
	putfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	aload_0 
	iconst_0 
	putfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	aload_0 
	arrayinit [113, -31, -86, 68, 95, -127, 7, 100, 32, 94, 25, -1, -123, -81, 51, 123, -80, -31, 86, -5, 73, 76, -24, 49, 6, 44, -120, 56, 20, -42, 106, -112, -92, -47, -69, -27, 106, -120, 106, -104, -87, 39, 64, 103, -73, -88, 31, 13, -66, -17, 97, 65, 0, 43, 2, -61, -61, -59, 96, -18, -35, -64, -70, 82, -6, 65, -69, -90, 47, 87, 111, -59, 30, -118, -95, -54, -36, -14, -25, -9, 24, -77, -35, -82, 106, -29, -73, 18, -3, -88, -18, 77, -46, 30, 7, 115, 40, 105, -105, 100, 3, -81, 14, -73, 9, -125, -58, 107, -52, 24, 59, 86, -103, -125, 36, 15, 96, 57, -13, 14, 94, -45, -125, 113, -4, 34, 3, 35, 89, -16, 87, -91, 67, 29, 98, -76, -106, 102, -124, 122, 82, -80, 2, -99, -85, 89, 91, 41, -29, -93, 39, 99, 107, 120, 18, -106, -91, 62, 57, -37, 41, 79, 84, -90, 57, -46, -80, -53, -67, 39, 59, 48, 31, -32, 45, 90, 115, 60, 44, -17, 32, 21, 52, 2, -11, 101, -52, -110, -86, -87, 13, -12, -105, -1, 104, -25, 55, 59, -85, 117, -36, 54, 75, -11, -93, 13, 4, -109, -95, 114, 46, 50, 22, -127, 62, 70, 27, -99, -37, 69, -41, 106, 84, 46, 51, -14, 17, 29, 102, 90, -54, 71, -89, -40, -32, 126, -50, 23, -5, -112]
	putfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	aload_0 
	new ApplicationManagerImpl$StartupProgressThread
	dup 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$StartupProgressThread.<init> // pc=2
	putfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	aload_0 
	new_lib java.util.Vector//module:net_rim_cldc.class#83 module:net_rim_cldc.class#83 module:net_rim_cldc.class#83
	dup 
	invokespecial_lib .routine_51888 // pc=1
	putfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	aload_0 
	new_lib net.rim.device.api.util.IntVector//module:net_rim_cldc.class#45 module:net_rim_cldc.class#45 module:net_rim_cldc.class#45
	dup 
	invokespecial_lib .routine_34076 // pc=1
	putfield .field_56_56   // get_name_1:  .field_56_56   // get_name_2:  .field_56_56   // get_Name:    .field_56_56   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 56
	aload_0 
	new_lib net.rim.device.api.util.IntVector//module:net_rim_cldc.class#45 module:net_rim_cldc.class#45 module:net_rim_cldc.class#45
	dup 
	invokespecial_lib .routine_34076 // pc=1
	putfield .field_57_57   // get_name_1:  .field_57_57   // get_name_2:  .field_57_57   // get_Name:    .field_57_57   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 57
	aload_0 
	new_lib Object//module:net_rim_cldc.class#61 module:net_rim_cldc.class#61 module:net_rim_cldc.class#61
	dup 
	invokespecial_lib .routine_42329 // pc=1
	putfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4616(  ) // class#10
	aload_0 
	new ApplicationRegistry
	dup 
	invokespecial net.rim.device.api.system.ApplicationRegistry.<init> // pc=1
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0 
	new_lib net.rim.device.api.system.GlobalKeyProcessRegistry//module:net_rim_cldc-12.class#40 module:net_rim_cldc-12.class#40 module:net_rim_cldc-12.class#40
	dup 
	invokespecial_lib .routine_18978 // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	new_lib net.rim.device.api.system.GlobalKeyBackgroundProcessRegistry//module:net_rim_cldc-12.class#39 module:net_rim_cldc-12.class#39 module:net_rim_cldc-12.class#39
	dup 
	invokespecial_lib .routine_18659 // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	new_lib net.rim.device.api.system.EventLogger//module:net_rim_cldc-12.class#27 module:net_rim_cldc-12.class#27 module:net_rim_cldc-12.class#27
	dup 
	invokespecial_lib .routine_13415 // pc=1
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	new ApplicationManagerImpl$ApplicationProcessContainer
	dup 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib java.util.Vector//module:net_rim_cldc.class#83 module:net_rim_cldc.class#83 module:net_rim_cldc.class#83
	dup 
	invokespecial_lib .routine_51888 // pc=1
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 105
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_0 
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	iconst_0 
	bipush 12
	invokespecial_lib .routine_33263 // pc=3
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	iconst_0 
	bipush 13
	invokespecial_lib .routine_33263 // pc=3
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0 
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	iconst_0 
	bipush 3
	invokespecial_lib .routine_33263 // pc=3
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	bipush 32
	iconst_0 
	invokespecial_lib .routine_33263 // pc=3
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_22280(  ) // class#28
	ifne Label127
	invokestatic int getVendorId(  ) // Branding
	iconst_1 
	if_icmpne Label129
Label127:
	iconst_1 
	goto Label130
Label129:
	iconst_0 
Label130:
	putfield .field_54_54   // get_name_1:  .field_54_54   // get_name_2:  .field_54_54   // get_Name:    .field_54_54   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 54
	aload_0 
	invokestatic_lib module:net_rim_cldc-10.class#0.routine_1007(  ) // class#0
	putfield .field_60_60   // get_name_1:  .field_60_60   // get_name_2:  .field_60_60   // get_Name:    .field_60_60   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 60
	aload_0 
	invokestatic_lib module:net_rim_cldc-30.class#11.routine_8542(  ) // class#11
	putfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	lipush 926941884388532065
	ldc literal_2071:"AppManager"
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_13585(  ) // class#27
	pop 
	ldc literal_2072:"init"
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	aload_0_getfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	iconst_0 
	aload_0_getfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	arraylength 
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_2401(  ) // class#3
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_20045(  ) // class#28
	ifne Label159
	aload_0 
	iconst_0 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	lipush 1141171200000
	invokestatic_lib module:net_rim_cldc-12.class#1.routine_2616(  ) // class#1
	pop 
	goto Label162
Label159:
	aload_0 
	iconst_1 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
Label162:
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.checkLoadCRC // pc=1
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.run // pc=1
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.system.ApplicationManager//module:net_rim_cldc-10.class#28 module:net_rim_cldc-10.class#28 module:net_rim_cldc-10.class#28
	synch_static ApplicationManagerImpl
	clinit_wait 
	iconst_0 
	putstatic _navUnclickTimestamp // ApplicationManagerImpl
	iconst_1 
	putstatic _navRollReceivedSinceUnclick // ApplicationManagerImpl
	lipush -1995386294720822350
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#9.routine_3733(  ) // class#9
	putstatic CRC_CHECK_ID // ApplicationManagerImpl
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean setNextAlarm( net.rim.device.api.system.ApplicationManagerImpl, boolean, module:net_rim_cldc-10.class#25 ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual_short .virtual_8 // idx=8 pc=1
	istore_4 
	iconst_1 
	istore_5 
	iconst_0 
	istore_6 
Label10:
	iload_6 
	ifeq Label13
	goto_w Label214
Label13:
	iload_4 
	ifgt Label16
	goto_w Label214
Label16:
	lipush 9223372036854775807
	lstore 7
	bipush -1
	istore 9
	iconst_0 
	istore 10
Label22:
	iload 10
	iload_4 
	if_icmpge Label58
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload 10
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_3 
	aload_3 
	invokevirtual_short .virtual_31 // idx=31 pc=1
	lstore 11
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	ifeq Label44
	aload_3 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore 13
	iload 13
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	iand 
	ifne Label44
	lipush 9223372036854775807
	lstore 11
Label44:
	lload 11
	lload 7
	lcmp 
	ifge Label56
	lload 11
	lipush 9223372036854775807
	lcmp 
	ifeq Label56
	lload 11
	lstore 7
	iload 10
	istore 9
Label56:
	iinc 10 1
	goto Label22
Label58:
	lload 7
	aload_0 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	lcmp 
	ifle Label66
	iload_1 
	ifne Label66
	goto_w Label183
Label66:
	lload 7
	lipush 9223372036854775807
	lcmp 
	ifne Label71
	goto_w Label183
Label71:
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42190(  ) // class#84
	sipush 15000
	i2l 
	ladd 
	lstore 10
	iload 9
	iflt Label124
	lload 7
	lload 10
	lcmp 
	ifge Label124
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload 9
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_3 
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1997:"Scheduling error for "
	invokespecial_lib .routine_42025 // pc=2
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_1998:" for "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 7
	invokevirtual_short .virtual_17 // idx=17 pc=3
	ldc literal_1999:" which is in the past or offers insufficient lag time"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	lload 10
	lstore 7
	aload_3 
	lload 7
	iconst_1 
	invokevirtual_short .virtual_33 // idx=33 pc=4
	pop2 
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2000:"Adjusting scheduling for "
	invokespecial_lib .routine_42025 // pc=2
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_1998:" for "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 7
	invokevirtual_short .virtual_17 // idx=17 pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
Label124:
	lload 7
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_19975(  ) // class#28
	ifeq Label152
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload 9
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_3 
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2001:"Scheduled "
	invokespecial_lib .routine_42025 // pc=2
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_1998:" for "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 7
	invokevirtual_short .virtual_17 // idx=17 pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	iconst_1 
	istore_6 
	aload_0 
	lload 7
	lputfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	goto_w Label10
Label152:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload 9
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_3 
	aload_3 
	aload_2 
	if_acmpne Label162
	iconst_0 
	istore_5 
Label162:
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1997:"Scheduling error for "
	invokespecial_lib .routine_42025 // pc=2
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_1998:" for "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 7
	invokevirtual_short .virtual_17 // idx=17 pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload 9
	invokevirtual_short .virtual_20 // idx=20 pc=2
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual_short .virtual_8 // idx=8 pc=1
	istore_4 
	goto_w Label10
Label183:
	iload 9
	bipush -1
	if_icmpeq Label211
	iload 9
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual_short .virtual_8 // idx=8 pc=1
	if_icmpge Label211
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload 9
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_3 
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2002:"SetNextAlarm: Earliest Alarm already set: "
	invokespecial_lib .routine_42025 // pc=2
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2003:"["
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 7
	invokevirtual_short .virtual_17 // idx=17 pc=3
	ldc literal_2004:"]"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
Label211:
	iconst_1 
	istore_6 
	goto_w Label10
Label214:
	iload_4 
	ifne Label220
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_19988(  ) // class#28
	aload_0 
	lipush 9223372036854775807
	lputfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
Label220:
	iload_5 
	ireturn 
	}


private final net.rim.device.api.system.ApplicationProcess findProcess( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual_short .virtual_19 // idx=19 pc=1
	iload_1 
	if_icmpne Label11
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label11
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	areturn 
Label11:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aconst_null 
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iconst_1 
	isub 
	istore_4 
Label22:
	iload_4 
	iflt Label38
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	iload_1 
	if_icmpne Label36
	aload_3 
	aload_2 
	monitorexit 
	areturn 
Label36:
	iinc 4 -1
	goto Label22
Label38:
	aconst_null 
	aload_2 
	monitorexit 
	areturn 
	astore_5 
	aload_2 
	monitorexit 
	aload_5 
	athrow 
	}


private final waitForConsole( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	dup 
	astore_1 
	monitorenter 
Label5:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label12
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	invokenonvirtual_lib .routine_42311 // pc=1
	goto Label5
	astore_2 
	goto Label5
Label12:
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
	}


private final didNotTakeForeground( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_acmpne Label34
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer.moveProcessToRear // pc=2
	aload_0 
	invokevirtual_short .virtual_25 // idx=25 pc=1
	ifeq Label18
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	goto Label34
Label18:
	iload_2 
	ifeq Label30
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label30
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer.moveProcess // pc=3
	goto Label34
Label30:
	aload_0 
	aconst_null 
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=3
Label34:
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


private final updateCachedForegroundFlag( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label55
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_1 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	aload_2 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	if_icmple Label19
	aload_2 
	invokevirtual_short .virtual_53 // idx=53 pc=1
	astore_3 
	aload_1 
	invokevirtual_short .virtual_53 // idx=53 pc=1
	astore_4 
	goto Label25
Label19:
	aload_1 
	invokevirtual_short .virtual_53 // idx=53 pc=1
	astore_3 
	aload_2 
	invokevirtual_short .virtual_53 // idx=53 pc=1
	astore_4 
Label25:
	aload_3 
	dup 
	astore_5 
	monitorenter 
	aload_4 
	dup 
	astore_6 
	monitorenter 
	aload_1 
	iconst_0 
	invokevirtual_short .virtual_52 // idx=52 pc=2
	aload_2 
	iconst_1 
	invokevirtual_short .virtual_52 // idx=52 pc=2
	aload_6 
	monitorexit 
	goto Label47
	astore_7 
	aload_6 
	monitorexit 
	aload_7 
	athrow 
Label47:
	aload_5 
	monitorexit 
	return 
	astore 8
	aload_5 
	monitorexit 
	aload 8
	athrow 
Label55:
	aload_2 
	invokevirtual_short .virtual_53 // idx=53 pc=1
	dup 
	astore_3 
	monitorenter 
	aload_2 
	iconst_1 
	invokevirtual_short .virtual_52 // idx=52 pc=2
	aload_3 
	monitorexit 
	return 
	astore 9
	aload_3 
	monitorexit 
	aload 9
	athrow 
	}


private final processExited( net.rim.device.api.system.ApplicationManagerImpl, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_5 
	iconst_0 
	newarray_object_lib net.rim.vm.Process//module:net_rim_cldc-37.class#10 module:net_rim_cldc-37.class#10 module:net_rim_cldc-37.class#10
	astore_6 
	iconst_0 
	newarray_object_lib Throwable//module:net_rim_cldc-2.class#87 module:net_rim_cldc-2.class#87 module:net_rim_cldc-2.class#87
	astore_7 
	new_lib net.rim.vm.WeakReference//module:net_rim_cldc-37.class#24 module:net_rim_cldc-37.class#24 module:net_rim_cldc-37.class#24
	dup 
	aload_6 
	invokespecial_lib .routine_6591 // pc=2
	astore 8
	iload_5 
	iconst_1 
	isub 
	istore 9
Label27:
	iload 9
	ifge Label30
	goto_w Label360
Label30:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 9
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore 10
	aload 10
	invokevirtual_short .virtual_20 // idx=20 pc=1
	ifeq Label38
	goto_w Label358
Label38:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2005:"Exit "
	invokespecial_lib .routine_42025 // pc=2
	aload 10
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload 10
	invokevirtual_short .virtual_13 // idx=13 pc=1
	astore 11
	aconst_null 
	astore 12
	aload_6 
	aload 10
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_566(  ) // class#3
	aload_7 
	aload 11
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_566(  ) // class#3
	aload 11
	ifnonnull Label61
	goto_w Label178
Label61:
	aload 11
	checkcastbranch_lib 
	astore 13
	aload 10
	invokevirtual_short .virtual_32 // idx=32 pc=1
	astore 14
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2006:"Content Protection Error: An application is persisting plaintext data.?App: "
	invokespecial_lib .routine_42025 // pc=2
	aload 14
	invokevirtual_short .virtual_5 // idx=5 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2007:"?Module: "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload 14
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2008:"?Object: 0x"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload 13
	invokevirtual_short .virtual_5 // idx=5 pc=1
	invokestatic_lib module:net_rim_cldc.class#46.routine_34252(  ) // class#46
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 15
	aload 15
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	sipush 204
	aload 15
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_22228(  ) // class#28
Label92:
	aload 11
	checkcastbranch_lib 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore 13
	aload 13
	ifnull Label123
	aload 10
	invokevirtual_short .virtual_32 // idx=32 pc=1
	astore 14
	aload 14
	invokevirtual_short .virtual_5 // idx=5 pc=1
	astore 15
	lipush 8732645638888225014
	ldc literal_2009:"net.rim.device.internal.resource.PlatformSecurity"
	invokestatic_lib module:net_rim_cldc-7.class#92.routine_45524(  ) // class#92
	astore 16
	aload 16
	bipush 21
	invokevirtual_short .virtual_8 // idx=8 pc=2
	bipush 2
	newarray_object_lib String//module:net_rim_cldc.class#78 module:net_rim_cldc.class#78 module:net_rim_cldc.class#78
	dup 
	iconst_0 
	aload 15
	aastore 
	dup 
	iconst_1 
	aload 13
	aastore 
	invokestatic_lib module:net_rim_cldc-7.class#88.routine_44562(  ) // class#88
	astore 12
Label123:
	aload 12
	ifnonnull Label136
	aload 10
	invokevirtual_short .virtual_39 // idx=39 pc=1
	astore 13
	aload 13
	ifnull Label136
	aload 13
	aload 11
	invokevirtual .virtual_91(  ) // pc=2
	astore 12
	goto Label136
	astore 14
Label136:
	aload 12
	ifnonnull Label154
	aload 11
	invokevirtual_short .virtual_3 // idx=3 pc=1
	astore 12
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2010:"Uncaught exception: "
	invokespecial_lib .routine_42025 // pc=2
	aload 12
	ifnonnull Label150
	aload 11
	invokevirtual_short .toString // idx=2 pc=1
	goto Label151
Label150:
	aload 12
Label151:
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 12
Label154:
	aload 10
	invokevirtual_short .virtual_13 // idx=13 pc=1
	astore 13
	iconst_0 
	istore 14
Label159:
	aload 13
	iload 14
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6300(  ) // class#19
	astore 15
	aload 15
	ifnonnull Label166
	goto Label170
Label166:
	aload 15
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	iinc 14 1
	goto Label159
Label170:
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lipush 9056933960126321432
	iconst_0 
	iconst_0 
	aload 12
	aload 11
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=8
Label178:
	aload 10
	iconst_0 
	invokestatic_lib module:net_rim_cldc-8.class#113.routine_42682(  ) // class#113
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 10
	invokevirtual_short .virtual_7 // idx=7 pc=2
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload 10
	invokevirtual_short .virtual_7 // idx=7 pc=2
	aload 10
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_acmpne Label194
	aload_0 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label200
Label194:
	aload 10
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	if_acmpne Label200
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label200:
	aload 10
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_acmpne Label205
	iconst_1 
	goto Label206
Label205:
	iconst_0 
Label206:
	istore 13
	iload 13
	ifeq Label211
	iconst_1 
	istore_3 
Label211:
	aload 10
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_acmpne Label216
	iconst_1 
	istore_4 
Label216:
	aload 10
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_acmpne Label238
	aload 11
	ifnull Label233
	new_lib net.rim.device.api.system.SecurityProcessDiedException//module:net_rim_cldc-13.class#124 module:net_rim_cldc-13.class#124 module:net_rim_cldc-13.class#124
	dup 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2011:"Security process failure - "
	invokespecial_lib .routine_42025 // pc=2
	aload 11
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_39925 // pc=2
	athrow 
Label233:
	aload_0 
	aconst_null 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_42209 // pc=1
Label238:
	aload_0_getfield .field_60_60   // get_name_1:  .field_60_60   // get_name_2:  .field_60_60   // get_Name:    .field_60_60   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 60
	aload 10
	aload 11
	invokevirtual_short .virtual_3 // idx=3 pc=3
	aload 10
	invokevirtual_short .virtual_4 // idx=4 pc=1
	ifeq Label279
	aload 10
	invokevirtual_short .virtual_32 // idx=32 pc=1
	astore 14
	aload 14
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore 15
	aload 14
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore 16
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2012:"Will restart "
	invokespecial_lib .routine_42025 // pc=2
	aload 15
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2013:":"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload 16
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	aload 15
	invokevirtual_short .virtual_22 // idx=22 pc=2
	aload_0_getfield .field_56_56   // get_name_1:  .field_56_56   // get_name_2:  .field_56_56   // get_Name:    .field_56_56   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 56
	iload 16
	invokevirtual_short .virtual_23 // idx=23 pc=2
	aload_0_getfield .field_57_57   // get_name_1:  .field_57_57   // get_name_2:  .field_57_57   // get_Name:    .field_57_57   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 57
	iload 13
	ifeq Label277
	iconst_1 
	goto Label278
Label277:
	iconst_0 
Label278:
	invokevirtual_short .virtual_23 // idx=23 pc=2
Label279:
	iinc 5 -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 9
	aload 8
	invokevirtual_short .virtual_6 // idx=6 pc=3
	iconst_0 
	istore 14
	aload 10
	invokevirtual_short .virtual_32 // idx=32 pc=1
	astore 15
	aconst_null 
	astore 10
	aload 15
	invokevirtual_short .virtual_21 // idx=21 pc=1
	bipush 4
	iand 
	ifeq Label300
	iconst_1 
	istore 14
	goto Label300
	astore 16
Label300:
	iload 14
	ifeq Label358
	aload 15
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore 16
	aload 15
	invokevirtual_short .virtual_3 // idx=3 pc=1
	bipush 51
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifne Label322
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2014:"module "
	invokespecial_lib .routine_42025 // pc=2
	aload 16
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2015:" missing RRI signature"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	goto Label358
Label322:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2016:"Restarting "
	invokespecial_lib .routine_42025 // pc=2
	aload 16
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	aload_0 
	aload 15
	iload 13
	invokevirtual_short .virtual_12 // idx=12 pc=3
	pop 
	iload 13
	ifeq Label353
	iconst_0 
	istore_3 
	goto Label353
	astore 17
	goto Label353
	astore 17
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2017:"cannot restart module "
	invokespecial_lib .routine_42025 // pc=2
	aload 16
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
Label353:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_5 
	goto Label358
	astore 16
Label358:
	iinc 9 -1
	goto_w Label27
Label360:
	iload_1 
	ifne Label365
	aload_6 
	aload_7 
	invokestatic_lib module:net_rim_cldc-13.class#71.routine_21433(  ) // class#71
Label365:
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	ifnull Label373
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	aload_6 
	aload_7 
	invokevirtual_short .virtual_7 // idx=7 pc=3
	goto Label373
	astore 9
Label373:
	aconst_null 
	astore_6 
	aconst_null 
	astore_7 
	aconst_null 
	astore 8
	iload_3 
	ifeq Label400
	lipush -7509200465648525729
	iipush 1095583300
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_13913(  ) // class#27
	pop 
	aload_0 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateForegroundProcess // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label400
	aload_0 
	aconst_null 
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=3
	goto Label400
	astore 9
Label400:
	iload_4 
	ifeq Label422
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label419
	lipush -7509200465648525729
	iipush 1095585860
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_13913(  ) // class#27
	pop 
	aload_0 
	aconst_null 
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=3
	goto Label422
	astore 9
	goto Label422
Label419:
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label422:
	aload_2 
	monitorexit 
	return 
	astore 18
	aload_2 
	monitorexit 
	aload 18
	athrow 
	}


private final lockSystemInternal( net.rim.device.api.system.ApplicationManagerImpl, boolean, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnull Label22
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label22
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	iload_1 
	iload_2 
	invokeinterface interfacemethodref_480 // pc=3 guess=2
	istore_4 
	iload_4 
	bipush -1
	if_icmpeq Label22
	aload_0 
	aload_0 
	iload_4 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label22:
	aload_3 
	monitorexit 
	return 
	astore_5 
	aload_3 
	monitorexit 
	aload_5 
	athrow 
	}


private final sendThurmanEvent( net.rim.device.api.system.ApplicationManagerImpl, int, int ); // address: 0
	{
	enter 
	invokestatic_lib module:net_rim_cldc-31.class#98.routine_39242(  ) // class#98
	iload_1 
	iload_2 
	invokevirtual_short .virtual_5 // idx=5 pc=3
	return 
	astore_3 
	return 
	}


private final interruptInputSequences( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual_short .virtual_45 // idx=45 pc=1
	pop 
	return 
	}


private final resetTouchState( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	iconst_0 
	istore_1 
Label6:
	iload_1 
	bipush 4
	if_icmpge Label15
	aload_0_getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	iload_1 
	iconst_0 
	bastore 
	iinc 1 1
	goto Label6
Label15:
	return 
	}


private final touchDown( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	iload_1 
	iconst_1 
	bastore 
	return 
	}


private final touchUp( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	iload_1 
	iconst_0 
	bastore 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDetected // pc=1
	ifne Label11
	aload_0 
	iconst_0 
	putfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
Label11:
	return 
	}


private final boolean touchFingerIsPressed( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	iload_1 
	baload 
	ireturn 
	}


private final boolean touchDetected( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
Label3:
	iload_1 
	bipush 4
	if_icmpge Label14
	aload_0_getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	iload_1 
	baload 
	ifeq Label12
	iconst_1 
	ireturn 
Label12:
	iinc 1 1
	goto Label3
Label14:
	iconst_0 
	ireturn 
	}


private final long touchDownReceivedBitmask( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	iconst_0 
	i2l 
	lstore 1
	bipush 3
	bipush 63
	invokestatic_lib module:net_rim_cldc-2.class#57.routine_30435(  ) // class#57
	istore_3 
Label8:
	iload_3 
	iflt Label26
	lload 1
	bipush 2
	i2l 
	lmul 
	lstore 1
	aload_0_getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	iload_3 
	baload 
	ifeq Label24
	lload 1
	iconst_1 
	i2l 
	ladd 
	lstore 1
Label24:
	iinc 3 -1
	goto Label8
Label26:
	lload 1
	lreturn 
	}


private final startCancellingTouch( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchGestureIsInProgress // pc=1
	ifeq Label7
	aload_0 
	iconst_1 
	putfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
Label7:
	return 
	}


private final module:net_rim_cldc-36.class#69 cancelInputProcessTouch( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchGestureIsInProgress // pc=1
	ifeq Label35
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnonnull Label16
	aconst_null 
	aload_1 
	monitorexit 
	areturn 
Label16:
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	invokespecial_lib .routine_33229 // pc=1
	astore_3 
	aload_0 
	aload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.cancelTouchMessage // pc=2
	aload_2 
	aload_3 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	aload_3 
	aload_1 
	monitorexit 
	areturn 
	astore_4 
	aload_1 
	monitorexit 
	aload_4 
	athrow 
Label35:
	aconst_null 
	areturn 
	}


private final boolean touchGestureIsInProgress( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:net_rim_cldc-13.class#23.routine_6066(  ) // class#23
	ifne Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	ifne Label10
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDetected // pc=1
	ifne Label12
Label10:
	iconst_0 
	ireturn 
Label12:
	iconst_1 
	ireturn 
	}


private final cancelTouchMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush 61
	invokevirtual_short .virtual_14 // idx=14 pc=2
	aload_1 
	iconst_0 
	invokevirtual_short .virtual_15 // idx=15 pc=2
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	tableswitch  :
		
		
		

Label10:
	aload_1 
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_23204(  ) // class#28
	l2i 
	invokevirtual_short .virtual_16 // idx=16 pc=2
Label14:
	aload_1 
	bipush -1
	invokevirtual_short .virtual_18 // idx=18 pc=2
	aload_1 
	bipush -1
	invokevirtual_short .virtual_19 // idx=19 pc=2
	aload_1 
	iconst_0 
	invokevirtual_short .virtual_22 // idx=22 pc=2
	aload_1 
	iconst_0 
	invokevirtual_short .virtual_17 // idx=17 pc=2
	return 
	}


private final int launchApplication( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc.class#78, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	aload_1 
	bipush 46
	invokevirtual_short .virtual_13 // idx=13 pc=2
	istore_5 
	aload_1 
	bipush 63
	invokevirtual_short .virtual_13 // idx=13 pc=2
	istore_6 
	iload_5 
	iload_6 
	if_icmple Label16
	bipush -1
	istore_5 
Label16:
	iload_5 
	bipush -1
	if_icmpeq Label42
	aload_1 
	iconst_0 
	iload_5 
	invokevirtual_short .virtual_20 // idx=20 pc=3
	astore_3 
	iload_6 
	bipush -1
	if_icmpne Label34
	aload_1 
	iload_5 
	iconst_1 
	iadd 
	invokevirtual_short .virtual_19 // idx=19 pc=2
	astore_4 
	goto Label53
Label34:
	aload_1 
	iload_5 
	iconst_1 
	iadd 
	iload_6 
	invokevirtual_short .virtual_20 // idx=20 pc=3
	astore_4 
	goto Label53
Label42:
	iload_6 
	bipush -1
	if_icmpne Label48
	aload_1 
	astore_3 
	goto Label53
Label48:
	aload_1 
	iconst_0 
	iload_6 
	invokevirtual_short .virtual_20 // idx=20 pc=3
	astore_3 
Label53:
	aload_3 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23151(  ) // class#34
	istore_7 
	iload_7 
	ifgt Label63
	new_lib net.rim.device.api.system.ApplicationManagerException//module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29
	dup 
	ldc literal_2018:"Module not found."
	invokespecial_lib .routine_19921 // pc=2
	athrow 
Label63:
	iload_7 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24430(  ) // class#34
	astore 8
	aload 8
	ifnull Label71
	aload 8
	arraylength 
	ifne Label76
Label71:
	new_lib net.rim.device.api.system.ApplicationManagerException//module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29
	dup 
	ldc literal_2019:"Module not an application."
	invokespecial_lib .routine_19921 // pc=2
	athrow 
Label76:
	aload 8
	iconst_0 
	aaload 
	astore 9
	aload_4 
	ifnonnull Label87
	aload 8
	iconst_0 
	aaload 
	astore 9
	goto Label115
Label87:
	aload 8
	arraylength 
	iconst_1 
	isub 
	istore 10
Label92:
	iload 10
	iflt Label108
	aload 8
	iload 10
	aaload 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label106
	aload 8
	iload 10
	aaload 
	astore 9
	goto Label108
Label106:
	iinc 10 -1
	goto Label92
Label108:
	iload 10
	ifge Label115
	new_lib net.rim.device.api.system.ApplicationManagerException//module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29
	dup 
	ldc literal_2020:"Entry point not found."
	invokespecial_lib .routine_19921 // pc=2
	athrow 
Label115:
	aconst_null 
	astore 10
	iload_6 
	bipush -1
	if_icmpeq Label148
	new_lib net.rim.device.api.util.StringTokenizer//module:net_rim_cldc-23.class#122 module:net_rim_cldc-23.class#122 module:net_rim_cldc-23.class#122
	dup 
	aload_1 
	iload_6 
	iconst_1 
	iadd 
	invokevirtual_short .virtual_19 // idx=19 pc=2
	bipush 38
	invokespecial_lib .routine_32467 // pc=3
	astore 11
	aload 11
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore 12
	iload 12
	newarray_object_lib String//module:net_rim_cldc.class#78 module:net_rim_cldc.class#78 module:net_rim_cldc.class#78
	astore 10
	iconst_0 
	istore 13
Label138:
	iload 13
	iload 12
	if_icmpge Label148
	aload 10
	iload 13
	aload 11
	invokevirtual_short .virtual_4 // idx=4 pc=1
	aastore 
	iinc 13 1
	goto Label138
Label148:
	aload 9
	aload 10
	invokestatic module:net_rim_cldc-10.class#25 getNewDescriptor( module:net_rim_cldc-10.class#25, module:net_rim_cldc.class#78[] ) // ApplicationManagerImpl
	astore 9
	aload_0 
	aload 9
	iconst_1 
	aconst_null 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.runApplication // pc=5
	ireturn 
	}


private final net.rim.device.api.system.ApplicationProcess getKeyboardProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	ifnonnull Label11
	invokestatic_lib module:net_rim_cldc-34.class#129.routine_45196(  ) // class#129
	astore_1 
	aload_1 
	ifnull Label11
	aload_0 
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	putfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
Label11:
	aload_0_getfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	areturn 
	}


private final repaintKeyboard( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.getKeyboardProcess // pc=1
	astore_1 
	aload_1 
	ifnull Label9
	aload_1 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label9:
	return 
	}


private final int runApplication( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, boolean, module:net_rim_cldc-2.class#86, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_5 
	aload_0 
	aload_1 
	iload_4 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.checkDescriptorSecurity // pc=3
	aload_1 
	astore_6 
	aload_6 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokestatic_lib module:net_rim_cldc-25.class#16.routine_23115(  ) // class#16
	ifeq Label42
	ldc literal_2021:"net.rim.device.apps.internal.applicationcontrol.TrustApplicationManager"
	invokestatic_lib module:net_rim_cldc-2.class#9.routine_2720(  ) // class#9
	astore_7 
	aload_7 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23109(  ) // class#34
	istore 8
	iload 8
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24430(  ) // class#34
	astore 9
	aload 9
	ifnull Label36
	aload 9
	arraylength 
	iconst_1 
	if_icmpne Label36
	aload 9
	iconst_0 
	aaload 
	astore_6 
	aload_1 
	iload_2 
	invokestatic_lib module:net_rim_cldc-25.class#16.routine_22756(  ) // class#16
	goto Label42
Label36:
	aload_1 
	astore_6 
	goto Label42
	astore_7 
	aload_1 
	astore_6 
Label42:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_7 
	monitorenter 
	aload_6 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore_5 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2022:"Starting "
	invokespecial_lib .routine_42025 // pc=2
	aload_5 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_0_getfield .field_54_54   // get_name_1:  .field_54_54   // get_name_2:  .field_54_54   // get_Name:    .field_54_54   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 54
	ifeq Label104
	aload_0 
	aload_6 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.foundMatchingDeadProcess // pc=3
	ifeq Label104
	aload_0 
	aload_6 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.foundMatchingDeadProcess // pc=3
	ifeq Label104
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	invokespecial_lib .routine_41984 // pc=1
	aload_5 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2023:": previous instance still active"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	aload 8
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	invokestatic boolean isDevelopmentDevice(  ) // BackdoorKeyProcessor
	ifeq Label93
	invokestatic_lib module:net_rim_cldc-12.class#0.routine_432(  ) // class#0
	ifne Label93
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	invokespecial_lib .routine_41984 // pc=1
	aload 8
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2024:" (report to http://go/memoryleaks)"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
Label93:
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lipush -1087644179251864105
	iconst_0 
	iconst_0 
	aload 8
	new_lib RuntimeException//module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79
	dup 
	aload 8
	invokespecial_lib .routine_39692 // pc=2
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=8
Label104:
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_23204(  ) // class#28
	l2i 
	istore 8
	aload_0 
	aload_6 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore 9
	aload 9
	ifnull Label147
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	invokespecial_lib .routine_41984 // pc=1
	aload_5 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2025:" already running"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	iload_2 
	ifeq Label137
	aload 9
	invokevirtual_short .virtual_39 // idx=39 pc=1
	astore 10
	aload 10
	checkcastbranch_lib 
	astore 11
	aload 11
	invokevirtual .virtual_128(  ) // pc=1
	goto Label137
Label133:
	aload_0 
	aload 9
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=3
Label137:
	aload_3 
	ifnull Label142
	aload 9
	aload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=2
Label142:
	aload 9
	invokevirtual_short .virtual_19 // idx=19 pc=1
	aload_7 
	monitorexit 
	ireturn 
Label147:
	new ApplicationProcess
	dup 
	aload_0 
	aload_6 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationProcess.<init> // pc=4
	astore 9
	iload_2 
	ifeq Label159
	aload_0 
	aload 9
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label159:
	ldc literal_2026:"net_rim_bb_application_permissions_proxy"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label174
	aload_0 
	aload_0 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	invokevirtual_short .virtual_19 // idx=19 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label174
	aload_0 
	aload 9
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label174:
	aload_6 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore 10
	iconst_0 
	istore 11
	iload 10
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23621(  ) // class#34
	ifeq Label184
	iconst_1 
	istore 11
Label184:
	iload 10
	invokestatic_lib module:net_rim_cldc-30.class#1.routine_2067(  ) // class#1
	ifne Label192
	new_lib RuntimeException//module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79
	dup 
	ldc literal_2027:"DRM violation"
	invokespecial_lib .routine_39692 // pc=2
	athrow 
Label192:
	aload_0 
	invokevirtual_short .virtual_25 // idx=25 pc=1
	ifne Label203
	iload 11
	ifne Label203
	invokestatic_lib module:net_rim_cldc-31.class#85.routine_36814(  ) // class#85
	iload 8
	aload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=3
	goto Label203
	astore 12
Label203:
	aload 9
	iload 10
	aload_5 
	aload_6 
	invokevirtual_short .virtual_15 // idx=15 pc=1
	iload 11
	invokenonvirtual_lib .routine_4000 // pc=5
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 9
	invokevirtual_short .virtual_5 // idx=5 pc=2
	aload 9
	invokevirtual_short .virtual_19 // idx=19 pc=1
	istore 12
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2028:"Started "
	invokespecial_lib .routine_42025 // pc=2
	aload_5 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	bipush 40
	invokevirtual_short .virtual_15 // idx=15 pc=2
	iload 12
	invokevirtual_short .virtual_16 // idx=16 pc=2
	bipush 41
	invokevirtual_short .virtual_15 // idx=15 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	ifnull Label240
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	iload 12
	aload_5 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	invokevirtual_short .virtual_6 // idx=6 pc=4
	goto Label240
	astore 13
Label240:
	aload_0 
	invokevirtual_short .virtual_25 // idx=25 pc=1
	ifne Label251
	iload_2 
	iconst_1 
	if_icmpne Label251
	aload_0 
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.recordAppStartTime // pc=3
Label251:
	aload_3 
	ifnull Label256
	aload 9
	aload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=2
Label256:
	iload 12
	aload_7 
	monitorexit 
	ireturn 
	astore 14
	aload_7 
	monitorexit 
	aload 14
	athrow 
	astore_6 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2029:"Error starting "
	invokespecial_lib .routine_42025 // pc=2
	aload_5 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2030:": "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_6 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_7 
	aload_7 
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	new_lib net.rim.device.api.system.ApplicationManagerException//module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29 module:net_rim_cldc-10.class#29
	dup 
	aload_7 
	invokespecial_lib .routine_19921 // pc=2
	athrow 
	}


private final checkDescriptorSecurity( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, int ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual_short .virtual_15 // idx=15 pc=1
	astore_3 
	aload_3 
	ifnull Label15
	aload_3 
	arraylength 
	ifeq Label15
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokestatic_lib module:net_rim_cldc.class#21.routine_15199(  ) // class#21
	ifeq Label15
	iload_2 
	invokestatic_lib module:net_rim_cldc.class#21.routine_15061(  ) // class#21
Label15:
	return 
	}


private final boolean postGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.assertIPCPermission // pc=1
	iload_7 
	invokestatic_lib module:net_rim_cldc.class#21.routine_15199(  ) // class#21
	istore 8
	aload_0 
	lload 1
	iload_3 
	iload_4 
	aload_5 
	aload_6 
	iload 8
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEventImpl // pc=8
	ireturn 
	}


private final boolean postGlobalEventImpl( net.rim.device.api.system.ApplicationManagerImpl, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore 8
	monitorenter 
	aload_0 
	lload 1
	iload_3 
	iload_4 
	aload_5 
	aload_6 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setGlobalEventMessage // pc=7
	aconst_null 
	astore 9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iconst_1 
	isub 
	istore 10
Label19:
	iload 10
	iflt Label33
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 10
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore 9
	aload_0 
	lload 1
	aload 9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iload_7 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postMessageToProcess // pc=6
	iinc 10 -1
	goto Label19
Label33:
	aload_0 
	iconst_0 
	i2l 
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setGlobalEventMessage // pc=7
	aload 8
	monitorexit 
	goto Label49
	astore 11
	aload 8
	monitorexit 
	aload 11
	athrow 
Label49:
	aload_0 
	lload 1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processGlobalEvent // pc=3
	iconst_1 
	ireturn 
	}


private final logSchedulingEvent( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc.class#78 ); // address: 0
	{
	enter 
	aload_1 
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	ifnull Label31
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	arraylength 
	if_icmplt Label12
	aload_0 
	iconst_0 
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
Label12:
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload_0 
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	invokespecial_lib .routine_41984 // pc=1
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42190(  ) // class#84
	invokestatic_lib module:net_rim_cldc.class#52.routine_39697(  ) // class#52
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2013:":"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_1 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
Label31:
	return 
	}


private final postInternalGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	lload 2
	iload_4 
	iload_5 
	aload_6 
	aload_7 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEventImpl // pc=9
	return 
	}


private final postGlobalEventImpl( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore 9
	monitorenter 
	aload_1 
	ifnull Label28
	aload_0 
	lload 2
	iload_4 
	iload_5 
	aload_6 
	aload_7 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setGlobalEventMessage // pc=7
	aload_0 
	lload 2
	aload_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iload 8
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postMessageToProcess // pc=6
	aload_0 
	iconst_0 
	i2l 
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setGlobalEventMessage // pc=7
Label28:
	aload 9
	monitorexit 
	goto Label36
	astore 10
	aload 9
	monitorexit 
	aload 10
	athrow 
Label36:
	aload_0 
	lload 2
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processGlobalEvent // pc=3
	return 
	}


private final postMessageToProcess( net.rim.device.api.system.ApplicationManagerImpl, long, net.rim.device.api.system.ApplicationProcess, module:net_rim_cldc-36.class#69, boolean ); // address: 0
	{
	enter 
	iload_5 
	aload_3 
	invokevirtual_short .virtual_34 // idx=34 pc=1
	if_icmpne Label9
	aload_3 
	aload_4 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	return 
Label9:
	iload_5 
	ifeq Label21
	aload_0_getfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	lload 1
	iconst_0 
	aload_0_getfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	arraylength 
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_2925(  ) // class#3
	iflt Label21
	aload_3 
	aload_4 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label21:
	return 
	}


private final setGlobalEventMessage( net.rim.device.api.system.ApplicationManagerImpl, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lload 1
	l2i 
	invokevirtual_short .virtual_15 // idx=15 pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lload 1
	bipush 32
	lshr 
	l2i 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iload_3 
	invokevirtual_short .virtual_18 // idx=18 pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iload_4 
	invokevirtual_short .virtual_19 // idx=19 pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokevirtual_short .virtual_20 // idx=20 pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	invokevirtual_short .virtual_21 // idx=21 pc=2
	return 
	}


private final processGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, long ); // address: 0
	{
	enter 
	lload 1
	lipush 3596208183088439728
	lcmp 
	ifeq Label9
	lload 1
	lipush 8877632280522743328
	lcmp 
	ifne Label29
Label9:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_3 
	monitorenter 
	aload_0 
	ldc literal_2031:"Device Time/TimeZone Change: Rescheduling Alarms."
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0 
	iconst_1 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setNextAlarm // pc=3
	pop 
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label29:
	return 
	}


private final runOnStartup( net.rim.device.api.system.ApplicationManagerImpl, int[], boolean ); // address: 0
	{
	enter 
	bipush 8
	newarray_object_lib java.util.Vector//module:net_rim_cldc.class#83 module:net_rim_cldc.class#83 module:net_rim_cldc.class#83
	astore_3 
	new_lib java.util.Vector//module:net_rim_cldc.class#83 module:net_rim_cldc.class#83 module:net_rim_cldc.class#83
	dup 
	invokespecial_lib .routine_51888 // pc=1
	astore_4 
	iconst_0 
	istore 8
Label10:
	iload 8
	aload_1 
	arraylength 
	if_icmplt Label15
	goto_w Label184
Label15:
	aload_1 
	iload 8
	iaload 
	istore 9
	iload 9
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24430(  ) // class#34
	dup 
	astore_5 
	ifnonnull Label25
	goto_w Label182
Label25:
	iconst_0 
	istore 10
Label27:
	iload 10
	aload_5 
	arraylength 
	if_icmplt Label32
	goto_w Label182
Label32:
	aload_5 
	iload 10
	aaload 
	astore 11
	aload 11
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore 12
	aload 11
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore 13
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iconst_1 
	isub 
	istore 14
Label47:
	iload 14
	iflt Label80
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	iload 14
	invokevirtual_short .virtual_16 // idx=16 pc=2
	aload 12
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label78
	aload_0_getfield .field_56_56   // get_name_1:  .field_56_56   // get_name_2:  .field_56_56   // get_Name:    .field_56_56   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 56
	iload 14
	invokevirtual_short .virtual_17 // idx=17 pc=2
	iload 13
	if_icmpne Label78
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	iload 14
	invokevirtual_short .virtual_20 // idx=20 pc=2
	aload_0_getfield .field_56_56   // get_name_1:  .field_56_56   // get_name_2:  .field_56_56   // get_Name:    .field_56_56   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 56
	iload 14
	invokevirtual_short .virtual_21 // idx=21 pc=2
	aload_0_getfield .field_57_57   // get_name_1:  .field_57_57   // get_name_2:  .field_57_57   // get_Name:    .field_57_57   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 57
	iload 14
	invokevirtual_short .virtual_17 // idx=17 pc=2
	ifeq Label72
	aload 11
	invokevirtual_short .virtual_39 // idx=39 pc=1
Label72:
	aload_0_getfield .field_57_57   // get_name_1:  .field_57_57   // get_name_2:  .field_57_57   // get_Name:    .field_57_57   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 57
	iload 14
	invokevirtual_short .virtual_21 // idx=21 pc=2
	aload 11
	invokevirtual_short .virtual_37 // idx=37 pc=1
	goto Label80
Label78:
	iinc 14 -1
	goto Label47
Label80:
	aload 11
	invokevirtual_short .virtual_38 // idx=38 pc=1
	ifne Label89
	aload 11
	invokevirtual_short .virtual_21 // idx=21 pc=1
	iconst_1 
	iand 
	ifne Label89
	goto_w Label179
Label89:
	aload 11
	invokevirtual_short .virtual_22 // idx=22 pc=1
	istore 14
	iconst_0 
	iload 14
	if_icmple Label96
	goto_w Label179
Label96:
	iload 14
	bipush 8
	if_icmplt Label100
	goto_w Label179
Label100:
	iload 9
	bipush 51
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifne Label140
	iload 14
	bipush 5
	if_icmpgt Label120
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2014:"module "
	invokespecial_lib .routine_42025 // pc=2
	aload 11
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2015:" missing RRI signature"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	goto Label179
Label120:
	iload 9
	iipush 5526098
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifne Label140
	aload 11
	invokevirtual_short .virtual_38 // idx=38 pc=1
	ifne Label140
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2014:"module "
	invokespecial_lib .routine_42025 // pc=2
	aload 11
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2032:" missing RRT signature"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	goto Label179
Label140:
	iload 14
	ifne Label164
	iload 9
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24325(  ) // class#34
	astore_6 
	aload_6 
	ifnull Label164
	aload_6 
	arraylength 
	ifle Label164
	new_lib String//module:net_rim_cldc.class#78 module:net_rim_cldc.class#78 module:net_rim_cldc.class#78
	dup 
	aload_6 
	invokespecial_lib .routine_47985 // pc=2
	astore_7 
	aload_7 
	invokevirtual_short .virtual_23 // idx=23 pc=1
	ldc literal_2033:"en"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ifne Label164
	aload_4 
	aload 11
	invokevirtual_short .virtual_22 // idx=22 pc=2
	goto Label179
Label164:
	aload_3 
	iload 14
	aaload 
	ifnonnull Label174
	aload_3 
	iload 14
	new_lib java.util.Vector//module:net_rim_cldc.class#83 module:net_rim_cldc.class#83 module:net_rim_cldc.class#83
	dup 
	invokespecial_lib .routine_51888 // pc=1
	aastore 
Label174:
	aload_3 
	iload 14
	aaload 
	aload 11
	invokevirtual_short .virtual_22 // idx=22 pc=2
Label179:
	iinc 10 1
	goto_w Label27
	astore 10
Label182:
	iinc 8 1
	goto_w Label10
Label184:
	bipush 10
	newarray 6
	astore 8
	aload_0 
	iconst_0 
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
Label190:
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	bipush 8
	if_icmpge Label237
	aload 8
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_23204(  ) // class#28
	lastore 
	aload_3 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aaload 
	astore 9
	aload 9
	ifnonnull Label204
	goto Label231
Label204:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2034:"Starting tier "
	invokespecial_lib .routine_42025 // pc=2
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_0 
	aload 9
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.startTier // pc=3
	aload_0 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.waitForTier // pc=2
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	ifne Label231
	aload_4 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label231
	aload_0 
	aload_4 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.startTier // pc=3
	aload_0 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.waitForTier // pc=2
Label231:
	aload_0 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	iconst_1 
	iadd 
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	goto Label190
Label237:
	aload_0 
	iipush 2147483647
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_0_getfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	invokevirtual_short .virtual_11 // idx=11 pc=1
	sipush 9900
	invokestatic updateStartupProgress( int ) // ApplicationManagerImpl
	sipush 10000
	invokestatic updateStartupProgress( int ) // ApplicationManagerImpl
	aload 8
	bipush 8
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_23204(  ) // class#28
	lastore 
	ldc literal_2035:"MIDlet PushRegistry startup"
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	iconst_0 
	istore 9
Label254:
	iload 9
	aload_1 
	arraylength 
	if_icmpge Label317
	aload_1 
	iload 9
	iaload 
	istore 10
	iload 10
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23634(  ) // class#34
	ifeq Label315
	iload 10
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24430(  ) // class#34
	astore 11
	aload 11
	ifnull Label315
	aload 11
	iconst_0 
	aaload 
	astore 12
	aload 12
	invokevirtual_short .virtual_15 // idx=15 pc=1
	astore 13
	aload 13
	bipush 2
	invokestatic_lib module:net_rim_cldc-36.class#1.routine_35(  ) // class#1
	aload 13
	iconst_1 
	aload 13
	iconst_0 
	aaload 
	aastore 
	aload 13
	iconst_0 
	getstatic_lib module:net_rim_cldc-28.class#85.static_204 // class#85
	aastore 
	new_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	dup 
	aload 11
	iconst_0 
	aaload 
	aload 11
	iconst_0 
	aaload 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	aload 13
	invokespecial_lib .routine_18416 // pc=4
	astore 14
	aload_0 
	aload 14
	iconst_0 
	invokevirtual_short .virtual_12 // idx=12 pc=3
	pop 
	goto Label315
	astore 15
	goto Label315
	astore 11
	aload 11
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
Label315:
	iinc 9 1
	goto Label254
Label317:
	ldc literal_2036:"MIDlet PushRegistry startup finished"
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload 8
	bipush 9
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_23204(  ) // class#28
	lastore 
	iload_2 
	ifne Label326
	goto_w Label432
Label326:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	invokespecial_lib .routine_41984 // pc=1
	astore 9
	aload 9
	ldc literal_2037:"Startup Time "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	pop 
	iconst_0 
	i2l 
	lstore 10
	iconst_0 
	istore 12
Label339:
	iload 12
	aload 8
	arraylength 
	iconst_1 
	isub 
	if_icmpge Label359
	lload 10
	aload 8
	iload 12
	iconst_1 
	iadd 
	laload 
	aload 8
	iload 12
	laload 
	lsub 
	ladd 
	lstore 10
	iinc 12 1
	goto Label339
Label359:
	aload 9
	lload 10
	invokevirtual_short .virtual_17 // idx=17 pc=3
	pop 
	aload 9
	ldc literal_2038:"ms?"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	pop 
	aload_0_getfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	lload 10
	iconst_1 
	i2l 
	ladd 
	l2i 
	invokestatic_lib module:net_rim_cldc-37.class#9.routine_3746(  ) // class#9
	iconst_0 
	istore 12
Label376:
	iload 12
	aload 8
	arraylength 
	iconst_1 
	isub 
	if_icmpge Label412
	aload 9
	ldc literal_2039:" tier "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	pop 
	aload 9
	iload 12
	invokevirtual_short .virtual_16 // idx=16 pc=2
	pop 
	aload 9
	ldc literal_2040:" took "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	pop 
	aload 9
	aload 8
	iload 12
	iconst_1 
	iadd 
	laload 
	aload 8
	iload 12
	laload 
	lsub 
	invokevirtual_short .virtual_17 // idx=17 pc=3
	pop 
	aload 9
	ldc literal_2038:"ms?"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	pop 
	iinc 12 1
	goto Label376
Label412:
	aload 9
	aload 9
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iconst_1 
	isub 
	invokevirtual_short .virtual_19 // idx=19 pc=2
	pop 
	aload 9
	invokevirtual_short .toString // idx=2 pc=1
	astore 12
	aload 12
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	ifnull Label432
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	aload 8
	invokevirtual_short .virtual_8 // idx=8 pc=2
	return 
	astore 13
Label432:
	return 
	}


private final startTier( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc.class#83, boolean ); // address: 0
	{
	enter 
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_25353(  ) // class#28
	istore_3 
	aload_1 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iconst_1 
	isub 
	istore_4 
Label8:
	iload_4 
	ifge Label11
	goto_w Label109
Label11:
	aload_1 
	iload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_5 
	aload_5 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_6 
	iload_2 
	ifeq Label28
	iload_6 
	invokestatic_lib module:net_rim_cldc-25.class#16.routine_23115(  ) // class#16
	ifeq Label28
	aload_5 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-25.class#16.routine_22756(  ) // class#16
	goto_w Label107
Label28:
	iload_3 
	ifeq Label54
	iload_6 
	bipush 51
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifne Label54
	iload_6 
	iipush 1129337923
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifne Label54
	iload_6 
	invokestatic_lib module:net_rim_cldc-30.class#1.routine_2504(  ) // class#1
	ifne Label54
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2014:"module "
	invokespecial_lib .routine_42025 // pc=2
	aload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2041:" cannot run in safe-mode"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	goto Label107
Label54:
	aload_0 
	aload_5 
	aload_5 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	invokevirtual_short .virtual_12 // idx=12 pc=3
	pop 
	goto Label107
	astore_7 
	goto Label107
	astore_7 
	ldc literal_2042:"Too many processes; waiting..."
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_0 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.waitForTier // pc=2
	aload_0 
	aload_5 
	iconst_0 
	invokevirtual_short .virtual_12 // idx=12 pc=3
	pop 
	goto Label107
	astore 8
	goto Label107
	astore 8
	iload_6 
	bipush 51
	invokestatic_lib module:net_rim_cldc.class#21.routine_14998(  ) // class#21
	ifeq Label84
	aload 8
	athrow 
Label84:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2043:"Unable to start "
	invokespecial_lib .routine_42025 // pc=2
	aload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2044:"; too many processes"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	goto Label107
	astore_7 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2045:"Exception thrown: "
	invokespecial_lib .routine_42025 // pc=2
	aload_7 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
Label107:
	iinc 4 -1
	goto_w Label8
Label109:
	return 
	}


private final waitForTier( net.rim.device.api.system.ApplicationManagerImpl, boolean ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifeq Label15
	iipush 300000
	i2l 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4577(  ) // class#10
	aload_0 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processExited // pc=2
	invokestatic_lib module:net_rim_cldc-9.class#51.routine_22472(  ) // class#51
	ifeq Label12
	invokestatic_lib module:net_rim_cldc-36.class#66.routine_31401(  ) // class#66
Label12:
	invokestatic_lib module:net_rim_cldc-9.class#51.routine_22454(  ) // class#51
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	invokevirtual_short .virtual_9 // idx=9 pc=1
Label15:
	return 
	}


private final sensorUpdate( net.rim.device.api.system.ApplicationManagerImpl, boolean, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	iload_1 
	ifeq Label27
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateInputProcess // pc=2
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnull Label34
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_481 // pc=1 guess=3
	ifeq Label34
	iload_2 
	ifne Label20
	iipush 1281912684
	invokestatic_lib module:net_rim_cldc-30.class#40.routine_29879(  ) // class#40
	goto Label22
Label20:
	iipush 1281780848
	invokestatic_lib module:net_rim_cldc-30.class#40.routine_29879(  ) // class#40
Label22:
	aload_0 
	iconst_1 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	goto Label34
Label27:
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label32
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	goto Label33
Label32:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label33:
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateInputProcess // pc=2
Label34:
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


private final net.rim.device.api.system.ApplicationProcess findProcess( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25 ); // address: 0
	{
	enter 
	new ApplicationManagerImpl$DescriptorComparator
	dup 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$DescriptorComparator.<init> // pc=2
	astore_2 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label18
	aload_2 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual_short .virtual_32 // idx=32 pc=1
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=3
	ifne Label18
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label18
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	areturn 
Label18:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aconst_null 
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iconst_1 
	isub 
	istore_5 
Label29:
	iload_5 
	iflt Label46
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_4 
	aload_4 
	invokevirtual_short .virtual_32 // idx=32 pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label44
	aload_4 
	aload_3 
	monitorexit 
	areturn 
Label44:
	iinc 5 -1
	goto Label29
Label46:
	aconst_null 
	aload_3 
	monitorexit 
	areturn 
	astore_6 
	aload_3 
	monitorexit 
	aload_6 
	athrow 
	}


private final run( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0 
	new ApplicationManagerImpl$StartupGetMessageThread
	dup 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$StartupGetMessageThread.<init> // pc=2
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokevirtual_short .virtual_3 // idx=3 pc=1
	aload_0 
	lipush -402321687056808009
	iipush 120000
	invokestatic_lib module:net_rim_cldc-37.class#9.routine_3733(  ) // class#9
	putfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	aload_0 
	aload_0_getfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	invokestatic_lib module:net_rim_cldc-37.class#9.routine_3759(  ) // class#9
	putfield .field_49_49   // get_name_1:  .field_49_49   // get_name_2:  .field_49_49   // get_Name:    .field_49_49   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 49
	aload_0_getfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	invokevirtual_short .virtual_3 // idx=3 pc=1
	aload_0 
	invokestatic_lib module:net_rim_cldc-31.class#83.routine_36497(  ) // class#83
	putfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	iconst_0 
	invokestatic_lib module:net_rim_cldc-31.class#71.routine_33677(  ) // class#71
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23041(  ) // class#34
	astore_1 
	aload_0 
	aload_1 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.runOnStartup // pc=3
	aconst_null 
	astore_1 
	aload_0 
	iconst_1 
	putfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	iconst_1 
	invokestatic_lib module:net_rim_cldc-31.class#71.routine_33677(  ) // class#71
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	invokevirtual_short .virtual_8 // idx=8 pc=1
	invokestatic_lib module:net_rim_cldc-36.class#66.routine_31212(  ) // class#66
	invokestatic_lib module:net_rim_cldc-36.class#66.routine_31160(  ) // class#66
	invokestatic_lib module:net_rim_cldc-9.class#63.routine_32617(  ) // class#63
	invokevirtual_short .virtual_11 // idx=11 pc=1
	ifeq Label47
	invokestatic_lib module:net_rim_cldc-9.class#63.routine_32617(  ) // class#63
	invokevirtual_short .virtual_13 // idx=13 pc=1
Label47:
	invokestatic startupDone(  ) // ApplicationManagerImpl
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label69
	ldc literal_2046:"net_rim_app_manager_console"
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23151(  ) // class#34
	istore_2 
	iload_2 
	ifeq Label67
	iload_2 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_24430(  ) // class#34
	astore_3 
	aload_0 
	aload_3 
	iconst_0 
	aaload 
	iconst_1 
	invokevirtual_short .virtual_12 // idx=12 pc=3
	pop 
	goto Label67
	astore_4 
Label67:
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.waitForConsole // pc=1
Label69:
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=3
	aload_0 
	iconst_0 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	sipush 10000
	i2l 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4577(  ) // class#10
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$StartupGetMessageThread.getMessages // pc=1
	astore_2 
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	invokespecial_lib .routine_33229 // pc=1
	astore_3 
Label87:
	aload_2 
	aload_3 
	iconst_0 
	invokevirtual_short .virtual_8 // idx=8 pc=3
	ifeq Label101
	aload_0 
	aload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processMessage // pc=2
	goto Label87
	astore_4 
	aload_4 
	athrow 
	astore_4 
	goto Label87
Label101:
	aconst_null 
	astore_2 
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	ifnull Label112
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	invokevirtual_short .virtual_9 // idx=9 pc=1
	aload_0 
	aconst_null 
	putfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	goto Label112
	astore_4 
Label112:
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	dup 
	astore_4 
	monitorenter 
	aload_0 
	aconst_null 
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	invokenonvirtual_lib .routine_42209 // pc=1
	aload_4 
	monitorexit 
	goto Label129
	astore_5 
	aload_4 
	monitorexit 
	aload_5 
	athrow 
Label129:
	invokestatic_lib module:net_rim_cldc-31.class#20.routine_6810(  ) // class#20
	goto Label132
	astore_4 
Label132:
	invokestatic_lib net.rim.device.internal.proxy.Proxy.routine_34352(  ) // Proxy
	aload_0 
	invokevirtual_short .virtual_40 // idx=40 pc=2
Label135:
	aload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	pop 
	aload_0 
	aload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processMessage // pc=2
	goto Label135
	astore_4 
	aload_4 
	athrow 
	astore_4 
	goto Label135
	}


private final logTouchscreenEvent( net.rim.device.api.system.ApplicationManagerImpl, int, int, int, int ); // address: 0
	{
	enter 
	iload_3 
	iipush 65535
	iand 
	istore_5 
	iload_3 
	bipush 16
	iushr 
	istore_6 
	iload_1 
Label11:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2047:"UI-TS: CANCEL OSTS:"
	invokespecial_lib .routine_42025 // pc=2
	iload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	return 
Label20:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2048:"UI-TS: DOWN "
	invokespecial_lib .routine_42025 // pc=2
	iload_2 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2049:"("
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_5 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2050:", "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_6 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2051:") OSTS:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	return 
Label41:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2052:"UI-TS: UP   "
	invokespecial_lib .routine_42025 // pc=2
	iload_2 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2049:"("
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_5 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2050:", "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_6 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2051:") OSTS:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	return 
Label62:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2053:"UI-TS: MOVE "
	invokespecial_lib .routine_42025 // pc=2
	iload_2 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2049:"("
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_5 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2050:", "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_6 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2051:") OSTS:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	return 
Label83:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2054:"UI-TS: HOVER"
	invokespecial_lib .routine_42025 // pc=2
	iload_2 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2049:"("
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_5 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2050:", "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_6 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2051:") OSTS:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	return 
Label104:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2055:"UI-TS: FACE "
	invokespecial_lib .routine_42025 // pc=2
	iload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	ldc literal_2056:" OSTS:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	iload_3 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	return 
Label117:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2057:"UI-TS: GESTURE OSTS:"
	invokespecial_lib .routine_42025 // pc=2
	iload_3 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
Label125:
	return 
	}


private final assertIPCPermission( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	iconst_1 
	invokestatic_lib module:net_rim_cldc-25.class#4.routine_2305(  ) // class#4
	return 
	}


private final processInputMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	sipush 6915
	if_icmpne Label11
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	putstatic _navUnclickTimestamp // ApplicationManagerImpl
	iconst_0 
	putstatic _navRollReceivedSinceUnclick // ApplicationManagerImpl
	goto Label42
Label11:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	sipush 6913
	if_icmpne Label42
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	getstatic _navUnclickTimestamp // ApplicationManagerImpl
	isub 
	istore_2 
	iload_2 
	bipush 25
	if_icmpge Label40
	getstatic _navRollReceivedSinceUnclick // ApplicationManagerImpl
	ifne Label37
	lipush -7509200465648525729
	iipush 1850561874
	iload_2 
	i2l 
	bipush 25
	i2l 
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
Label37:
	iconst_1 
	putstatic _navRollReceivedSinceUnclick // ApplicationManagerImpl
	return 
Label40:
	iconst_1 
	putstatic _navRollReceivedSinceUnclick // ApplicationManagerImpl
Label42:
	iconst_0 
	istore_2 
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	bipush 2
	if_icmpne Label50
	iconst_1 
	goto Label51
Label50:
	iconst_0 
Label51:
	istore_3 
	iload_3 
	ifeq Label97
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	bipush 16
	ishr 
	istore_4 
	getstatic_lib module:net_rim_cldc-31.class#122.static_298 // class#122
	iload_4 
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_3542(  ) // class#3
	bipush -1
	if_icmpeq Label66
	iconst_1 
	goto Label67
Label66:
	iconst_0 
Label67:
	istore_2 
	iload_2 
	ifeq Label97
	iload_4 
	bipush 18
	if_icmpne Label82
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	sipush 513
	if_icmpne Label82
	aload_0 
	bipush 19
	aload_0 
	invokevirtual_short .virtual_63 // idx=63 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
Label82:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_4 
	invokevirtual_short .virtual_3 // idx=3 pc=2
	istore_5 
	iload_5 
	iflt Label93
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	iload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=3
	return 
Label93:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_1 
	iload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=3
Label97:
	invokestatic_lib module:net_rim_cldc-14.class#49.routine_48019(  ) // class#49
	ifeq Label117
	iload_2 
	ifne Label117
	invokestatic_lib module:net_rim_cldc-32.class#98.routine_44235(  ) // class#98
	ifeq Label116
	lipush -7509200465648525729
	iipush 1380537409
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	i2l 
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	i2l 
	invokestatic_lib module:net_rim_cldc-14.class#49.routine_47922(  ) // class#49
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
Label116:
	return 
Label117:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	iload_3 
	ifeq Label134
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore_4 
	aload_4 
	ifnull Label134
	aload_1 
	bipush 49
	invokevirtual_short .virtual_14 // idx=14 pc=2
	aload_4 
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	return 
	astore_2 
Label134:
	return 
	}


private final processMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=1
Label4:
	aload_1 
	invokestatic_lib module:net_rim_cldc-29.class#82.routine_33094(  ) // class#82
	goto_w Label564
Label7:
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processSensorMessage // pc=2
	return 
Label11:
	return 
Label12:
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processInputMessage // pc=2
	return 
Label16:
	aload_0 
	aload_1 
	invokevirtual_short .virtual_36 // idx=36 pc=2
	pop 
	return 
Label21:
	aload_1 
	invokestatic_lib module:net_rim_cldc-31.class#85.routine_37240(  ) // class#85
	return 
Label24:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
Label27:
	ldc literal_2058:"POWER_UP"
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_0 
	iconst_0 
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0 
	ldc literal_2059:"System Powering On: Executing Alarms."
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.executeScheduledApplications // pc=1
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	ifeq Label45
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	ifne Label45
	aload_0 
	iconst_1 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	goto_w Label564
Label45:
	invokestatic notifyRestart(  ) // AudioRouter
	iconst_0 
	invokestatic_lib module:net_rim_cldc-31.class#71.routine_33677(  ) // class#71
	iipush 1146310741
	invokestatic_lib module:net_rim_cldc-30.class#40.routine_29879(  ) // class#40
	aload_0 
	iconst_0 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	goto_w Label564
Label55:
	aload_0 
	iconst_1 
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_2 
	monitorenter 
	aload_0 
	ldc literal_2060:"System Powering Off: Rescheduling Alarms."
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0 
	iconst_1 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setNextAlarm // pc=3
	pop 
	aload_2 
	monitorexit 
	goto Label78
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label78:
	iipush 1146310735
	invokestatic_lib module:net_rim_cldc-30.class#40.routine_29879(  ) // class#40
	aload_0 
	iconst_0 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	goto_w Label564
Label85:
	aload_1 
	invokestatic_lib module:net_rim_cldc-12.class#0.routine_48(  ) // class#0
	invokevirtual_short .virtual_16 // idx=16 pc=2
	goto_w Label564
Label89:
	aload_0 
	iconst_0 
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0 
	iconst_1 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	iconst_0 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	iconst_1 
	invokestatic_lib module:net_rim_cldc-31.class#71.routine_33677(  ) // class#71
	aload_0 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.repaintForeground // pc=1
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_2 
	monitorenter 
	aload_0 
	ldc literal_2061:"Fast VM Reset: Rescheduling Alarms."
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0 
	iconst_1 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setNextAlarm // pc=3
	pop 
	aload_2 
	monitorexit 
	goto_w Label564
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
Label122:
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	istore_2 
	aload_0_getfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	iload_2 
	if_icmpeq Label153
	aload_0_getfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	ifeq Label153
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	invokespecial_lib .routine_33229 // pc=1
	astore_3 
	aload_3 
	iconst_1 
	invokevirtual_short .virtual_14 // idx=14 pc=2
	aload_3 
	sipush 320
	invokevirtual_short .virtual_15 // idx=15 pc=2
	aload_3 
	aload_0_getfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	invokevirtual_short .virtual_16 // idx=16 pc=2
	aload_3 
	iconst_0 
	invokevirtual_short .virtual_17 // idx=17 pc=2
	aload_3 
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	invokevirtual_short .virtual_18 // idx=18 pc=2
	aload_0 
	aload_3 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postMessage // pc=2
Label153:
	aload_0 
	iload_2 
	putfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	goto_w Label564
Label157:
	lipush -7509200465648525729
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iconst_1 
	if_icmpne Label164
	iipush 1400262510
	goto Label165
Label164:
	iipush 1400262502
Label165:
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
	goto_w Label564
Label172:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
Label175:
	invokestatic_lib module:net_rim_cldc-31.class#85.routine_36814(  ) // class#85
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_23204(  ) // class#28
	l2i 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	aload_0 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processExited // pc=2
	return 
Label183:
	aload_0 
	invokevirtual_short .virtual_44 // idx=44 pc=1
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.repaintKeyboard // pc=1
	return 
Label188:
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokestatic_lib module:net_rim_cldc-36.class#66.routine_32579(  ) // class#66
	astore_2 
	aload_2 
	ifnonnull Label196
	ldc literal_2062:"JVM BORK request"
	astore_2 
Label196:
	aload_0 
	lipush 2888237357036234703
	iconst_0 
	iconst_0 
	aload_2 
	aconst_null 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=7
	pop 
	return 
Label205:
	aload_0 
	lipush -5179361672050507927
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=7
	pop 
	return 
Label214:
	aload_0 
	lipush 8877632280522743328
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=7
	pop 
	return 
Label223:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label234
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	ifnull Label234
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iconst_1 
	invokevirtual_short .virtual_12 // idx=12 pc=3
	pop 
	return 
	astore_3 
Label234:
	return 
Label235:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label246
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lipush 7563637690172082503
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=8
Label246:
	return 
Label247:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label258
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lipush -8249535590121003989
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=8
Label258:
	return 
Label259:
	aload_0 
	lipush 945659952435832745
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=7
	pop 
	return 
Label268:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label273
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label273:
	return 
Label274:
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	ifne Label281
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	invokestatic_lib module:net_rim_cldc-13.class#81.routine_23679(  ) // class#81
	return 
Label281:
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	invokestatic_lib module:net_rim_cldc-13.class#81.routine_23419(  ) // class#81
	pop 
	return 
Label286:
	aload_0 
	lgetstatic_lib module:net_rim_cldc-36.class#66.static_157 // class#66
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=7
	pop 
	return 
Label295:
	invokestatic_lib net.rim.device.internal.proxy.Proxy.routine_34352(  ) // Proxy
	astore_3 
	aload_0 
	aload_3 
	invokevirtual .virtual_87(  ) // pc=1
	lipush 5493164573379949557
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=8
	return 
Label307:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	tableswitch  :
		
		
		

Label310:
	aload_0 
	ldc literal_2063:"RTC Expired: Running Alarms."
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.executeScheduledApplications // pc=1
	return 
Label316:
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnonnull Label319
	goto_w Label564
Label319:
	aload_0 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	ifeq Label323
	goto_w Label564
Label323:
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_481 // pc=1 guess=4
	ifne Label327
	goto_w Label564
Label327:
	iipush 1281977448
	invokestatic_lib module:net_rim_cldc-30.class#40.routine_29879(  ) // class#40
	aload_0 
	iconst_0 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	goto_w Label564
Label334:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_2 
	iload_2 
	invokestatic int getProcessIdFromOSTimerId( int ) // ApplicationProcess
	istore_3 
	iload_3 
	ifne Label343
	return 
Label343:
	aload_0 
	iload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore_4 
	aload_4 
	ifnonnull Label362
	iload_2 
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_20032(  ) // class#28
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2064:"delete os timer due to lost process: "
	invokespecial_lib .routine_42025 // pc=2
	iload_2 
	invokestatic_lib module:net_rim_cldc.class#46.routine_34252(  ) // class#46
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic log( module:net_rim_cldc.class#78, boolean ) // ApplicationManagerImpl
	return 
Label362:
	aload_4 
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	return 
Label366:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	sipush 2306
	if_icmpeq Label371
	goto_w Label564
Label371:
	iipush 1396926582
	invokestatic_lib module:net_rim_cldc-30.class#40.routine_29879(  ) // class#40
	aload_0 
	iconst_1 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	goto_w Label564
Label378:
	aload_1 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	istore_3 
	iload_3 
	ifne Label384
	goto_w Label564
Label384:
	aload_0 
	iload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore_4 
	aload_4 
	ifnonnull Label391
	return 
Label391:
	aload_4 
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	return 
Label395:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	sipush 255
	iand 
	istore_5 
	aconst_null 
	astore_6 
	iload_5 
	bipush 2
	if_icmpne Label415
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	istore_7 
	aload_0 
	aload_1 
	invokevirtual_short .virtual_35 // idx=35 pc=2
	iload_7 
	invokestatic_lib module:net_rim_cldc-10.class#10.routine_4409(  ) // class#10
	astore_6 
	goto Label421
Label415:
	iload_5 
	iconst_1 
	if_icmpne Label421
	aload_1 
	invokestatic_lib module:net_rim_cldc-10.class#10.routine_4389(  ) // class#10
	astore_6 
Label421:
	invokestatic_lib module:net_rim_cldc-31.class#85.routine_36814(  ) // class#85
	iload_5 
	aload_1 
	invokevirtual_short .virtual_17 // idx=17 pc=3
	aload_6 
	ifnull Label450
	aload_1 
	bipush 2
	invokevirtual_short .virtual_22 // idx=22 pc=2
	aload_6 
	arraylength 
	iconst_1 
	isub 
	istore_7 
Label435:
	iload_7 
	iflt Label450
	aload_0 
	aload_6 
	iload_7 
	iaload 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore_4 
	aload_4 
	ifnull Label448
	aload_4 
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label448:
	iinc 7 -1
	goto Label435
Label450:
	return 
Label451:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_7 
	aconst_null 
	astore 8
	iload_7 
	ifne Label460
	invokestatic_lib module:net_rim_cldc-12.class#78.routine_28276(  ) // class#78
	astore 8
Label460:
	aload 8
	ifnull Label482
	aload 8
	arraylength 
	iconst_1 
	isub 
	istore 9
Label467:
	iload 9
	iflt Label482
	aload_0 
	aload 8
	iload 9
	iaload 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore_4 
	aload_4 
	ifnull Label480
	aload_4 
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label480:
	iinc 9 -1
	goto Label467
Label482:
	return 
Label483:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	sipush 11522
	if_icmpne Label507
	invokestatic_lib module:net_rim_cldc-32.class#98.routine_44235(  ) // class#98
	ifeq Label497
	lipush -7509200465648525729
	iipush 1380926785
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
Label497:
	aload_1 
	invokevirtual_short .virtual_13 // idx=13 pc=1
	istore 9
	iload 9
	invokestatic_lib module:net_rim_cldc-14.class#13.routine_8444(  ) // class#13
	astore 10
	aload 10
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual_short .virtual_6 // idx=6 pc=2
Label507:
	return 
Label508:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label513
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label513:
	return 
Label514:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label519
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label519:
	return 
Label520:
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=2
	ifeq Label529
	aload_0 
	aload_1 
	iconst_0 
	invokevirtual_short .virtual_43 // idx=43 pc=3
	pop 
Label529:
	return 
Label530:
	invokestatic_lib module:net_rim_cldc-12.class#0.routine_432(  ) // class#0
	ifeq Label564
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
Label535:
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	invokespecial_lib .routine_33229 // pc=1
	astore 9
	aload 9
	aload_1 
	invokevirtual_short .virtual_23 // idx=23 pc=2
	aload_0 
	lipush -5541484959569186698
	iconst_0 
	iconst_0 
	aload 9
	aconst_null 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=7
	pop 
	goto Label564
Label551:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
Label554:
	aload_1 
	invokevirtual_short .virtual_11 // idx=11 pc=1
	checkcast_array 1 5
	astore 9
	aload 9
	invokestatic_lib module:net_rim_cldc-25.class#16.routine_23403(  ) // class#16
	aload_0 
	aload 9
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.runOnStartup // pc=3
Label564:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postMessage // pc=2
	return 
	}


private final processSensorMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	sipush 13056
	if_icmpne Label40
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	istore_2 
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	istore_3 
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	istore_4 
	iload_2 
	iload_3 
	invokestatic_lib module:net_rim_cldc-31.class#71.routine_33770(  ) // class#71
	istore_5 
	aload_0 
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40085(  ) // class#125
	ifne Label23
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40116(  ) // class#125
	ifeq Label25
Label23:
	iconst_1 
	goto Label26
Label25:
	iconst_0 
Label26:
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sensorUpdate // pc=3
	iload_5 
	ifeq Label40
	iload_2 
	iload_4 
	invokestatic_lib module:net_rim_cldc-31.class#71.routine_33802(  ) // class#71
	invokestatic_lib module:net_rim_cldc-31.class#85.routine_36814(  ) // class#85
	iload_2 
	iload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=3
	aload_0 
	aload_1 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postMessage // pc=2
Label40:
	return 
	}


private final assertChangeDeviceSettingsPermission( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	iconst_1 
	invokestatic_lib module:net_rim_cldc-25.class#47.routine_30723(  ) // class#47
	sipush 10133
	invokestatic_lib module:net_rim_cldc-25.class#4.routine_3614(  ) // class#4
	return 
	}


private final executeScheduledApplications( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_4 
	monitorenter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iconst_1 
	isub 
	istore_5 
Label10:
	iload_5 
	iflt Label74
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_5 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_1 
	aload_1 
	invokevirtual_short .virtual_32 // idx=32 pc=1
	lstore 2
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42190(  ) // class#84
	lstore 6
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_2065:"Checking "
	invokespecial_lib .routine_42025 // pc=2
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_2066:" Scheduled For:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 2
	invokevirtual_short .virtual_17 // idx=17 pc=3
	ldc literal_2067:" against alarm time:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_0 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokevirtual_short .virtual_17 // idx=17 pc=3
	ldc literal_2068:" current time:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 6
	invokevirtual_short .virtual_17 // idx=17 pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	lload 2
	lload 6
	sipush 30000
	i2l 
	ladd 
	lcmp 
	ifgt Label72
	aload_0 
	aload_1 
	iconst_1 
	invokevirtual_short .virtual_12 // idx=12 pc=3
	pop 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_5 
	invokevirtual_short .virtual_20 // idx=20 pc=2
	goto Label72
	astore 8
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_5 
	invokevirtual_short .virtual_20 // idx=20 pc=2
	goto Label72
	astore 9
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_5 
	invokevirtual_short .virtual_20 // idx=20 pc=2
	aload 9
	athrow 
Label72:
	iinc 5 -1
	goto Label10
Label74:
	aload_0 
	ldc literal_2069:"RTC Expired: Rescheduling Alarms."
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0 
	iconst_1 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setNextAlarm // pc=3
	pop 
	aload_4 
	monitorexit 
	return 
	astore 10
	aload_4 
	monitorexit 
	aload 10
	athrow 
	}


private final updateInputProcess( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4642(  ) // class#10
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	if_acmpeq Label12
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.interruptInputSequences // pc=1
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label12:
	return 
	}


private final boolean foundMatchingDeadProcess( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	iload_2 
	invokevirtual_short .virtual_10 // idx=10 pc=3
	aload_3 
	monitorexit 
	ireturn 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


private final recordAppStartTime( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc.class#78, int ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.getAppUsageAnalyzer // pc=1
	ifnull Label12
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42190(  ) // class#84
	lstore 3
	aload_0_getfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
	aload_1 
	lload 3
	invokeinterface interfacemethodref_482 // pc=4 guess=5
	return 
	astore_3 
Label12:
	return 
	}


private final checkLoadCRC( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	getstatic CRC_CHECK_ID // ApplicationManagerImpl
	invokestatic_lib module:net_rim_cldc-37.class#9.routine_3759(  ) // class#9
	istore_1 
	invokestatic_lib module:net_rim_cldc-30.class#1.routine_1680(  ) // class#1
	istore_2 
	iload_1 
	iload_2 
	if_icmpeq Label15
	aload_0 
	iconst_1 
	putfield .field_59_59   // get_name_1:  .field_59_59   // get_name_2:  .field_59_59   // get_Name:    .field_59_59   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 59
	getstatic CRC_CHECK_ID // ApplicationManagerImpl
	iload_2 
	invokestatic_lib module:net_rim_cldc-37.class#9.routine_3746(  ) // class#9
Label15:
	return 
	}


private final updateForegroundProcess( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4629(  ) // class#10
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final module:net_rim_cldc-12.class#40 getGlobalKeyProcessRegistry( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	}


public final module:net_rim_cldc-12.class#39 getGlobalKeyBackgroundProcessRegistry( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	}


public final removeScheduledApplicationsForModule( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iconst_1 
	isub 
	istore_3 
Label10:
	iload_3 
	iflt Label26
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_3 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_4 
	aload_4 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iload_1 
	if_icmpne Label24
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_3 
	invokevirtual_short .virtual_20 // idx=20 pc=2
Label24:
	iinc 3 -1
	goto Label10
Label26:
	aload_2 
	monitorexit 
	return 
	astore_5 
	aload_2 
	monitorexit 
	aload_5 
	athrow 
	}


final processAccelerometerMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter 
	invokestatic_lib module:net_rim_cldc-32.class#98.routine_44235(  ) // class#98
	ifeq Label11
	lipush -7509200465648525729
	iipush 1380991297
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
Label11:
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	istore_2 
	iload_2 
	bipush 10
	if_icmpeq Label27
	iload_2 
	invokestatic_lib module:net_rim_cldc-29.class#0.routine_554(  ) // class#0
	aload_1 
	iconst_1 
	invokevirtual_short .virtual_22 // idx=22 pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label27
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label27:
	return 
	}


final module:net_rim_cldc-36.class#69 processTouchscreenMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_2 
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	istore_3 
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	istore_4 
	aload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	sipush 255
	iand 
	istore_5 
	aload_1 
	invokestatic_lib module:net_rim_cldc-17.class#35.routine_11052(  ) // class#35
	istore_6 
	invokestatic_lib module:net_rim_cldc-17.class#42.routine_15626(  ) // class#42
	ifeq Label26
	aload_0 
	iload_2 
	iload_5 
	iload_4 
	iload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logTouchscreenEvent // pc=5
Label26:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_7 
	monitorenter 
	iload_2 
	ifne Label51
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.resetTouchState // pc=1
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.cancelTouchMessage // pc=2
	lipush -7509200465648525729
	iipush 1951228786
	iload_6 
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	aload_1 
	aload_7 
	monitorexit 
	areturn 
Label51:
	invokestatic_lib module:net_rim_cldc-22.class#108.routine_46533(  ) // class#108
	ifne Label54
	goto_w Label157
Label54:
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	ifle Label78
	iload_6 
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	isub 
	iipush 60000
	if_icmple Label78
	lipush -7509200465648525729
	iipush 1951229540
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	i2l 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDownReceivedBitmask // pc=1
	aload_0_getfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
	aload_0 
	iload_6 
	putfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0 
	iconst_0 
	putfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
Label78:
	iload_2 
Label80:
	aload_0 
	bipush 8
	bipush 8
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDown // pc=2
	aload_0 
	iload_6 
	putfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label94:
	aload_0 
	bipush 8
	bipush 8
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchUp // pc=2
	aload_0 
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	iconst_1 
	iadd 
	putfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	aload_0 
	iload_6 
	putfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label113:
	iload_3 
	iconst_1 
	if_icmpeq Label142
	lipush -7509200465648525729
	iipush 1951229540
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	i2l 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDownReceivedBitmask // pc=1
	aload_0_getfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
	lipush -7509200465648525729
	iipush 1951229537
	iload_6 
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-22.class#108.routine_46515(  ) // class#108
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.startCancellingTouch // pc=1
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label142:
	lipush -7509200465648525729
	iipush 1951229554
	iload_6 
	i2l 
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
Label149:
	aload_0 
	bipush 8
	bipush 8
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label157:
	iload_2 
	sipush 13576
	if_icmpeq Label161
	goto_w Label221
Label161:
	iload_3 
	iconst_1 
	if_icmpeq Label186
	lipush -7509200465648525729
	iipush 1951229540
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	i2l 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDownReceivedBitmask // pc=1
	aload_0_getfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
	lipush -7509200465648525729
	iipush 1951229554
	iload_6 
	i2l 
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label186:
	lipush -7509200465648525729
	iipush 1951229552
	iload_6 
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15366(  ) // class#27
	pop 
	iconst_1 
	invokestatic_lib module:net_rim_cldc-22.class#108.routine_46515(  ) // class#108
	aload_0 
	iconst_0 
	putfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	aload_0 
	bipush -1
	putfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	aload_0 
	iload_6 
	putfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchGestureIsInProgress // pc=1
	ifeq Label217
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.cancelTouchMessage // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	aload_1 
	aload_7 
	monitorexit 
	areturn 
Label217:
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label221:
	invokestatic_lib module:net_rim_cldc-14.class#49.routine_48019(  ) // class#49
	ifne Label224
	goto_w Label291
Label224:
	iload_2 
	tableswitch  :
		
		
		

Label226:
	lipush -7509200465648525729
	iipush 1951232580
	iload_5 
	i2l 
	iload_6 
	i2l 
	invokestatic_lib module:net_rim_cldc-14.class#49.routine_47922(  ) // class#49
	i2l 
	bipush 3
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDown // pc=2
	goto Label255
Label241:
	lipush -7509200465648525729
	iipush 1951232597
	iload_5 
	i2l 
	iload_6 
	i2l 
	invokestatic_lib module:net_rim_cldc-14.class#49.routine_47922(  ) // class#49
	i2l 
	bipush 3
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchUp // pc=2
Label255:
	invokestatic_lib module:net_rim_cldc-32.class#98.routine_44235(  ) // class#98
	ifeq Label268
	lipush -7509200465648525729
	iipush 1380537409
	iload_2 
	i2l 
	iload_6 
	i2l 
	invokestatic_lib module:net_rim_cldc-14.class#49.routine_47922(  ) // class#49
	i2l 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_15070(  ) // class#27
	pop 
Label268:
	aload_0 
	bipush 8
	bipush 3
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchGestureIsInProgress // pc=1
	ifeq Label287
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.cancelTouchMessage // pc=2
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.startCancellingTouch // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	aload_1 
	aload_7 
	monitorexit 
	areturn 
Label287:
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label291:
	iload_2 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		

Label293:
	iload_5 
	bipush 4
	if_icmplt Label313
	lipush -7509200465648525729
	iipush 1951221316
	iload_5 
	i2l 
	iload_6 
	i2l 
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_14732(  ) // class#27
	pop 
	aload_0 
	bipush 8
	bipush 9
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label313:
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchFingerIsPressed // pc=2
	ifeq Label337
	lipush -7509200465648525729
	iipush 1951220804
	iload_5 
	i2l 
	iload_6 
	i2l 
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_14732(  ) // class#27
	pop 
	aload_0 
	bipush 8
	bipush 7
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDown // pc=2
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label337:
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	ifeq Label359
	lipush -7509200465648525729
	iipush 1951220548
	iload_5 
	i2l 
	iload_6 
	i2l 
	bipush 3
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_14732(  ) // class#27
	pop 
	aload_0 
	bipush 8
	bipush 4
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDown // pc=2
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label359:
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchDown // pc=2
	goto_w Label476
Label363:
	iload_5 
	bipush 4
	if_icmplt Label383
	lipush -7509200465648525729
	iipush 1951221333
	iload_5 
	i2l 
	iload_6 
	i2l 
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_14732(  ) // class#27
	pop 
	aload_0 
	bipush 8
	bipush 9
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label383:
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchFingerIsPressed // pc=2
	ifne Label407
	lipush -7509200465648525729
	iipush 1951220821
	iload_5 
	i2l 
	iload_6 
	i2l 
	bipush 2
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_14732(  ) // class#27
	pop 
	aload_0 
	bipush 8
	bipush 5
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchUp // pc=2
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label407:
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	ifeq Label429
	lipush -7509200465648525729
	iipush 1951220565
	iload_5 
	i2l 
	iload_6 
	i2l 
	bipush 3
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_14732(  ) // class#27
	pop 
	aload_0 
	bipush 8
	bipush 4
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchUp // pc=2
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label429:
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchUp // pc=2
	goto Label476
Label433:
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	ifeq Label476
	aload_0 
	bipush 8
	bipush 4
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label443:
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	ifeq Label453
	aload_0 
	bipush 8
	bipush 4
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label453:
	iload_5 
	bipush 4
	if_icmplt Label464
	aload_0 
	bipush 8
	bipush 9
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label464:
	aload_0 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.touchFingerIsPressed // pc=2
	ifne Label476
	aload_0 
	bipush 8
	bipush 6
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.sendThurmanEvent // pc=3
	aconst_null 
	aload_7 
	monitorexit 
	areturn 
Label476:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	aload_7 
	monitorexit 
	goto Label490
	astore 8
	aload_7 
	monitorexit 
	aload 8
	athrow 
	astore_2 
	aconst_null 
	astore_1 
Label490:
	aload_1 
	areturn 
	}


final boolean postInternalGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, int, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore 8
	aload 8
	ifnonnull Label9
	iconst_0 
	ireturn 
Label9:
	aload_0 
	aload 8
	lload 2
	iload_4 
	iload_5 
	aload_6 
	aload_7 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEventImpl // pc=9
	iconst_1 
	ireturn 
	}


public final boolean postGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#19[], long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label5
	iconst_1 
	ireturn 
Label5:
	new_lib net.rim.vm.Message//module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69 module:net_rim_cldc-36.class#69
	dup 
	bipush 32
	iconst_0 
	invokespecial_lib .routine_33263 // pc=3
	astore 8
	aload 8
	lload 2
	l2i 
	invokevirtual_short .virtual_15 // idx=15 pc=2
	aload 8
	lload 2
	bipush 32
	lshr 
	l2i 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	aload 8
	iload_4 
	invokevirtual_short .virtual_18 // idx=18 pc=2
	aload 8
	iload_5 
	invokevirtual_short .virtual_19 // idx=19 pc=2
	aload 8
	aload_6 
	invokevirtual_short .virtual_20 // idx=20 pc=2
	aload 8
	aload_7 
	invokevirtual_short .virtual_21 // idx=21 pc=2
	aload_1 
	arraylength 
	istore 9
	iconst_0 
	istore 10
Label38:
	iload 10
	iload 9
	if_icmpge Label52
	aload_0 
	lload 2
	aload_1 
	iload 10
	aaload 
	invokevirtual .virtual_87(  ) // pc=1
	aload 8
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postMessageToProcess // pc=6
	iinc 10 1
	goto Label38
Label52:
	iconst_1 
	ireturn 
	}


final boolean postExternalGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	aload_0 
	lload 1
	iload_3 
	iload_4 
	aload_5 
	aload_6 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEventImpl // pc=8
	ireturn 
	}


public final registerWithGlobalKeyBackgroundProcessRegistry( net.rim.device.api.system.ApplicationManagerImpl, int, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_2 
	iload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=3
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


public final deregisterFromGlobalKeyBackgroundProcessRegistry( net.rim.device.api.system.ApplicationManagerImpl, int, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_2 
	iload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=3
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


final boolean postInternalGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	aload_0 
	lload 1
	iload_3 
	iload_4 
	aload_5 
	aload_6 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEventImpl // pc=8
	ireturn 
	}


final boolean postMessageToForegroundProcess( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label11
	iconst_0 
	aload_3 
	monitorexit 
	ireturn 
Label11:
	iload_2 
	ifeq Label41
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual_short .virtual_39 // idx=39 pc=1
	astore_4 
	aload_4 
	ifnull Label41
	bipush 3
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_5 
	iload_5 
	ifle Label32
	aload_4 
	bipush 2
	iload_5 
	invokevirtual .virtual_75(  ) // pc=3
	ifne Label32
	iconst_0 
	aload_3 
	monitorexit 
	ireturn 
Label32:
	aload_4 
	invokestatic_lib module:net_rim_cldc-12.class#91.routine_34997(  ) // class#91
	iconst_1 
	invokestatic_lib module:net_rim_cldc-12.class#88.routine_33351(  ) // class#88
	ifeq Label41
	iconst_0 
	aload_3 
	monitorexit 
	ireturn 
Label41:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	aload_3 
	monitorexit 
	iconst_1 
	ireturn 
	astore_6 
	aload_3 
	monitorexit 
	aload_6 
	athrow 
	}


public final repaintAll( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.postMessage // pc=2
	return 
	}


final module:net_rim_cldc-36.class#69 interruptTouchSequences( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.cancelInputProcessTouch // pc=1
	astore_1 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.startCancellingTouch // pc=1
	aload_1 
	areturn 
	}


final module:net_rim_cldc-12.class#27 getEventLogger( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	}


final didNotTakeForegroundOnForegroundSwitch( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter 
	lipush -7509200465648525729
	iipush 1095583315
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_13913(  ) // class#27
	pop 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.didNotTakeForeground // pc=3
	return 
	}


final didNotTakeForegroundOnStartup( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess ); // address: 0
	{
	enter 
	lipush -7509200465648525729
	iipush 1095585619
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iconst_0 
	invokestatic_lib module:net_rim_cldc-12.class#27.routine_13913(  ) // class#27
	pop 
	aload_0 
	aload_1 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.didNotTakeForeground // pc=3
	return 
	}


final boolean setForegroundProcess( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0 
	invokevirtual_short .virtual_25 // idx=25 pc=1
	ifeq Label25
	aload_1 
	invokevirtual_short .virtual_32 // idx=32 pc=1
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23634(  ) // class#34
	istore_4 
	iload_4 
	ifne Label25
	aload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_acmpeq Label25
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_acmpeq Label25
	iconst_0 
	aload_3 
	monitorexit 
	ireturn 
Label25:
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_acmpne Label31
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label31:
	aload_1 
	invokevirtual_short .virtual_20 // idx=20 pc=1
	ifne Label38
	iconst_0 
	aload_3 
	monitorexit 
	ireturn 
Label38:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label64
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_acmpeq Label64
	aload_1 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	if_icmpeq Label64
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_acmpeq Label56
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label64
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_19 // idx=19 pc=1
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	if_icmpne Label64
Label56:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer.moveProcessAfter // pc=3
	iconst_0 
	aload_3 
	monitorexit 
	ireturn 
Label64:
	aload_1 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	istore_4 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1989:"Foreground is set: "
	invokespecial_lib .routine_42025 // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	iload_4 
	invokestatic_lib module:net_rim_cldc-30.class#28.routine_19878(  ) // class#28
	iconst_1 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-26.class#9.routine_3072(  ) // class#9
	bipush 2
	iconst_0 
	invokestatic_lib module:net_rim_cldc-26.class#9.routine_3072(  ) // class#9
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnull Label89
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	if_acmpeq Label96
Label89:
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40085(  ) // class#125
	ifne Label96
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40116(  ) // class#125
	ifne Label96
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateInputProcess // pc=2
Label96:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	if_acmpeq Label142
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer.moveProcess // pc=3
	aload_1 
	iconst_1 
	invokevirtual_short .virtual_56 // idx=56 pc=2
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateCachedForegroundFlag // pc=3
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateForegroundProcess // pc=2
	aload_5 
	ifnull Label123
	aload_5 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-8.class#113.routine_42682(  ) // class#113
	aload_5 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label123:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	invokestatic_lib module:net_rim_cldc-8.class#113.routine_42682(  ) // class#113
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnull Label142
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	arraylength 
	iconst_1 
	isub 
	istore_6 
Label133:
	iload_6 
	iflt Label142
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	iload_6 
	aaload 
	checkcast_lib Runnable//module:net_rim_cldc-2.class#77 module:net_rim_cldc-2.class#77 module:net_rim_cldc-2.class#77
	invokeinterface interfacemethodref_478 // pc=1 guess=0
	iinc 6 -1
	goto Label133
Label142:
	iconst_1 
	aload_3 
	monitorexit 
	ireturn 
	astore_7 
	aload_3 
	monitorexit 
	aload_7 
	athrow 
	}


public final int runApplication( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, boolean, module:net_rim_cldc-2.class#86 ); // address: 0
	{
	enter 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_4 
	aload_0 
	aload_1 
	iload_2 
	aload_3 
	iload_4 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.runApplication // pc=5
	ireturn 
	}


final requestForeground( net.rim.device.api.system.ApplicationManagerImpl, net.rim.device.api.system.ApplicationProcess, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0 
	invokevirtual_short .virtual_25 // idx=25 pc=1
	ifeq Label30
	iconst_0 
	istore_4 
	aload_1 
	ifnull Label17
	aload_1 
	invokevirtual_short .virtual_32 // idx=32 pc=1
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23634(  ) // class#34
	istore_4 
Label17:
	aload_1 
	ifnull Label27
	iload_4 
	ifne Label30
	aload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_acmpeq Label30
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_acmpeq Label30
Label27:
	aload_3 
	monitorexit 
	return 
Label30:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	aload_1 
	ifnull Label37
	iload_2 
	ifeq Label93
Label37:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_4 
	iconst_0 
	istore_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label53
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	if_acmpne Label53
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_1 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$ApplicationProcessContainer.moveProcessToRear // pc=2
Label53:
	aconst_null 
	astore_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label73
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_6 
	aload_6 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_acmpeq Label73
	aload_6 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	if_icmpeq Label73
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .virtual_50 // idx=50 pc=1
	ifeq Label73
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore_1 
Label73:
	aload_1 
	ifnonnull Label88
Label75:
	iload_5 
	iload_4 
	if_icmpge Label88
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_1 
	aload_1 
	invokevirtual_short .virtual_50 // idx=50 pc=1
	ifeq Label86
	goto Label88
Label86:
	iinc 5 1
	goto Label75
Label88:
	aload_1 
	ifnonnull Label93
	aload_3 
	monitorexit 
	return 
Label93:
	aload_1 
	invokevirtual_short .virtual_20 // idx=20 pc=1
	ifeq Label139
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_acmpne Label103
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	goto Label106
Label103:
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label106:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1990:"Foreground is requested: "
	invokespecial_lib .routine_42025 // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic log( module:net_rim_cldc.class#78 ) // ApplicationManagerImpl
	aload_1 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokevirtual_short .virtual_41 // idx=41 pc=2
	invokestatic_lib module:net_rim_cldc-31.class#85.routine_36814(  ) // class#85
	aload_1 
	invokevirtual_short .virtual_22 // idx=22 pc=1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label132
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_acmpne Label132
	aload_1 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	if_icmpeq Label132
	iconst_1 
	goto Label133
Label132:
	iconst_0 
Label133:
	invokevirtual_short .virtual_6 // idx=6 pc=3
	aload_0 
	aload_1 
	invokevirtual_short .virtual_22 // idx=22 pc=1
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.recordAppStartTime // pc=3
Label139:
	aload_3 
	monitorexit 
	return 
	astore_7 
	aload_3 
	monitorexit 
	aload_7 
	athrow 
	}


final net.rim.device.api.system.ApplicationProcess getInputProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


final net.rim.device.api.system.ApplicationProcess getSecurityProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


final net.rim.device.api.system.ApplicationProcess getForegroundProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


final net.rim.device.api.system.ApplicationProcess getInHolsterInputProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


final net.rim.device.api.system.ApplicationProcess getRedirectInputProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final int getInputProcessId( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_1 
	aload_1 
	ifnull Label8
	aload_1 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	ireturn 
Label8:
	bipush -1
	ireturn 
	}


public final int runApplication( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, module:net_rim_cldc-2.class#86 ); // address: 0
	{
	enter 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_3 
	aload_0 
	aload_1 
	iconst_1 
	aload_2 
	iload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.runApplication // pc=5
	ireturn 
	}


public final setTunnelAllocatorProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label11
	new_lib RuntimeException//module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79
	dup 
	invokespecial_lib .routine_39675 // pc=1
	athrow 
Label11:
	aload_0 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final setNativeSocketProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label11
	new_lib RuntimeException//module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79 module:net_rim_cldc-2.class#79
	dup 
	invokespecial_lib .routine_39675 // pc=1
	athrow 
Label11:
	aload_0 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final lockSystemKeepBacklightOn( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	iconst_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	return 
	}


public final module:net_rim_cldc-10.class#25[] getApplicationsForApplicationSwitcher( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_2 
	iconst_0 
	newarray_object_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_3 
	iconst_0 
	istore_4 
	aconst_null 
	astore_5 
Label15:
	iload_4 
	iload_2 
	if_icmpge Label31
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_5 
	aload_5 
	invokevirtual_short .virtual_51 // idx=51 pc=1
	ifeq Label29
	aload_3 
	aload_5 
	invokevirtual_short .virtual_32 // idx=32 pc=1
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_566(  ) // class#3
Label29:
	iinc 4 1
	goto Label15
Label31:
	aload_3 
	aload_1 
	monitorexit 
	areturn 
	astore_6 
	aload_1 
	monitorexit 
	aload_6 
	athrow 
	}


public final int getVisibleApplicationsCount( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_2 
	aconst_null 
	astore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label14:
	iload_5 
	iload_2 
	if_icmpge Label27
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_50 // idx=50 pc=1
	ifeq Label25
	iinc 4 1
Label25:
	iinc 5 1
	goto Label14
Label27:
	iload_4 
	aload_1 
	monitorexit 
	ireturn 
	astore_6 
	aload_1 
	monitorexit 
	aload_6 
	athrow 
	}


public final net.rim.device.api.system.ApplicationProcess[] getProcesses( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_8 // idx=8 pc=1
	aload_1 
	monitorexit 
	areturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final net.rim.device.api.system.ApplicationProcess[] getDeadProcesses( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_9 // idx=9 pc=1
	aload_1 
	monitorexit 
	areturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final setDeadProcessChecking( net.rim.device.api.system.ApplicationManagerImpl, boolean ); // address: 0
	{
	putfield_return .field_54_54   // get_name_1:  .field_54_54   // get_name_2:  .field_54_54   // get_Name:    .field_54_54   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 54
	}


public final module:net_rim_cldc-10.class#25 getEngScreenDescriptor( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	}


public final interruptTouchInputSequences( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual_short .virtual_45 // idx=45 pc=1
	pop 
	return 
	}


public final redirectInput( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-37.class#10, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_1 
	ifnull Label25
	aload_1 
	invokevirtual_short .virtual_20 // idx=20 pc=1
	ifeq Label25
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	if_acmpeq Label39
	aload_0 
	aload_1 
	checkcast ApplicationProcess
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40085(  ) // class#125
	ifne Label39
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40116(  ) // class#125
	ifne Label39
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateInputProcess // pc=2
	goto Label39
Label25:
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40085(  ) // class#125
	ifne Label35
	invokestatic_lib module:net_rim_cldc-13.class#125.routine_40116(  ) // class#125
	ifne Label35
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.updateInputProcess // pc=2
Label35:
	iload_2 
	ifeq Label39
	aload_0 
	invokenonvirtual net.rim.device.api.system.ApplicationManagerImpl.repaintForeground // pc=1
Label39:
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


public final boolean setEngScreenDescriptor( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	ifnull Label11
	iconst_0 
	aload_2 
	monitorexit 
	ireturn 
Label11:
	aload_0 
	aload_1 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iconst_1 
	aload_2 
	monitorexit 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final repaintForeground( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual_short .virtual_41 // idx=41 pc=2
	return 
	astore_1 
	return 
	}


public final boolean postMessage( net.rim.device.api.system.ApplicationManagerImpl, int, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	iload_1 
	bipush -1
	if_icmpne Label26
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iconst_1 
	isub 
	istore_4 
Label13:
	iload_4 
	iflt Label22
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	aload_2 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	iinc 4 -1
	goto Label13
Label22:
	iconst_1 
	aload_3 
	monitorexit 
	ireturn 
Label26:
	iload_1 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4870(  ) // class#10
	astore_4 
	aload_4 
	ifnull Label42
	aload_4 
	invokevirtual_short .virtual_20 // idx=20 pc=1
	ifeq Label42
	aload_4 
	checkcast ApplicationProcess
	aload_2 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	iconst_1 
	aload_3 
	monitorexit 
	ireturn 
Label42:
	iconst_0 
	aload_3 
	monitorexit 
	ireturn 
	astore_5 
	aload_3 
	monitorexit 
	aload_5 
	athrow 
	}


public final postMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter 
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=2
	ifeq Label46
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aconst_null 
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	iconst_1 
	isub 
	istore_5 
Label20:
	iload_5 
	iflt Label38
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_5 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_4 
	iload_2 
	bipush -1
	if_icmpeq Label33
	aload_4 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	iload_2 
	if_icmpne Label36
Label33:
	aload_4 
	aload_1 
	invokevirtual_short .virtual_41 // idx=41 pc=2
Label36:
	iinc 5 -1
	goto Label20
Label38:
	aload_3 
	monitorexit 
	return 
	astore_6 
	aload_3 
	monitorexit 
	aload_6 
	athrow 
Label46:
	return 
	}


public final injectInputMessage( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-36.class#69 ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=1
Label4:
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.processMessage // pc=2
Label7:
	return 
	}


public final module:net_rim_cldc-31.class#70 getSecurityManager( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	}


public final addForegroundChangeListener( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-2.class#77 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_1 
	invokestatic_lib module:net_rim_cldc-23.class#71.routine_17679(  ) // class#71
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	return 
	}


public final removeForegroundChangeListener( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-2.class#77 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_1 
	invokestatic_lib module:net_rim_cldc-23.class#71.routine_17825(  ) // class#71
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	return 
	}


public final module:net_rim_cldc-10.class#19 getForegroundApplication( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label11
	aconst_null 
	aload_1 
	monitorexit 
	areturn 
Label11:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_39 // idx=39 pc=1
	aload_1 
	monitorexit 
	areturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final boolean setSecurityManager( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-31.class#70 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnull Label11
	iconst_0 
	aload_2 
	monitorexit 
	ireturn 
Label11:
	aload_0 
	aload_1 
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	iconst_1 
	aload_2 
	monitorexit 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final boolean deregisterForGlobalKey( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	astore_3 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	iload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=3
	aload_2 
	monitorexit 
	ireturn 
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
	}


public final boolean registerForGlobalKey( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	astore_3 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	iload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=3
	aload_2 
	monitorexit 
	ireturn 
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
	}


public final boolean setSecurityLockSupercedingProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	invokevirtual_short .virtual_19 // idx=19 pc=1
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_1 
	monitorexit 
	iconst_1 
	ireturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final int getStartupTierInProgress( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	ireturn_field .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	}


public final int getConsoleProcessId( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .virtual_19 // idx=19 pc=1
	ireturn 
	}


public final boolean setConsoleProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label11
	iconst_0 
	aload_1 
	monitorexit 
	ireturn 
Label11:
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	dup 
	astore_2 
	monitorenter 
	aload_0 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush 107
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	invokenonvirtual_lib .routine_42209 // pc=1
	aload_2 
	monitorexit 
	goto Label32
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label32:
	iconst_1 
	aload_1 
	monitorexit 
	ireturn 
	astore_4 
	aload_1 
	monitorexit 
	aload_4 
	athrow 
	}


public final boolean isSecurityLockSupercedingProcessForeground( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual_short .virtual_18 // idx=18 pc=1
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	if_icmpne Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final clearPermissionsRequestingProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	return 
	}


public final clearApplicationPermissionsProxyProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	return 
	}


public final net.rim.device.api.system.ApplicationUsageAnalyzer getAppUsageAnalyzer( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
	ifnonnull Label27
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	aload_0_getfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
	ifnonnull Label19
	aload_0 
	new ApplicationUsageStorage
	dup 
	invokespecial net.rim.device.api.system.ApplicationUsageStorage.<init> // pc=1
	putfield .field_51_51   // get_name_1:  .field_51_51   // get_name_2:  .field_51_51   // get_Name:    .field_51_51   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 51
	aload_0 
	aload_0_getfield .field_51_51   // get_name_1:  .field_51_51   // get_name_2:  .field_51_51   // get_Name:    .field_51_51   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 51
	invokevirtual_short .virtual_4 // idx=4 pc=1
	checkcast ApplicationUsageAnalyzerImpl
	putfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
Label19:
	aload_1 
	monitorexit 
	goto Label27
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label27:
	aload_0_getfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
	areturn 
	}


public final net.rim.device.api.system.ApplicationUsageStorage getAppUsageStorage( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	areturn_field .field_51_51   // get_name_1:  .field_51_51   // get_name_2:  .field_51_51   // get_Name:    .field_51_51   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 51
	}


public final clockUpdated( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	sipush 300
	i2l 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_5049(  ) // class#10
	iconst_0 
	i2l 
	lcmp 
	ifne Label9
	return 
Label9:
	invokestatic_lib module:net_rim_cldc-10.class#28.routine_19891(  ) // class#28
	checkcast_lib net.rim.device.internal.system.ApplicationManagerInternal//module:net_rim_cldc-29.class#12 module:net_rim_cldc-29.class#12 module:net_rim_cldc-29.class#12
	invokeinterface interfacemethodref_479 // pc=1 guess=1
	astore_1 
	iconst_0 
	istore_2 
Label15:
	iload_2 
	aload_1 
	arraylength 
	if_icmpge Label49
	aload_1 
	iload_2 
	aaload 
	invokevirtual_short .virtual_50 // idx=50 pc=1
	ifeq Label47
	aload_1 
	iload_2 
	aaload 
	invokevirtual_short .virtual_39 // idx=39 pc=1
	astore_3 
	aload_3 
	ifnull Label47
	aload_3 
	invokevirtual_short .virtual_18 // idx=18 pc=1
	ifne Label47
	aload_3 
	invokevirtual_short .virtual_15 // idx=15 pc=1
	iipush 3600000
	i2l 
	lcmp 
	iflt Label47
	aload_3 
	new ApplicationManagerImpl$1
	dup 
	aload_0 
	aload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl$1.<init> // pc=3
	invokevirtual .virtual_78(  ) // pc=2
Label47:
	iinc 2 1
	goto Label15
Label49:
	return 
	}


public final boolean loadCRCChanged( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	ireturn_field .field_59_59   // get_name_1:  .field_59_59   // get_name_2:  .field_59_59   // get_Name:    .field_59_59   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 59
	}


public final enableSchedulingLog( net.rim.device.api.system.ApplicationManagerImpl, boolean, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_3 
	monitorenter 
	iload_1 
	ifeq Label17
	iload_2 
	iconst_1 
	if_icmpge Label12
	iconst_1 
	istore_2 
Label12:
	aload_0 
	iload_2 
	newarray_object_lib String//module:net_rim_cldc.class#78 module:net_rim_cldc.class#78 module:net_rim_cldc.class#78
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	goto Label20
Label17:
	aload_0 
	aconst_null 
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
Label20:
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


public final module:net_rim_cldc.class#78[] getSchedulingLog( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	arraylength 
	newarray_object_lib String//module:net_rim_cldc.class#78 module:net_rim_cldc.class#78 module:net_rim_cldc.class#78
	astore_2 
	iconst_0 
	istore_3 
Label11:
	iload_3 
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	arraylength 
	if_icmpge Label23
	aload_2 
	iload_3 
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	iload_3 
	aaload 
	aastore 
	iinc 3 1
	goto Label11
Label23:
	aload_2 
	aload_1 
	monitorexit 
	areturn 
	astore_4 
	aload_1 
	monitorexit 
	aload_4 
	athrow 
	}


public final boolean isConsoleDescriptor( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label14
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .virtual_32 // idx=32 pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	aload_2 
	monitorexit 
	ireturn 
Label14:
	aload_2 
	monitorexit 
	iconst_0 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final requestForeground( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore_2 
	aload_2 
	ifnull Label11
	aload_0 
	aload_2 
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=3
Label11:
	return 
	}


public final lockSystem( net.rim.device.api.system.ApplicationManagerImpl, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.assertChangeDeviceSettingsPermission // pc=1
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_2 
	iload_2 
	invokestatic_lib module:net_rim_cldc.class#21.routine_15199(  ) // class#21
	ifne Label32
	iload_2 
	invokestatic_lib module:net_rim_cldc-10.class#34.routine_23417(  ) // class#34
	astore_3 
	aload_3 
	ifnull Label17
	aload_3 
	stringlength 
	ifgt Label29
Label17:
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1991:"<unknown>-"
	invokespecial_lib .routine_42025 // pc=2
	astore_4 
	aload_4 
	iload_2 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	pop 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
Label29:
	iipush 1414547822
	aload_3 
	invokestatic_lib module:net_rim_cldc-30.class#40.routine_30025(  ) // class#40
Label32:
	aload_0 
	iconst_0 
	iconst_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.lockSystemInternal // pc=3
	return 
	}


public final module:net_rim_cldc-10.class#25[] getVisibleApplications( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_2 
	iconst_0 
	newarray_object_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_3 
	iconst_0 
	istore_4 
	aconst_null 
	astore_5 
Label15:
	iload_4 
	iload_2 
	if_icmpge Label31
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_5 
	aload_5 
	invokevirtual_short .virtual_50 // idx=50 pc=1
	ifeq Label29
	aload_3 
	aload_5 
	invokevirtual_short .virtual_32 // idx=32 pc=1
	invokestatic_lib module:net_rim_cldc-23.class#3.routine_566(  ) // class#3
Label29:
	iinc 4 1
	goto Label15
Label31:
	aload_3 
	aload_1 
	monitorexit 
	areturn 
	astore_6 
	aload_1 
	monitorexit 
	aload_6 
	athrow 
	}


public final boolean isSystemLocked( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label5
	iconst_1 
	ireturn 
Label5:
	iconst_0 
	ireturn 
	}


public final unlockSystem( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.assertChangeDeviceSettingsPermission // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label12
	aload_1 
	monitorexit 
	return 
Label12:
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	lipush 1597563888101360867
	iconst_0 
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postInternalGlobalEvent // pc=8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_42311 // pc=1
	goto Label24
	astore_2 
Label24:
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
	}


public final int runApplication( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, boolean ); // address: 0
	{
	enter 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_3 
	aload_0 
	aload_1 
	iload_2 
	aconst_null 
	iload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.runApplication // pc=5
	ireturn 
	}


protected final int runApplicationImpl( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, boolean, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aconst_null 
	iload_3 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.runApplication // pc=5
	ireturn 
	}


public final boolean setInHolsterInputProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label11
	iconst_0 
	aload_1 
	monitorexit 
	ireturn 
Label11:
	aload_0 
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	aload_1 
	monitorexit 
	ireturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final int launchApplication( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc.class#78 ); // address: 0
	{
	enter_narrow 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_2 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.launchApplication // pc=3
	ireturn 
	}


public final boolean scheduleApplication( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25, long, boolean ); // address: 0
	{
	enter 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_5 
	aload_0 
	aload_1 
	iload_5 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.checkDescriptorSecurity // pc=3
	goto Label12
	astore_6 
	iconst_0 
	ireturn 
Label12:
	lload 2
	lipush 9223372036854775807
	lcmp 
	ifne Label18
	iconst_0 
	ireturn 
Label18:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_6 
	monitorenter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	invokevirtual_short .virtual_12 // idx=12 pc=2
	istore_7 
	lload 2
	iconst_0 
	i2l 
	lcmp 
	ifge Label60
	iload_7 
	bipush -1
	if_icmpeq Label56
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1992:"Un-scheduling "
	invokespecial_lib .routine_42025 // pc=2
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_7 
	invokevirtual_short .virtual_20 // idx=20 pc=2
	aload_0 
	iconst_1 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setNextAlarm // pc=3
	pop 
	iconst_1 
	aload_6 
	monitorexit 
	ireturn 
Label56:
	iconst_0 
	aload_6 
	monitorexit 
	ireturn 
Label60:
	iload_4 
	ifeq Label70
	lload 2
	invokestatic_lib module:net_rim_cldc-2.class#84.routine_42190(  ) // class#84
	lcmp 
	ifge Label70
	iconst_0 
	aload_6 
	monitorexit 
	ireturn 
Label70:
	iload_4 
	ifne Label87
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1993:"App "
	invokespecial_lib .routine_42025 // pc=2
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_1994:" is trying to schedule relative time:"
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 2
	invokevirtual_short .virtual_17 // idx=17 pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	goto Label101
Label87:
	aload_0 
	new_lib StringBuffer//module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82 module:net_rim_cldc-2.class#82
	dup 
	ldc literal_1993:"App "
	invokespecial_lib .routine_42025 // pc=2
	aload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokevirtual_short .virtual_11 // idx=11 pc=2
	ldc literal_1995:" is trying to schedule for time: "
	invokevirtual_short .virtual_11 // idx=11 pc=2
	lload 2
	invokevirtual_short .virtual_17 // idx=17 pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
Label101:
	iload_7 
	bipush -1
	if_icmpne Label110
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	invokevirtual_short .virtual_22 // idx=22 pc=2
	iconst_0 
	istore 8
	goto Label117
Label110:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_7 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_1 
	iconst_1 
	istore 8
Label117:
	aload_1 
	lload 2
	iload_4 
	invokevirtual_short .virtual_33 // idx=33 pc=4
	pop2 
	aload_0 
	iload 8
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setNextAlarm // pc=3
	aload_6 
	monitorexit 
	ireturn 
	astore 9
	aload_6 
	monitorexit 
	aload 9
	athrow 
	}


public final setCurrentPowerOnBehavior( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.assertChangeDeviceSettingsPermission // pc=1
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	istore_3 
	iload_1 
	tableswitch  :
		
		
		

Label11:
	aload_0 
	iload_1 
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	goto Label18
Label15:
	aload_0 
	iconst_0 
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
Label18:
	iload_3 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	if_icmpeq Label29
	aload_0 
	ldc literal_1996:"Power ON Behaviour Change: Rescheduling Alarms."
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.logSchedulingEvent // pc=2
	aload_0 
	iconst_1 
	aconst_null 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.setNextAlarm // pc=3
	pop 
Label29:
	aload_2 
	monitorexit 
	return 
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
	}


protected final boolean postGlobalEventImpl( net.rim.device.api.system.ApplicationManagerImpl, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61, int ); // address: 0
	{
	enter 
	aload_0 
	lload 1
	iload_3 
	iload_4 
	aload_5 
	aload_6 
	iload_7 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEvent // pc=8
	ireturn 
	}


public final boolean postGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_7 
	aload_0 
	lload 1
	iload_3 
	iload_4 
	aload_5 
	aload_6 
	iload_7 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEvent // pc=8
	ireturn 
	}


public final launch( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc.class#78 ); // address: 0
	{
	enter_narrow 
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore_2 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.launchApplication // pc=3
	pop 
	return 
	}


public final requestForegroundForConsole( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label11
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=3
Label11:
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final boolean postGlobalEvent( net.rim.device.api.system.ApplicationManagerImpl, int, long, int, int, module:net_rim_cldc.class#61, module:net_rim_cldc.class#61 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.assertIPCPermission // pc=1
	aload_0 
	iload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore 8
	aload 8
	ifnonnull Label11
	iconst_0 
	ireturn 
Label11:
	iconst_0 
	invokestatic_lib module:net_rim_cldc-37.class#19.routine_6326(  ) // class#19
	istore 9
	iload 9
	invokestatic_lib module:net_rim_cldc.class#21.routine_15199(  ) // class#21
	istore 10
	aload_0 
	aload 8
	lload 2
	iload_4 
	iload_5 
	aload_6 
	aload_7 
	iload 10
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.postGlobalEventImpl // pc=9
	iconst_1 
	ireturn 
	}


public final boolean wasDeviceTimeValidOnStartup( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	ireturn_field .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	}


public final boolean inStartup( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	ifnull Label5
	iconst_1 
	ireturn 
Label5:
	iconst_0 
	ireturn 
	}


public final waitForStartup( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	dup 
	astore_1 
	monitorenter 
	aload_0 
	invokevirtual_short .virtual_25 // idx=25 pc=1
	ifeq Label12
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	invokenonvirtual_lib .routine_42311 // pc=1
	goto Label12
	astore_2 
Label12:
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
	}


public final boolean haveStartupTiersRun( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	ireturn_field .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	}


public final boolean isInHolsterInputProcess( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label11
	iconst_0 
	aload_1 
	monitorexit 
	ireturn 
Label11:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib module:net_rim_cldc-37.class#10.routine_4850(  ) // class#10
	checkcast ApplicationProcess
	if_acmpne Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	aload_1 
	monitorexit 
	ireturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final int getProcessId( net.rim.device.api.system.ApplicationManagerImpl, module:net_rim_cldc-10.class#25 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.device.api.system.ApplicationManagerImpl.findProcess // pc=2
	astore_2 
	aload_2 
	ifnonnull Label9
	bipush -1
	ireturn 
Label9:
	aload_2 
	invokevirtual_short .virtual_19 // idx=19 pc=1
	ireturn 
	}


public final int getForegroundProcessId( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label11
	bipush -1
	aload_1 
	monitorexit 
	ireturn 
Label11:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_19 // idx=19 pc=1
	aload_1 
	monitorexit 
	ireturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final long getNextAlarm( net.rim.device.api.system.ApplicationManagerImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	invokevirtual_short .virtual_30 // idx=30 pc=2
	lreturn 
	}


public final long getNextAlarm( net.rim.device.api.system.ApplicationManagerImpl, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	dup 
	astore_2 
	monitorenter 
	lipush 9223372036854775807
	lstore 3
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual_short .virtual_8 // idx=8 pc=1
	istore_5 
	iconst_0 
	istore_6 
Label12:
	iload_6 
	iload_5 
	if_icmpge Label38
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_6 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25 module:net_rim_cldc-10.class#25
	astore_7 
	aload_7 
	invokevirtual_short .virtual_35 // idx=35 pc=1
	istore 8
	iload 8
	iload_1 
	iand 
	ifle Label36
	aload_7 
	invokevirtual_short .virtual_31 // idx=31 pc=1
	lstore 9
	lload 9
	lload 3
	lcmp 
	ifge Label36
	lload 9
	lstore 3
Label36:
	iinc 6 1
	goto Label12
Label38:
	lload 3
	aload_2 
	monitorexit 
	lreturn 
	astore 11
	aload_2 
	monitorexit 
	aload 11
	athrow 
	}

}
