// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1ApiCategoryDataResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApicategoryResult {
    /**
     * @return Details of category.
     * 
     */
    private final GoogleCloudApigeeV1ApiCategoryDataResponse data;
    /**
     * @return ID that can be used to find errors in the log files.
     * 
     */
    private final String errorCode;
    /**
     * @return Description of the operation.
     * 
     */
    private final String message;
    /**
     * @return ID that can be used to find request details in the log files.
     * 
     */
    private final String requestId;
    /**
     * @return Status of the operation.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetApicategoryResult(
        @CustomType.Parameter("data") GoogleCloudApigeeV1ApiCategoryDataResponse data,
        @CustomType.Parameter("errorCode") String errorCode,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("requestId") String requestId,
        @CustomType.Parameter("status") String status) {
        this.data = data;
        this.errorCode = errorCode;
        this.message = message;
        this.requestId = requestId;
        this.status = status;
    }

    /**
     * @return Details of category.
     * 
     */
    public GoogleCloudApigeeV1ApiCategoryDataResponse data() {
        return this.data;
    }
    /**
     * @return ID that can be used to find errors in the log files.
     * 
     */
    public String errorCode() {
        return this.errorCode;
    }
    /**
     * @return Description of the operation.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return ID that can be used to find request details in the log files.
     * 
     */
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return Status of the operation.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApicategoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1ApiCategoryDataResponse data;
        private String errorCode;
        private String message;
        private String requestId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApicategoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.errorCode = defaults.errorCode;
    	      this.message = defaults.message;
    	      this.requestId = defaults.requestId;
    	      this.status = defaults.status;
        }

        public Builder data(GoogleCloudApigeeV1ApiCategoryDataResponse data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder errorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetApicategoryResult build() {
            return new GetApicategoryResult(data, errorCode, message, requestId, status);
        }
    }
}
