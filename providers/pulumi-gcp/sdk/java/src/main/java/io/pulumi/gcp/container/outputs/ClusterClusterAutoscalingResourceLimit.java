// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterAutoscalingResourceLimit {
    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    private final @Nullable Integer maximum;
    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    private final @Nullable Integer minimum;
    /**
     * The type of the resource. For example, `cpu` and
     * `memory`.  See the [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
     * for a list of types.
     * 
     */
    private final String resourceType;

    @CustomType.Constructor
    private ClusterClusterAutoscalingResourceLimit(
        @CustomType.Parameter("maximum") @Nullable Integer maximum,
        @CustomType.Parameter("minimum") @Nullable Integer minimum,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.resourceType = resourceType;
    }

    /**
     * Maximum amount of the resource in the cluster.
     * 
    */
    public Optional<Integer> maximum() {
        return Optional.ofNullable(this.maximum);
    }
    /**
     * Minimum amount of the resource in the cluster.
     * 
    */
    public Optional<Integer> minimum() {
        return Optional.ofNullable(this.minimum);
    }
    /**
     * The type of the resource. For example, `cpu` and
     * `memory`.  See the [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
     * for a list of types.
     * 
    */
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAutoscalingResourceLimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maximum;
        private @Nullable Integer minimum;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterAutoscalingResourceLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder maximum(@Nullable Integer maximum) {
            this.maximum = maximum;
            return this;
        }
        public Builder minimum(@Nullable Integer minimum) {
            this.minimum = minimum;
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public ClusterClusterAutoscalingResourceLimit build() {
            return new ClusterClusterAutoscalingResourceLimit(maximum, minimum, resourceType);
        }
    }
}
