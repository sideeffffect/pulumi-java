// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DefaultSnatStatus contains the desired state of whether default sNAT should be disabled on the cluster.
 * 
 */
public final class DefaultSnatStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultSnatStatusArgs Empty = new DefaultSnatStatusArgs();

    /**
     * Disables cluster default sNAT rules.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    public DefaultSnatStatusArgs(@Nullable Output<Boolean> disabled) {
        this.disabled = disabled;
    }

    private DefaultSnatStatusArgs() {
        this.disabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSnatStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSnatStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }        public DefaultSnatStatusArgs build() {
            return new DefaultSnatStatusArgs(disabled);
        }
    }
}
