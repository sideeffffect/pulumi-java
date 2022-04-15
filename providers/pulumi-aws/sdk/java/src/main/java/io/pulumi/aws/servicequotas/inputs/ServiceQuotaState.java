// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicequotas.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceQuotaState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceQuotaState Empty = new ServiceQuotaState();

    /**
     * Whether the service quota can be increased.
     * 
     */
    @Import(name="adjustable")
      private final @Nullable Output<Boolean> adjustable;

    public Output<Boolean> adjustable() {
        return this.adjustable == null ? Codegen.empty() : this.adjustable;
    }

    /**
     * Amazon Resource Name (ARN) of the service quota.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Default value of the service quota.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<Double> defaultValue;

    public Output<Double> defaultValue() {
        return this.defaultValue == null ? Codegen.empty() : this.defaultValue;
    }

    /**
     * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
     * 
     */
    @Import(name="quotaCode")
      private final @Nullable Output<String> quotaCode;

    public Output<String> quotaCode() {
        return this.quotaCode == null ? Codegen.empty() : this.quotaCode;
    }

    /**
     * Name of the quota.
     * 
     */
    @Import(name="quotaName")
      private final @Nullable Output<String> quotaName;

    public Output<String> quotaName() {
        return this.quotaName == null ? Codegen.empty() : this.quotaName;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    @Import(name="requestStatus")
      private final @Nullable Output<String> requestStatus;

    public Output<String> requestStatus() {
        return this.requestStatus == null ? Codegen.empty() : this.requestStatus;
    }

    /**
     * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
     * 
     */
    @Import(name="serviceCode")
      private final @Nullable Output<String> serviceCode;

    public Output<String> serviceCode() {
        return this.serviceCode == null ? Codegen.empty() : this.serviceCode;
    }

    /**
     * Name of the service.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    /**
     * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Double> value;

    public Output<Double> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ServiceQuotaState(
        @Nullable Output<Boolean> adjustable,
        @Nullable Output<String> arn,
        @Nullable Output<Double> defaultValue,
        @Nullable Output<String> quotaCode,
        @Nullable Output<String> quotaName,
        @Nullable Output<String> requestId,
        @Nullable Output<String> requestStatus,
        @Nullable Output<String> serviceCode,
        @Nullable Output<String> serviceName,
        @Nullable Output<Double> value) {
        this.adjustable = adjustable;
        this.arn = arn;
        this.defaultValue = defaultValue;
        this.quotaCode = quotaCode;
        this.quotaName = quotaName;
        this.requestId = requestId;
        this.requestStatus = requestStatus;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.value = value;
    }

    private ServiceQuotaState() {
        this.adjustable = Codegen.empty();
        this.arn = Codegen.empty();
        this.defaultValue = Codegen.empty();
        this.quotaCode = Codegen.empty();
        this.quotaName = Codegen.empty();
        this.requestId = Codegen.empty();
        this.requestStatus = Codegen.empty();
        this.serviceCode = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceQuotaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> adjustable;
        private @Nullable Output<String> arn;
        private @Nullable Output<Double> defaultValue;
        private @Nullable Output<String> quotaCode;
        private @Nullable Output<String> quotaName;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> requestStatus;
        private @Nullable Output<String> serviceCode;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceQuotaState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adjustable = defaults.adjustable;
    	      this.arn = defaults.arn;
    	      this.defaultValue = defaults.defaultValue;
    	      this.quotaCode = defaults.quotaCode;
    	      this.quotaName = defaults.quotaName;
    	      this.requestId = defaults.requestId;
    	      this.requestStatus = defaults.requestStatus;
    	      this.serviceCode = defaults.serviceCode;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder adjustable(@Nullable Output<Boolean> adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Builder adjustable(@Nullable Boolean adjustable) {
            this.adjustable = Codegen.ofNullable(adjustable);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder defaultValue(@Nullable Output<Double> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable Double defaultValue) {
            this.defaultValue = Codegen.ofNullable(defaultValue);
            return this;
        }
        public Builder quotaCode(@Nullable Output<String> quotaCode) {
            this.quotaCode = quotaCode;
            return this;
        }
        public Builder quotaCode(@Nullable String quotaCode) {
            this.quotaCode = Codegen.ofNullable(quotaCode);
            return this;
        }
        public Builder quotaName(@Nullable Output<String> quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public Builder quotaName(@Nullable String quotaName) {
            this.quotaName = Codegen.ofNullable(quotaName);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder requestStatus(@Nullable Output<String> requestStatus) {
            this.requestStatus = requestStatus;
            return this;
        }
        public Builder requestStatus(@Nullable String requestStatus) {
            this.requestStatus = Codegen.ofNullable(requestStatus);
            return this;
        }
        public Builder serviceCode(@Nullable Output<String> serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public Builder serviceCode(@Nullable String serviceCode) {
            this.serviceCode = Codegen.ofNullable(serviceCode);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }
        public Builder value(@Nullable Output<Double> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ServiceQuotaState build() {
            return new ServiceQuotaState(adjustable, arn, defaultValue, quotaCode, quotaName, requestId, requestStatus, serviceCode, serviceName, value);
        }
    }
}
