// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileInforNexusConnectorProfilePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileInforNexusConnectorProfilePropertiesArgs Empty = new ConnectorProfileInforNexusConnectorProfilePropertiesArgs();

    /**
     * The location of the InforNexus resource
     * 
     */
    @Import(name="instanceUrl", required=true)
    private Output<String> instanceUrl;

    /**
     * @return The location of the InforNexus resource
     * 
     */
    public Output<String> instanceUrl() {
        return this.instanceUrl;
    }

    private ConnectorProfileInforNexusConnectorProfilePropertiesArgs() {}

    private ConnectorProfileInforNexusConnectorProfilePropertiesArgs(ConnectorProfileInforNexusConnectorProfilePropertiesArgs $) {
        this.instanceUrl = $.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileInforNexusConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileInforNexusConnectorProfilePropertiesArgs $;

        public Builder() {
            $ = new ConnectorProfileInforNexusConnectorProfilePropertiesArgs();
        }

        public Builder(ConnectorProfileInforNexusConnectorProfilePropertiesArgs defaults) {
            $ = new ConnectorProfileInforNexusConnectorProfilePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceUrl The location of the InforNexus resource
         * 
         * @return builder
         * 
         */
        public Builder instanceUrl(Output<String> instanceUrl) {
            $.instanceUrl = instanceUrl;
            return this;
        }

        /**
         * @param instanceUrl The location of the InforNexus resource
         * 
         * @return builder
         * 
         */
        public Builder instanceUrl(String instanceUrl) {
            return instanceUrl(Output.of(instanceUrl));
        }

        public ConnectorProfileInforNexusConnectorProfilePropertiesArgs build() {
            $.instanceUrl = Objects.requireNonNull($.instanceUrl, "expected parameter 'instanceUrl' to be non-null");
            return $;
        }
    }

}
