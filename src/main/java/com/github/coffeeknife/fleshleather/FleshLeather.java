package com.github.coffeeknife.fleshleather;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmokingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class FleshLeather extends JavaPlugin {
    @Override
    public void onEnable() {

        // add furnace recipe
        getServer().addRecipe(new FurnaceRecipe(
                new NamespacedKey(this, "furnace_flesh"),
                new ItemStack(Material.LEATHER),
                Material.ROTTEN_FLESH,
                0.15f,
                200
        ));

        // add smoker recipe
        getServer().addRecipe(new SmokingRecipe(
                new NamespacedKey(this, "smoker_flesh"),
                new ItemStack(Material.LEATHER),
                Material.ROTTEN_FLESH,
                0.15f,
                100
        ));

        // add campfire recipe
        getServer().addRecipe(new CampfireRecipe(
                new NamespacedKey(this, "campfire_flesh"),
                new ItemStack(Material.LEATHER),
                Material.ROTTEN_FLESH,
                0.15f,
                600
        ));

        getLogger().info("FleshLeather has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("FleshLeather has been disabled!");
    }
}
