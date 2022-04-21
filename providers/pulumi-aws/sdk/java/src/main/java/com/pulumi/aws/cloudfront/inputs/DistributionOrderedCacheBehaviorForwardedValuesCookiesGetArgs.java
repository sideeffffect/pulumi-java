// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs Empty = new DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs();

    /**
     * Specifies whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You can
     * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
     * subsequent `whitelisted_names`
     * 
     */
    @Import(name="forward", required=true)
    private Output<String> forward;

    public Output<String> forward() {
        return this.forward;
    }

    /**
     * If you have specified `whitelist` to
     * `forward`, the whitelisted cookies that you want CloudFront to forward to
     * your origin.
     * 
     */
    @Import(name="whitelistedNames")
    private @Nullable Output<List<String>> whitelistedNames;

    public Optional<Output<List<String>>> whitelistedNames() {
        return Optional.ofNullable(this.whitelistedNames);
    }

    private DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs() {}

    private DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs(DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs $) {
        this.forward = $.forward;
        this.whitelistedNames = $.whitelistedNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs $;

        public Builder() {
            $ = new DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs();
        }

        public Builder(DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs defaults) {
            $ = new DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder forward(Output<String> forward) {
            $.forward = forward;
            return this;
        }

        public Builder forward(String forward) {
            return forward(Output.of(forward));
        }

        public Builder whitelistedNames(@Nullable Output<List<String>> whitelistedNames) {
            $.whitelistedNames = whitelistedNames;
            return this;
        }

        public Builder whitelistedNames(List<String> whitelistedNames) {
            return whitelistedNames(Output.of(whitelistedNames));
        }

        public Builder whitelistedNames(String... whitelistedNames) {
            return whitelistedNames(List.of(whitelistedNames));
        }

        public DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs build() {
            $.forward = Objects.requireNonNull($.forward, "expected parameter 'forward' to be non-null");
            return $;
        }
    }

}
