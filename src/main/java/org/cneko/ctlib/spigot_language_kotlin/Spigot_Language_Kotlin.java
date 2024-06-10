package org.cneko.ctlib.spigot_language_kotlin;

import net.byteflux.libby.BukkitLibraryManager;
import net.byteflux.libby.LibraryManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.cneko.ctlib.spigot_language_kotlin.ctlib.plugin.LibrariesLoader;

public final class Spigot_Language_Kotlin extends JavaPlugin {

    @Override
    public void onEnable() {
        // 初始化load
        LibraryManager libraryManager;
        libraryManager = new BukkitLibraryManager(this);
        LibrariesLoader.setManager(libraryManager);
        // 加载依赖项
        LibrariesLoader.load("org.xerial", "sqlite-jdbc", "3.41.2.2");
        LibrariesLoader.load("org.jetbrains.kotlin", "kotlin-stdlib", "2.0.0-Beta1");
    }

}
