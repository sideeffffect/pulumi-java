// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.InnerHealthErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HealthErrorResponse {
    /**
     * @return Error creation time (UTC)
     * 
     */
    private final @Nullable String creationTimeUtc;
    /**
     * @return Value indicating whether the health error is customer resolvable.
     * 
     */
    private final @Nullable String customerResolvability;
    /**
     * @return ID of the entity.
     * 
     */
    private final @Nullable String entityId;
    /**
     * @return Category of error.
     * 
     */
    private final @Nullable String errorCategory;
    /**
     * @return Error code.
     * 
     */
    private final @Nullable String errorCode;
    /**
     * @return The health error unique id.
     * 
     */
    private final @Nullable String errorId;
    /**
     * @return Level of error.
     * 
     */
    private final @Nullable String errorLevel;
    /**
     * @return Error message.
     * 
     */
    private final @Nullable String errorMessage;
    /**
     * @return Source of error.
     * 
     */
    private final @Nullable String errorSource;
    /**
     * @return Type of error.
     * 
     */
    private final @Nullable String errorType;
    /**
     * @return The inner health errors. HealthError having a list of HealthError as child errors is problematic. InnerHealthError is used because this will prevent an infinite loop of structures when Hydra tries to auto-generate the contract. We are exposing the related health errors as inner health errors and all API consumers can utilize this in the same fashion as Exception -&amp;gt; InnerException.
     * 
     */
    private final @Nullable List<InnerHealthErrorResponse> innerHealthErrors;
    /**
     * @return Possible causes of error.
     * 
     */
    private final @Nullable String possibleCauses;
    /**
     * @return Recommended action to resolve error.
     * 
     */
    private final @Nullable String recommendedAction;
    /**
     * @return DRA error message.
     * 
     */
    private final @Nullable String recoveryProviderErrorMessage;
    /**
     * @return Summary message of the entity.
     * 
     */
    private final @Nullable String summaryMessage;

    @CustomType.Constructor
    private HealthErrorResponse(
        @CustomType.Parameter("creationTimeUtc") @Nullable String creationTimeUtc,
        @CustomType.Parameter("customerResolvability") @Nullable String customerResolvability,
        @CustomType.Parameter("entityId") @Nullable String entityId,
        @CustomType.Parameter("errorCategory") @Nullable String errorCategory,
        @CustomType.Parameter("errorCode") @Nullable String errorCode,
        @CustomType.Parameter("errorId") @Nullable String errorId,
        @CustomType.Parameter("errorLevel") @Nullable String errorLevel,
        @CustomType.Parameter("errorMessage") @Nullable String errorMessage,
        @CustomType.Parameter("errorSource") @Nullable String errorSource,
        @CustomType.Parameter("errorType") @Nullable String errorType,
        @CustomType.Parameter("innerHealthErrors") @Nullable List<InnerHealthErrorResponse> innerHealthErrors,
        @CustomType.Parameter("possibleCauses") @Nullable String possibleCauses,
        @CustomType.Parameter("recommendedAction") @Nullable String recommendedAction,
        @CustomType.Parameter("recoveryProviderErrorMessage") @Nullable String recoveryProviderErrorMessage,
        @CustomType.Parameter("summaryMessage") @Nullable String summaryMessage) {
        this.creationTimeUtc = creationTimeUtc;
        this.customerResolvability = customerResolvability;
        this.entityId = entityId;
        this.errorCategory = errorCategory;
        this.errorCode = errorCode;
        this.errorId = errorId;
        this.errorLevel = errorLevel;
        this.errorMessage = errorMessage;
        this.errorSource = errorSource;
        this.errorType = errorType;
        this.innerHealthErrors = innerHealthErrors;
        this.possibleCauses = possibleCauses;
        this.recommendedAction = recommendedAction;
        this.recoveryProviderErrorMessage = recoveryProviderErrorMessage;
        this.summaryMessage = summaryMessage;
    }

    /**
     * @return Error creation time (UTC)
     * 
     */
    public Optional<String> creationTimeUtc() {
        return Optional.ofNullable(this.creationTimeUtc);
    }
    /**
     * @return Value indicating whether the health error is customer resolvable.
     * 
     */
    public Optional<String> customerResolvability() {
        return Optional.ofNullable(this.customerResolvability);
    }
    /**
     * @return ID of the entity.
     * 
     */
    public Optional<String> entityId() {
        return Optional.ofNullable(this.entityId);
    }
    /**
     * @return Category of error.
     * 
     */
    public Optional<String> errorCategory() {
        return Optional.ofNullable(this.errorCategory);
    }
    /**
     * @return Error code.
     * 
     */
    public Optional<String> errorCode() {
        return Optional.ofNullable(this.errorCode);
    }
    /**
     * @return The health error unique id.
     * 
     */
    public Optional<String> errorId() {
        return Optional.ofNullable(this.errorId);
    }
    /**
     * @return Level of error.
     * 
     */
    public Optional<String> errorLevel() {
        return Optional.ofNullable(this.errorLevel);
    }
    /**
     * @return Error message.
     * 
     */
    public Optional<String> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    /**
     * @return Source of error.
     * 
     */
    public Optional<String> errorSource() {
        return Optional.ofNullable(this.errorSource);
    }
    /**
     * @return Type of error.
     * 
     */
    public Optional<String> errorType() {
        return Optional.ofNullable(this.errorType);
    }
    /**
     * @return The inner health errors. HealthError having a list of HealthError as child errors is problematic. InnerHealthError is used because this will prevent an infinite loop of structures when Hydra tries to auto-generate the contract. We are exposing the related health errors as inner health errors and all API consumers can utilize this in the same fashion as Exception -&amp;gt; InnerException.
     * 
     */
    public List<InnerHealthErrorResponse> innerHealthErrors() {
        return this.innerHealthErrors == null ? List.of() : this.innerHealthErrors;
    }
    /**
     * @return Possible causes of error.
     * 
     */
    public Optional<String> possibleCauses() {
        return Optional.ofNullable(this.possibleCauses);
    }
    /**
     * @return Recommended action to resolve error.
     * 
     */
    public Optional<String> recommendedAction() {
        return Optional.ofNullable(this.recommendedAction);
    }
    /**
     * @return DRA error message.
     * 
     */
    public Optional<String> recoveryProviderErrorMessage() {
        return Optional.ofNullable(this.recoveryProviderErrorMessage);
    }
    /**
     * @return Summary message of the entity.
     * 
     */
    public Optional<String> summaryMessage() {
        return Optional.ofNullable(this.summaryMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTimeUtc;
        private @Nullable String customerResolvability;
        private @Nullable String entityId;
        private @Nullable String errorCategory;
        private @Nullable String errorCode;
        private @Nullable String errorId;
        private @Nullable String errorLevel;
        private @Nullable String errorMessage;
        private @Nullable String errorSource;
        private @Nullable String errorType;
        private @Nullable List<InnerHealthErrorResponse> innerHealthErrors;
        private @Nullable String possibleCauses;
        private @Nullable String recommendedAction;
        private @Nullable String recoveryProviderErrorMessage;
        private @Nullable String summaryMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimeUtc = defaults.creationTimeUtc;
    	      this.customerResolvability = defaults.customerResolvability;
    	      this.entityId = defaults.entityId;
    	      this.errorCategory = defaults.errorCategory;
    	      this.errorCode = defaults.errorCode;
    	      this.errorId = defaults.errorId;
    	      this.errorLevel = defaults.errorLevel;
    	      this.errorMessage = defaults.errorMessage;
    	      this.errorSource = defaults.errorSource;
    	      this.errorType = defaults.errorType;
    	      this.innerHealthErrors = defaults.innerHealthErrors;
    	      this.possibleCauses = defaults.possibleCauses;
    	      this.recommendedAction = defaults.recommendedAction;
    	      this.recoveryProviderErrorMessage = defaults.recoveryProviderErrorMessage;
    	      this.summaryMessage = defaults.summaryMessage;
        }

        public Builder creationTimeUtc(@Nullable String creationTimeUtc) {
            this.creationTimeUtc = creationTimeUtc;
            return this;
        }
        public Builder customerResolvability(@Nullable String customerResolvability) {
            this.customerResolvability = customerResolvability;
            return this;
        }
        public Builder entityId(@Nullable String entityId) {
            this.entityId = entityId;
            return this;
        }
        public Builder errorCategory(@Nullable String errorCategory) {
            this.errorCategory = errorCategory;
            return this;
        }
        public Builder errorCode(@Nullable String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Builder errorId(@Nullable String errorId) {
            this.errorId = errorId;
            return this;
        }
        public Builder errorLevel(@Nullable String errorLevel) {
            this.errorLevel = errorLevel;
            return this;
        }
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Builder errorSource(@Nullable String errorSource) {
            this.errorSource = errorSource;
            return this;
        }
        public Builder errorType(@Nullable String errorType) {
            this.errorType = errorType;
            return this;
        }
        public Builder innerHealthErrors(@Nullable List<InnerHealthErrorResponse> innerHealthErrors) {
            this.innerHealthErrors = innerHealthErrors;
            return this;
        }
        public Builder innerHealthErrors(InnerHealthErrorResponse... innerHealthErrors) {
            return innerHealthErrors(List.of(innerHealthErrors));
        }
        public Builder possibleCauses(@Nullable String possibleCauses) {
            this.possibleCauses = possibleCauses;
            return this;
        }
        public Builder recommendedAction(@Nullable String recommendedAction) {
            this.recommendedAction = recommendedAction;
            return this;
        }
        public Builder recoveryProviderErrorMessage(@Nullable String recoveryProviderErrorMessage) {
            this.recoveryProviderErrorMessage = recoveryProviderErrorMessage;
            return this;
        }
        public Builder summaryMessage(@Nullable String summaryMessage) {
            this.summaryMessage = summaryMessage;
            return this;
        }        public HealthErrorResponse build() {
            return new HealthErrorResponse(creationTimeUtc, customerResolvability, entityId, errorCategory, errorCode, errorId, errorLevel, errorMessage, errorSource, errorType, innerHealthErrors, possibleCauses, recommendedAction, recoveryProviderErrorMessage, summaryMessage);
        }
    }
}
