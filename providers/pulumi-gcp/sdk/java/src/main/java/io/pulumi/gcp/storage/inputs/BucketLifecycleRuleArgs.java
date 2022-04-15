// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs;
import java.util.Objects;


public final class BucketLifecycleRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleArgs Empty = new BucketLifecycleRuleArgs();

    /**
     * The Lifecycle Rule's action configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @Import(name="action", required=true)
      private final Output<BucketLifecycleRuleActionArgs> action;

    public Output<BucketLifecycleRuleActionArgs> action() {
        return this.action;
    }

    /**
     * The Lifecycle Rule's condition configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @Import(name="condition", required=true)
      private final Output<BucketLifecycleRuleConditionArgs> condition;

    public Output<BucketLifecycleRuleConditionArgs> condition() {
        return this.condition;
    }

    public BucketLifecycleRuleArgs(
        Output<BucketLifecycleRuleActionArgs> action,
        Output<BucketLifecycleRuleConditionArgs> condition) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
    }

    private BucketLifecycleRuleArgs() {
        this.action = Codegen.empty();
        this.condition = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BucketLifecycleRuleActionArgs> action;
        private Output<BucketLifecycleRuleConditionArgs> condition;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
        }

        public Builder action(Output<BucketLifecycleRuleActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(BucketLifecycleRuleActionArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder condition(Output<BucketLifecycleRuleConditionArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder condition(BucketLifecycleRuleConditionArgs condition) {
            this.condition = Output.of(Objects.requireNonNull(condition));
            return this;
        }        public BucketLifecycleRuleArgs build() {
            return new BucketLifecycleRuleArgs(action, condition);
        }
    }
}
