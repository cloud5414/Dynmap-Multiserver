package net.cubespace.dynmap.multiserver.Config;


import net.cubespace.Yamler.Config.YamlConfig;

import java.io.File;
import java.util.ArrayList;

/**
 * @author geNAZt (fabian.fassbender42@googlemail.com)
 */
public class Main extends YamlConfig {
    public Main() {
        CONFIG_FILE = new File("config/main.yml");

        DynMap.add(new Dynmap());
    }

    public String Webserver_IP = "0.0.0.0";
    public Integer Webserver_Port = 8080;
    public String Webserver_webDir = "web/";
    public String Webserver_Title = "Awesome Multiserver Dynmap";
    public Integer Webserver_WorkerThreads = 16;
    public ArrayList<Dynmap> DynMap = new ArrayList<>();
}
