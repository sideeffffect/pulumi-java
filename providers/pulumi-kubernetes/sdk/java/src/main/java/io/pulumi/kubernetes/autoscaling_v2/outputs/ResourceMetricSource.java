// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricTarget;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceMetricSource {
    /**
     * name is the name of the resource in question.
     * 
     */
    private final String name;
    /**
     * target specifies the target value for the given metric
     * 
     */
    private final MetricTarget target;

    @OutputCustomType.Constructor
    private ResourceMetricSource(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("target") MetricTarget target) {
        this.name = name;
        this.target = target;
    }

    /**
     * name is the name of the resource in question.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * target specifies the target value for the given metric
     * 
    */
    public MetricTarget getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private MetricTarget target;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder target(MetricTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ResourceMetricSource build() {
            return new ResourceMetricSource(name, target);
        }
    }
}
