// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHubResponse {
    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String connectionStringPrimaryKey;
    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String connectionStringSecondaryKey;
    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
     */
    private final String createdTime;
    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String deadLetterSecret;
    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    private final @Nullable String deadLetterUri;
    /**
     * The type of Digital Twins endpoint
     * Expected value is 'EventHub'.
     * 
     */
    private final String endpointType;
    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    private final @Nullable String endpointUri;
    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
     */
    private final @Nullable String entityPath;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private EventHubResponse(
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("connectionStringPrimaryKey") @Nullable String connectionStringPrimaryKey,
        @CustomType.Parameter("connectionStringSecondaryKey") @Nullable String connectionStringSecondaryKey,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("deadLetterSecret") @Nullable String deadLetterSecret,
        @CustomType.Parameter("deadLetterUri") @Nullable String deadLetterUri,
        @CustomType.Parameter("endpointType") String endpointType,
        @CustomType.Parameter("endpointUri") @Nullable String endpointUri,
        @CustomType.Parameter("entityPath") @Nullable String entityPath,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.authenticationType = authenticationType;
        this.connectionStringPrimaryKey = connectionStringPrimaryKey;
        this.connectionStringSecondaryKey = connectionStringSecondaryKey;
        this.createdTime = createdTime;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = endpointType;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.provisioningState = provisioningState;
    }

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
    */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
    */
    public Optional<String> connectionStringPrimaryKey() {
        return Optional.ofNullable(this.connectionStringPrimaryKey);
    }
    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
    */
    public Optional<String> connectionStringSecondaryKey() {
        return Optional.ofNullable(this.connectionStringSecondaryKey);
    }
    /**
     * Time when the Endpoint was added to DigitalTwinsInstance.
     * 
    */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
    */
    public Optional<String> deadLetterSecret() {
        return Optional.ofNullable(this.deadLetterSecret);
    }
    /**
     * Dead letter storage URL for identity-based authentication.
     * 
    */
    public Optional<String> deadLetterUri() {
        return Optional.ofNullable(this.deadLetterUri);
    }
    /**
     * The type of Digital Twins endpoint
     * Expected value is 'EventHub'.
     * 
    */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
    */
    public Optional<String> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }
    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
    */
    public Optional<String> entityPath() {
        return Optional.ofNullable(this.entityPath);
    }
    /**
     * The provisioning state.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private @Nullable String connectionStringPrimaryKey;
        private @Nullable String connectionStringSecondaryKey;
        private String createdTime;
        private @Nullable String deadLetterSecret;
        private @Nullable String deadLetterUri;
        private String endpointType;
        private @Nullable String endpointUri;
        private @Nullable String entityPath;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionStringPrimaryKey = defaults.connectionStringPrimaryKey;
    	      this.connectionStringSecondaryKey = defaults.connectionStringSecondaryKey;
    	      this.createdTime = defaults.createdTime;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder connectionStringPrimaryKey(@Nullable String connectionStringPrimaryKey) {
            this.connectionStringPrimaryKey = connectionStringPrimaryKey;
            return this;
        }
        public Builder connectionStringSecondaryKey(@Nullable String connectionStringSecondaryKey) {
            this.connectionStringSecondaryKey = connectionStringSecondaryKey;
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public EventHubResponse build() {
            return new EventHubResponse(authenticationType, connectionStringPrimaryKey, connectionStringSecondaryKey, createdTime, deadLetterSecret, deadLetterUri, endpointType, endpointUri, entityPath, provisioningState);
        }
    }
}
