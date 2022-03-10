// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.enums.TaskSetAwsVpcConfigurationAssignPublicIp;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskSetAwsVpcConfiguration {
    /**
     * Whether the task's elastic network interface receives a public IP address. The default value is DISABLED.
     * 
     */
    private final @Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp;
    /**
     * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
     * 
     */
    private final List<String> subnets;

    @OutputCustomType.Constructor
    private TaskSetAwsVpcConfiguration(
        @OutputCustomType.Parameter("assignPublicIp") @Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp,
        @OutputCustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @OutputCustomType.Parameter("subnets") List<String> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = subnets;
    }

    /**
     * Whether the task's elastic network interface receives a public IP address. The default value is DISABLED.
     * 
    */
    public Optional<TaskSetAwsVpcConfigurationAssignPublicIp> getAssignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
     * 
    */
    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
     * 
    */
    public List<String> getSubnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetAwsVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp;
        private @Nullable List<String> securityGroups;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetAwsVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp) {
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
        public TaskSetAwsVpcConfiguration build() {
            return new TaskSetAwsVpcConfiguration(assignPublicIp, securityGroups, subnets);
        }
    }
}
