// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.ErrorDetailResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InquiryValidationResponse {
    /**
     * @return Error Additional Detail in case the status is non-success.
     * 
     */
    private final String additionalDetail;
    /**
     * @return Error Detail in case the status is non-success.
     * 
     */
    private final @Nullable ErrorDetailResponse errorDetail;
    /**
     * @return Status for the Inquiry Validation.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private InquiryValidationResponse(
        @CustomType.Parameter("additionalDetail") String additionalDetail,
        @CustomType.Parameter("errorDetail") @Nullable ErrorDetailResponse errorDetail,
        @CustomType.Parameter("status") @Nullable String status) {
        this.additionalDetail = additionalDetail;
        this.errorDetail = errorDetail;
        this.status = status;
    }

    /**
     * @return Error Additional Detail in case the status is non-success.
     * 
     */
    public String additionalDetail() {
        return this.additionalDetail;
    }
    /**
     * @return Error Detail in case the status is non-success.
     * 
     */
    public Optional<ErrorDetailResponse> errorDetail() {
        return Optional.ofNullable(this.errorDetail);
    }
    /**
     * @return Status for the Inquiry Validation.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InquiryValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String additionalDetail;
        private @Nullable ErrorDetailResponse errorDetail;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(InquiryValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDetail = defaults.additionalDetail;
    	      this.errorDetail = defaults.errorDetail;
    	      this.status = defaults.status;
        }

        public Builder additionalDetail(String additionalDetail) {
            this.additionalDetail = Objects.requireNonNull(additionalDetail);
            return this;
        }
        public Builder errorDetail(@Nullable ErrorDetailResponse errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public InquiryValidationResponse build() {
            return new InquiryValidationResponse(additionalDetail, errorDetail, status);
        }
    }
}
