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
    private @Nullable InquiryValidationResponse inquiryValidation;

    public Optional<InquiryValidationResponse> inquiryValidation() {
        return Optional.ofNullable(this.inquiryValidation);
    }

    /**
     * Contains the protectable item Count inside this Container.
     * 
     */
    @Import(name="itemCount")
    private @Nullable Double itemCount;

    public Optional<Double> itemCount() {
        return Optional.ofNullable(this.itemCount);
    }

    /**
     * Type of the Workload such as SQL, Oracle etc.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private WorkloadInquiryDetailsResponse() {}

    private WorkloadInquiryDetailsResponse(WorkloadInquiryDetailsResponse $) {
        this.inquiryValidation = $.inquiryValidation;
        this.itemCount = $.itemCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadInquiryDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadInquiryDetailsResponse $;

        public Builder() {
            $ = new WorkloadInquiryDetailsResponse();
        }

        public Builder(WorkloadInquiryDetailsResponse defaults) {
            $ = new WorkloadInquiryDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder inquiryValidation(@Nullable InquiryValidationResponse inquiryValidation) {
            $.inquiryValidation = inquiryValidation;
            return this;
        }

        public Builder itemCount(@Nullable Double itemCount) {
            $.itemCount = itemCount;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public WorkloadInquiryDetailsResponse build() {
            return $;
        }
    }

}
