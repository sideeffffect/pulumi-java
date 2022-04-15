// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class MetricStreamIncludeFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStreamIncludeFilterArgs Empty = new MetricStreamIncludeFilterArgs();

    /**
     * Name of the metric namespace in the filter.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    public MetricStreamIncludeFilterArgs(Output<String> namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private MetricStreamIncludeFilterArgs() {
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamIncludeFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamIncludeFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }        public MetricStreamIncludeFilterArgs build() {
            return new MetricStreamIncludeFilterArgs(namespace);
        }
    }
}
