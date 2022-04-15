// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkConfigurationArgs Empty = new ServiceNetworkConfigurationArgs();

    /**
     * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    @Import(name="assignPublicIp")
      private final @Nullable Output<Boolean> assignPublicIp;

    public Output<Boolean> assignPublicIp() {
        return this.assignPublicIp == null ? Codegen.empty() : this.assignPublicIp;
    }

    /**
     * Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> securityGroups() {
        return this.securityGroups == null ? Codegen.empty() : this.securityGroups;
    }

    /**
     * Subnets associated with the task or service.
     * 
     */
    @Import(name="subnets", required=true)
      private final Output<List<String>> subnets;

    public Output<List<String>> subnets() {
        return this.subnets;
    }

    public ServiceNetworkConfigurationArgs(
        @Nullable Output<Boolean> assignPublicIp,
        @Nullable Output<List<String>> securityGroups,
        Output<List<String>> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private ServiceNetworkConfigurationArgs() {
        this.assignPublicIp = Codegen.empty();
        this.securityGroups = Codegen.empty();
        this.subnets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> assignPublicIp;
        private @Nullable Output<List<String>> securityGroups;
        private Output<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable Output<Boolean> assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }
        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {
            this.assignPublicIp = Codegen.ofNullable(assignPublicIp);
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Codegen.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnets(Output<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Output.of(Objects.requireNonNull(subnets));
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }        public ServiceNetworkConfigurationArgs build() {
            return new ServiceNetworkConfigurationArgs(assignPublicIp, securityGroups, subnets);
        }
    }
}
