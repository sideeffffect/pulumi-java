// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the configuration.
 * 
 */
public final class ConfigurationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationInfoResponse Empty = new ConfigurationInfoResponse();

    /**
     * Name of the configuration.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Version of the configuration.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private ConfigurationInfoResponse() {}

    private ConfigurationInfoResponse(ConfigurationInfoResponse $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationInfoResponse $;

        public Builder() {
            $ = new ConfigurationInfoResponse();
        }

        public Builder(ConfigurationInfoResponse defaults) {
            $ = new ConfigurationInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public ConfigurationInfoResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
