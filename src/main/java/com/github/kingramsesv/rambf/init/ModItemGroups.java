package com.github.kingramsesv.rambf.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.util.Supplier;

public class ModItemGroups {

    public static class ModItemGroup extends ItemGroup{

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {

            super(name);
            this.iconSupplier = iconSupplier;

        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }


    }

}
