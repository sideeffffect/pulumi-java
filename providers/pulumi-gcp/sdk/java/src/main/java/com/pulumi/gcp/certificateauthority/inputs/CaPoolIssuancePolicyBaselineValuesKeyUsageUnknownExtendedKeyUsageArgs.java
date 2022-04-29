// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs extends ResourceArgs {

    public static final CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs Empty = new CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @Import(name="objectIdPaths", required=true)
    private Output<List<Integer>> objectIdPaths;

    /**
     * @return An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    public Output<List<Integer>> objectIdPaths() {
        return this.objectIdPaths;
    }

    private CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs() {}

    private CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs(CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs $) {
        this.objectIdPaths = $.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs $;

        public Builder() {
            $ = new CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs();
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs defaults) {
            $ = new CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectIdPaths An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * 
         * @return builder
         * 
         */
        public Builder objectIdPaths(Output<List<Integer>> objectIdPaths) {
            $.objectIdPaths = objectIdPaths;
            return this;
        }

        /**
         * @param objectIdPaths An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * 
         * @return builder
         * 
         */
        public Builder objectIdPaths(List<Integer> objectIdPaths) {
            return objectIdPaths(Output.of(objectIdPaths));
        }

        /**
         * @param objectIdPaths An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * 
         * @return builder
         * 
         */
        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }

        public CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs build() {
            $.objectIdPaths = Objects.requireNonNull($.objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
            return $;
        }
    }

}
