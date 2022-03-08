// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricIdentifier {
    /**
     * name is the name of the given metric
     * 
     */
    private final String name;
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    private final @Nullable LabelSelector selector;

    @OutputCustomType.Constructor({"name","selector"})
    private MetricIdentifier(
        String name,
        @Nullable LabelSelector selector) {
        this.name = name;
        this.selector = selector;
    }

    /**
     * name is the name of the given metric
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
    */
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricIdentifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable LabelSelector selector;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSelector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        public MetricIdentifier build() {
            return new MetricIdentifier(name, selector);
        }
    }
}
