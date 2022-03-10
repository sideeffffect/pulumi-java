// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicyPublishMetricAction;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyActionDefinition {
    private final @Nullable FirewallPolicyPublishMetricAction publishMetricAction;

    @OutputCustomType.Constructor
    private FirewallPolicyActionDefinition(@OutputCustomType.Parameter("publishMetricAction") @Nullable FirewallPolicyPublishMetricAction publishMetricAction) {
        this.publishMetricAction = publishMetricAction;
    }

    public Optional<FirewallPolicyPublishMetricAction> getPublishMetricAction() {
        return Optional.ofNullable(this.publishMetricAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyPublishMetricAction publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder publishMetricAction(@Nullable FirewallPolicyPublishMetricAction publishMetricAction) {
            this.publishMetricAction = publishMetricAction;
            return this;
        }
        public FirewallPolicyActionDefinition build() {
            return new FirewallPolicyActionDefinition(publishMetricAction);
        }
    }
}
