// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.FirewallPolicyRuleMatcherLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class FirewallPolicyRuleMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleMatcherArgs Empty = new FirewallPolicyRuleMatcherArgs();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="destIpRanges")
    private @Nullable Output<List<String>> destIpRanges;

    public Optional<Output<List<String>>> destIpRanges() {
        return Optional.ofNullable(this.destIpRanges);
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    @Import(name="layer4Configs")
    private @Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs;

    public Optional<Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>>> layer4Configs() {
        return Optional.ofNullable(this.layer4Configs);
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="srcIpRanges")
    private @Nullable Output<List<String>> srcIpRanges;

    public Optional<Output<List<String>>> srcIpRanges() {
        return Optional.ofNullable(this.srcIpRanges);
    }

    private FirewallPolicyRuleMatcherArgs() {}

    private FirewallPolicyRuleMatcherArgs(FirewallPolicyRuleMatcherArgs $) {
        this.destIpRanges = $.destIpRanges;
        this.layer4Configs = $.layer4Configs;
        this.srcIpRanges = $.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleMatcherArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleMatcherArgs();
        }

        public Builder(FirewallPolicyRuleMatcherArgs defaults) {
            $ = new FirewallPolicyRuleMatcherArgs(Objects.requireNonNull(defaults));
        }

        public Builder destIpRanges(@Nullable Output<List<String>> destIpRanges) {
            $.destIpRanges = destIpRanges;
            return this;
        }

        public Builder destIpRanges(List<String> destIpRanges) {
            return destIpRanges(Output.of(destIpRanges));
        }

        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }

        public Builder layer4Configs(@Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs) {
            $.layer4Configs = layer4Configs;
            return this;
        }

        public Builder layer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigArgs> layer4Configs) {
            return layer4Configs(Output.of(layer4Configs));
        }

        public Builder layer4Configs(FirewallPolicyRuleMatcherLayer4ConfigArgs... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }

        public Builder srcIpRanges(@Nullable Output<List<String>> srcIpRanges) {
            $.srcIpRanges = srcIpRanges;
            return this;
        }

        public Builder srcIpRanges(List<String> srcIpRanges) {
            return srcIpRanges(Output.of(srcIpRanges));
        }

        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }

        public FirewallPolicyRuleMatcherArgs build() {
            return $;
        }
    }

}
