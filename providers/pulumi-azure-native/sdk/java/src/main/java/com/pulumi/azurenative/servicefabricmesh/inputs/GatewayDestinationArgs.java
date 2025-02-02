// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes destination endpoint for routing traffic.
 * 
 */
public final class GatewayDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayDestinationArgs Empty = new GatewayDestinationArgs();

    /**
     * Name of the service fabric Mesh application.
     * 
     */
    @Import(name="applicationName", required=true)
    private Output<String> applicationName;

    /**
     * @return Name of the service fabric Mesh application.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }

    /**
     * name of the endpoint in the service.
     * 
     */
    @Import(name="endpointName", required=true)
    private Output<String> endpointName;

    /**
     * @return name of the endpoint in the service.
     * 
     */
    public Output<String> endpointName() {
        return this.endpointName;
    }

    /**
     * service that contains the endpoint.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return service that contains the endpoint.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GatewayDestinationArgs() {}

    private GatewayDestinationArgs(GatewayDestinationArgs $) {
        this.applicationName = $.applicationName;
        this.endpointName = $.endpointName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayDestinationArgs $;

        public Builder() {
            $ = new GatewayDestinationArgs();
        }

        public Builder(GatewayDestinationArgs defaults) {
            $ = new GatewayDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName Name of the service fabric Mesh application.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName Name of the service fabric Mesh application.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param endpointName name of the endpoint in the service.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param endpointName name of the endpoint in the service.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param serviceName service that contains the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName service that contains the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GatewayDestinationArgs build() {
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
