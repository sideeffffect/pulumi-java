// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricValueStatusArgs;
import java.lang.String;
import java.util.Objects;


/**
 * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
 * 
 */
public final class ResourceMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceMetricStatusArgs Empty = new ResourceMetricStatusArgs();

    /**
     * current contains the current value for the given metric
     * 
     */
    @InputImport(name="current", required=true)
      private final Input<MetricValueStatusArgs> current;

    public Input<MetricValueStatusArgs> getCurrent() {
        return this.current;
    }

    /**
     * Name is the name of the resource in question.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ResourceMetricStatusArgs(
        Input<MetricValueStatusArgs> current,
        Input<String> name) {
        this.current = Objects.requireNonNull(current, "expected parameter 'current' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ResourceMetricStatusArgs() {
        this.current = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MetricValueStatusArgs> current;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.name = defaults.name;
        }

        public Builder current(Input<MetricValueStatusArgs> current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder current(MetricValueStatusArgs current) {
            this.current = Input.of(Objects.requireNonNull(current));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public ResourceMetricStatusArgs build() {
            return new ResourceMetricStatusArgs(current, name);
        }
    }
}
