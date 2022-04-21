// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesGetArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorFunctionAssociationGetArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorLambdaFunctionAssociationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOrderedCacheBehaviorGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorGetArgs Empty = new DistributionOrderedCacheBehaviorGetArgs();

    /**
     * Controls which HTTP methods CloudFront
     * processes and forwards to your Amazon S3 bucket or your custom origin.
     * 
     */
    @Import(name="allowedMethods", required=true)
    private Output<List<String>> allowedMethods;

    public Output<List<String>> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * The unique identifier of the cache policy that
     * is attached to the cache behavior.
     * 
     */
    @Import(name="cachePolicyId")
    private @Nullable Output<String> cachePolicyId;

    public Optional<Output<String>> cachePolicyId() {
        return Optional.ofNullable(this.cachePolicyId);
    }

    /**
     * Controls whether CloudFront caches the
     * response to requests using the specified HTTP methods.
     * 
     */
    @Import(name="cachedMethods", required=true)
    private Output<List<String>> cachedMethods;

    public Output<List<String>> cachedMethods() {
        return this.cachedMethods;
    }

    /**
     * Whether you want CloudFront to automatically
     * compress content for web requests that include `Accept-Encoding: gzip` in
     * the request header (default: `false`).
     * 
     */
    @Import(name="compress")
    private @Nullable Output<Boolean> compress;

    public Optional<Output<Boolean>> compress() {
        return Optional.ofNullable(this.compress);
    }

    /**
     * The default amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * in the absence of an `Cache-Control max-age` or `Expires` header.
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<Integer> defaultTtl;

    public Optional<Output<Integer>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * Field level encryption configuration ID
     * 
     */
    @Import(name="fieldLevelEncryptionId")
    private @Nullable Output<String> fieldLevelEncryptionId;

    public Optional<Output<String>> fieldLevelEncryptionId() {
        return Optional.ofNullable(this.fieldLevelEncryptionId);
    }

    /**
     * The forwarded values configuration that specifies how CloudFront
     * handles query strings, cookies and headers (maximum one).
     * 
     */
    @Import(name="forwardedValues")
    private @Nullable Output<DistributionOrderedCacheBehaviorForwardedValuesGetArgs> forwardedValues;

    public Optional<Output<DistributionOrderedCacheBehaviorForwardedValuesGetArgs>> forwardedValues() {
        return Optional.ofNullable(this.forwardedValues);
    }

    /**
     * A config block that triggers a cloudfront
     * function with specific actions (maximum 2).
     * 
     */
    @Import(name="functionAssociations")
    private @Nullable Output<List<DistributionOrderedCacheBehaviorFunctionAssociationGetArgs>> functionAssociations;

    public Optional<Output<List<DistributionOrderedCacheBehaviorFunctionAssociationGetArgs>>> functionAssociations() {
        return Optional.ofNullable(this.functionAssociations);
    }

    /**
     * A config block that triggers a lambda
     * function with specific actions (maximum 4).
     * 
     */
    @Import(name="lambdaFunctionAssociations")
    private @Nullable Output<List<DistributionOrderedCacheBehaviorLambdaFunctionAssociationGetArgs>> lambdaFunctionAssociations;

    public Optional<Output<List<DistributionOrderedCacheBehaviorLambdaFunctionAssociationGetArgs>>> lambdaFunctionAssociations() {
        return Optional.ofNullable(this.lambdaFunctionAssociations);
    }

    /**
     * The maximum amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * to your origin to determine whether the object has been updated. Only
     * effective in the presence of `Cache-Control max-age`, `Cache-Control
     * s-maxage`, and `Expires` headers.
     * 
     */
    @Import(name="maxTtl")
    private @Nullable Output<Integer> maxTtl;

    public Optional<Output<Integer>> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }

    /**
     * The minimum amount of time that you want objects to
     * stay in CloudFront caches before CloudFront queries your origin to see
     * whether the object has been updated. Defaults to 0 seconds.
     * 
     */
    @Import(name="minTtl")
    private @Nullable Output<Integer> minTtl;

    public Optional<Output<Integer>> minTtl() {
        return Optional.ofNullable(this.minTtl);
    }

    /**
     * The unique identifier of the origin request policy
     * that is attached to the behavior.
     * 
     */
    @Import(name="originRequestPolicyId")
    private @Nullable Output<String> originRequestPolicyId;

    public Optional<Output<String>> originRequestPolicyId() {
        return Optional.ofNullable(this.originRequestPolicyId);
    }

    /**
     * The pattern (for example, `images/*.jpg`) that
     * specifies which requests you want this cache behavior to apply to.
     * 
     */
    @Import(name="pathPattern", required=true)
    private Output<String> pathPattern;

    public Output<String> pathPattern() {
        return this.pathPattern;
    }

    /**
     * The ARN of the real-time log configuration
     * that is attached to this cache behavior.
     * 
     */
    @Import(name="realtimeLogConfigArn")
    private @Nullable Output<String> realtimeLogConfigArn;

    public Optional<Output<String>> realtimeLogConfigArn() {
        return Optional.ofNullable(this.realtimeLogConfigArn);
    }

    /**
     * The identifier for a response headers policy.
     * 
     */
    @Import(name="responseHeadersPolicyId")
    private @Nullable Output<String> responseHeadersPolicyId;

    public Optional<Output<String>> responseHeadersPolicyId() {
        return Optional.ofNullable(this.responseHeadersPolicyId);
    }

    /**
     * Indicates whether you want to distribute
     * media files in Microsoft Smooth Streaming format using the origin that is
     * associated with this cache behavior.
     * 
     */
    @Import(name="smoothStreaming")
    private @Nullable Output<Boolean> smoothStreaming;

    public Optional<Output<Boolean>> smoothStreaming() {
        return Optional.ofNullable(this.smoothStreaming);
    }

    /**
     * The value of ID for the origin that you want
     * CloudFront to route requests to when a request matches the path pattern
     * either for a cache behavior or for the default cache behavior.
     * 
     */
    @Import(name="targetOriginId", required=true)
    private Output<String> targetOriginId;

    public Output<String> targetOriginId() {
        return this.targetOriginId;
    }

    /**
     * A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    @Import(name="trustedKeyGroups")
    private @Nullable Output<List<String>> trustedKeyGroups;

    public Optional<Output<List<String>>> trustedKeyGroups() {
        return Optional.ofNullable(this.trustedKeyGroups);
    }

    /**
     * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    @Import(name="trustedSigners")
    private @Nullable Output<List<String>> trustedSigners;

    public Optional<Output<List<String>>> trustedSigners() {
        return Optional.ofNullable(this.trustedSigners);
    }

    /**
     * Use this element to specify the
     * protocol that users can use to access the files in the origin specified by
     * TargetOriginId when a request matches the path pattern in PathPattern. One
     * of `allow-all`, `https-only`, or `redirect-to-https`.
     * 
     */
    @Import(name="viewerProtocolPolicy", required=true)
    private Output<String> viewerProtocolPolicy;

    public Output<String> viewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    private DistributionOrderedCacheBehaviorGetArgs() {}

    private DistributionOrderedCacheBehaviorGetArgs(DistributionOrderedCacheBehaviorGetArgs $) {
        this.allowedMethods = $.allowedMethods;
        this.cachePolicyId = $.cachePolicyId;
        this.cachedMethods = $.cachedMethods;
        this.compress = $.compress;
        this.defaultTtl = $.defaultTtl;
        this.fieldLevelEncryptionId = $.fieldLevelEncryptionId;
        this.forwardedValues = $.forwardedValues;
        this.functionAssociations = $.functionAssociations;
        this.lambdaFunctionAssociations = $.lambdaFunctionAssociations;
        this.maxTtl = $.maxTtl;
        this.minTtl = $.minTtl;
        this.originRequestPolicyId = $.originRequestPolicyId;
        this.pathPattern = $.pathPattern;
        this.realtimeLogConfigArn = $.realtimeLogConfigArn;
        this.responseHeadersPolicyId = $.responseHeadersPolicyId;
        this.smoothStreaming = $.smoothStreaming;
        this.targetOriginId = $.targetOriginId;
        this.trustedKeyGroups = $.trustedKeyGroups;
        this.trustedSigners = $.trustedSigners;
        this.viewerProtocolPolicy = $.viewerProtocolPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOrderedCacheBehaviorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOrderedCacheBehaviorGetArgs $;

        public Builder() {
            $ = new DistributionOrderedCacheBehaviorGetArgs();
        }

        public Builder(DistributionOrderedCacheBehaviorGetArgs defaults) {
            $ = new DistributionOrderedCacheBehaviorGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedMethods(Output<List<String>> allowedMethods) {
            $.allowedMethods = allowedMethods;
            return this;
        }

        public Builder allowedMethods(List<String> allowedMethods) {
            return allowedMethods(Output.of(allowedMethods));
        }

        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }

        public Builder cachePolicyId(@Nullable Output<String> cachePolicyId) {
            $.cachePolicyId = cachePolicyId;
            return this;
        }

        public Builder cachePolicyId(String cachePolicyId) {
            return cachePolicyId(Output.of(cachePolicyId));
        }

        public Builder cachedMethods(Output<List<String>> cachedMethods) {
            $.cachedMethods = cachedMethods;
            return this;
        }

        public Builder cachedMethods(List<String> cachedMethods) {
            return cachedMethods(Output.of(cachedMethods));
        }

        public Builder cachedMethods(String... cachedMethods) {
            return cachedMethods(List.of(cachedMethods));
        }

        public Builder compress(@Nullable Output<Boolean> compress) {
            $.compress = compress;
            return this;
        }

        public Builder compress(Boolean compress) {
            return compress(Output.of(compress));
        }

        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        public Builder defaultTtl(Integer defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        public Builder fieldLevelEncryptionId(@Nullable Output<String> fieldLevelEncryptionId) {
            $.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }

        public Builder fieldLevelEncryptionId(String fieldLevelEncryptionId) {
            return fieldLevelEncryptionId(Output.of(fieldLevelEncryptionId));
        }

        public Builder forwardedValues(@Nullable Output<DistributionOrderedCacheBehaviorForwardedValuesGetArgs> forwardedValues) {
            $.forwardedValues = forwardedValues;
            return this;
        }

        public Builder forwardedValues(DistributionOrderedCacheBehaviorForwardedValuesGetArgs forwardedValues) {
            return forwardedValues(Output.of(forwardedValues));
        }

        public Builder functionAssociations(@Nullable Output<List<DistributionOrderedCacheBehaviorFunctionAssociationGetArgs>> functionAssociations) {
            $.functionAssociations = functionAssociations;
            return this;
        }

        public Builder functionAssociations(List<DistributionOrderedCacheBehaviorFunctionAssociationGetArgs> functionAssociations) {
            return functionAssociations(Output.of(functionAssociations));
        }

        public Builder functionAssociations(DistributionOrderedCacheBehaviorFunctionAssociationGetArgs... functionAssociations) {
            return functionAssociations(List.of(functionAssociations));
        }

        public Builder lambdaFunctionAssociations(@Nullable Output<List<DistributionOrderedCacheBehaviorLambdaFunctionAssociationGetArgs>> lambdaFunctionAssociations) {
            $.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }

        public Builder lambdaFunctionAssociations(List<DistributionOrderedCacheBehaviorLambdaFunctionAssociationGetArgs> lambdaFunctionAssociations) {
            return lambdaFunctionAssociations(Output.of(lambdaFunctionAssociations));
        }

        public Builder lambdaFunctionAssociations(DistributionOrderedCacheBehaviorLambdaFunctionAssociationGetArgs... lambdaFunctionAssociations) {
            return lambdaFunctionAssociations(List.of(lambdaFunctionAssociations));
        }

        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            $.maxTtl = maxTtl;
            return this;
        }

        public Builder maxTtl(Integer maxTtl) {
            return maxTtl(Output.of(maxTtl));
        }

        public Builder minTtl(@Nullable Output<Integer> minTtl) {
            $.minTtl = minTtl;
            return this;
        }

        public Builder minTtl(Integer minTtl) {
            return minTtl(Output.of(minTtl));
        }

        public Builder originRequestPolicyId(@Nullable Output<String> originRequestPolicyId) {
            $.originRequestPolicyId = originRequestPolicyId;
            return this;
        }

        public Builder originRequestPolicyId(String originRequestPolicyId) {
            return originRequestPolicyId(Output.of(originRequestPolicyId));
        }

        public Builder pathPattern(Output<String> pathPattern) {
            $.pathPattern = pathPattern;
            return this;
        }

        public Builder pathPattern(String pathPattern) {
            return pathPattern(Output.of(pathPattern));
        }

        public Builder realtimeLogConfigArn(@Nullable Output<String> realtimeLogConfigArn) {
            $.realtimeLogConfigArn = realtimeLogConfigArn;
            return this;
        }

        public Builder realtimeLogConfigArn(String realtimeLogConfigArn) {
            return realtimeLogConfigArn(Output.of(realtimeLogConfigArn));
        }

        public Builder responseHeadersPolicyId(@Nullable Output<String> responseHeadersPolicyId) {
            $.responseHeadersPolicyId = responseHeadersPolicyId;
            return this;
        }

        public Builder responseHeadersPolicyId(String responseHeadersPolicyId) {
            return responseHeadersPolicyId(Output.of(responseHeadersPolicyId));
        }

        public Builder smoothStreaming(@Nullable Output<Boolean> smoothStreaming) {
            $.smoothStreaming = smoothStreaming;
            return this;
        }

        public Builder smoothStreaming(Boolean smoothStreaming) {
            return smoothStreaming(Output.of(smoothStreaming));
        }

        public Builder targetOriginId(Output<String> targetOriginId) {
            $.targetOriginId = targetOriginId;
            return this;
        }

        public Builder targetOriginId(String targetOriginId) {
            return targetOriginId(Output.of(targetOriginId));
        }

        public Builder trustedKeyGroups(@Nullable Output<List<String>> trustedKeyGroups) {
            $.trustedKeyGroups = trustedKeyGroups;
            return this;
        }

        public Builder trustedKeyGroups(List<String> trustedKeyGroups) {
            return trustedKeyGroups(Output.of(trustedKeyGroups));
        }

        public Builder trustedKeyGroups(String... trustedKeyGroups) {
            return trustedKeyGroups(List.of(trustedKeyGroups));
        }

        public Builder trustedSigners(@Nullable Output<List<String>> trustedSigners) {
            $.trustedSigners = trustedSigners;
            return this;
        }

        public Builder trustedSigners(List<String> trustedSigners) {
            return trustedSigners(Output.of(trustedSigners));
        }

        public Builder trustedSigners(String... trustedSigners) {
            return trustedSigners(List.of(trustedSigners));
        }

        public Builder viewerProtocolPolicy(Output<String> viewerProtocolPolicy) {
            $.viewerProtocolPolicy = viewerProtocolPolicy;
            return this;
        }

        public Builder viewerProtocolPolicy(String viewerProtocolPolicy) {
            return viewerProtocolPolicy(Output.of(viewerProtocolPolicy));
        }

        public DistributionOrderedCacheBehaviorGetArgs build() {
            $.allowedMethods = Objects.requireNonNull($.allowedMethods, "expected parameter 'allowedMethods' to be non-null");
            $.cachedMethods = Objects.requireNonNull($.cachedMethods, "expected parameter 'cachedMethods' to be non-null");
            $.pathPattern = Objects.requireNonNull($.pathPattern, "expected parameter 'pathPattern' to be non-null");
            $.targetOriginId = Objects.requireNonNull($.targetOriginId, "expected parameter 'targetOriginId' to be non-null");
            $.viewerProtocolPolicy = Objects.requireNonNull($.viewerProtocolPolicy, "expected parameter 'viewerProtocolPolicy' to be non-null");
            return $;
        }
    }

}
