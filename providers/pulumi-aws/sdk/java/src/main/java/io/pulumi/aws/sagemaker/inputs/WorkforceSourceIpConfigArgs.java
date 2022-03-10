// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkforceSourceIpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkforceSourceIpConfigArgs Empty = new WorkforceSourceIpConfigArgs();

    /**
     * A list of up to 10 CIDR values.
     * 
     */
    @InputImport(name="cidrs", required=true)
      private final Input<List<String>> cidrs;

    public Input<List<String>> getCidrs() {
        return this.cidrs;
    }

    public WorkforceSourceIpConfigArgs(Input<List<String>> cidrs) {
        this.cidrs = Objects.requireNonNull(cidrs, "expected parameter 'cidrs' to be non-null");
    }

    private WorkforceSourceIpConfigArgs() {
        this.cidrs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceSourceIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> cidrs;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceSourceIpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
        }

        public Builder cidrs(Input<List<String>> cidrs) {
            this.cidrs = Objects.requireNonNull(cidrs);
            return this;
        }

        public Builder cidrs(List<String> cidrs) {
            this.cidrs = Input.of(Objects.requireNonNull(cidrs));
            return this;
        }
        public WorkforceSourceIpConfigArgs build() {
            return new WorkforceSourceIpConfigArgs(cidrs);
        }
    }
}
