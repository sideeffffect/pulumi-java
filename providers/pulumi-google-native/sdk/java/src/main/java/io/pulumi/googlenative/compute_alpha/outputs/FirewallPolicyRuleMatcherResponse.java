// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FirewallPolicyRuleMatcherLayer4ConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.FirewallPolicyRuleSecureTagResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyRuleMatcherResponse {
    /**
     * Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
     * 
     */
    private final List<String> destAddressGroups;
    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
     * 
     */
    private final List<String> destFqdns;
    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    private final List<String> destIpRanges;
    /**
     * Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of dest region codes allowed is 5000.
     * 
     */
    private final List<String> destRegionCodes;
    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    private final List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
    /**
     * Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
     * 
     */
    private final List<String> srcAddressGroups;
    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
     * 
     */
    private final List<String> srcFqdns;
    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    private final List<String> srcIpRanges;
    /**
     * Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of source region codes allowed is 5000.
     * 
     */
    private final List<String> srcRegionCodes;
    /**
     * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    private final List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

    @OutputCustomType.Constructor({"destAddressGroups","destFqdns","destIpRanges","destRegionCodes","layer4Configs","srcAddressGroups","srcFqdns","srcIpRanges","srcRegionCodes","srcSecureTags"})
    private FirewallPolicyRuleMatcherResponse(
        List<String> destAddressGroups,
        List<String> destFqdns,
        List<String> destIpRanges,
        List<String> destRegionCodes,
        List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs,
        List<String> srcAddressGroups,
        List<String> srcFqdns,
        List<String> srcIpRanges,
        List<String> srcRegionCodes,
        List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
        this.destAddressGroups = destAddressGroups;
        this.destFqdns = destFqdns;
        this.destIpRanges = destIpRanges;
        this.destRegionCodes = destRegionCodes;
        this.layer4Configs = layer4Configs;
        this.srcAddressGroups = srcAddressGroups;
        this.srcFqdns = srcFqdns;
        this.srcIpRanges = srcIpRanges;
        this.srcRegionCodes = srcRegionCodes;
        this.srcSecureTags = srcSecureTags;
    }

    /**
     * Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
     * 
    */
    public List<String> getDestAddressGroups() {
        return this.destAddressGroups;
    }
    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
     * 
    */
    public List<String> getDestFqdns() {
        return this.destFqdns;
    }
    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
    */
    public List<String> getDestIpRanges() {
        return this.destIpRanges;
    }
    /**
     * Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of dest region codes allowed is 5000.
     * 
    */
    public List<String> getDestRegionCodes() {
        return this.destRegionCodes;
    }
    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
    */
    public List<FirewallPolicyRuleMatcherLayer4ConfigResponse> getLayer4Configs() {
        return this.layer4Configs;
    }
    /**
     * Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
     * 
    */
    public List<String> getSrcAddressGroups() {
        return this.srcAddressGroups;
    }
    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
     * 
    */
    public List<String> getSrcFqdns() {
        return this.srcFqdns;
    }
    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
    */
    public List<String> getSrcIpRanges() {
        return this.srcIpRanges;
    }
    /**
     * Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of source region codes allowed is 5000.
     * 
    */
    public List<String> getSrcRegionCodes() {
        return this.srcRegionCodes;
    }
    /**
     * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
    */
    public List<FirewallPolicyRuleSecureTagResponse> getSrcSecureTags() {
        return this.srcSecureTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destAddressGroups;
        private List<String> destFqdns;
        private List<String> destIpRanges;
        private List<String> destRegionCodes;
        private List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
        private List<String> srcAddressGroups;
        private List<String> srcFqdns;
        private List<String> srcIpRanges;
        private List<String> srcRegionCodes;
        private List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destAddressGroups = defaults.destAddressGroups;
    	      this.destFqdns = defaults.destFqdns;
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.destRegionCodes = defaults.destRegionCodes;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcAddressGroups = defaults.srcAddressGroups;
    	      this.srcFqdns = defaults.srcFqdns;
    	      this.srcIpRanges = defaults.srcIpRanges;
    	      this.srcRegionCodes = defaults.srcRegionCodes;
    	      this.srcSecureTags = defaults.srcSecureTags;
        }

        public Builder setDestAddressGroups(List<String> destAddressGroups) {
            this.destAddressGroups = Objects.requireNonNull(destAddressGroups);
            return this;
        }

        public Builder setDestFqdns(List<String> destFqdns) {
            this.destFqdns = Objects.requireNonNull(destFqdns);
            return this;
        }

        public Builder setDestIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }

        public Builder setDestRegionCodes(List<String> destRegionCodes) {
            this.destRegionCodes = Objects.requireNonNull(destRegionCodes);
            return this;
        }

        public Builder setLayer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder setSrcAddressGroups(List<String> srcAddressGroups) {
            this.srcAddressGroups = Objects.requireNonNull(srcAddressGroups);
            return this;
        }

        public Builder setSrcFqdns(List<String> srcFqdns) {
            this.srcFqdns = Objects.requireNonNull(srcFqdns);
            return this;
        }

        public Builder setSrcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }

        public Builder setSrcRegionCodes(List<String> srcRegionCodes) {
            this.srcRegionCodes = Objects.requireNonNull(srcRegionCodes);
            return this;
        }

        public Builder setSrcSecureTags(List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
            this.srcSecureTags = Objects.requireNonNull(srcSecureTags);
            return this;
        }
        public FirewallPolicyRuleMatcherResponse build() {
            return new FirewallPolicyRuleMatcherResponse(destAddressGroups, destFqdns, destIpRanges, destRegionCodes, layer4Configs, srcAddressGroups, srcFqdns, srcIpRanges, srcRegionCodes, srcSecureTags);
        }
    }
}
