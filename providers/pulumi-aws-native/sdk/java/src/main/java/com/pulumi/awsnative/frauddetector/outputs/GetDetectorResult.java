// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.outputs;

import com.pulumi.awsnative.frauddetector.enums.DetectorRuleExecutionMode;
import com.pulumi.awsnative.frauddetector.enums.DetectorVersionStatus;
import com.pulumi.awsnative.frauddetector.outputs.DetectorEventType;
import com.pulumi.awsnative.frauddetector.outputs.DetectorModel;
import com.pulumi.awsnative.frauddetector.outputs.DetectorRule;
import com.pulumi.awsnative.frauddetector.outputs.DetectorTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDetectorResult {
    /**
     * The ARN of the detector.
     * 
     */
    private final @Nullable String arn;
    /**
     * The models to associate with this detector.
     * 
     */
    private final @Nullable List<DetectorModel> associatedModels;
    /**
     * The time when the detector was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The description of the detector.
     * 
     */
    private final @Nullable String description;
    /**
     * The active version ID of the detector
     * 
     */
    private final @Nullable String detectorVersionId;
    /**
     * The desired detector version status for the detector
     * 
     */
    private final @Nullable DetectorVersionStatus detectorVersionStatus;
    /**
     * The event type to associate this detector with.
     * 
     */
    private final @Nullable DetectorEventType eventType;
    /**
     * The time when the detector was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    private final @Nullable DetectorRuleExecutionMode ruleExecutionMode;
    private final @Nullable List<DetectorRule> rules;
    /**
     * Tags associated with this detector.
     * 
     */
    private final @Nullable List<DetectorTag> tags;

    @CustomType.Constructor
    private GetDetectorResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("associatedModels") @Nullable List<DetectorModel> associatedModels,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("detectorVersionId") @Nullable String detectorVersionId,
        @CustomType.Parameter("detectorVersionStatus") @Nullable DetectorVersionStatus detectorVersionStatus,
        @CustomType.Parameter("eventType") @Nullable DetectorEventType eventType,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("ruleExecutionMode") @Nullable DetectorRuleExecutionMode ruleExecutionMode,
        @CustomType.Parameter("rules") @Nullable List<DetectorRule> rules,
        @CustomType.Parameter("tags") @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.associatedModels = associatedModels;
        this.createdTime = createdTime;
        this.description = description;
        this.detectorVersionId = detectorVersionId;
        this.detectorVersionStatus = detectorVersionStatus;
        this.eventType = eventType;
        this.lastUpdatedTime = lastUpdatedTime;
        this.ruleExecutionMode = ruleExecutionMode;
        this.rules = rules;
        this.tags = tags;
    }

    /**
     * The ARN of the detector.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The models to associate with this detector.
     * 
    */
    public List<DetectorModel> associatedModels() {
        return this.associatedModels == null ? List.of() : this.associatedModels;
    }
    /**
     * The time when the detector was created.
     * 
    */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The description of the detector.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The active version ID of the detector
     * 
    */
    public Optional<String> detectorVersionId() {
        return Optional.ofNullable(this.detectorVersionId);
    }
    /**
     * The desired detector version status for the detector
     * 
    */
    public Optional<DetectorVersionStatus> detectorVersionStatus() {
        return Optional.ofNullable(this.detectorVersionStatus);
    }
    /**
     * The event type to associate this detector with.
     * 
    */
    public Optional<DetectorEventType> eventType() {
        return Optional.ofNullable(this.eventType);
    }
    /**
     * The time when the detector was last updated.
     * 
    */
    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<DetectorRuleExecutionMode> ruleExecutionMode() {
        return Optional.ofNullable(this.ruleExecutionMode);
    }
    public List<DetectorRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * Tags associated with this detector.
     * 
    */
    public List<DetectorTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDetectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<DetectorModel> associatedModels;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String detectorVersionId;
        private @Nullable DetectorVersionStatus detectorVersionStatus;
        private @Nullable DetectorEventType eventType;
        private @Nullable String lastUpdatedTime;
        private @Nullable DetectorRuleExecutionMode ruleExecutionMode;
        private @Nullable List<DetectorRule> rules;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDetectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associatedModels = defaults.associatedModels;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.detectorVersionId = defaults.detectorVersionId;
    	      this.detectorVersionStatus = defaults.detectorVersionStatus;
    	      this.eventType = defaults.eventType;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.ruleExecutionMode = defaults.ruleExecutionMode;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder associatedModels(@Nullable List<DetectorModel> associatedModels) {
            this.associatedModels = associatedModels;
            return this;
        }
        public Builder associatedModels(DetectorModel... associatedModels) {
            return associatedModels(List.of(associatedModels));
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder detectorVersionId(@Nullable String detectorVersionId) {
            this.detectorVersionId = detectorVersionId;
            return this;
        }
        public Builder detectorVersionStatus(@Nullable DetectorVersionStatus detectorVersionStatus) {
            this.detectorVersionStatus = detectorVersionStatus;
            return this;
        }
        public Builder eventType(@Nullable DetectorEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder ruleExecutionMode(@Nullable DetectorRuleExecutionMode ruleExecutionMode) {
            this.ruleExecutionMode = ruleExecutionMode;
            return this;
        }
        public Builder rules(@Nullable List<DetectorRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(DetectorRule... rules) {
            return rules(List.of(rules));
        }
        public Builder tags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DetectorTag... tags) {
            return tags(List.of(tags));
        }        public GetDetectorResult build() {
            return new GetDetectorResult(arn, associatedModels, createdTime, description, detectorVersionId, detectorVersionStatus, eventType, lastUpdatedTime, ruleExecutionMode, rules, tags);
        }
    }
}
