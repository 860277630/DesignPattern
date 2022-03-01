// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EnumSingleton.java

package com.example.demo.single.enumSingleTon;


// Referenced classes of package com.example.demo.single.enumSingleTon:
//			User

final class EmumForSingleton extends Enum
{
	public static final EmumForSingleton INSTANCE;
	private User u;
	private static final EmumForSingleton $VALUES[];
	static
	{
		INSTANCE = new com.example.demo.single.enumSingleTon.EmumForSingleton("INSTANCE", 0);
		$VALUES = (new com.example.demo.single.enumSingleTon.EmumForSingleton[] {
				INSTANCE
		});
	}
	private EmumForSingleton(String s, int i)
	{
		super(s, i);
		u = new User("peter", Integer.valueOf(15), "man");
	}
	public User getU()
	{
		return u;
	}

	public void setU(User u)
	{
		this.u = u;
	}

	public static EmumForSingleton[] values()
	{
		return (EmumForSingleton[])$VALUES.clone();
	}

	public static EmumForSingleton valueOf(String name)
	{
		return (EmumForSingleton)Enum.valueOf(com/example/demo/single/enumSingleTon/EmumForSingleton, name);
	}
}
