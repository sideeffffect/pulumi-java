// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties related to ServiceBus.
 * 
 */
public final class ServiceBusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceBusResponse Empty = new ServiceBusResponse();

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
     */
    @InputImport(name="createdTime", required=true)
      private final String createdTime;

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    @InputImport(name="deadLetterSecret")
      private final @Nullable String deadLetterSecret;

    public Optional<String> getDeadLetterSecret() {
        return this.deadLetterSecret == null ? Optional.empty() : Optional.ofNullable(this.deadLetterSecret);
    }

    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    @InputImport(name="deadLetterUri")
      private final @Nullable String deadLetterUri;

    public Optional<String> getDeadLetterUri() {
        return this.deadLetterUri == null ? Optional.empty() : Optional.ofNullable(this.deadLetterUri);
    }

    /**
     * The type of Digital Twins endpoint
     * Expected value is 'ServiceBus'.
     * 
     */
    @InputImport(name="endpointType", required=true)
      private final String endpointType;

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * The URL of the ServiceBus namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    @InputImport(name="endpointUri")
      private final @Nullable String endpointUri;

    public Optional<String> getEndpointUri() {
        return this.endpointUri == null ? Optional.empty() : Optional.ofNullable(this.endpointUri);
    }

    /**
     * The ServiceBus Topic name for identity-based authentication
     * 
     */
    @InputImport(name="entityPath")
      private final @Nullable String entityPath;

    public Optional<String> getEntityPath() {
        return this.entityPath == null ? Optional.empty() : Optional.ofNullable(this.entityPath);
    }

    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @InputImport(name="primaryConnectionString")
      private final @Nullable String primaryConnectionString;

    public Optional<String> getPrimaryConnectionString() {
        return this.primaryConnectionString == null ? Optional.empty() : Optional.ofNullable(this.primaryConnectionString);
    }

    /**
     * The provisioning state.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @InputImport(name="secondaryConnectionString")
      private final @Nullable String secondaryConnectionString;

    public Optional<String> getSecondaryConnectionString() {
        return this.secondaryConnectionString == null ? Optional.empty() : Optional.ofNullable(this.secondaryConnectionString);
    }

    public ServiceBusResponse(
        @Nullable String authenticationType,
        String createdTime,
        @Nullable String deadLetterSecret,
        @Nullable String deadLetterUri,
        String endpointType,
        @Nullable String endpointUri,
        @Nullable String entityPath,
        @Nullable String primaryConnectionString,
        String provisioningState,
        @Nullable String secondaryConnectionString) {
        this.authenticationType = authenticationType;
        this.createdTime = Objects.requireNonNull(createdTime, "expected parameter 'createdTime' to be non-null");
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.primaryConnectionString = primaryConnectionString;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.secondaryConnectionString = secondaryConnectionString;
    }

    private ServiceBusResponse() {
        this.authenticationType = null;
        this.createdTime = null;
        this.deadLetterSecret = null;
        this.deadLetterUri = null;
        this.endpointType = null;
        this.endpointUri = null;
        this.entityPath = null;
        this.primaryConnectionString = null;
        this.provisioningState = null;
        this.secondaryConnectionString = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private String createdTime;
        private @Nullable String deadLetterSecret;
        private @Nullable String deadLetterUri;
        private String endpointType;
        private @Nullable String endpointUri;
        private @Nullable String entityPath;
        private @Nullable String primaryConnectionString;
        private String provisioningState;
        private @Nullable String secondaryConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.createdTime = defaults.createdTime;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.provisioningState = defaults.provisioningState;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder deadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }

        public Builder deadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder entityPath(@Nullable String entityPath) {
            this.entityPath = entityPath;
            return this;
        }

        public Builder primaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder secondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }
        public ServiceBusResponse build() {
            return new ServiceBusResponse(authenticationType, createdTime, deadLetterSecret, deadLetterUri, endpointType, endpointUri, entityPath, primaryConnectionString, provisioningState, secondaryConnectionString);
        }
    }
}
