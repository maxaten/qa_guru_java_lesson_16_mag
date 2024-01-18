package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})
public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://magnum.kz")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowserName();

    @Key("browserVersion")
    @DefaultValue("120.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    @DefaultValue("")
    String getRemoteUrl();


}
