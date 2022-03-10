// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileDynatraceConnectorProfileProperties {
    /**
     * The location of the Dynatrace resource
     * 
     */
    private final String instanceUrl;

    @OutputCustomType.Constructor
    private ConnectorProfileDynatraceConnectorProfileProperties(@OutputCustomType.Parameter("instanceUrl") String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * The location of the Dynatrace resource
     * 
    */
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileDynatraceConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileDynatraceConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }
        public ConnectorProfileDynatraceConnectorProfileProperties build() {
            return new ConnectorProfileDynatraceConnectorProfileProperties(instanceUrl);
        }
    }
}
