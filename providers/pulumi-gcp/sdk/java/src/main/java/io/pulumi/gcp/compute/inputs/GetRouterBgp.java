// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.GetRouterBgpAdvertisedIpRange;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetRouterBgp extends io.pulumi.resources.InvokeArgs {

    public static final GetRouterBgp Empty = new GetRouterBgp();

    @Import(name="advertiseMode", required=true)
      private final String advertiseMode;

    public String advertiseMode() {
        return this.advertiseMode;
    }

    @Import(name="advertisedGroups", required=true)
      private final List<String> advertisedGroups;

    public List<String> advertisedGroups() {
        return this.advertisedGroups;
    }

    @Import(name="advertisedIpRanges", required=true)
      private final List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges;

    public List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges() {
        return this.advertisedIpRanges;
    }

    @Import(name="asn", required=true)
      private final Integer asn;

    public Integer asn() {
        return this.asn;
    }

    public GetRouterBgp(
        String advertiseMode,
        List<String> advertisedGroups,
        List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges,
        Integer asn) {
        this.advertiseMode = Objects.requireNonNull(advertiseMode, "expected parameter 'advertiseMode' to be non-null");
        this.advertisedGroups = Objects.requireNonNull(advertisedGroups, "expected parameter 'advertisedGroups' to be non-null");
        this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges, "expected parameter 'advertisedIpRanges' to be non-null");
        this.asn = Objects.requireNonNull(asn, "expected parameter 'asn' to be non-null");
    }

    private GetRouterBgp() {
        this.advertiseMode = null;
        this.advertisedGroups = List.of();
        this.advertisedIpRanges = List.of();
        this.asn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterBgp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advertiseMode;
        private List<String> advertisedGroups;
        private List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges;
        private Integer asn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterBgp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.asn = defaults.asn;
        }

        public Builder advertiseMode(String advertiseMode) {
            this.advertiseMode = Objects.requireNonNull(advertiseMode);
            return this;
        }
        public Builder advertisedGroups(List<String> advertisedGroups) {
            this.advertisedGroups = Objects.requireNonNull(advertisedGroups);
            return this;
        }
        public Builder advertisedGroups(String... advertisedGroups) {
            return advertisedGroups(List.of(advertisedGroups));
        }
        public Builder advertisedIpRanges(List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges) {
            this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges);
            return this;
        }
        public Builder advertisedIpRanges(GetRouterBgpAdvertisedIpRange... advertisedIpRanges) {
            return advertisedIpRanges(List.of(advertisedIpRanges));
        }
        public Builder asn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }        public GetRouterBgp build() {
            return new GetRouterBgp(advertiseMode, advertisedGroups, advertisedIpRanges, asn);
        }
    }
}
