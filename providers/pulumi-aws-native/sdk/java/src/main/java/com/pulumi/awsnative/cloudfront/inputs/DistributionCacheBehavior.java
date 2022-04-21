// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionForwardedValues;
import com.pulumi.awsnative.cloudfront.inputs.DistributionFunctionAssociation;
import com.pulumi.awsnative.cloudfront.inputs.DistributionLambdaFunctionAssociation;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionCacheBehavior extends com.pulumi.resources.InvokeArgs {

    public static final DistributionCacheBehavior Empty = new DistributionCacheBehavior();

    @Import(name="allowedMethods")
    private @Nullable List<String> allowedMethods;

    public Optional<List<String>> allowedMethods() {
        return Optional.ofNullable(this.allowedMethods);
    }

    @Import(name="cachePolicyId")
    private @Nullable String cachePolicyId;

    public Optional<String> cachePolicyId() {
        return Optional.ofNullable(this.cachePolicyId);
    }

    @Import(name="cachedMethods")
    private @Nullable List<String> cachedMethods;

    public Optional<List<String>> cachedMethods() {
        return Optional.ofNullable(this.cachedMethods);
    }

    @Import(name="compress")
    private @Nullable Boolean compress;

    public Optional<Boolean> compress() {
        return Optional.ofNullable(this.compress);
    }

    @Import(name="defaultTTL")
    private @Nullable Double defaultTTL;

    public Optional<Double> defaultTTL() {
        return Optional.ofNullable(this.defaultTTL);
    }

    @Import(name="fieldLevelEncryptionId")
    private @Nullable String fieldLevelEncryptionId;

    public Optional<String> fieldLevelEncryptionId() {
        return Optional.ofNullable(this.fieldLevelEncryptionId);
    }

    @Import(name="forwardedValues")
    private @Nullable DistributionForwardedValues forwardedValues;

    public Optional<DistributionForwardedValues> forwardedValues() {
        return Optional.ofNullable(this.forwardedValues);
    }

    @Import(name="functionAssociations")
    private @Nullable List<DistributionFunctionAssociation> functionAssociations;

    public Optional<List<DistributionFunctionAssociation>> functionAssociations() {
        return Optional.ofNullable(this.functionAssociations);
    }

    @Import(name="lambdaFunctionAssociations")
    private @Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations;

    public Optional<List<DistributionLambdaFunctionAssociation>> lambdaFunctionAssociations() {
        return Optional.ofNullable(this.lambdaFunctionAssociations);
    }

    @Import(name="maxTTL")
    private @Nullable Double maxTTL;

    public Optional<Double> maxTTL() {
        return Optional.ofNullable(this.maxTTL);
    }

    @Import(name="minTTL")
    private @Nullable Double minTTL;

    public Optional<Double> minTTL() {
        return Optional.ofNullable(this.minTTL);
    }

    @Import(name="originRequestPolicyId")
    private @Nullable String originRequestPolicyId;

    public Optional<String> originRequestPolicyId() {
        return Optional.ofNullable(this.originRequestPolicyId);
    }

    @Import(name="pathPattern", required=true)
    private String pathPattern;

    public String pathPattern() {
        return this.pathPattern;
    }

    @Import(name="realtimeLogConfigArn")
    private @Nullable String realtimeLogConfigArn;

    public Optional<String> realtimeLogConfigArn() {
        return Optional.ofNullable(this.realtimeLogConfigArn);
    }

    @Import(name="responseHeadersPolicyId")
    private @Nullable String responseHeadersPolicyId;

    public Optional<String> responseHeadersPolicyId() {
        return Optional.ofNullable(this.responseHeadersPolicyId);
    }

    @Import(name="smoothStreaming")
    private @Nullable Boolean smoothStreaming;

    public Optional<Boolean> smoothStreaming() {
        return Optional.ofNullable(this.smoothStreaming);
    }

    @Import(name="targetOriginId", required=true)
    private String targetOriginId;

    public String targetOriginId() {
        return this.targetOriginId;
    }

    @Import(name="trustedKeyGroups")
    private @Nullable List<String> trustedKeyGroups;

    public Optional<List<String>> trustedKeyGroups() {
        return Optional.ofNullable(this.trustedKeyGroups);
    }

    @Import(name="trustedSigners")
    private @Nullable List<String> trustedSigners;

    public Optional<List<String>> trustedSigners() {
        return Optional.ofNullable(this.trustedSigners);
    }

    @Import(name="viewerProtocolPolicy", required=true)
    private String viewerProtocolPolicy;

    public String viewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    private DistributionCacheBehavior() {}

    private DistributionCacheBehavior(DistributionCacheBehavior $) {
        this.allowedMethods = $.allowedMethods;
        this.cachePolicyId = $.cachePolicyId;
        this.cachedMethods = $.cachedMethods;
        this.compress = $.compress;
        this.defaultTTL = $.defaultTTL;
        this.fieldLevelEncryptionId = $.fieldLevelEncryptionId;
        this.forwardedValues = $.forwardedValues;
        this.functionAssociations = $.functionAssociations;
        this.lambdaFunctionAssociations = $.lambdaFunctionAssociations;
        this.maxTTL = $.maxTTL;
        this.minTTL = $.minTTL;
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
    public static Builder builder(DistributionCacheBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionCacheBehavior $;

        public Builder() {
            $ = new DistributionCacheBehavior();
        }

        public Builder(DistributionCacheBehavior defaults) {
            $ = new DistributionCacheBehavior(Objects.requireNonNull(defaults));
        }

        public Builder allowedMethods(@Nullable List<String> allowedMethods) {
            $.allowedMethods = allowedMethods;
            return this;
        }

        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }

        public Builder cachePolicyId(@Nullable String cachePolicyId) {
            $.cachePolicyId = cachePolicyId;
            return this;
        }

        public Builder cachedMethods(@Nullable List<String> cachedMethods) {
            $.cachedMethods = cachedMethods;
            return this;
        }

        public Builder cachedMethods(String... cachedMethods) {
            return cachedMethods(List.of(cachedMethods));
        }

        public Builder compress(@Nullable Boolean compress) {
            $.compress = compress;
            return this;
        }

        public Builder defaultTTL(@Nullable Double defaultTTL) {
            $.defaultTTL = defaultTTL;
            return this;
        }

        public Builder fieldLevelEncryptionId(@Nullable String fieldLevelEncryptionId) {
            $.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }

        public Builder forwardedValues(@Nullable DistributionForwardedValues forwardedValues) {
            $.forwardedValues = forwardedValues;
            return this;
        }

        public Builder functionAssociations(@Nullable List<DistributionFunctionAssociation> functionAssociations) {
            $.functionAssociations = functionAssociations;
            return this;
        }

        public Builder functionAssociations(DistributionFunctionAssociation... functionAssociations) {
            return functionAssociations(List.of(functionAssociations));
        }

        public Builder lambdaFunctionAssociations(@Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations) {
            $.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }

        public Builder lambdaFunctionAssociations(DistributionLambdaFunctionAssociation... lambdaFunctionAssociations) {
            return lambdaFunctionAssociations(List.of(lambdaFunctionAssociations));
        }

        public Builder maxTTL(@Nullable Double maxTTL) {
            $.maxTTL = maxTTL;
            return this;
        }

        public Builder minTTL(@Nullable Double minTTL) {
            $.minTTL = minTTL;
            return this;
        }

        public Builder originRequestPolicyId(@Nullable String originRequestPolicyId) {
            $.originRequestPolicyId = originRequestPolicyId;
            return this;
        }

        public Builder pathPattern(String pathPattern) {
            $.pathPattern = pathPattern;
            return this;
        }

        public Builder realtimeLogConfigArn(@Nullable String realtimeLogConfigArn) {
            $.realtimeLogConfigArn = realtimeLogConfigArn;
            return this;
        }

        public Builder responseHeadersPolicyId(@Nullable String responseHeadersPolicyId) {
            $.responseHeadersPolicyId = responseHeadersPolicyId;
            return this;
        }

        public Builder smoothStreaming(@Nullable Boolean smoothStreaming) {
            $.smoothStreaming = smoothStreaming;
            return this;
        }

        public Builder targetOriginId(String targetOriginId) {
            $.targetOriginId = targetOriginId;
            return this;
        }

        public Builder trustedKeyGroups(@Nullable List<String> trustedKeyGroups) {
            $.trustedKeyGroups = trustedKeyGroups;
            return this;
        }

        public Builder trustedKeyGroups(String... trustedKeyGroups) {
            return trustedKeyGroups(List.of(trustedKeyGroups));
        }

        public Builder trustedSigners(@Nullable List<String> trustedSigners) {
            $.trustedSigners = trustedSigners;
            return this;
        }

        public Builder trustedSigners(String... trustedSigners) {
            return trustedSigners(List.of(trustedSigners));
        }

        public Builder viewerProtocolPolicy(String viewerProtocolPolicy) {
            $.viewerProtocolPolicy = viewerProtocolPolicy;
            return this;
        }

        public DistributionCacheBehavior build() {
            $.pathPattern = Objects.requireNonNull($.pathPattern, "expected parameter 'pathPattern' to be non-null");
            $.targetOriginId = Objects.requireNonNull($.targetOriginId, "expected parameter 'targetOriginId' to be non-null");
            $.viewerProtocolPolicy = Objects.requireNonNull($.viewerProtocolPolicy, "expected parameter 'viewerProtocolPolicy' to be non-null");
            return $;
        }
    }

}
