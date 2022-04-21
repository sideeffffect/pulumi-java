// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediaconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowVpcInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowVpcInterfaceArgs Empty = new FlowVpcInterfaceArgs();

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     */
    @Import(name="flowArn", required=true)
    private Output<String> flowArn;

    public Output<String> flowArn() {
        return this.flowArn;
    }

    /**
     * Immutable and has to be a unique against other VpcInterfaces in this Flow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Role Arn MediaConnect can assumes to create ENIs in customer&#39;s account.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Security Group IDs to be used on ENI.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * Subnet must be in the AZ of the Flow
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId;
    }

    private FlowVpcInterfaceArgs() {}

    private FlowVpcInterfaceArgs(FlowVpcInterfaceArgs $) {
        this.flowArn = $.flowArn;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowVpcInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowVpcInterfaceArgs $;

        public Builder() {
            $ = new FlowVpcInterfaceArgs();
        }

        public Builder(FlowVpcInterfaceArgs defaults) {
            $ = new FlowVpcInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder flowArn(Output<String> flowArn) {
            $.flowArn = flowArn;
            return this;
        }

        public Builder flowArn(String flowArn) {
            return flowArn(Output.of(flowArn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public FlowVpcInterfaceArgs build() {
            $.flowArn = Objects.requireNonNull($.flowArn, "expected parameter 'flowArn' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
