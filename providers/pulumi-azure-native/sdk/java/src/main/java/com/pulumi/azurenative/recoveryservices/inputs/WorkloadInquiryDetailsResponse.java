// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.InquiryValidationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of an inquired protectable item.
 * 
 */
public final class WorkloadInquiryDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkloadInquiryDetailsResponse Empty = new WorkloadInquiryDetailsResponse();

    /**
     * Inquiry validation such as permissions and other backup validations.
     * 
     */
    @Import(name="inquiryValidation")
      private final @Nullable InquiryValidationResponse inquiryValidation;

    public Optional<InquiryValidationResponse> inquiryValidation() {
        return this.inquiryValidation == null ? Optional.empty() : Optional.ofNullable(this.inquiryValidation);
    }

    /**
     * Contains the protectable item Count inside this Container.
     * 
     */
    @Import(name="itemCount")
      private final @Nullable Double itemCount;

    public Optional<Double> itemCount() {
        return this.itemCount == null ? Optional.empty() : Optional.ofNullable(this.itemCount);
    }

    /**
     * Type of the Workload such as SQL, Oracle etc.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public WorkloadInquiryDetailsResponse(
        @Nullable InquiryValidationResponse inquiryValidation,
        @Nullable Double itemCount,
        @Nullable String type) {
        this.inquiryValidation = inquiryValidation;
        this.itemCount = itemCount;
        this.type = type;
    }

    private WorkloadInquiryDetailsResponse() {
        this.inquiryValidation = null;
        this.itemCount = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadInquiryDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InquiryValidationResponse inquiryValidation;
        private @Nullable Double itemCount;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadInquiryDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inquiryValidation = defaults.inquiryValidation;
    	      this.itemCount = defaults.itemCount;
    	      this.type = defaults.type;
        }

        public Builder inquiryValidation(@Nullable InquiryValidationResponse inquiryValidation) {
            this.inquiryValidation = inquiryValidation;
            return this;
        }
        public Builder itemCount(@Nullable Double itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public WorkloadInquiryDetailsResponse build() {
            return new WorkloadInquiryDetailsResponse(inquiryValidation, itemCount, type);
        }
    }
}
