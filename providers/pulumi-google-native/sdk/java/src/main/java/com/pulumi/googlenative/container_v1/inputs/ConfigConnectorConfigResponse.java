// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration options for the Config Connector add-on.
 * 
 */
public final class ConfigConnectorConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigConnectorConfigResponse Empty = new ConfigConnectorConfigResponse();

    /**
     * Whether Cloud Connector is enabled for this cluster.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    private ConfigConnectorConfigResponse() {}

    private ConfigConnectorConfigResponse(ConfigConnectorConfigResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigConnectorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigConnectorConfigResponse $;

        public Builder() {
            $ = new ConfigConnectorConfigResponse();
        }

        public Builder(ConfigConnectorConfigResponse defaults) {
            $ = new ConfigConnectorConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public ConfigConnectorConfigResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
