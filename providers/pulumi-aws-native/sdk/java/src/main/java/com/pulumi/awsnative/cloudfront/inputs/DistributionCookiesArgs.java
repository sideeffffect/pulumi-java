// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionCookiesArgs extends ResourceArgs {

    public static final DistributionCookiesArgs Empty = new DistributionCookiesArgs();

    @Import(name="forward", required=true)
    private Output<String> forward;

    public Output<String> forward() {
        return this.forward;
    }

    @Import(name="whitelistedNames")
    private @Nullable Output<List<String>> whitelistedNames;

    public Optional<Output<List<String>>> whitelistedNames() {
        return Optional.ofNullable(this.whitelistedNames);
    }

    private DistributionCookiesArgs() {}

    private DistributionCookiesArgs(DistributionCookiesArgs $) {
        this.forward = $.forward;
        this.whitelistedNames = $.whitelistedNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionCookiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionCookiesArgs $;

        public Builder() {
            $ = new DistributionCookiesArgs();
        }

        public Builder(DistributionCookiesArgs defaults) {
            $ = new DistributionCookiesArgs(Objects.requireNonNull(defaults));
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

        public DistributionCookiesArgs build() {
            $.forward = Objects.requireNonNull($.forward, "expected parameter 'forward' to be non-null");
            return $;
        }
    }

}
