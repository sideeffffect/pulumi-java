// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A webhook receiver.
 * 
 */
public final class WebhookReceiverResponse extends com.pulumi.resources.InvokeArgs {

    public static final WebhookReceiverResponse Empty = new WebhookReceiverResponse();

    /**
     * Indicates the identifier uri for aad auth.
     * 
     */
    @Import(name="identifierUri")
      private final @Nullable String identifierUri;

    public Optional<String> identifierUri() {
        return this.identifierUri == null ? Optional.empty() : Optional.ofNullable(this.identifierUri);
    }

    /**
     * The name of the webhook receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Indicates the webhook app object Id for aad auth.
     * 
     */
    @Import(name="objectId")
      private final @Nullable String objectId;

    public Optional<String> objectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    /**
     * The URI where webhooks should be sent.
     * 
     */
    @Import(name="serviceUri", required=true)
      private final String serviceUri;

    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Indicates the tenant id for aad auth.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> tenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * Indicates whether or not use AAD authentication.
     * 
     */
    @Import(name="useAadAuth")
      private final @Nullable Boolean useAadAuth;

    public Optional<Boolean> useAadAuth() {
        return this.useAadAuth == null ? Optional.empty() : Optional.ofNullable(this.useAadAuth);
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
      private final @Nullable Boolean useCommonAlertSchema;

    public Optional<Boolean> useCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Optional.empty() : Optional.ofNullable(this.useCommonAlertSchema);
    }

    public WebhookReceiverResponse(
        @Nullable String identifierUri,
        String name,
        @Nullable String objectId,
        String serviceUri,
        @Nullable String tenantId,
        @Nullable Boolean useAadAuth,
        @Nullable Boolean useCommonAlertSchema) {
        this.identifierUri = identifierUri;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.objectId = objectId;
        this.serviceUri = Objects.requireNonNull(serviceUri, "expected parameter 'serviceUri' to be non-null");
        this.tenantId = tenantId;
        this.useAadAuth = useAadAuth == null ? false : useAadAuth;
        this.useCommonAlertSchema = useCommonAlertSchema == null ? false : useCommonAlertSchema;
    }

    private WebhookReceiverResponse() {
        this.identifierUri = null;
        this.name = null;
        this.objectId = null;
        this.serviceUri = null;
        this.tenantId = null;
        this.useAadAuth = null;
        this.useCommonAlertSchema = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identifierUri;
        private String name;
        private @Nullable String objectId;
        private String serviceUri;
        private @Nullable String tenantId;
        private @Nullable Boolean useAadAuth;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifierUri = defaults.identifierUri;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.serviceUri = defaults.serviceUri;
    	      this.tenantId = defaults.tenantId;
    	      this.useAadAuth = defaults.useAadAuth;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder identifierUri(@Nullable String identifierUri) {
            this.identifierUri = identifierUri;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder serviceUri(String serviceUri) {
            this.serviceUri = Objects.requireNonNull(serviceUri);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder useAadAuth(@Nullable Boolean useAadAuth) {
            this.useAadAuth = useAadAuth;
            return this;
        }
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }        public WebhookReceiverResponse build() {
            return new WebhookReceiverResponse(identifierUri, name, objectId, serviceUri, tenantId, useAadAuth, useCommonAlertSchema);
        }
    }
}
