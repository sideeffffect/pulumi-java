// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEc2AttributesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEc2AttributesGetArgs Empty = new ClusterEc2AttributesGetArgs();

    /**
     * String containing a comma separated list of additional Amazon EC2 security group IDs for the master node.
     * 
     */
    @Import(name="additionalMasterSecurityGroups")
    private @Nullable Output<String> additionalMasterSecurityGroups;

    public Optional<Output<String>> additionalMasterSecurityGroups() {
        return Optional.ofNullable(this.additionalMasterSecurityGroups);
    }

    /**
     * String containing a comma separated list of additional Amazon EC2 security group IDs for the slave nodes as a comma separated string.
     * 
     */
    @Import(name="additionalSlaveSecurityGroups")
    private @Nullable Output<String> additionalSlaveSecurityGroups;

    public Optional<Output<String>> additionalSlaveSecurityGroups() {
        return Optional.ofNullable(this.additionalSlaveSecurityGroups);
    }

    /**
     * Identifier of the Amazon EC2 EMR-Managed security group for the master node.
     * 
     */
    @Import(name="emrManagedMasterSecurityGroup")
    private @Nullable Output<String> emrManagedMasterSecurityGroup;

    public Optional<Output<String>> emrManagedMasterSecurityGroup() {
        return Optional.ofNullable(this.emrManagedMasterSecurityGroup);
    }

    /**
     * Identifier of the Amazon EC2 EMR-Managed security group for the slave nodes.
     * 
     */
    @Import(name="emrManagedSlaveSecurityGroup")
    private @Nullable Output<String> emrManagedSlaveSecurityGroup;

    public Optional<Output<String>> emrManagedSlaveSecurityGroup() {
        return Optional.ofNullable(this.emrManagedSlaveSecurityGroup);
    }

    /**
     * Instance Profile for EC2 instances of the cluster assume this role.
     * 
     */
    @Import(name="instanceProfile", required=true)
    private Output<String> instanceProfile;

    public Output<String> instanceProfile() {
        return this.instanceProfile;
    }

    /**
     * Amazon EC2 key pair that can be used to ssh to the master node as the user called `hadoop`.
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * Identifier of the Amazon EC2 service-access security group - required when the cluster runs on a private subnet.
     * 
     */
    @Import(name="serviceAccessSecurityGroup")
    private @Nullable Output<String> serviceAccessSecurityGroup;

    public Optional<Output<String>> serviceAccessSecurityGroup() {
        return Optional.ofNullable(this.serviceAccessSecurityGroup);
    }

    /**
     * VPC subnet id where you want the job flow to launch. Cannot specify the `cc1.4xlarge` instance type for nodes of a job flow launched in an Amazon VPC.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * List of VPC subnet id-s where you want the job flow to launch.  Amazon EMR identifies the best Availability Zone to launch instances according to your fleet specifications.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    private ClusterEc2AttributesGetArgs() {}

    private ClusterEc2AttributesGetArgs(ClusterEc2AttributesGetArgs $) {
        this.additionalMasterSecurityGroups = $.additionalMasterSecurityGroups;
        this.additionalSlaveSecurityGroups = $.additionalSlaveSecurityGroups;
        this.emrManagedMasterSecurityGroup = $.emrManagedMasterSecurityGroup;
        this.emrManagedSlaveSecurityGroup = $.emrManagedSlaveSecurityGroup;
        this.instanceProfile = $.instanceProfile;
        this.keyName = $.keyName;
        this.serviceAccessSecurityGroup = $.serviceAccessSecurityGroup;
        this.subnetId = $.subnetId;
        this.subnetIds = $.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEc2AttributesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEc2AttributesGetArgs $;

        public Builder() {
            $ = new ClusterEc2AttributesGetArgs();
        }

        public Builder(ClusterEc2AttributesGetArgs defaults) {
            $ = new ClusterEc2AttributesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalMasterSecurityGroups(@Nullable Output<String> additionalMasterSecurityGroups) {
            $.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
            return this;
        }

        public Builder additionalMasterSecurityGroups(String additionalMasterSecurityGroups) {
            return additionalMasterSecurityGroups(Output.of(additionalMasterSecurityGroups));
        }

        public Builder additionalSlaveSecurityGroups(@Nullable Output<String> additionalSlaveSecurityGroups) {
            $.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
            return this;
        }

        public Builder additionalSlaveSecurityGroups(String additionalSlaveSecurityGroups) {
            return additionalSlaveSecurityGroups(Output.of(additionalSlaveSecurityGroups));
        }

        public Builder emrManagedMasterSecurityGroup(@Nullable Output<String> emrManagedMasterSecurityGroup) {
            $.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
            return this;
        }

        public Builder emrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
            return emrManagedMasterSecurityGroup(Output.of(emrManagedMasterSecurityGroup));
        }

        public Builder emrManagedSlaveSecurityGroup(@Nullable Output<String> emrManagedSlaveSecurityGroup) {
            $.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
            return this;
        }

        public Builder emrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
            return emrManagedSlaveSecurityGroup(Output.of(emrManagedSlaveSecurityGroup));
        }

        public Builder instanceProfile(Output<String> instanceProfile) {
            $.instanceProfile = instanceProfile;
            return this;
        }

        public Builder instanceProfile(String instanceProfile) {
            return instanceProfile(Output.of(instanceProfile));
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        public Builder serviceAccessSecurityGroup(@Nullable Output<String> serviceAccessSecurityGroup) {
            $.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
            return this;
        }

        public Builder serviceAccessSecurityGroup(String serviceAccessSecurityGroup) {
            return serviceAccessSecurityGroup(Output.of(serviceAccessSecurityGroup));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public ClusterEc2AttributesGetArgs build() {
            $.instanceProfile = Objects.requireNonNull($.instanceProfile, "expected parameter 'instanceProfile' to be non-null");
            return $;
        }
    }

}
