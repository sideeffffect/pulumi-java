// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentState extends com.pulumi.resources.ResourceArgs {

    public static final AgentState Empty = new AgentState();

    /**
     * DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
     * 
     */
    @Import(name="activationKey")
    private @Nullable Output<String> activationKey;

    public Optional<Output<String>> activationKey() {
        return Optional.ofNullable(this.activationKey);
    }

    /**
     * Amazon Resource Name (ARN) of the DataSync Agent.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Name of the DataSync Agent.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
     * 
     */
    @Import(name="privateLinkEndpoint")
    private @Nullable Output<String> privateLinkEndpoint;

    public Optional<Output<String>> privateLinkEndpoint() {
        return Optional.ofNullable(this.privateLinkEndpoint);
    }

    /**
     * The ARNs of the security groups used to protect your data transfer task subnets.
     * 
     */
    @Import(name="securityGroupArns")
    private @Nullable Output<List<String>> securityGroupArns;

    public Optional<Output<List<String>>> securityGroupArns() {
        return Optional.ofNullable(this.securityGroupArns);
    }

    /**
     * The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    @Import(name="subnetArns")
    private @Nullable Output<List<String>> subnetArns;

    public Optional<Output<List<String>>> subnetArns() {
        return Optional.ofNullable(this.subnetArns);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
     * 
     */
    @Import(name="vpcEndpointId")
    private @Nullable Output<String> vpcEndpointId;

    public Optional<Output<String>> vpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }

    private AgentState() {}

    private AgentState(AgentState $) {
        this.activationKey = $.activationKey;
        this.arn = $.arn;
        this.ipAddress = $.ipAddress;
        this.name = $.name;
        this.privateLinkEndpoint = $.privateLinkEndpoint;
        this.securityGroupArns = $.securityGroupArns;
        this.subnetArns = $.subnetArns;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcEndpointId = $.vpcEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentState $;

        public Builder() {
            $ = new AgentState();
        }

        public Builder(AgentState defaults) {
            $ = new AgentState(Objects.requireNonNull(defaults));
        }

        public Builder activationKey(@Nullable Output<String> activationKey) {
            $.activationKey = activationKey;
            return this;
        }

        public Builder activationKey(String activationKey) {
            return activationKey(Output.of(activationKey));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder privateLinkEndpoint(@Nullable Output<String> privateLinkEndpoint) {
            $.privateLinkEndpoint = privateLinkEndpoint;
            return this;
        }

        public Builder privateLinkEndpoint(String privateLinkEndpoint) {
            return privateLinkEndpoint(Output.of(privateLinkEndpoint));
        }

        public Builder securityGroupArns(@Nullable Output<List<String>> securityGroupArns) {
            $.securityGroupArns = securityGroupArns;
            return this;
        }

        public Builder securityGroupArns(List<String> securityGroupArns) {
            return securityGroupArns(Output.of(securityGroupArns));
        }

        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }

        public Builder subnetArns(@Nullable Output<List<String>> subnetArns) {
            $.subnetArns = subnetArns;
            return this;
        }

        public Builder subnetArns(List<String> subnetArns) {
            return subnetArns(Output.of(subnetArns));
        }

        public Builder subnetArns(String... subnetArns) {
            return subnetArns(List.of(subnetArns));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            $.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder vpcEndpointId(String vpcEndpointId) {
            return vpcEndpointId(Output.of(vpcEndpointId));
        }

        public AgentState build() {
            return $;
        }
    }

}
