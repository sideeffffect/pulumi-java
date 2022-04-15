// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    /**
     * The name of the ECS Cluster
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    public GetClusterArgs(String clusterName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
    }

    private GetClusterArgs() {
        this.clusterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }        public GetClusterArgs build() {
            return new GetClusterArgs(clusterName);
        }
    }
}
