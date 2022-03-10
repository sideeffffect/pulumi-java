// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackendResponse {
    /**
     * Location of the backend (IP address or FQDN)
     * 
     */
    private final @Nullable String address;
    /**
     * The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
     */
    private final @Nullable String backendHostHeader;
    /**
     * Whether to enable use of this backend. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    private final @Nullable String enabledState;
    /**
     * The HTTP TCP port number. Must be between 1 and 65535.
     * 
     */
    private final @Nullable Integer httpPort;
    /**
     * The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     */
    private final @Nullable Integer httpsPort;
    /**
     * Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The Approval status for the connection to the Private Link
     * 
     */
    private final String privateEndpointStatus;
    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    private final @Nullable String privateLinkAlias;
    /**
     * A custom message to be included in the approval request to connect to the Private Link
     * 
     */
    private final @Nullable String privateLinkApprovalMessage;
    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    private final @Nullable String privateLinkLocation;
    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    private final @Nullable String privateLinkResourceId;
    /**
     * Weight of this endpoint for load balancing purposes.
     * 
     */
    private final @Nullable Integer weight;

    @OutputCustomType.Constructor
    private BackendResponse(
        @OutputCustomType.Parameter("address") @Nullable String address,
        @OutputCustomType.Parameter("backendHostHeader") @Nullable String backendHostHeader,
        @OutputCustomType.Parameter("enabledState") @Nullable String enabledState,
        @OutputCustomType.Parameter("httpPort") @Nullable Integer httpPort,
        @OutputCustomType.Parameter("httpsPort") @Nullable Integer httpsPort,
        @OutputCustomType.Parameter("priority") @Nullable Integer priority,
        @OutputCustomType.Parameter("privateEndpointStatus") String privateEndpointStatus,
        @OutputCustomType.Parameter("privateLinkAlias") @Nullable String privateLinkAlias,
        @OutputCustomType.Parameter("privateLinkApprovalMessage") @Nullable String privateLinkApprovalMessage,
        @OutputCustomType.Parameter("privateLinkLocation") @Nullable String privateLinkLocation,
        @OutputCustomType.Parameter("privateLinkResourceId") @Nullable String privateLinkResourceId,
        @OutputCustomType.Parameter("weight") @Nullable Integer weight) {
        this.address = address;
        this.backendHostHeader = backendHostHeader;
        this.enabledState = enabledState;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.priority = priority;
        this.privateEndpointStatus = privateEndpointStatus;
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.weight = weight;
    }

    /**
     * Location of the backend (IP address or FQDN)
     * 
    */
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    /**
     * The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
    */
    public Optional<String> getBackendHostHeader() {
        return Optional.ofNullable(this.backendHostHeader);
    }
    /**
     * Whether to enable use of this backend. Permitted values are 'Enabled' or 'Disabled'
     * 
    */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * The HTTP TCP port number. Must be between 1 and 65535.
     * 
    */
    public Optional<Integer> getHttpPort() {
        return Optional.ofNullable(this.httpPort);
    }
    /**
     * The HTTPS TCP port number. Must be between 1 and 65535.
     * 
    */
    public Optional<Integer> getHttpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }
    /**
     * Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The Approval status for the connection to the Private Link
     * 
    */
    public String getPrivateEndpointStatus() {
        return this.privateEndpointStatus;
    }
    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
    */
    public Optional<String> getPrivateLinkAlias() {
        return Optional.ofNullable(this.privateLinkAlias);
    }
    /**
     * A custom message to be included in the approval request to connect to the Private Link
     * 
    */
    public Optional<String> getPrivateLinkApprovalMessage() {
        return Optional.ofNullable(this.privateLinkApprovalMessage);
    }
    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
    */
    public Optional<String> getPrivateLinkLocation() {
        return Optional.ofNullable(this.privateLinkLocation);
    }
    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
    */
    public Optional<String> getPrivateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }
    /**
     * Weight of this endpoint for load balancing purposes.
     * 
    */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String backendHostHeader;
        private @Nullable String enabledState;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private @Nullable Integer priority;
        private String privateEndpointStatus;
        private @Nullable String privateLinkAlias;
        private @Nullable String privateLinkApprovalMessage;
        private @Nullable String privateLinkLocation;
        private @Nullable String privateLinkResourceId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.backendHostHeader = defaults.backendHostHeader;
    	      this.enabledState = defaults.enabledState;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.priority = defaults.priority;
    	      this.privateEndpointStatus = defaults.privateEndpointStatus;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.weight = defaults.weight;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder backendHostHeader(@Nullable String backendHostHeader) {
            this.backendHostHeader = backendHostHeader;
            return this;
        }

        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder httpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }

        public Builder httpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder privateEndpointStatus(String privateEndpointStatus) {
            this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus);
            return this;
        }

        public Builder privateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }

        public Builder privateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }

        public Builder privateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public BackendResponse build() {
            return new BackendResponse(address, backendHostHeader, enabledState, httpPort, httpsPort, priority, privateEndpointStatus, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, weight);
        }
    }
}
