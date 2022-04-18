// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.CustomScaleRuleResponse;
import com.pulumi.azurenative.web.inputs.HttpScaleRuleResponse;
import com.pulumi.azurenative.web.inputs.QueueScaleRuleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container scaling rule.
 * 
 */
public final class ScaleRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScaleRuleResponse Empty = new ScaleRuleResponse();

    /**
     * Azure Queue based scaling.
     * 
     */
    @Import(name="azureQueue")
      private final @Nullable QueueScaleRuleResponse azureQueue;

    public Optional<QueueScaleRuleResponse> azureQueue() {
        return this.azureQueue == null ? Optional.empty() : Optional.ofNullable(this.azureQueue);
    }

    /**
     * Custom scale rule.
     * 
     */
    @Import(name="custom")
      private final @Nullable CustomScaleRuleResponse custom;

    public Optional<CustomScaleRuleResponse> custom() {
        return this.custom == null ? Optional.empty() : Optional.ofNullable(this.custom);
    }

    /**
     * HTTP requests based scaling.
     * 
     */
    @Import(name="http")
      private final @Nullable HttpScaleRuleResponse http;

    public Optional<HttpScaleRuleResponse> http() {
        return this.http == null ? Optional.empty() : Optional.ofNullable(this.http);
    }

    /**
     * Scale Rule Name
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public ScaleRuleResponse(
        @Nullable QueueScaleRuleResponse azureQueue,
        @Nullable CustomScaleRuleResponse custom,
        @Nullable HttpScaleRuleResponse http,
        @Nullable String name) {
        this.azureQueue = azureQueue;
        this.custom = custom;
        this.http = http;
        this.name = name;
    }

    private ScaleRuleResponse() {
        this.azureQueue = null;
        this.custom = null;
        this.http = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QueueScaleRuleResponse azureQueue;
        private @Nullable CustomScaleRuleResponse custom;
        private @Nullable HttpScaleRuleResponse http;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureQueue = defaults.azureQueue;
    	      this.custom = defaults.custom;
    	      this.http = defaults.http;
    	      this.name = defaults.name;
        }

        public Builder azureQueue(@Nullable QueueScaleRuleResponse azureQueue) {
            this.azureQueue = azureQueue;
            return this;
        }
        public Builder custom(@Nullable CustomScaleRuleResponse custom) {
            this.custom = custom;
            return this;
        }
        public Builder http(@Nullable HttpScaleRuleResponse http) {
            this.http = http;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public ScaleRuleResponse build() {
            return new ScaleRuleResponse(azureQueue, custom, http, name);
        }
    }
}
