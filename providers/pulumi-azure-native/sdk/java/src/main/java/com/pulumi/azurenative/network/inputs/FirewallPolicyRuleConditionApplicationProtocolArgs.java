// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicyRuleConditionApplicationProtocolType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the application rule protocol.
 * 
 */
public final class FirewallPolicyRuleConditionApplicationProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleConditionApplicationProtocolArgs Empty = new FirewallPolicyRuleConditionApplicationProtocolArgs();

    /**
     * Port number for the protocol, cannot be greater than 64000.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol type.
     * 
     */
    @Import(name="protocolType")
    private @Nullable Output<Either<String,FirewallPolicyRuleConditionApplicationProtocolType>> protocolType;

    public Optional<Output<Either<String,FirewallPolicyRuleConditionApplicationProtocolType>>> protocolType() {
        return Optional.ofNullable(this.protocolType);
    }

    private FirewallPolicyRuleConditionApplicationProtocolArgs() {}

    private FirewallPolicyRuleConditionApplicationProtocolArgs(FirewallPolicyRuleConditionApplicationProtocolArgs $) {
        this.port = $.port;
        this.protocolType = $.protocolType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleConditionApplicationProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleConditionApplicationProtocolArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleConditionApplicationProtocolArgs();
        }

        public Builder(FirewallPolicyRuleConditionApplicationProtocolArgs defaults) {
            $ = new FirewallPolicyRuleConditionApplicationProtocolArgs(Objects.requireNonNull(defaults));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocolType(@Nullable Output<Either<String,FirewallPolicyRuleConditionApplicationProtocolType>> protocolType) {
            $.protocolType = protocolType;
            return this;
        }

        public Builder protocolType(Either<String,FirewallPolicyRuleConditionApplicationProtocolType> protocolType) {
            return protocolType(Output.of(protocolType));
        }

        public FirewallPolicyRuleConditionApplicationProtocolArgs build() {
            return $;
        }
    }

}
