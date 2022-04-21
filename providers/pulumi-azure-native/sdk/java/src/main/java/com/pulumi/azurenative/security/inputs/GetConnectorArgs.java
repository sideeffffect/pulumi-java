// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorArgs Empty = new GetConnectorArgs();

    /**
     * Name of the cloud account connector
     * 
     */
    @Import(name="connectorName", required=true)
    private String connectorName;

    public String connectorName() {
        return this.connectorName;
    }

    private GetConnectorArgs() {}

    private GetConnectorArgs(GetConnectorArgs $) {
        this.connectorName = $.connectorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorArgs $;

        public Builder() {
            $ = new GetConnectorArgs();
        }

        public Builder(GetConnectorArgs defaults) {
            $ = new GetConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectorName(String connectorName) {
            $.connectorName = connectorName;
            return this;
        }

        public GetConnectorArgs build() {
            $.connectorName = Objects.requireNonNull($.connectorName, "expected parameter 'connectorName' to be non-null");
            return $;
        }
    }

}
