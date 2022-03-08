// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogicAppReceiverResponse {
    /**
     * The callback url where http request sent to.
     * 
     */
    private final String callbackUrl;
    /**
     * The name of the logic app receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * The azure resource id of the logic app receiver.
     * 
     */
    private final String resourceId;
    /**
     * Indicates whether to use common alert schema.
     * 
     */
    private final @Nullable Boolean useCommonAlertSchema;

    @OutputCustomType.Constructor({"callbackUrl","name","resourceId","useCommonAlertSchema"})
    private LogicAppReceiverResponse(
        String callbackUrl,
        String name,
        String resourceId,
        @Nullable Boolean useCommonAlertSchema) {
        this.callbackUrl = callbackUrl;
        this.name = name;
        this.resourceId = resourceId;
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * The callback url where http request sent to.
     * 
    */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    /**
     * The name of the logic app receiver. Names must be unique across all receivers within an action group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The azure resource id of the logic app receiver.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Indicates whether to use common alert schema.
     * 
    */
    public Optional<Boolean> getUseCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogicAppReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callbackUrl;
        private String name;
        private String resourceId;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(LogicAppReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder setCallbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }
        public LogicAppReceiverResponse build() {
            return new LogicAppReceiverResponse(callbackUrl, name, resourceId, useCommonAlertSchema);
        }
    }
}
