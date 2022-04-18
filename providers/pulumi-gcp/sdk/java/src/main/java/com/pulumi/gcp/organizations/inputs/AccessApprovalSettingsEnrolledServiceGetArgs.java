// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsEnrolledServiceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsEnrolledServiceGetArgs Empty = new AccessApprovalSettingsEnrolledServiceGetArgs();

    /**
     * The product for which Access Approval will be enrolled. Allowed values are listed (case-sensitive):
     * all
     * appengine.googleapis.com
     * bigquery.googleapis.com
     * bigtable.googleapis.com
     * cloudkms.googleapis.com
     * compute.googleapis.com
     * dataflow.googleapis.com
     * iam.googleapis.com
     * pubsub.googleapis.com
     * storage.googleapis.com
     * 
     */
    @Import(name="cloudProduct", required=true)
      private final Output<String> cloudProduct;

    public Output<String> cloudProduct() {
        return this.cloudProduct;
    }

    /**
     * The enrollment level of the service.
     * Default value is `BLOCK_ALL`.
     * Possible values are `BLOCK_ALL`.
     * 
     */
    @Import(name="enrollmentLevel")
      private final @Nullable Output<String> enrollmentLevel;

    public Output<String> enrollmentLevel() {
        return this.enrollmentLevel == null ? Codegen.empty() : this.enrollmentLevel;
    }

    public AccessApprovalSettingsEnrolledServiceGetArgs(
        Output<String> cloudProduct,
        @Nullable Output<String> enrollmentLevel) {
        this.cloudProduct = Objects.requireNonNull(cloudProduct, "expected parameter 'cloudProduct' to be non-null");
        this.enrollmentLevel = enrollmentLevel;
    }

    private AccessApprovalSettingsEnrolledServiceGetArgs() {
        this.cloudProduct = Codegen.empty();
        this.enrollmentLevel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsEnrolledServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloudProduct;
        private @Nullable Output<String> enrollmentLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsEnrolledServiceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProduct = defaults.cloudProduct;
    	      this.enrollmentLevel = defaults.enrollmentLevel;
        }

        public Builder cloudProduct(Output<String> cloudProduct) {
            this.cloudProduct = Objects.requireNonNull(cloudProduct);
            return this;
        }
        public Builder cloudProduct(String cloudProduct) {
            this.cloudProduct = Output.of(Objects.requireNonNull(cloudProduct));
            return this;
        }
        public Builder enrollmentLevel(@Nullable Output<String> enrollmentLevel) {
            this.enrollmentLevel = enrollmentLevel;
            return this;
        }
        public Builder enrollmentLevel(@Nullable String enrollmentLevel) {
            this.enrollmentLevel = Codegen.ofNullable(enrollmentLevel);
            return this;
        }        public AccessApprovalSettingsEnrolledServiceGetArgs build() {
            return new AccessApprovalSettingsEnrolledServiceGetArgs(cloudProduct, enrollmentLevel);
        }
    }
}
