// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Override a RuleGroup or ManagedRuleGroup behavior. This can only be applied to Rule that has RuleGroupReferenceStatement or ManagedRuleGroupReferenceStatement.
 * 
 */
public final class WebACLOverrideActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLOverrideActionArgs Empty = new WebACLOverrideActionArgs();

    /**
     * Count traffic towards application.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<Object> count;

    public Input<Object> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Keep the RuleGroup or ManagedRuleGroup behavior as is.
     * 
     */
    @InputImport(name="none")
      private final @Nullable Input<Object> none;

    public Input<Object> getNone() {
        return this.none == null ? Input.empty() : this.none;
    }

    public WebACLOverrideActionArgs(
        @Nullable Input<Object> count,
        @Nullable Input<Object> none) {
        this.count = count;
        this.none = none;
    }

    private WebACLOverrideActionArgs() {
        this.count = Input.empty();
        this.none = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLOverrideActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> count;
        private @Nullable Input<Object> none;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLOverrideActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.none = defaults.none;
        }

        public Builder count(@Nullable Input<Object> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable Object count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder none(@Nullable Input<Object> none) {
            this.none = none;
            return this;
        }

        public Builder none(@Nullable Object none) {
            this.none = Input.ofNullable(none);
            return this;
        }
        public WebACLOverrideActionArgs build() {
            return new WebACLOverrideActionArgs(count, none);
        }
    }
}
