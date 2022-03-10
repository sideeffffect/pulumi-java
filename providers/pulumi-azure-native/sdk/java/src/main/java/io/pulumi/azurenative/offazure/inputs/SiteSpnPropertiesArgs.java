// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class for site properties.
 * 
 */
public final class SiteSpnPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteSpnPropertiesArgs Empty = new SiteSpnPropertiesArgs();

    /**
     * AAD Authority URL which was used to request the token for the service principal.
     * 
     */
    @InputImport(name="aadAuthority")
      private final @Nullable Input<String> aadAuthority;

    public Input<String> getAadAuthority() {
        return this.aadAuthority == null ? Input.empty() : this.aadAuthority;
    }

    /**
     * Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * Intended audience for the service principal.
     * 
     */
    @InputImport(name="audience")
      private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="objectId")
      private final @Nullable Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId == null ? Input.empty() : this.objectId;
    }

    /**
     * Raw certificate data for building certificate expiry flows.
     * 
     */
    @InputImport(name="rawCertData")
      private final @Nullable Input<String> rawCertData;

    public Input<String> getRawCertData() {
        return this.rawCertData == null ? Input.empty() : this.rawCertData;
    }

    /**
     * Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public SiteSpnPropertiesArgs(
        @Nullable Input<String> aadAuthority,
        @Nullable Input<String> applicationId,
        @Nullable Input<String> audience,
        @Nullable Input<String> objectId,
        @Nullable Input<String> rawCertData,
        @Nullable Input<String> tenantId) {
        this.aadAuthority = aadAuthority;
        this.applicationId = applicationId;
        this.audience = audience;
        this.objectId = objectId;
        this.rawCertData = rawCertData;
        this.tenantId = tenantId;
    }

    private SiteSpnPropertiesArgs() {
        this.aadAuthority = Input.empty();
        this.applicationId = Input.empty();
        this.audience = Input.empty();
        this.objectId = Input.empty();
        this.rawCertData = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteSpnPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aadAuthority;
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> audience;
        private @Nullable Input<String> objectId;
        private @Nullable Input<String> rawCertData;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteSpnPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthority = defaults.aadAuthority;
    	      this.applicationId = defaults.applicationId;
    	      this.audience = defaults.audience;
    	      this.objectId = defaults.objectId;
    	      this.rawCertData = defaults.rawCertData;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder aadAuthority(@Nullable Input<String> aadAuthority) {
            this.aadAuthority = aadAuthority;
            return this;
        }

        public Builder aadAuthority(@Nullable String aadAuthority) {
            this.aadAuthority = Input.ofNullable(aadAuthority);
            return this;
        }

        public Builder applicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder audience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder objectId(@Nullable Input<String> objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder objectId(@Nullable String objectId) {
            this.objectId = Input.ofNullable(objectId);
            return this;
        }

        public Builder rawCertData(@Nullable Input<String> rawCertData) {
            this.rawCertData = rawCertData;
            return this;
        }

        public Builder rawCertData(@Nullable String rawCertData) {
            this.rawCertData = Input.ofNullable(rawCertData);
            return this;
        }

        public Builder tenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }
        public SiteSpnPropertiesArgs build() {
            return new SiteSpnPropertiesArgs(aadAuthority, applicationId, audience, objectId, rawCertData, tenantId);
        }
    }
}
