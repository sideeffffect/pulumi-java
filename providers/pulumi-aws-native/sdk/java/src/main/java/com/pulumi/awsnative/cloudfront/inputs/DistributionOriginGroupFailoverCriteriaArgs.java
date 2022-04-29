// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionStatusCodesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


public final class DistributionOriginGroupFailoverCriteriaArgs extends ResourceArgs {

    public static final DistributionOriginGroupFailoverCriteriaArgs Empty = new DistributionOriginGroupFailoverCriteriaArgs();

    @Import(name="statusCodes", required=true)
    private Output<DistributionStatusCodesArgs> statusCodes;

    public Output<DistributionStatusCodesArgs> statusCodes() {
        return this.statusCodes;
    }

    private DistributionOriginGroupFailoverCriteriaArgs() {}

    private DistributionOriginGroupFailoverCriteriaArgs(DistributionOriginGroupFailoverCriteriaArgs $) {
        this.statusCodes = $.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginGroupFailoverCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroupFailoverCriteriaArgs $;

        public Builder() {
            $ = new DistributionOriginGroupFailoverCriteriaArgs();
        }

        public Builder(DistributionOriginGroupFailoverCriteriaArgs defaults) {
            $ = new DistributionOriginGroupFailoverCriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder statusCodes(Output<DistributionStatusCodesArgs> statusCodes) {
            $.statusCodes = statusCodes;
            return this;
        }

        public Builder statusCodes(DistributionStatusCodesArgs statusCodes) {
            return statusCodes(Output.of(statusCodes));
        }

        public DistributionOriginGroupFailoverCriteriaArgs build() {
            $.statusCodes = Objects.requireNonNull($.statusCodes, "expected parameter 'statusCodes' to be non-null");
            return $;
        }
    }

}
