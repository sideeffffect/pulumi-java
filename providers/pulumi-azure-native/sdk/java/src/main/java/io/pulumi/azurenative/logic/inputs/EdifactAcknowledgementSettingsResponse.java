// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact agreement acknowledgement settings.
 * 
 */
public final class EdifactAcknowledgementSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactAcknowledgementSettingsResponse Empty = new EdifactAcknowledgementSettingsResponse();

    /**
     * The acknowledgement control number lower bound.
     * 
     */
    @InputImport(name="acknowledgementControlNumberLowerBound", required=true)
      private final Integer acknowledgementControlNumberLowerBound;

    public Integer getAcknowledgementControlNumberLowerBound() {
        return this.acknowledgementControlNumberLowerBound;
    }

    /**
     * The acknowledgement control number prefix.
     * 
     */
    @InputImport(name="acknowledgementControlNumberPrefix")
      private final @Nullable String acknowledgementControlNumberPrefix;

    public Optional<String> getAcknowledgementControlNumberPrefix() {
        return this.acknowledgementControlNumberPrefix == null ? Optional.empty() : Optional.ofNullable(this.acknowledgementControlNumberPrefix);
    }

    /**
     * The acknowledgement control number suffix.
     * 
     */
    @InputImport(name="acknowledgementControlNumberSuffix")
      private final @Nullable String acknowledgementControlNumberSuffix;

    public Optional<String> getAcknowledgementControlNumberSuffix() {
        return this.acknowledgementControlNumberSuffix == null ? Optional.empty() : Optional.ofNullable(this.acknowledgementControlNumberSuffix);
    }

    /**
     * The acknowledgement control number upper bound.
     * 
     */
    @InputImport(name="acknowledgementControlNumberUpperBound", required=true)
      private final Integer acknowledgementControlNumberUpperBound;

    public Integer getAcknowledgementControlNumberUpperBound() {
        return this.acknowledgementControlNumberUpperBound;
    }

    /**
     * The value indicating whether to batch functional acknowledgements.
     * 
     */
    @InputImport(name="batchFunctionalAcknowledgements", required=true)
      private final Boolean batchFunctionalAcknowledgements;

    public Boolean getBatchFunctionalAcknowledgements() {
        return this.batchFunctionalAcknowledgements;
    }

    /**
     * The value indicating whether to batch the technical acknowledgements.
     * 
     */
    @InputImport(name="batchTechnicalAcknowledgements", required=true)
      private final Boolean batchTechnicalAcknowledgements;

    public Boolean getBatchTechnicalAcknowledgements() {
        return this.batchTechnicalAcknowledgements;
    }

    /**
     * The value indicating whether functional acknowledgement is needed.
     * 
     */
    @InputImport(name="needFunctionalAcknowledgement", required=true)
      private final Boolean needFunctionalAcknowledgement;

    public Boolean getNeedFunctionalAcknowledgement() {
        return this.needFunctionalAcknowledgement;
    }

    /**
     * The value indicating whether a loop is needed for valid messages.
     * 
     */
    @InputImport(name="needLoopForValidMessages", required=true)
      private final Boolean needLoopForValidMessages;

    public Boolean getNeedLoopForValidMessages() {
        return this.needLoopForValidMessages;
    }

    /**
     * The value indicating whether technical acknowledgement is needed.
     * 
     */
    @InputImport(name="needTechnicalAcknowledgement", required=true)
      private final Boolean needTechnicalAcknowledgement;

    public Boolean getNeedTechnicalAcknowledgement() {
        return this.needTechnicalAcknowledgement;
    }

    /**
     * The value indicating whether to rollover acknowledgement control number.
     * 
     */
    @InputImport(name="rolloverAcknowledgementControlNumber", required=true)
      private final Boolean rolloverAcknowledgementControlNumber;

    public Boolean getRolloverAcknowledgementControlNumber() {
        return this.rolloverAcknowledgementControlNumber;
    }

    /**
     * The value indicating whether to send synchronous acknowledgement.
     * 
     */
    @InputImport(name="sendSynchronousAcknowledgement", required=true)
      private final Boolean sendSynchronousAcknowledgement;

    public Boolean getSendSynchronousAcknowledgement() {
        return this.sendSynchronousAcknowledgement;
    }

    public EdifactAcknowledgementSettingsResponse(
        Integer acknowledgementControlNumberLowerBound,
        @Nullable String acknowledgementControlNumberPrefix,
        @Nullable String acknowledgementControlNumberSuffix,
        Integer acknowledgementControlNumberUpperBound,
        Boolean batchFunctionalAcknowledgements,
        Boolean batchTechnicalAcknowledgements,
        Boolean needFunctionalAcknowledgement,
        Boolean needLoopForValidMessages,
        Boolean needTechnicalAcknowledgement,
        Boolean rolloverAcknowledgementControlNumber,
        Boolean sendSynchronousAcknowledgement) {
        this.acknowledgementControlNumberLowerBound = Objects.requireNonNull(acknowledgementControlNumberLowerBound, "expected parameter 'acknowledgementControlNumberLowerBound' to be non-null");
        this.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
        this.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
        this.acknowledgementControlNumberUpperBound = Objects.requireNonNull(acknowledgementControlNumberUpperBound, "expected parameter 'acknowledgementControlNumberUpperBound' to be non-null");
        this.batchFunctionalAcknowledgements = Objects.requireNonNull(batchFunctionalAcknowledgements, "expected parameter 'batchFunctionalAcknowledgements' to be non-null");
        this.batchTechnicalAcknowledgements = Objects.requireNonNull(batchTechnicalAcknowledgements, "expected parameter 'batchTechnicalAcknowledgements' to be non-null");
        this.needFunctionalAcknowledgement = Objects.requireNonNull(needFunctionalAcknowledgement, "expected parameter 'needFunctionalAcknowledgement' to be non-null");
        this.needLoopForValidMessages = Objects.requireNonNull(needLoopForValidMessages, "expected parameter 'needLoopForValidMessages' to be non-null");
        this.needTechnicalAcknowledgement = Objects.requireNonNull(needTechnicalAcknowledgement, "expected parameter 'needTechnicalAcknowledgement' to be non-null");
        this.rolloverAcknowledgementControlNumber = Objects.requireNonNull(rolloverAcknowledgementControlNumber, "expected parameter 'rolloverAcknowledgementControlNumber' to be non-null");
        this.sendSynchronousAcknowledgement = Objects.requireNonNull(sendSynchronousAcknowledgement, "expected parameter 'sendSynchronousAcknowledgement' to be non-null");
    }

    private EdifactAcknowledgementSettingsResponse() {
        this.acknowledgementControlNumberLowerBound = null;
        this.acknowledgementControlNumberPrefix = null;
        this.acknowledgementControlNumberSuffix = null;
        this.acknowledgementControlNumberUpperBound = null;
        this.batchFunctionalAcknowledgements = null;
        this.batchTechnicalAcknowledgements = null;
        this.needFunctionalAcknowledgement = null;
        this.needLoopForValidMessages = null;
        this.needTechnicalAcknowledgement = null;
        this.rolloverAcknowledgementControlNumber = null;
        this.sendSynchronousAcknowledgement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactAcknowledgementSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acknowledgementControlNumberLowerBound;
        private @Nullable String acknowledgementControlNumberPrefix;
        private @Nullable String acknowledgementControlNumberSuffix;
        private Integer acknowledgementControlNumberUpperBound;
        private Boolean batchFunctionalAcknowledgements;
        private Boolean batchTechnicalAcknowledgements;
        private Boolean needFunctionalAcknowledgement;
        private Boolean needLoopForValidMessages;
        private Boolean needTechnicalAcknowledgement;
        private Boolean rolloverAcknowledgementControlNumber;
        private Boolean sendSynchronousAcknowledgement;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactAcknowledgementSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementControlNumberLowerBound = defaults.acknowledgementControlNumberLowerBound;
    	      this.acknowledgementControlNumberPrefix = defaults.acknowledgementControlNumberPrefix;
    	      this.acknowledgementControlNumberSuffix = defaults.acknowledgementControlNumberSuffix;
    	      this.acknowledgementControlNumberUpperBound = defaults.acknowledgementControlNumberUpperBound;
    	      this.batchFunctionalAcknowledgements = defaults.batchFunctionalAcknowledgements;
    	      this.batchTechnicalAcknowledgements = defaults.batchTechnicalAcknowledgements;
    	      this.needFunctionalAcknowledgement = defaults.needFunctionalAcknowledgement;
    	      this.needLoopForValidMessages = defaults.needLoopForValidMessages;
    	      this.needTechnicalAcknowledgement = defaults.needTechnicalAcknowledgement;
    	      this.rolloverAcknowledgementControlNumber = defaults.rolloverAcknowledgementControlNumber;
    	      this.sendSynchronousAcknowledgement = defaults.sendSynchronousAcknowledgement;
        }

        public Builder acknowledgementControlNumberLowerBound(Integer acknowledgementControlNumberLowerBound) {
            this.acknowledgementControlNumberLowerBound = Objects.requireNonNull(acknowledgementControlNumberLowerBound);
            return this;
        }

        public Builder acknowledgementControlNumberPrefix(@Nullable String acknowledgementControlNumberPrefix) {
            this.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
            return this;
        }

        public Builder acknowledgementControlNumberSuffix(@Nullable String acknowledgementControlNumberSuffix) {
            this.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
            return this;
        }

        public Builder acknowledgementControlNumberUpperBound(Integer acknowledgementControlNumberUpperBound) {
            this.acknowledgementControlNumberUpperBound = Objects.requireNonNull(acknowledgementControlNumberUpperBound);
            return this;
        }

        public Builder batchFunctionalAcknowledgements(Boolean batchFunctionalAcknowledgements) {
            this.batchFunctionalAcknowledgements = Objects.requireNonNull(batchFunctionalAcknowledgements);
            return this;
        }

        public Builder batchTechnicalAcknowledgements(Boolean batchTechnicalAcknowledgements) {
            this.batchTechnicalAcknowledgements = Objects.requireNonNull(batchTechnicalAcknowledgements);
            return this;
        }

        public Builder needFunctionalAcknowledgement(Boolean needFunctionalAcknowledgement) {
            this.needFunctionalAcknowledgement = Objects.requireNonNull(needFunctionalAcknowledgement);
            return this;
        }

        public Builder needLoopForValidMessages(Boolean needLoopForValidMessages) {
            this.needLoopForValidMessages = Objects.requireNonNull(needLoopForValidMessages);
            return this;
        }

        public Builder needTechnicalAcknowledgement(Boolean needTechnicalAcknowledgement) {
            this.needTechnicalAcknowledgement = Objects.requireNonNull(needTechnicalAcknowledgement);
            return this;
        }

        public Builder rolloverAcknowledgementControlNumber(Boolean rolloverAcknowledgementControlNumber) {
            this.rolloverAcknowledgementControlNumber = Objects.requireNonNull(rolloverAcknowledgementControlNumber);
            return this;
        }

        public Builder sendSynchronousAcknowledgement(Boolean sendSynchronousAcknowledgement) {
            this.sendSynchronousAcknowledgement = Objects.requireNonNull(sendSynchronousAcknowledgement);
            return this;
        }
        public EdifactAcknowledgementSettingsResponse build() {
            return new EdifactAcknowledgementSettingsResponse(acknowledgementControlNumberLowerBound, acknowledgementControlNumberPrefix, acknowledgementControlNumberSuffix, acknowledgementControlNumberUpperBound, batchFunctionalAcknowledgements, batchTechnicalAcknowledgements, needFunctionalAcknowledgement, needLoopForValidMessages, needTechnicalAcknowledgement, rolloverAcknowledgementControlNumber, sendSynchronousAcknowledgement);
        }
    }
}
