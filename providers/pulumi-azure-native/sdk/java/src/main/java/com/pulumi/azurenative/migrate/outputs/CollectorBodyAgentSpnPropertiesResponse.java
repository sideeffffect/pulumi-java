// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CollectorBodyAgentSpnPropertiesResponse {
    /**
     * Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String applicationId;
    /**
     * Intended audience for the service principal.
     * 
     */
    private final @Nullable String audience;
    /**
     * AAD Authority URL which was used to request the token for the service principal.
     * 
     */
    private final @Nullable String authority;
    /**
     * Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String objectId;
    /**
     * Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private CollectorBodyAgentSpnPropertiesResponse(
        @CustomType.Parameter("applicationId") @Nullable String applicationId,
        @CustomType.Parameter("audience") @Nullable String audience,
        @CustomType.Parameter("authority") @Nullable String authority,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.applicationId = applicationId;
        this.audience = audience;
        this.authority = authority;
        this.objectId = objectId;
        this.tenantId = tenantId;
    }

    /**
     * Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
    */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * Intended audience for the service principal.
     * 
    */
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * AAD Authority URL which was used to request the token for the service principal.
     * 
    */
    public Optional<String> authority() {
        return Optional.ofNullable(this.authority);
    }
    /**
     * Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
    */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectorBodyAgentSpnPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String audience;
        private @Nullable String authority;
        private @Nullable String objectId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectorBodyAgentSpnPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }
        public Builder authority(@Nullable String authority) {
            this.authority = authority;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public CollectorBodyAgentSpnPropertiesResponse build() {
            return new CollectorBodyAgentSpnPropertiesResponse(applicationId, audience, authority, objectId, tenantId);
        }
    }
}
