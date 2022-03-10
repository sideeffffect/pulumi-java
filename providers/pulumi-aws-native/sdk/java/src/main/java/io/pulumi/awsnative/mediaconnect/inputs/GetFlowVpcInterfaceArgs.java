// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFlowVpcInterfaceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFlowVpcInterfaceArgs Empty = new GetFlowVpcInterfaceArgs();

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     */
    @InputImport(name="flowArn", required=true)
      private final String flowArn;

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * Immutable and has to be a unique against other VpcInterfaces in this Flow.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetFlowVpcInterfaceArgs(
        String flowArn,
        String name) {
        this.flowArn = Objects.requireNonNull(flowArn, "expected parameter 'flowArn' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetFlowVpcInterfaceArgs() {
        this.flowArn = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowVpcInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flowArn;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowVpcInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowArn = defaults.flowArn;
    	      this.name = defaults.name;
        }

        public Builder flowArn(String flowArn) {
            this.flowArn = Objects.requireNonNull(flowArn);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetFlowVpcInterfaceArgs build() {
            return new GetFlowVpcInterfaceArgs(flowArn, name);
        }
    }
}
