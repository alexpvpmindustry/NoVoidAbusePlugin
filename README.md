### a contribution to improve PVP gameplay

kills all units that are out of bounds from the map.
this prevents players from using the "void" to bypass defenses, hence the plugin name.

major contribution from `Goober#8171` from Anuke's Mindustry Discord .

glhf.

plugin modified from https://github.com/Anuken/MindustryPluginTemplate

### Setup

Clone this repository first.
To edit the plugin display name and other data, take a look at `plugin.json`.
Edit the name of the project itself by going into `settings.gradle`.

### Basic Usage

See `src/example/ExamplePlugin.java` for some basic commands and event handlers.  
Every main plugin class must extend `Plugin`. Make sure that `plugin.json` points to the correct main plugin class.

Please note that the plugin system is in beta, and as such is subject to changes.

### Building a Jar

`gradlew jar` / `./gradlew jar`

Output jar should be in `build/libs`.


### Installing

Simply place the output jar from the step above in your server's `config/mods` directory and restart the server.
List your currently installed plugins/mods by running the `mods` command.
