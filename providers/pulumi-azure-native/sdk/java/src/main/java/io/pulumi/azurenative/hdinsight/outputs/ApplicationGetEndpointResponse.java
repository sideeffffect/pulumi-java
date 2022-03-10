// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGetEndpointResponse {
    /**
     * The destination port to connect to.
     * 
     */
    private final @Nullable Integer destinationPort;
    /**
     * The location of the endpoint.
     * 
     */
    private final @Nullable String location;
    /**
     * The private ip address of the endpoint.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * The public port to connect to.
     * 
     */
    private final @Nullable Integer publicPort;

    @OutputCustomType.Constructor
    private ApplicationGetEndpointResponse(
        @OutputCustomType.Parameter("destinationPort") @Nullable Integer destinationPort,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("privateIPAddress") @Nullable String privateIPAddress,
        @OutputCustomType.Parameter("publicPort") @Nullable Integer publicPort) {
        this.destinationPort = destinationPort;
        this.location = location;
        this.privateIPAddress = privateIPAddress;
        this.publicPort = publicPort;
    }

    /**
     * The destination port to connect to.
     * 
    */
    public Optional<Integer> getDestinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }
    /**
     * The location of the endpoint.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The private ip address of the endpoint.
     * 
    */
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * The public port to connect to.
     * 
    */
    public Optional<Integer> getPublicPort() {
        return Optional.ofNullable(this.publicPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGetEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer destinationPort;
        private @Nullable String location;
        private @Nullable String privateIPAddress;
        private @Nullable Integer publicPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGetEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPort = defaults.destinationPort;
    	      this.location = defaults.location;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicPort = defaults.publicPort;
        }

        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder publicPort(@Nullable Integer publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public ApplicationGetEndpointResponse build() {
            return new ApplicationGetEndpointResponse(destinationPort, location, privateIPAddress, publicPort);
        }
    }
}
