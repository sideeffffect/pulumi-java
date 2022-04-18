// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.ErrorAdditionalInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The error detail.
 * 
 */
public final class ErrorDetailResponse extends com.pulumi.resources.InvokeArgs {

    public static final ErrorDetailResponse Empty = new ErrorDetailResponse();

    /**
     * The error additional info.
     * 
     */
    @Import(name="additionalInfo", required=true)
      private final List<ErrorAdditionalInfoResponse> additionalInfo;

    public List<ErrorAdditionalInfoResponse> additionalInfo() {
        return this.additionalInfo;
    }

    /**
     * The error code.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    /**
     * The error details.
     * 
     */
    @Import(name="details", required=true)
      private final List<ErrorDetailResponse> details;

    public List<ErrorDetailResponse> details() {
        return this.details;
    }

    /**
     * The error message.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    /**
     * The error target.
     * 
     */
    @Import(name="target", required=true)
      private final String target;

    public String target() {
        return this.target;
    }

    public ErrorDetailResponse(
        List<ErrorAdditionalInfoResponse> additionalInfo,
        String code,
        List<ErrorDetailResponse> details,
        String message,
        String target) {
        this.additionalInfo = Objects.requireNonNull(additionalInfo, "expected parameter 'additionalInfo' to be non-null");
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ErrorDetailResponse() {
        this.additionalInfo = List.of();
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ErrorAdditionalInfoResponse> additionalInfo;
        private String code;
        private List<ErrorDetailResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder additionalInfo(List<ErrorAdditionalInfoResponse> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }
        public Builder additionalInfo(ErrorAdditionalInfoResponse... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder details(List<ErrorDetailResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder details(ErrorDetailResponse... details) {
            return details(List.of(details));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public ErrorDetailResponse build() {
            return new ErrorDetailResponse(additionalInfo, code, details, message, target);
        }
    }
}
