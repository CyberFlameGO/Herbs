# Herbs (Minecraft Plugin)
Minecraft plugin for a server I’m working on. I used Eclipse for this. Compile using `mvn clean install`. 
[PlayerListener.java](https://github.com/CyberFlameGO/Herbs/blob/master/src/main/java/me/cyberflame/herbs/PlayerListener.java) is where the plugin does its magic, and it sets a poppy to air on right-click, gives you the poppy, and replaces the poppy after 5 minutes. It also runs a say command for testing purposes.
Note that I don't plan on adding a configuration file, as hardcoding works best for this use case, but it's pretty simple to manipulate this plugin to your needs, and I'll probably end up commenting the code too. 
To-do list for this plugin:
- Add a permission node for usage
- Add the rest of items to the plugin
- Make the plugin look for the specific block durability (blocktype) e.g. Right-clicking a poppy (RED_FLOWER:1 item) isn't the same as a Red Tulip (RED_FLOWER:4), because at the moment it just looks for the material name, not any blockdata.
