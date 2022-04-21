// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver;

import com.pulumi.awsnative.route53resolver.enums.ResolverConfigAutodefinedReverseFlag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResolverConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverConfigArgs Empty = new ResolverConfigArgs();

    /**
     * Represents the desired status of AutodefinedReverse. The only supported value on creation is DISABLE. Deletion of this resource will return AutodefinedReverse to its default value (ENABLED).
     * 
     */
    @Import(name="autodefinedReverseFlag", required=true)
    private Output<ResolverConfigAutodefinedReverseFlag> autodefinedReverseFlag;

    public Output<ResolverConfigAutodefinedReverseFlag> autodefinedReverseFlag() {
        return this.autodefinedReverseFlag;
    }

    /**
     * ResourceId
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    private ResolverConfigArgs() {}

    private ResolverConfigArgs(ResolverConfigArgs $) {
        this.autodefinedReverseFlag = $.autodefinedReverseFlag;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverConfigArgs $;

        public Builder() {
            $ = new ResolverConfigArgs();
        }

        public Builder(ResolverConfigArgs defaults) {
            $ = new ResolverConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder autodefinedReverseFlag(Output<ResolverConfigAutodefinedReverseFlag> autodefinedReverseFlag) {
            $.autodefinedReverseFlag = autodefinedReverseFlag;
            return this;
        }

        public Builder autodefinedReverseFlag(ResolverConfigAutodefinedReverseFlag autodefinedReverseFlag) {
            return autodefinedReverseFlag(Output.of(autodefinedReverseFlag));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public ResolverConfigArgs build() {
            $.autodefinedReverseFlag = Objects.requireNonNull($.autodefinedReverseFlag, "expected parameter 'autodefinedReverseFlag' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
