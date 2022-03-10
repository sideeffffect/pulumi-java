// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceNetworkConfiguration {
    /**
     * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    private final @Nullable Boolean assignPublicIp;
    /**
     * Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * Subnets associated with the task or service.
     * 
     */
    private final List<String> subnets;

    @OutputCustomType.Constructor
    private ServiceNetworkConfiguration(
        @OutputCustomType.Parameter("assignPublicIp") @Nullable Boolean assignPublicIp,
        @OutputCustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @OutputCustomType.Parameter("subnets") List<String> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = subnets;
    }

    /**
     * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
    */
    public Optional<Boolean> getAssignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
    */
    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * Subnets associated with the task or service.
     * 
    */
    public List<String> getSubnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean assignPublicIp;
        private @Nullable List<String> securityGroups;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public ServiceNetworkConfiguration build() {
            return new ServiceNetworkConfiguration(assignPublicIp, securityGroups, subnets);
        }
    }
}
