// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsEnrolledServiceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsEnrolledServiceGetArgs Empty = new AccessApprovalSettingsEnrolledServiceGetArgs();

    /**
     * The product for which Access Approval will be enrolled. Allowed values are listed (case-sensitive):
     * * all
     * * App Engine
     * * BigQuery
     * * Cloud Bigtable
     * * Cloud Key Management Service
     * * Compute Engine
     * * Cloud Dataflow
     * * Cloud Identity and Access Management
     * * Cloud Pub/Sub
     * * Cloud Storage
     * * Persistent Disk
     *   Note: These values are supported as input, but considered a legacy format:
     * * all
     * * appengine.googleapis.com
     * * bigquery.googleapis.com
     * * bigtable.googleapis.com
     * * cloudkms.googleapis.com
     * * compute.googleapis.com
     * * dataflow.googleapis.com
     * * iam.googleapis.com
     * * pubsub.googleapis.com
     * * storage.googleapis.com
     * 
     */
    @Import(name="cloudProduct", required=true)
    private Output<String> cloudProduct;

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
    private @Nullable Output<String> enrollmentLevel;

    public Optional<Output<String>> enrollmentLevel() {
        return Optional.ofNullable(this.enrollmentLevel);
    }

    private AccessApprovalSettingsEnrolledServiceGetArgs() {}

    private AccessApprovalSettingsEnrolledServiceGetArgs(AccessApprovalSettingsEnrolledServiceGetArgs $) {
        this.cloudProduct = $.cloudProduct;
        this.enrollmentLevel = $.enrollmentLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApprovalSettingsEnrolledServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApprovalSettingsEnrolledServiceGetArgs $;

        public Builder() {
            $ = new AccessApprovalSettingsEnrolledServiceGetArgs();
        }

        public Builder(AccessApprovalSettingsEnrolledServiceGetArgs defaults) {
            $ = new AccessApprovalSettingsEnrolledServiceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudProduct(Output<String> cloudProduct) {
            $.cloudProduct = cloudProduct;
            return this;
        }

        public Builder cloudProduct(String cloudProduct) {
            return cloudProduct(Output.of(cloudProduct));
        }

        public Builder enrollmentLevel(@Nullable Output<String> enrollmentLevel) {
            $.enrollmentLevel = enrollmentLevel;
            return this;
        }

        public Builder enrollmentLevel(String enrollmentLevel) {
            return enrollmentLevel(Output.of(enrollmentLevel));
        }

        public AccessApprovalSettingsEnrolledServiceGetArgs build() {
            $.cloudProduct = Objects.requireNonNull($.cloudProduct, "expected parameter 'cloudProduct' to be non-null");
            return $;
        }
    }

}
