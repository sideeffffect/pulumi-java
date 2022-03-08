// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetJobQueueComputeEnvironmentOrder {
    private final String computeEnvironment;
    private final Integer order;

    @OutputCustomType.Constructor({"computeEnvironment","order"})
    private GetJobQueueComputeEnvironmentOrder(
        String computeEnvironment,
        Integer order) {
        this.computeEnvironment = computeEnvironment;
        this.order = order;
    }

    public String getComputeEnvironment() {
        return this.computeEnvironment;
    }
    public Integer getOrder() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobQueueComputeEnvironmentOrder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeEnvironment;
        private Integer order;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobQueueComputeEnvironmentOrder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnvironment = defaults.computeEnvironment;
    	      this.order = defaults.order;
        }

        public Builder setComputeEnvironment(String computeEnvironment) {
            this.computeEnvironment = Objects.requireNonNull(computeEnvironment);
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public GetJobQueueComputeEnvironmentOrder build() {
            return new GetJobQueueComputeEnvironmentOrder(computeEnvironment, order);
        }
    }
}
