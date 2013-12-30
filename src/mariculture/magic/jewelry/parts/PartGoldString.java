package mariculture.magic.jewelry.parts;

import net.minecraft.item.ItemStack;
import mariculture.core.Core;
import mariculture.core.lib.Text;
import mariculture.core.lib.CraftingMeta;
import mariculture.core.lib.Jewelry;

public class PartGoldString extends JewelryPart {
	@Override
	public boolean isValid(int type) {
		return type == Jewelry.BRACELET;
	}
		
	@Override
	public boolean isVisible(int type) {
		return false;
	}

	@Override
	public String getPartName() {
		return "goldString";
	}
	
	@Override
	public String getPartLang() {
		return "item.craftingItems.goldenSilk.name";
	}
	
	@Override
	public int getEnchantability() {
		return 12;
	}
	
	@Override
	public String getColor() {
		return Text.YELLOW;
	}

	@Override
	public String getPartType(int type) {
		return "string";
	}
	
	@Override
	public ItemStack getItemStack() {
		return new ItemStack(Core.craftingItem, 1, CraftingMeta.GOLDEN_SILK);
	}
}