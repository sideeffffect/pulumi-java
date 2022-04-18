// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify properties of default content key for each encryption scheme
 * 
 */
public final class DefaultKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final DefaultKeyResponse Empty = new DefaultKeyResponse();

    /**
     * Label can be used to specify Content Key when creating a Streaming Locator
     * 
     */
    @Import(name="label")
      private final @Nullable String label;

    public Optional<String> label() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * Policy used by Default Key
     * 
     */
    @Import(name="policyName")
      private final @Nullable String policyName;

    public Optional<String> policyName() {
        return this.policyName == null ? Optional.empty() : Optional.ofNullable(this.policyName);
    }

    public DefaultKeyResponse(
        @Nullable String label,
        @Nullable String policyName) {
        this.label = label;
        this.policyName = policyName;
    }

    private DefaultKeyResponse() {
        this.label = null;
        this.policyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String label;
        private @Nullable String policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.policyName = defaults.policyName;
        }

        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }        public DefaultKeyResponse build() {
            return new DefaultKeyResponse(label, policyName);
        }
    }
}
