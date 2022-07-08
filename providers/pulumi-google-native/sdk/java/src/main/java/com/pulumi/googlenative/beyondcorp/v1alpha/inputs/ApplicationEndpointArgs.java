// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * ApplicationEndpoint represents a remote application endpoint.
 * 
 */
public final class ApplicationEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationEndpointArgs Empty = new ApplicationEndpointArgs();

    /**
     * Hostname or IP address of the remote application endpoint.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return Hostname or IP address of the remote application endpoint.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * Port of the remote application endpoint.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Port of the remote application endpoint.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private ApplicationEndpointArgs() {}

    private ApplicationEndpointArgs(ApplicationEndpointArgs $) {
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationEndpointArgs $;

        public Builder() {
            $ = new ApplicationEndpointArgs();
        }

        public Builder(ApplicationEndpointArgs defaults) {
            $ = new ApplicationEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Hostname or IP address of the remote application endpoint.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hostname or IP address of the remote application endpoint.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port Port of the remote application endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port of the remote application endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ApplicationEndpointArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
