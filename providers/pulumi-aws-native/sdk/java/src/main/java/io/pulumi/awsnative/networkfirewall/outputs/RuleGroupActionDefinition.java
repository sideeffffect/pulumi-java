// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupPublishMetricAction;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupActionDefinition {
    private final @Nullable RuleGroupPublishMetricAction publishMetricAction;

    @OutputCustomType.Constructor
    private RuleGroupActionDefinition(@OutputCustomType.Parameter("publishMetricAction") @Nullable RuleGroupPublishMetricAction publishMetricAction) {
        this.publishMetricAction = publishMetricAction;
    }

    public Optional<RuleGroupPublishMetricAction> getPublishMetricAction() {
        return Optional.ofNullable(this.publishMetricAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupPublishMetricAction publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder publishMetricAction(@Nullable RuleGroupPublishMetricAction publishMetricAction) {
            this.publishMetricAction = publishMetricAction;
            return this;
        }
        public RuleGroupActionDefinition build() {
            return new RuleGroupActionDefinition(publishMetricAction);
        }
    }
}
