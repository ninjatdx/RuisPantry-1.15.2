package com.formas1.ruispantry.itemgroups;

import com.formas1.ruispantry.init.BlockInit;
import com.formas1.ruispantry.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RPToolsArmor extends ItemGroup
{
	public RPToolsArmor(int index, String label)
	{
		super(index, label);
	}
	
	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemInit.bat_wing_shoes);
	}
}
