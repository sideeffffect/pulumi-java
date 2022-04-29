// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionS3OriginConfigArgs extends ResourceArgs {

    public static final DistributionS3OriginConfigArgs Empty = new DistributionS3OriginConfigArgs();

    @Import(name="originAccessIdentity")
    private @Nullable Output<String> originAccessIdentity;

    public Optional<Output<String>> originAccessIdentity() {
        return Optional.ofNullable(this.originAccessIdentity);
    }

    private DistributionS3OriginConfigArgs() {}

    private DistributionS3OriginConfigArgs(DistributionS3OriginConfigArgs $) {
        this.originAccessIdentity = $.originAccessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionS3OriginConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionS3OriginConfigArgs $;

        public Builder() {
            $ = new DistributionS3OriginConfigArgs();
        }

        public Builder(DistributionS3OriginConfigArgs defaults) {
            $ = new DistributionS3OriginConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder originAccessIdentity(@Nullable Output<String> originAccessIdentity) {
            $.originAccessIdentity = originAccessIdentity;
            return this;
        }

        public Builder originAccessIdentity(String originAccessIdentity) {
            return originAccessIdentity(Output.of(originAccessIdentity));
        }

        public DistributionS3OriginConfigArgs build() {
            return $;
        }
    }

}
