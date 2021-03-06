package com.hifun.soul.gameserver.item.template;

import com.hifun.soul.common.exception.TemplateConfigException;
import com.hifun.soul.core.annotation.ExcelRowBinding;

/**
 * 
 * 材料道具模版
 * 
 * @author magicstone
 * 
 */
@ExcelRowBinding
public class MaterialItemTemplate extends MaterialItemTemplateVO implements
		ItemTemplate {

	@Override
	public void check() throws TemplateConfigException {

	}

	@Override
	public boolean isOverlapable() {
		return this.maxOverlap > 1;
	}
	
	@Override
	public boolean canSell() {
		return this.sell;
	}
	
	@Override
	public int getLevelLimit() {
		return super.getLimitLevel();
	}
	
	@Override
	public int getOccupationLimit() {
		return 0;
	}

}
