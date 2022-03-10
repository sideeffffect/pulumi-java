// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs;
import io.pulumi.aws.ssm.inputs.AssociationTargetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssociationArgs Empty = new AssociationArgs();

    /**
     * By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
     * 
     */
    @InputImport(name="applyOnlyAtCronInterval")
      private final @Nullable Input<Boolean> applyOnlyAtCronInterval;

    public Input<Boolean> getApplyOnlyAtCronInterval() {
        return this.applyOnlyAtCronInterval == null ? Input.empty() : this.applyOnlyAtCronInterval;
    }

    /**
     * The descriptive name for the association.
     * 
     */
    @InputImport(name="associationName")
      private final @Nullable Input<String> associationName;

    public Input<String> getAssociationName() {
        return this.associationName == null ? Input.empty() : this.associationName;
    }

    /**
     * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
     * 
     */
    @InputImport(name="automationTargetParameterName")
      private final @Nullable Input<String> automationTargetParameterName;

    public Input<String> getAutomationTargetParameterName() {
        return this.automationTargetParameterName == null ? Input.empty() : this.automationTargetParameterName;
    }

    /**
     * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
     * 
     */
    @InputImport(name="complianceSeverity")
      private final @Nullable Input<String> complianceSeverity;

    public Input<String> getComplianceSeverity() {
        return this.complianceSeverity == null ? Input.empty() : this.complianceSeverity;
    }

    /**
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * 
     */
    @InputImport(name="documentVersion")
      private final @Nullable Input<String> documentVersion;

    public Input<String> getDocumentVersion() {
        return this.documentVersion == null ? Input.empty() : this.documentVersion;
    }

    /**
     * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    @InputImport(name="maxConcurrency")
      private final @Nullable Input<String> maxConcurrency;

    public Input<String> getMaxConcurrency() {
        return this.maxConcurrency == null ? Input.empty() : this.maxConcurrency;
    }

    /**
     * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    @InputImport(name="maxErrors")
      private final @Nullable Input<String> maxErrors;

    public Input<String> getMaxErrors() {
        return this.maxErrors == null ? Input.empty() : this.maxErrors;
    }

    /**
     * The name of the SSM document to apply.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An output location block. Output Location is documented below.
     * 
     */
    @InputImport(name="outputLocation")
      private final @Nullable Input<AssociationOutputLocationArgs> outputLocation;

    public Input<AssociationOutputLocationArgs> getOutputLocation() {
        return this.outputLocation == null ? Input.empty() : this.outputLocation;
    }

    /**
     * A block of arbitrary string parameters to pass to the SSM document.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * A cron expression when the association will be applied to the target(s).
     * 
     */
    @InputImport(name="scheduleExpression")
      private final @Nullable Input<String> scheduleExpression;

    public Input<String> getScheduleExpression() {
        return this.scheduleExpression == null ? Input.empty() : this.scheduleExpression;
    }

    /**
     * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * 
     */
    @InputImport(name="targets")
      private final @Nullable Input<List<AssociationTargetArgs>> targets;

    public Input<List<AssociationTargetArgs>> getTargets() {
        return this.targets == null ? Input.empty() : this.targets;
    }

    public AssociationArgs(
        @Nullable Input<Boolean> applyOnlyAtCronInterval,
        @Nullable Input<String> associationName,
        @Nullable Input<String> automationTargetParameterName,
        @Nullable Input<String> complianceSeverity,
        @Nullable Input<String> documentVersion,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> maxConcurrency,
        @Nullable Input<String> maxErrors,
        @Nullable Input<String> name,
        @Nullable Input<AssociationOutputLocationArgs> outputLocation,
        @Nullable Input<Map<String,String>> parameters,
        @Nullable Input<String> scheduleExpression,
        @Nullable Input<List<AssociationTargetArgs>> targets) {
        this.applyOnlyAtCronInterval = applyOnlyAtCronInterval;
        this.associationName = associationName;
        this.automationTargetParameterName = automationTargetParameterName;
        this.complianceSeverity = complianceSeverity;
        this.documentVersion = documentVersion;
        this.instanceId = instanceId;
        this.maxConcurrency = maxConcurrency;
        this.maxErrors = maxErrors;
        this.name = name;
        this.outputLocation = outputLocation;
        this.parameters = parameters;
        this.scheduleExpression = scheduleExpression;
        this.targets = targets;
    }

    private AssociationArgs() {
        this.applyOnlyAtCronInterval = Input.empty();
        this.associationName = Input.empty();
        this.automationTargetParameterName = Input.empty();
        this.complianceSeverity = Input.empty();
        this.documentVersion = Input.empty();
        this.instanceId = Input.empty();
        this.maxConcurrency = Input.empty();
        this.maxErrors = Input.empty();
        this.name = Input.empty();
        this.outputLocation = Input.empty();
        this.parameters = Input.empty();
        this.scheduleExpression = Input.empty();
        this.targets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> applyOnlyAtCronInterval;
        private @Nullable Input<String> associationName;
        private @Nullable Input<String> automationTargetParameterName;
        private @Nullable Input<String> complianceSeverity;
        private @Nullable Input<String> documentVersion;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> maxConcurrency;
        private @Nullable Input<String> maxErrors;
        private @Nullable Input<String> name;
        private @Nullable Input<AssociationOutputLocationArgs> outputLocation;
        private @Nullable Input<Map<String,String>> parameters;
        private @Nullable Input<String> scheduleExpression;
        private @Nullable Input<List<AssociationTargetArgs>> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyOnlyAtCronInterval = defaults.applyOnlyAtCronInterval;
    	      this.associationName = defaults.associationName;
    	      this.automationTargetParameterName = defaults.automationTargetParameterName;
    	      this.complianceSeverity = defaults.complianceSeverity;
    	      this.documentVersion = defaults.documentVersion;
    	      this.instanceId = defaults.instanceId;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.maxErrors = defaults.maxErrors;
    	      this.name = defaults.name;
    	      this.outputLocation = defaults.outputLocation;
    	      this.parameters = defaults.parameters;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.targets = defaults.targets;
        }

        public Builder applyOnlyAtCronInterval(@Nullable Input<Boolean> applyOnlyAtCronInterval) {
            this.applyOnlyAtCronInterval = applyOnlyAtCronInterval;
            return this;
        }

        public Builder applyOnlyAtCronInterval(@Nullable Boolean applyOnlyAtCronInterval) {
            this.applyOnlyAtCronInterval = Input.ofNullable(applyOnlyAtCronInterval);
            return this;
        }

        public Builder associationName(@Nullable Input<String> associationName) {
            this.associationName = associationName;
            return this;
        }

        public Builder associationName(@Nullable String associationName) {
            this.associationName = Input.ofNullable(associationName);
            return this;
        }

        public Builder automationTargetParameterName(@Nullable Input<String> automationTargetParameterName) {
            this.automationTargetParameterName = automationTargetParameterName;
            return this;
        }

        public Builder automationTargetParameterName(@Nullable String automationTargetParameterName) {
            this.automationTargetParameterName = Input.ofNullable(automationTargetParameterName);
            return this;
        }

        public Builder complianceSeverity(@Nullable Input<String> complianceSeverity) {
            this.complianceSeverity = complianceSeverity;
            return this;
        }

        public Builder complianceSeverity(@Nullable String complianceSeverity) {
            this.complianceSeverity = Input.ofNullable(complianceSeverity);
            return this;
        }

        public Builder documentVersion(@Nullable Input<String> documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }

        public Builder documentVersion(@Nullable String documentVersion) {
            this.documentVersion = Input.ofNullable(documentVersion);
            return this;
        }

        public Builder instanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder maxConcurrency(@Nullable Input<String> maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        public Builder maxConcurrency(@Nullable String maxConcurrency) {
            this.maxConcurrency = Input.ofNullable(maxConcurrency);
            return this;
        }

        public Builder maxErrors(@Nullable Input<String> maxErrors) {
            this.maxErrors = maxErrors;
            return this;
        }

        public Builder maxErrors(@Nullable String maxErrors) {
            this.maxErrors = Input.ofNullable(maxErrors);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder outputLocation(@Nullable Input<AssociationOutputLocationArgs> outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        public Builder outputLocation(@Nullable AssociationOutputLocationArgs outputLocation) {
            this.outputLocation = Input.ofNullable(outputLocation);
            return this;
        }

        public Builder parameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder scheduleExpression(@Nullable Input<String> scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleExpression(@Nullable String scheduleExpression) {
            this.scheduleExpression = Input.ofNullable(scheduleExpression);
            return this;
        }

        public Builder targets(@Nullable Input<List<AssociationTargetArgs>> targets) {
            this.targets = targets;
            return this;
        }

        public Builder targets(@Nullable List<AssociationTargetArgs> targets) {
            this.targets = Input.ofNullable(targets);
            return this;
        }
        public AssociationArgs build() {
            return new AssociationArgs(applyOnlyAtCronInterval, associationName, automationTargetParameterName, complianceSeverity, documentVersion, instanceId, maxConcurrency, maxErrors, name, outputLocation, parameters, scheduleExpression, targets);
        }
    }
}
