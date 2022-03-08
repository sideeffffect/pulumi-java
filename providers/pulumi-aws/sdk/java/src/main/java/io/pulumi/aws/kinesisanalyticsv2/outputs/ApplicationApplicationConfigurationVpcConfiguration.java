// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationVpcConfiguration {
    /**
     * The Security Group IDs used by the VPC configuration.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * The Subnet IDs used by the VPC configuration.
     * 
     */
    private final List<String> subnetIds;
    private final @Nullable String vpcConfigurationId;
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor({"securityGroupIds","subnetIds","vpcConfigurationId","vpcId"})
    private ApplicationApplicationConfigurationVpcConfiguration(
        List<String> securityGroupIds,
        List<String> subnetIds,
        @Nullable String vpcConfigurationId,
        @Nullable String vpcId) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcConfigurationId = vpcConfigurationId;
        this.vpcId = vpcId;
    }

    /**
     * The Security Group IDs used by the VPC configuration.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The Subnet IDs used by the VPC configuration.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public Optional<String> getVpcConfigurationId() {
        return Optional.ofNullable(this.vpcConfigurationId);
    }
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcConfigurationId;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcConfigurationId = defaults.vpcConfigurationId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setVpcConfigurationId(@Nullable String vpcConfigurationId) {
            this.vpcConfigurationId = vpcConfigurationId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public ApplicationApplicationConfigurationVpcConfiguration build() {
            return new ApplicationApplicationConfigurationVpcConfiguration(securityGroupIds, subnetIds, vpcConfigurationId, vpcId);
        }
    }
}
