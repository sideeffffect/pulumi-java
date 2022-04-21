// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarconnections.inputs;

import com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostState extends com.pulumi.resources.ResourceArgs {

    public static final HostState Empty = new HostState();

    /**
     * The CodeStar Host ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    @Import(name="providerEndpoint")
    private @Nullable Output<String> providerEndpoint;

    public Optional<Output<String>> providerEndpoint() {
        return Optional.ofNullable(this.providerEndpoint);
    }

    /**
     * The name of the external provider where your third-party code repository is configured.
     * 
     */
    @Import(name="providerType")
    private @Nullable Output<String> providerType;

    public Optional<Output<String>> providerType() {
        return Optional.ofNullable(this.providerType);
    }

    /**
     * The CodeStar Host status. Possible values are `PENDING`, `AVAILABLE`, `VPC_CONFIG_DELETING`, `VPC_CONFIG_INITIALIZING`, and `VPC_CONFIG_FAILED_INITIALIZATION`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    @Import(name="vpcConfiguration")
    private @Nullable Output<HostVpcConfigurationGetArgs> vpcConfiguration;

    public Optional<Output<HostVpcConfigurationGetArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private HostState() {}

    private HostState(HostState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.providerEndpoint = $.providerEndpoint;
        this.providerType = $.providerType;
        this.status = $.status;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostState $;

        public Builder() {
            $ = new HostState();
        }

        public Builder(HostState defaults) {
            $ = new HostState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder providerEndpoint(@Nullable Output<String> providerEndpoint) {
            $.providerEndpoint = providerEndpoint;
            return this;
        }

        public Builder providerEndpoint(String providerEndpoint) {
            return providerEndpoint(Output.of(providerEndpoint));
        }

        public Builder providerType(@Nullable Output<String> providerType) {
            $.providerType = providerType;
            return this;
        }

        public Builder providerType(String providerType) {
            return providerType(Output.of(providerType));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder vpcConfiguration(@Nullable Output<HostVpcConfigurationGetArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder vpcConfiguration(HostVpcConfigurationGetArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public HostState build() {
            return $;
        }
    }

}
