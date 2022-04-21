// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionCustomErrorResponseGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionCustomErrorResponseGetArgs Empty = new DistributionCustomErrorResponseGetArgs();

    /**
     * The minimum amount of time you want
     * HTTP error codes to stay in CloudFront caches before CloudFront queries your
     * origin to see whether the object has been updated.
     * 
     */
    @Import(name="errorCachingMinTtl")
    private @Nullable Output<Integer> errorCachingMinTtl;

    public Optional<Output<Integer>> errorCachingMinTtl() {
        return Optional.ofNullable(this.errorCachingMinTtl);
    }

    /**
     * The 4xx or 5xx HTTP status code that you want to
     * customize.
     * 
     */
    @Import(name="errorCode", required=true)
    private Output<Integer> errorCode;

    public Output<Integer> errorCode() {
        return this.errorCode;
    }

    /**
     * The HTTP status code that you want CloudFront
     * to return with the custom error page to the viewer.
     * 
     */
    @Import(name="responseCode")
    private @Nullable Output<Integer> responseCode;

    public Optional<Output<Integer>> responseCode() {
        return Optional.ofNullable(this.responseCode);
    }

    /**
     * The path of the custom error page (for
     * example, `/custom_404.html`).
     * 
     */
    @Import(name="responsePagePath")
    private @Nullable Output<String> responsePagePath;

    public Optional<Output<String>> responsePagePath() {
        return Optional.ofNullable(this.responsePagePath);
    }

    private DistributionCustomErrorResponseGetArgs() {}

    private DistributionCustomErrorResponseGetArgs(DistributionCustomErrorResponseGetArgs $) {
        this.errorCachingMinTtl = $.errorCachingMinTtl;
        this.errorCode = $.errorCode;
        this.responseCode = $.responseCode;
        this.responsePagePath = $.responsePagePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionCustomErrorResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionCustomErrorResponseGetArgs $;

        public Builder() {
            $ = new DistributionCustomErrorResponseGetArgs();
        }

        public Builder(DistributionCustomErrorResponseGetArgs defaults) {
            $ = new DistributionCustomErrorResponseGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder errorCachingMinTtl(@Nullable Output<Integer> errorCachingMinTtl) {
            $.errorCachingMinTtl = errorCachingMinTtl;
            return this;
        }

        public Builder errorCachingMinTtl(Integer errorCachingMinTtl) {
            return errorCachingMinTtl(Output.of(errorCachingMinTtl));
        }

        public Builder errorCode(Output<Integer> errorCode) {
            $.errorCode = errorCode;
            return this;
        }

        public Builder errorCode(Integer errorCode) {
            return errorCode(Output.of(errorCode));
        }

        public Builder responseCode(@Nullable Output<Integer> responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        public Builder responseCode(Integer responseCode) {
            return responseCode(Output.of(responseCode));
        }

        public Builder responsePagePath(@Nullable Output<String> responsePagePath) {
            $.responsePagePath = responsePagePath;
            return this;
        }

        public Builder responsePagePath(String responsePagePath) {
            return responsePagePath(Output.of(responsePagePath));
        }

        public DistributionCustomErrorResponseGetArgs build() {
            $.errorCode = Objects.requireNonNull($.errorCode, "expected parameter 'errorCode' to be non-null");
            return $;
        }
    }

}
