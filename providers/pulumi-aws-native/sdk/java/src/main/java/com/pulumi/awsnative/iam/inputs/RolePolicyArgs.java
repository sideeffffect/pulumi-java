// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * The inline policy document that is embedded in the specified IAM role.
 * 
 */
public final class RolePolicyArgs extends ResourceArgs {

    public static final RolePolicyArgs Empty = new RolePolicyArgs();

    /**
     * The policy document.
     * 
     */
    @Import(name="policyDocument", required=true)
    private Output<String> policyDocument;

    /**
     * @return The policy document.
     * 
     */
    public Output<String> policyDocument() {
        return this.policyDocument;
    }

    /**
     * The friendly name (not ARN) identifying the policy.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return The friendly name (not ARN) identifying the policy.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    private RolePolicyArgs() {}

    private RolePolicyArgs(RolePolicyArgs $) {
        this.policyDocument = $.policyDocument;
        this.policyName = $.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolePolicyArgs $;

        public Builder() {
            $ = new RolePolicyArgs();
        }

        public Builder(RolePolicyArgs defaults) {
            $ = new RolePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyDocument The policy document.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(Output<String> policyDocument) {
            $.policyDocument = policyDocument;
            return this;
        }

        /**
         * @param policyDocument The policy document.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(String policyDocument) {
            return policyDocument(Output.of(policyDocument));
        }

        /**
         * @param policyName The friendly name (not ARN) identifying the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The friendly name (not ARN) identifying the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public RolePolicyArgs build() {
            $.policyDocument = Objects.requireNonNull($.policyDocument, "expected parameter 'policyDocument' to be non-null");
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            return $;
        }
    }

}
