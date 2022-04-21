// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1.inputs.PolicyAlternativeNameServerConfigTargetNameServerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyAlternativeNameServerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyAlternativeNameServerConfigArgs Empty = new PolicyAlternativeNameServerConfigArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    @Import(name="targetNameServers")
    private @Nullable Output<List<PolicyAlternativeNameServerConfigTargetNameServerArgs>> targetNameServers;

    public Optional<Output<List<PolicyAlternativeNameServerConfigTargetNameServerArgs>>> targetNameServers() {
        return Optional.ofNullable(this.targetNameServers);
    }

    private PolicyAlternativeNameServerConfigArgs() {}

    private PolicyAlternativeNameServerConfigArgs(PolicyAlternativeNameServerConfigArgs $) {
        this.kind = $.kind;
        this.targetNameServers = $.targetNameServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyAlternativeNameServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAlternativeNameServerConfigArgs $;

        public Builder() {
            $ = new PolicyAlternativeNameServerConfigArgs();
        }

        public Builder(PolicyAlternativeNameServerConfigArgs defaults) {
            $ = new PolicyAlternativeNameServerConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder targetNameServers(@Nullable Output<List<PolicyAlternativeNameServerConfigTargetNameServerArgs>> targetNameServers) {
            $.targetNameServers = targetNameServers;
            return this;
        }

        public Builder targetNameServers(List<PolicyAlternativeNameServerConfigTargetNameServerArgs> targetNameServers) {
            return targetNameServers(Output.of(targetNameServers));
        }

        public Builder targetNameServers(PolicyAlternativeNameServerConfigTargetNameServerArgs... targetNameServers) {
            return targetNameServers(List.of(targetNameServers));
        }

        public PolicyAlternativeNameServerConfigArgs build() {
            return $;
        }
    }

}
